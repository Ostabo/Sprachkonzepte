// ExprVisitor.java
package ast;

public interface ExprVisitor {
    default void enterOperation(Operation operation) { }
    default void exitOperation(Operation operation) { }
    default void visitOperation(Operation operation) { }
    default void visitValue(Value value) { }
}

