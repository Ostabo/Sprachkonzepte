package u6;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

public final class HtmlJavaDoc {

    public static void main(String[] args) {
        ST templ = new STGroupFile("u6/htmljavadoc.stg").getInstanceOf("docpage");

        Collection<Class<?>> classes = Arrays.asList(
                HtmlJavaDoc.class,
                ST.class,
                STGroupFile.class,
                Method.class,
                Parameter.class
        );
        templ.add("p", classes.stream().map(ClassInfo::new).toList());

        String result = templ.render();
        System.out.println(result);
    }
}

final class ClassInfo {
    public final String name;
    public final Collection<String> classMethods;
    public Collection<InterfaceInfo> interfaces;

    public ClassInfo(Class<?> c) {
        this.name = c.getName();
        this.interfaces = Arrays.stream(c.getInterfaces()).map(InterfaceInfo::new).toList();
        if (this.interfaces.isEmpty()) {
            this.classMethods = Arrays.stream(c.getMethods()).map(Method::getName).toList();
        } else {
            this.classMethods = null;
        }
    }
}

final class InterfaceInfo {
    public final String name;
    public final Collection<String> methods;

    public InterfaceInfo(Class<?> i) {
        this.name = i.getName();
        this.methods = Arrays.stream(i.getMethods()).map(Method::getName).toList();
    }
}
