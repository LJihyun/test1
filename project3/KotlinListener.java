// Generated from Kotlin.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KotlinParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KotlinParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#packageList}.
	 * @param ctx the parse tree
	 */
	void enterPackageList(KotlinParser.PackageListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#packageList}.
	 * @param ctx the parse tree
	 */
	void exitPackageList(KotlinParser.PackageListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(KotlinParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(KotlinParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(KotlinParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(KotlinParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(KotlinParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(KotlinParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KotlinParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KotlinParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(KotlinParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(KotlinParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(KotlinParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(KotlinParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(KotlinParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(KotlinParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(KotlinParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(KotlinParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(KotlinParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(KotlinParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(KotlinParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(KotlinParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(KotlinParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(KotlinParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(KotlinParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(KotlinParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(KotlinParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(KotlinParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(KotlinParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(KotlinParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(KotlinParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(KotlinParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiVariable}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariable(KotlinParser.MultiVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiVariable}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariable(KotlinParser.MultiVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(KotlinParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(KotlinParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#opExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpExpression(KotlinParser.OpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#opExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpExpression(KotlinParser.OpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#opOperator}.
	 * @param ctx the parse tree
	 */
	void enterOpOperator(KotlinParser.OpOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#opOperator}.
	 * @param ctx the parse tree
	 */
	void exitOpOperator(KotlinParser.OpOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(KotlinParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(KotlinParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#elvis}.
	 * @param ctx the parse tree
	 */
	void enterElvis(KotlinParser.ElvisContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#elvis}.
	 * @param ctx the parse tree
	 */
	void exitElvis(KotlinParser.ElvisContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(KotlinParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(KotlinParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeOperation}.
	 * @param ctx the parse tree
	 */
	void enterRangeOperation(KotlinParser.RangeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeOperation}.
	 * @param ctx the parse tree
	 */
	void exitRangeOperation(KotlinParser.RangeOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#downTo}.
	 * @param ctx the parse tree
	 */
	void enterDownTo(KotlinParser.DownToContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#downTo}.
	 * @param ctx the parse tree
	 */
	void exitDownTo(KotlinParser.DownToContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(KotlinParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(KotlinParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(KotlinParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(KotlinParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(KotlinParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(KotlinParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(KotlinParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(KotlinParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#strText}.
	 * @param ctx the parse tree
	 */
	void enterStrText(KotlinParser.StrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#strText}.
	 * @param ctx the parse tree
	 */
	void exitStrText(KotlinParser.StrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#strRef}.
	 * @param ctx the parse tree
	 */
	void enterStrRef(KotlinParser.StrRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#strRef}.
	 * @param ctx the parse tree
	 */
	void exitStrRef(KotlinParser.StrRefContext ctx);
}