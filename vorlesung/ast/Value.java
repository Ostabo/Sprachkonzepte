// Value.java
public final class Value extends Expr {
    private final String value;

    public Value(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}

