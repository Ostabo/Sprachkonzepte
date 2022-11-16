// Generated from C:/AIN5/Sprachkonzepte/src/u3\HtwgJavaParser.g4 by ANTLR 4.10.1
package u3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtwgJavaParser}.
 */
public interface HtwgJavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(HtwgJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(HtwgJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(HtwgJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(HtwgJavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(HtwgJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(HtwgJavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(HtwgJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(HtwgJavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiers(HtwgJavaParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiers(HtwgJavaParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(HtwgJavaParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(HtwgJavaParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(HtwgJavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(HtwgJavaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(HtwgJavaParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(HtwgJavaParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(HtwgJavaParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(HtwgJavaParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(HtwgJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(HtwgJavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(HtwgJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(HtwgJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(HtwgJavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(HtwgJavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(HtwgJavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(HtwgJavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(HtwgJavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(HtwgJavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(HtwgJavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(HtwgJavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(HtwgJavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(HtwgJavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(HtwgJavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(HtwgJavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(HtwgJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(HtwgJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(HtwgJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(HtwgJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(HtwgJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(HtwgJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(HtwgJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(HtwgJavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(HtwgJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(HtwgJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(HtwgJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(HtwgJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(HtwgJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(HtwgJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(HtwgJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(HtwgJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(HtwgJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(HtwgJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(HtwgJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(HtwgJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(HtwgJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(HtwgJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(HtwgJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(HtwgJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(HtwgJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(HtwgJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(HtwgJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(HtwgJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(HtwgJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(HtwgJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(HtwgJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(HtwgJavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(HtwgJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(HtwgJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(HtwgJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(HtwgJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(HtwgJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(HtwgJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(HtwgJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(HtwgJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(HtwgJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(HtwgJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(HtwgJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(HtwgJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(HtwgJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(HtwgJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(HtwgJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(HtwgJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(HtwgJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(HtwgJavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(HtwgJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(HtwgJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(HtwgJavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(HtwgJavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(HtwgJavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(HtwgJavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(HtwgJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(HtwgJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(HtwgJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(HtwgJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(HtwgJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(HtwgJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(HtwgJavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(HtwgJavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(HtwgJavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(HtwgJavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HtwgJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HtwgJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(HtwgJavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(HtwgJavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(HtwgJavaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(HtwgJavaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(HtwgJavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(HtwgJavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(HtwgJavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(HtwgJavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(HtwgJavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(HtwgJavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(HtwgJavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(HtwgJavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(HtwgJavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(HtwgJavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(HtwgJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(HtwgJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(HtwgJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(HtwgJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(HtwgJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(HtwgJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(HtwgJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(HtwgJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(HtwgJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(HtwgJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(HtwgJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(HtwgJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(HtwgJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(HtwgJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(HtwgJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(HtwgJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(HtwgJavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(HtwgJavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HtwgJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HtwgJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(HtwgJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(HtwgJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(HtwgJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(HtwgJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(HtwgJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(HtwgJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HtwgJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HtwgJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(HtwgJavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(HtwgJavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(HtwgJavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(HtwgJavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(HtwgJavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(HtwgJavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(HtwgJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(HtwgJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(HtwgJavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(HtwgJavaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(HtwgJavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(HtwgJavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(HtwgJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(HtwgJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(HtwgJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(HtwgJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(HtwgJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(HtwgJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(HtwgJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(HtwgJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(HtwgJavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(HtwgJavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(HtwgJavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(HtwgJavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(HtwgJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(HtwgJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(HtwgJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(HtwgJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HtwgJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HtwgJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(HtwgJavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(HtwgJavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(HtwgJavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(HtwgJavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(HtwgJavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(HtwgJavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(HtwgJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(HtwgJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(HtwgJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(HtwgJavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(HtwgJavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(HtwgJavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(HtwgJavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(HtwgJavaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(HtwgJavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(HtwgJavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(HtwgJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(HtwgJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(HtwgJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(HtwgJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(HtwgJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(HtwgJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(HtwgJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(HtwgJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(HtwgJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(HtwgJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(HtwgJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(HtwgJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(HtwgJavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(HtwgJavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(HtwgJavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(HtwgJavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(HtwgJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(HtwgJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(HtwgJavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(HtwgJavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(HtwgJavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(HtwgJavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(HtwgJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(HtwgJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtwgJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HtwgJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtwgJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HtwgJavaParser.ArgumentsContext ctx);
}