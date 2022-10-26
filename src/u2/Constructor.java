package u2;

import java.util.List;

public class Constructor implements Creation {
    private final String leftVal;
    private final List<Expr> params;
    private final String rightVal;

    public Constructor(String leftVal, List<Expr> params, String rightVal) {
        this.leftVal = leftVal;
        this.params = params;
        this.rightVal = rightVal;
    }

    public String getLeftVal() {
        return leftVal;
    }

    public List<Expr> getParams() {
        return params;
    }

    public String getRightVal() {
        return rightVal;
    }

    @Override
    public String toString() {
        return this.leftVal + this.params + this.rightVal;
    }
}
