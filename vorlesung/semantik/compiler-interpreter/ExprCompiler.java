// ExprCompiler
import ast.Expr;
import ast.ExprVisitor;
import ast.Operation;
import ast.Value;
import java.io.PrintWriter;
import java.io.UncheckedIOException;

public final class ExprCompiler implements ExprVisitor {
    private final Expr expr;
    private StringBuilder result;

    private static final int PRECISION = 6;

    public ExprCompiler(Expr expr) {
        this.expr = expr;
        this.result = null;
    }

    public String compile() {
        if (this.result == null) {
            this.result = new StringBuilder();
            this.result.append("#!/usr/bin/dc\n");
            this.result.append(String.valueOf(PRECISION));
            this.result.append("\nk\n");
            this.expr.accept(this);
            this.result.append("p\n");
        }
        return this.result.toString();
    }

    @Override
    public void visitValue(Value value) {
        String v = value.getValue();
        if (v.startsWith("-")) {
            v = v.replace('-', '_');
        } else if (v.startsWith("+")) {
            v = v.substring(1);
        }
        this.result.append(v);
        this.result.append('\n');
    }

    @Override
    public void exitOperation(Operation operation) {
        this.result.append(operation.getOperation());
        this.result.append('\n');
    }
}

