// Operation.java
package ast;

public final class Operation extends Expr {
    public final Expr left;
    public final String op;
    public final Expr right;

    public Operation(Expr left, String op, Expr right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public String getOperation() {
        return this.op;
    }

    @Override
    public void accept(ExprVisitor v) {
        v.enterOperation(this);
        left.accept(v);
        v.visitOperation(this);
        right.accept(v);
        v.exitOperation(this);
    }
}

