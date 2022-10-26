package u2;

public class Params implements Expr {
    private final Expr value;

    public Params(Expr value) {
        this.value = value;
    }
}
