package u6;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import java.util.Arrays;
import java.util.List;

public final class HtmlJavaDoc {

    public static void main(String[] args) {
        ST templ = new STGroupFile("u6/htmljavadoc.stg").getInstanceOf("docpage");

        List<? extends Class<?>> classes = Arrays.stream(args)
                .map(arg -> {
                    try {
                        return Class.forName(arg);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList();
        templ.add("p", classes.stream().map(ClassInfo::new).toList());

        String result = templ.render();
        System.out.println(result);
    }
}

final class ClassInfo {
    public final String name;
    public final boolean hasNoInterface;
    public final boolean hasMethods;
    public final List<String> classMethods;
    public List<InterfaceInfo> interfaces;

    public ClassInfo(Class<?> c) {
        this.name = c.getName();
        this.interfaces = Arrays.stream(c.getInterfaces()).map(InterfaceInfo::new).toList();
        this.hasNoInterface = interfaces.isEmpty();

        this.classMethods = Arrays.stream(c.getMethods())
                .map(x -> x.getReturnType() + " " + x.getName() + "(" + Arrays.toString(x.getParameterTypes()) + ")")
                .filter(o -> this.interfaces.stream().noneMatch(i -> i.methods.contains(o)))
                .toList();
        this.hasMethods = !classMethods.isEmpty();
    }
}

final class InterfaceInfo {
    public final String name;
    public final List<String> methods;

    public InterfaceInfo(Class<?> i) {
        this.name = i.getName();
        this.methods = Arrays.stream(i.getMethods()).map(
                x -> x.getReturnType() + " " + x.getName()
                        + "(" + Arrays.toString(x.getParameterTypes())
                        .replace('[', ' ').replace(']', ' ') + ")"
        ).toList();
    }
}
