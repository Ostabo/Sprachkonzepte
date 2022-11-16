// Generated from C:/AIN5/Sprachkonzepte/src/u2\CreationParser.g4 by ANTLR 4.11.1
package u2;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CreationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CreationParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CreationParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStart(CreationParser.StartContext ctx);

    /**
     * Visit a parse tree produced by {@link CreationParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(CreationParser.ExprContext ctx);

    /**
     * Visit a parse tree produced by {@link CreationParser#params}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParams(CreationParser.ParamsContext ctx);

    /**
     * Visit a parse tree produced by {@link CreationParser#param}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParam(CreationParser.ParamContext ctx);
}