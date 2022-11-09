// Expr.java
package ast;

public abstract class Expr {
    public abstract void accept(ExprVisitor visitor);
}

