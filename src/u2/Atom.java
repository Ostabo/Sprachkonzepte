package u2;

public class Atom implements Expr {
    private final String val;

    public Atom(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public String toString() {
        return this.val;
    }
}
