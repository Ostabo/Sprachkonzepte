// ExprPrinter
import ast.Expr;
import ast.ExprVisitor;
import ast.Operation;
import ast.Value;
import java.io.UncheckedIOException;

public final class ExprPrinter implements ExprVisitor {
    private final Expr expr;
    private StringBuilder result;

    public ExprPrinter(Expr expr) {
        this.expr = expr;
        this.result = null;
    }

    public String print() {
        if (this.result == null) {
            this.result = new StringBuilder();
            this.expr.accept(this);
        }
        return this.result.toString();
    }

    @Override
    public void visitValue(Value value) {
        this.result.append(value.getValue());
    }

    @Override
    public void enterOperation(Operation operation) {
        this.result.append('(');
    }

    @Override
    public void visitOperation(Operation operation) {
        this.result.append(operation.getOperation());
    }

    @Override
    public void exitOperation(Operation operation) {
        this.result.append(')');
    }
}

