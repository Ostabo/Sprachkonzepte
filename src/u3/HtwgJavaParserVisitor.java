// Generated from C:/AIN5/Sprachkonzepte/src/u3\HtwgJavaParser.g4 by ANTLR 4.10.1
package u3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtwgJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtwgJavaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(HtwgJavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(HtwgJavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(HtwgJavaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(HtwgJavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifiers(HtwgJavaParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(HtwgJavaParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(HtwgJavaParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(HtwgJavaParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(HtwgJavaParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(HtwgJavaParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(HtwgJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(HtwgJavaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(HtwgJavaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(HtwgJavaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(HtwgJavaParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(HtwgJavaParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(HtwgJavaParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(HtwgJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(HtwgJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(HtwgJavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(HtwgJavaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(HtwgJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(HtwgJavaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(HtwgJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(HtwgJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(HtwgJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(HtwgJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(HtwgJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(HtwgJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(HtwgJavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(HtwgJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(HtwgJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(HtwgJavaParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(HtwgJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(HtwgJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(HtwgJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(HtwgJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(HtwgJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(HtwgJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(HtwgJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(HtwgJavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(HtwgJavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(HtwgJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(HtwgJavaParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(HtwgJavaParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(HtwgJavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(HtwgJavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(HtwgJavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(HtwgJavaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(HtwgJavaParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HtwgJavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(HtwgJavaParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(HtwgJavaParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(HtwgJavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(HtwgJavaParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(HtwgJavaParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(HtwgJavaParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(HtwgJavaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(HtwgJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(HtwgJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(HtwgJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(HtwgJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(HtwgJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(HtwgJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(HtwgJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(HtwgJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(HtwgJavaParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HtwgJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(HtwgJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(HtwgJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(HtwgJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HtwgJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(HtwgJavaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(HtwgJavaParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(HtwgJavaParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(HtwgJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(HtwgJavaParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(HtwgJavaParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(HtwgJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(HtwgJavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(HtwgJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(HtwgJavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(HtwgJavaParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(HtwgJavaParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(HtwgJavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(HtwgJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HtwgJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(HtwgJavaParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(HtwgJavaParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(HtwgJavaParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(HtwgJavaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(HtwgJavaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(HtwgJavaParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(HtwgJavaParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(HtwgJavaParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(HtwgJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(HtwgJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(HtwgJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(HtwgJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(HtwgJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(HtwgJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(HtwgJavaParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(HtwgJavaParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(HtwgJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(HtwgJavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(HtwgJavaParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(HtwgJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtwgJavaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HtwgJavaParser.ArgumentsContext ctx);
}