// Value.java
package ast;

public final class Value extends Expr {
    private final String value;

    public Value(String value) {
        double d = Double.parseDouble(value);
        if (d < Float.MIN_VALUE && !value.matches("[0\\.]*") || d > Float.MAX_VALUE) {
            throw new IllegalArgumentException(
                '\"' + value + "\" not representable as float");
        }
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public void accept(ExprVisitor v) {
        v.visitValue(this);
    }
}

