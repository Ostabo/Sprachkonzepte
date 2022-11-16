// Generated from C:/AIN5/Sprachkonzepte/src/u2\CreationParser.g4 by ANTLR 4.11.1
package u2;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreationParser}.
 */
public interface CreationParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CreationParser#start}.
     *
     * @param ctx the parse tree
     */
    void enterStart(CreationParser.StartContext ctx);

    /**
     * Exit a parse tree produced by {@link CreationParser#start}.
     *
     * @param ctx the parse tree
     */
    void exitStart(CreationParser.StartContext ctx);

    /**
     * Enter a parse tree produced by {@link CreationParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(CreationParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link CreationParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(CreationParser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link CreationParser#params}.
     *
     * @param ctx the parse tree
     */
    void enterParams(CreationParser.ParamsContext ctx);

    /**
     * Exit a parse tree produced by {@link CreationParser#params}.
     *
     * @param ctx the parse tree
     */
    void exitParams(CreationParser.ParamsContext ctx);

    /**
     * Enter a parse tree produced by {@link CreationParser#param}.
     *
     * @param ctx the parse tree
     */
    void enterParam(CreationParser.ParamContext ctx);

    /**
     * Exit a parse tree produced by {@link CreationParser#param}.
     *
     * @param ctx the parse tree
     */
    void exitParam(CreationParser.ParamContext ctx);
}