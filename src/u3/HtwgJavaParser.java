// Generated from C:/AIN5/Sprachkonzepte/src/u3\HtwgJavaParser.g4 by ANTLR 4.10.1
package u3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HtwgJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, DECIMAL_LITERAL=51, HEX_LITERAL=52, OCT_LITERAL=53, BINARY_LITERAL=54, 
		FLOAT_LITERAL=55, HEX_FLOAT_LITERAL=56, BOOL_LITERAL=57, CHAR_LITERAL=58, 
		STRING_LITERAL=59, NULL_LITERAL=60, LPAREN=61, RPAREN=62, LBRACE=63, RBRACE=64, 
		LBRACK=65, RBRACK=66, SEMI=67, COMMA=68, DOT=69, ASSIGN=70, GT=71, LT=72, 
		BANG=73, TILDE=74, QUESTION=75, COLON=76, EQUAL=77, LE=78, GE=79, NOTEQUAL=80, 
		AND=81, OR=82, INC=83, DEC=84, ADD=85, SUB=86, MUL=87, DIV=88, BITAND=89, 
		BITOR=90, CARET=91, MOD=92, ADD_ASSIGN=93, SUB_ASSIGN=94, MUL_ASSIGN=95, 
		DIV_ASSIGN=96, AND_ASSIGN=97, OR_ASSIGN=98, XOR_ASSIGN=99, MOD_ASSIGN=100, 
		LSHIFT_ASSIGN=101, RSHIFT_ASSIGN=102, URSHIFT_ASSIGN=103, ARROW=104, COLONCOLON=105, 
		AT=106, ELLIPSIS=107, WS=108, COMMENT=109, LINE_COMMENT=110, IDENTIFIER=111;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceModifiers = 4, RULE_accessModifier = 5, 
		RULE_classModifier = 6, RULE_modifiers = 7, RULE_memberModifier = 8, RULE_variableModifier = 9, 
		RULE_classDeclaration = 10, RULE_typeParameters = 11, RULE_typeParameter = 12, 
		RULE_typeBound = 13, RULE_enumDeclaration = 14, RULE_enumConstants = 15, 
		RULE_enumConstant = 16, RULE_enumBodyDeclarations = 17, RULE_interfaceDeclaration = 18, 
		RULE_classBody = 19, RULE_interfaceBody = 20, RULE_classBodyDeclaration = 21, 
		RULE_memberDeclaration = 22, RULE_methodDeclaration = 23, RULE_methodBody = 24, 
		RULE_typeTypeOrVoid = 25, RULE_genericMethodDeclaration = 26, RULE_genericConstructorDeclaration = 27, 
		RULE_constructorDeclaration = 28, RULE_fieldDeclaration = 29, RULE_interfaceBodyDeclaration = 30, 
		RULE_interfaceMemberDeclaration = 31, RULE_constDeclaration = 32, RULE_constantDeclarator = 33, 
		RULE_interfaceMethodDeclaration = 34, RULE_interfaceMethodModifier = 35, 
		RULE_genericInterfaceMethodDeclaration = 36, RULE_variableDeclarators = 37, 
		RULE_variableDeclarator = 38, RULE_variableDeclaratorId = 39, RULE_variableInitializer = 40, 
		RULE_arrayInitializer = 41, RULE_classOrInterfaceType = 42, RULE_typeArgument = 43, 
		RULE_qualifiedNameList = 44, RULE_formalParameters = 45, RULE_formalParameterList = 46, 
		RULE_formalParameter = 47, RULE_lastFormalParameter = 48, RULE_qualifiedName = 49, 
		RULE_literal = 50, RULE_integerLiteral = 51, RULE_floatLiteral = 52, RULE_altAnnotationQualifiedName = 53, 
		RULE_annotation = 54, RULE_elementValuePairs = 55, RULE_elementValuePair = 56, 
		RULE_elementValue = 57, RULE_elementValueArrayInitializer = 58, RULE_annotationTypeDeclaration = 59, 
		RULE_annotationTypeBody = 60, RULE_annotationTypeElementDeclaration = 61, 
		RULE_annotationTypeElementRest = 62, RULE_annotationMethodOrConstantRest = 63, 
		RULE_annotationMethodRest = 64, RULE_annotationConstantRest = 65, RULE_defaultValue = 66, 
		RULE_block = 67, RULE_blockStatement = 68, RULE_localVariableDeclaration = 69, 
		RULE_localTypeDeclaration = 70, RULE_statement = 71, RULE_catchClause = 72, 
		RULE_catchType = 73, RULE_finallyBlock = 74, RULE_resourceSpecification = 75, 
		RULE_resources = 76, RULE_resource = 77, RULE_switchBlockStatementGroup = 78, 
		RULE_switchLabel = 79, RULE_forControl = 80, RULE_forInit = 81, RULE_enhancedForControl = 82, 
		RULE_parExpression = 83, RULE_expressionList = 84, RULE_methodCall = 85, 
		RULE_expression = 86, RULE_lambdaExpression = 87, RULE_lambdaParameters = 88, 
		RULE_lambdaBody = 89, RULE_primary = 90, RULE_classType = 91, RULE_creator = 92, 
		RULE_createdName = 93, RULE_innerCreator = 94, RULE_arrayCreatorRest = 95, 
		RULE_classCreatorRest = 96, RULE_explicitGenericInvocation = 97, RULE_typeArgumentsOrDiamond = 98, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 99, RULE_nonWildcardTypeArguments = 100, 
		RULE_typeList = 101, RULE_typeType = 102, RULE_primitiveType = 103, RULE_typeArguments = 104, 
		RULE_superSuffix = 105, RULE_explicitGenericInvocationSuffix = 106, RULE_arguments = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classOrInterfaceModifiers", "accessModifier", "classModifier", "modifiers", 
			"memberModifier", "variableModifier", "classDeclaration", "typeParameters", 
			"typeParameter", "typeBound", "enumDeclaration", "enumConstants", "enumConstant", 
			"enumBodyDeclarations", "interfaceDeclaration", "classBody", "interfaceBody", 
			"classBodyDeclaration", "memberDeclaration", "methodDeclaration", "methodBody", 
			"typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "lambdaExpression", "lambdaParameters", 
			"lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HtwgJavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtwgJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HtwgJavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(216);
				packageDeclaration();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(219);
				importDeclaration();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(225);
				typeDeclaration();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(HtwgJavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(233);
				annotation();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(PACKAGE);
			setState(240);
			qualifiedName();
			setState(241);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HtwgJavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(HtwgJavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(HtwgJavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(HtwgJavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IMPORT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(244);
				match(STATIC);
				}
			}

			setState(247);
			qualifiedName();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(248);
				match(DOT);
				setState(249);
				match(MUL);
				}
			}

			setState(252);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				classOrInterfaceModifiers();
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(255);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(256);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(257);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(258);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(HtwgJavaParser.STATIC, 0); }
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public TerminalNode STRICTFP() { return getToken(HtwgJavaParser.STRICTFP, 0); }
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassOrInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceModifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					annotation();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(270);
				accessModifier();
				}
			}

			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(273);
				match(STATIC);
				}
			}

			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==FINAL) {
				{
				setState(276);
				classModifier();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICTFP) {
				{
				setState(279);
				match(STRICTFP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(HtwgJavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(HtwgJavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(HtwgJavaParser.PRIVATE, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(HtwgJavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(HtwgJavaParser.FINAL, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==ABSTRACT || _la==FINAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(HtwgJavaParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(HtwgJavaParser.STATIC, 0); }
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					annotation();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(292);
				accessModifier();
				}
				break;
			}
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(295);
				match(ABSTRACT);
				}
				break;
			case 2:
				{
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(296);
					match(STATIC);
					}
					break;
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						memberModifier();
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(HtwgJavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(HtwgJavaParser.STRICTFP, 0); }
		public TerminalNode NATIVE() { return getToken(HtwgJavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(HtwgJavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(HtwgJavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(HtwgJavaParser.VOLATILE, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << NATIVE) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(HtwgJavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableModifier);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(FINAL);
				}
				break;
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(HtwgJavaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(HtwgJavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(HtwgJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CLASS);
			setState(314);
			match(IDENTIFIER);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(315);
				typeParameters();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(318);
				match(EXTENDS);
				setState(319);
				typeType();
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(322);
				match(IMPLEMENTS);
				setState(323);
				typeList();
				}
			}

			setState(326);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HtwgJavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(HtwgJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LT);
			setState(329);
			typeParameter();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(330);
				match(COMMA);
				setState(331);
				typeParameter();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(HtwgJavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					annotation();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(345);
			match(IDENTIFIER);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(346);
				match(EXTENDS);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(347);
						annotation();
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(353);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(HtwgJavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(HtwgJavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			typeType();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(357);
				match(BITAND);
				setState(358);
				typeType();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(HtwgJavaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(HtwgJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HtwgJavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ENUM);
			setState(365);
			match(IDENTIFIER);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(366);
				match(IMPLEMENTS);
				setState(367);
				typeList();
				}
			}

			setState(370);
			match(LBRACE);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(371);
				enumConstants();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(374);
				match(COMMA);
				}
			}

			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(377);
				enumBodyDeclarations();
				}
			}

			setState(380);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			enumConstant();
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(383);
					match(COMMA);
					setState(384);
					enumConstant();
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					annotation();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(396);
			match(IDENTIFIER);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(397);
				arguments();
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(400);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(SEMI);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(404);
				classBodyDeclaration();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(HtwgJavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(HtwgJavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(INTERFACE);
			setState(411);
			match(IDENTIFIER);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(412);
				typeParameters();
				}
			}

			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(415);
				match(EXTENDS);
				setState(416);
				typeList();
				}
			}

			setState(419);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(LBRACE);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(422);
				classBodyDeclaration();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(LBRACE);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(431);
				interfaceBodyDeclaration();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(HtwgJavaParser.STATIC, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(440);
					match(STATIC);
					}
				}

				setState(443);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				modifiers();
				setState(445);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_memberDeclaration);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(456);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(457);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(HtwgJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(HtwgJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(HtwgJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(HtwgJavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(HtwgJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			typeTypeOrVoid();
			setState(461);
			match(IDENTIFIER);
			setState(462);
			formalParameters();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(463);
				match(LBRACK);
				setState(464);
				match(RBRACK);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(470);
				match(THROWS);
				setState(471);
				qualifiedNameList();
				}
			}

			setState(474);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodBody);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(HtwgJavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeTypeOrVoid);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			typeParameters();
			setState(485);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			typeParameters();
			setState(488);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(HtwgJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(IDENTIFIER);
			setState(491);
			formalParameters();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(492);
				match(THROWS);
				setState(493);
				qualifiedNameList();
				}
			}

			setState(496);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			typeType();
			setState(499);
			variableDeclarators();
			setState(500);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceBodyDeclaration);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				modifiers();
				setState(503);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMemberDeclaration);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(514);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			typeType();
			setState(518);
			constantDeclarator();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				constantDeclarator();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(HtwgJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(HtwgJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(HtwgJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(HtwgJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(HtwgJavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(IDENTIFIER);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(529);
				match(LBRACK);
				setState(530);
				match(RBRACK);
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(ASSIGN);
			setState(537);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(HtwgJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(HtwgJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(HtwgJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(HtwgJavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(HtwgJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					interfaceMethodModifier();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(545);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(546);
				typeParameters();
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						annotation();
						}
						} 
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(553);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
			match(IDENTIFIER);
			setState(558);
			formalParameters();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(559);
				match(LBRACK);
				setState(560);
				match(RBRACK);
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(566);
				match(THROWS);
				setState(567);
				qualifiedNameList();
				}
			}

			setState(570);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(HtwgJavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(HtwgJavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(HtwgJavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(HtwgJavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(HtwgJavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_interfaceMethodModifier);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			typeParameters();
			setState(581);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			variableDeclarator();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				variableDeclarator();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HtwgJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			variableDeclaratorId();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(592);
				match(ASSIGN);
				setState(593);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(HtwgJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(HtwgJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(HtwgJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(HtwgJavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(IDENTIFIER);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(597);
				match(LBRACK);
				setState(598);
				match(RBRACK);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableInitializer);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(LBRACE);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(609);
				variableInitializer();
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						match(COMMA);
						setState(611);
						variableInitializer();
						}
						} 
					}
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(617);
					match(COMMA);
					}
				}

				}
			}

			setState(622);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtwgJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtwgJavaParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtwgJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtwgJavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(IDENTIFIER);
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(625);
				typeArguments();
				}
				break;
			}
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(628);
					match(DOT);
					setState(629);
					match(IDENTIFIER);
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(630);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(HtwgJavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(HtwgJavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(HtwgJavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeArgument);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==IDENTIFIER) {
					{
					{
					setState(639);
					annotation();
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
				match(QUESTION);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(647);
					typeType();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			qualifiedName();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				qualifiedName();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(LPAREN);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(661);
				formalParameterList();
				}
			}

			setState(664);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				formalParameter();
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(667);
						match(COMMA);
						setState(668);
						formalParameter();
						}
						} 
					}
					setState(673);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(674);
					match(COMMA);
					setState(675);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(681);
					variableModifier();
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(687);
			typeType();
			setState(688);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(HtwgJavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(690);
					variableModifier();
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(696);
			typeType();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(697);
				annotation();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			match(ELLIPSIS);
			setState(704);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtwgJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtwgJavaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtwgJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtwgJavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(IDENTIFIER);
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					match(DOT);
					setState(708);
					match(IDENTIFIER);
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(HtwgJavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HtwgJavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(HtwgJavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(HtwgJavaParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(HtwgJavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(HtwgJavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(HtwgJavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(HtwgJavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(HtwgJavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(HtwgJavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(HtwgJavaParser.AT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtwgJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtwgJavaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtwgJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtwgJavaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAltAnnotationQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAltAnnotationQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAltAnnotationQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(726);
				match(IDENTIFIER);
				setState(727);
				match(DOT);
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(733);
			match(AT);
			setState(734);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(HtwgJavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(736);
				match(AT);
				setState(737);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(738);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(741);
				match(LPAREN);
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(742);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(743);
					elementValue();
					}
					break;
				}
				setState(746);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			elementValuePair();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750);
				match(COMMA);
				setState(751);
				elementValuePair();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(HtwgJavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(IDENTIFIER);
			setState(758);
			match(ASSIGN);
			setState(759);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValue);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(LBRACE);
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(767);
				elementValue();
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(768);
						match(COMMA);
						setState(769);
						elementValue();
						}
						} 
					}
					setState(774);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
			}

			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(777);
				match(COMMA);
				}
			}

			setState(780);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(HtwgJavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(HtwgJavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(AT);
			setState(783);
			match(INTERFACE);
			setState(784);
			match(IDENTIFIER);
			setState(785);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(LBRACE);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(788);
				annotationTypeElementDeclaration();
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(794);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementDeclaration);
		try {
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				modifiers();
				setState(797);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementRest);
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				typeType();
				setState(803);
				annotationMethodOrConstantRest();
				setState(804);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				classDeclaration();
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(807);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				interfaceDeclaration();
				setState(812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(811);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				enumDeclaration();
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(815);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(818);
				annotationTypeDeclaration();
				setState(820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(819);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodOrConstantRest);
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(IDENTIFIER);
			setState(829);
			match(LPAREN);
			setState(830);
			match(RPAREN);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(831);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(HtwgJavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(DEFAULT);
			setState(837);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(LBRACE);
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(840);
				blockStatement();
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(846);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockStatement);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				localVariableDeclaration();
				setState(849);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(855);
					variableModifier();
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(861);
			typeType();
			setState(862);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localTypeDeclaration);
		try {
			setState(870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				classOrInterfaceModifiers();
				setState(867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(865);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(866);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(HtwgJavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(HtwgJavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(HtwgJavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HtwgJavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(HtwgJavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(HtwgJavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(HtwgJavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(HtwgJavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(HtwgJavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(HtwgJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HtwgJavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(HtwgJavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(HtwgJavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(HtwgJavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(HtwgJavaParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(HtwgJavaParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(ASSERT);
				setState(874);
				expression(0);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(875);
					match(COLON);
					setState(876);
					expression(0);
					}
				}

				setState(879);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				match(IF);
				setState(882);
				parExpression();
				setState(883);
				statement();
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(884);
					match(ELSE);
					setState(885);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(888);
				match(FOR);
				setState(889);
				match(LPAREN);
				setState(890);
				forControl();
				setState(891);
				match(RPAREN);
				setState(892);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(894);
				match(WHILE);
				setState(895);
				parExpression();
				setState(896);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(898);
				match(DO);
				setState(899);
				statement();
				setState(900);
				match(WHILE);
				setState(901);
				parExpression();
				setState(902);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(904);
				match(TRY);
				setState(905);
				block();
				setState(915);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(907); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(906);
						catchClause();
						}
						}
						setState(909); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(911);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(914);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(917);
				match(TRY);
				setState(918);
				resourceSpecification();
				setState(919);
				block();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(920);
					catchClause();
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(926);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(929);
				match(SWITCH);
				setState(930);
				parExpression();
				setState(931);
				match(LBRACE);
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(932);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(938);
					switchLabel();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(946);
				match(SYNCHRONIZED);
				setState(947);
				parExpression();
				setState(948);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(950);
				match(RETURN);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(951);
					expression(0);
					}
				}

				setState(954);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(955);
				match(THROW);
				setState(956);
				expression(0);
				setState(957);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(959);
				match(BREAK);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(960);
					match(IDENTIFIER);
					}
				}

				setState(963);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(964);
				match(CONTINUE);
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(965);
					match(IDENTIFIER);
					}
				}

				setState(968);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(969);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(970);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(971);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(973);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(974);
				match(COLON);
				setState(975);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(HtwgJavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(CATCH);
			setState(979);
			match(LPAREN);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(980);
					variableModifier();
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(986);
			catchType();
			setState(987);
			match(IDENTIFIER);
			setState(988);
			match(RPAREN);
			setState(989);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(HtwgJavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(HtwgJavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			qualifiedName();
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(992);
				match(BITOR);
				setState(993);
				qualifiedName();
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(HtwgJavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(FINALLY);
			setState(1000);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(HtwgJavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(LPAREN);
			setState(1003);
			resources();
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1004);
				match(SEMI);
				}
			}

			setState(1007);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HtwgJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HtwgJavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			resource();
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1010);
					match(SEMI);
					setState(1011);
					resource();
					}
					} 
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HtwgJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resource);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1017);
					variableModifier();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(1023);
			classOrInterfaceType();
			setState(1024);
			variableDeclaratorId();
			setState(1025);
			match(ASSIGN);
			setState(1026);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1028);
				switchLabel();
				}
				}
				setState(1031); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1034); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1033);
				blockStatement();
				}
				}
				setState(1036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(HtwgJavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(HtwgJavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(HtwgJavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				match(CASE);
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1039);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1040);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1043);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(DEFAULT);
				setState(1045);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(HtwgJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HtwgJavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1049);
					forInit();
					}
				}

				setState(1052);
				match(SEMI);
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1053);
					expression(0);
					}
				}

				setState(1056);
				match(SEMI);
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1057);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HtwgJavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1066);
					variableModifier();
					}
					} 
				}
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			setState(1072);
			typeType();
			setState(1073);
			variableDeclaratorId();
			setState(1074);
			match(COLON);
			setState(1075);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(LPAREN);
			setState(1078);
			expression(0);
			setState(1079);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			expression(0);
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1082);
				match(COMMA);
				setState(1083);
				expression(0);
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(HtwgJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(HtwgJavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_methodCall);
		int _la;
		try {
			setState(1107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				match(IDENTIFIER);
				setState(1090);
				match(LPAREN);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1091);
					expressionList();
					}
				}

				setState(1094);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				match(THIS);
				setState(1096);
				match(LPAREN);
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1097);
					expressionList();
					}
				}

				setState(1100);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				match(SUPER);
				setState(1102);
				match(LPAREN);
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1103);
					expressionList();
					}
				}

				setState(1106);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(HtwgJavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(HtwgJavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(HtwgJavaParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(HtwgJavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(HtwgJavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(HtwgJavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(HtwgJavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(HtwgJavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(HtwgJavaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(HtwgJavaParser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(HtwgJavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(HtwgJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(HtwgJavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(HtwgJavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HtwgJavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(HtwgJavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HtwgJavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(HtwgJavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(HtwgJavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(HtwgJavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HtwgJavaParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(HtwgJavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(HtwgJavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(HtwgJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(HtwgJavaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(HtwgJavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(HtwgJavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(HtwgJavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(HtwgJavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(HtwgJavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(HtwgJavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(HtwgJavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(HtwgJavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(HtwgJavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(HtwgJavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(HtwgJavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(HtwgJavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(HtwgJavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(HtwgJavaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(HtwgJavaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(HtwgJavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(HtwgJavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(HtwgJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(HtwgJavaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(HtwgJavaParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1110);
				primary();
				}
				break;
			case 2:
				{
				setState(1111);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1112);
				match(NEW);
				setState(1113);
				creator();
				}
				break;
			case 4:
				{
				setState(1114);
				match(LPAREN);
				setState(1118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1115);
						annotation();
						}
						} 
					}
					setState(1120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				setState(1121);
				typeType();
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1122);
					match(BITAND);
					setState(1123);
					typeType();
					}
					}
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1129);
				match(RPAREN);
				setState(1130);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1132);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INC - 83)) | (1L << (DEC - 83)) | (1L << (ADD - 83)) | (1L << (SUB - 83)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1133);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1134);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1135);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1136);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1137);
				typeType();
				setState(1138);
				match(COLONCOLON);
				setState(1144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1139);
						typeArguments();
						}
					}

					setState(1142);
					match(IDENTIFIER);
					}
					break;
				case NEW:
					{
					setState(1143);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1146);
				classType();
				setState(1147);
				match(COLONCOLON);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1148);
					typeArguments();
					}
				}

				setState(1151);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1156);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MUL - 87)) | (1L << (DIV - 87)) | (1L << (MOD - 87)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1157);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1158);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1159);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1160);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1161);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1169);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
						case 1:
							{
							setState(1162);
							match(LT);
							setState(1163);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1164);
							match(GT);
							setState(1165);
							match(GT);
							setState(1166);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1167);
							match(GT);
							setState(1168);
							match(GT);
							}
							break;
						}
						setState(1171);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1173);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (GT - 71)) | (1L << (LT - 71)) | (1L << (LE - 71)) | (1L << (GE - 71)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1174);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1176);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1177);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1179);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1180);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1182);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1183);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1185);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1186);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1188);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1189);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1190);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1191);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1192);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1194);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1195);
						expression(0);
						setState(1196);
						match(COLON);
						setState(1197);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1200);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1201);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1203);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1215);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
						case 1:
							{
							setState(1204);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1205);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1206);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1207);
							match(NEW);
							setState(1209);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1208);
								nonWildcardTypeArguments();
								}
							}

							setState(1211);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1212);
							match(SUPER);
							setState(1213);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1214);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1217);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1218);
						match(LBRACK);
						setState(1219);
						expression(0);
						setState(1220);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1222);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1223);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1224);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1225);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1226);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1228);
						match(COLONCOLON);
						setState(1230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1229);
							typeArguments();
							}
						}

						setState(1232);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HtwgJavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			lambdaParameters();
			setState(1239);
			match(ARROW);
			setState(1240);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtwgJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtwgJavaParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lambdaParameters);
		int _la;
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				match(LPAREN);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1244);
					formalParameterList();
					}
				}

				setState(1247);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				match(LPAREN);
				setState(1249);
				match(IDENTIFIER);
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1250);
					match(COMMA);
					setState(1251);
					match(IDENTIFIER);
					}
					}
					setState(1256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1257);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdaBody);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(HtwgJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(HtwgJavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HtwgJavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(HtwgJavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_primary);
		try {
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(LPAREN);
				setState(1265);
				expression(0);
				setState(1266);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1271);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1272);
				typeTypeOrVoid();
				setState(1273);
				match(DOT);
				setState(1274);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1276);
				nonWildcardTypeArguments();
				setState(1280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1277);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1278);
					match(THIS);
					setState(1279);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HtwgJavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1284);
				classOrInterfaceType();
				setState(1285);
				match(DOT);
				}
				break;
			}
			setState(1292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1289);
					annotation();
					}
					} 
				}
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1295);
			match(IDENTIFIER);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1296);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_creator);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				nonWildcardTypeArguments();
				setState(1300);
				createdName();
				setState(1301);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				createdName();
				setState(1306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1304);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1305);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HtwgJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HtwgJavaParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtwgJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtwgJavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_createdName);
		int _la;
		try {
			setState(1325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				match(IDENTIFIER);
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1311);
					typeArgumentsOrDiamond();
					}
				}

				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1314);
					match(DOT);
					setState(1315);
					match(IDENTIFIER);
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1316);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(IDENTIFIER);
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1328);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1331);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(HtwgJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(HtwgJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(HtwgJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(HtwgJavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(LBRACK);
			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1334);
				match(RBRACK);
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1335);
					match(LBRACK);
					setState(1336);
					match(RBRACK);
					}
					}
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1342);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1343);
				expression(0);
				setState(1344);
				match(RBRACK);
				setState(1351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1345);
						match(LBRACK);
						setState(1346);
						expression(0);
						setState(1347);
						match(RBRACK);
						}
						} 
					}
					setState(1353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1354);
						match(LBRACK);
						setState(1355);
						match(RBRACK);
						}
						} 
					}
					setState(1360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			arguments();
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1364);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			nonWildcardTypeArguments();
			setState(1368);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HtwgJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(HtwgJavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeArgumentsOrDiamond);
		try {
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				match(LT);
				setState(1371);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HtwgJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(HtwgJavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				match(LT);
				setState(1376);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HtwgJavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(HtwgJavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(LT);
			setState(1381);
			typeList();
			setState(1382);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			typeType();
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1385);
				match(COMMA);
				setState(1386);
				typeType();
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(HtwgJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(HtwgJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(HtwgJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(HtwgJavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1392);
					annotation();
					}
					} 
				}
				setState(1397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1398);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1399);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1402);
						annotation();
						}
						}
						setState(1407);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1408);
					match(LBRACK);
					setState(1409);
					match(RBRACK);
					}
					} 
				}
				setState(1414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(HtwgJavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(HtwgJavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(HtwgJavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(HtwgJavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(HtwgJavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(HtwgJavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(HtwgJavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(HtwgJavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HtwgJavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(HtwgJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HtwgJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HtwgJavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(LT);
			setState(1418);
			typeArgument();
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1419);
				match(COMMA);
				setState(1420);
				typeArgument();
				}
				}
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1426);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HtwgJavaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_superSuffix);
		try {
			setState(1434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				match(DOT);
				setState(1430);
				match(IDENTIFIER);
				setState(1432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1431);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(HtwgJavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HtwgJavaParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				match(SUPER);
				setState(1437);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				match(IDENTIFIER);
				setState(1439);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HtwgJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HtwgJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtwgJavaParserListener ) ((HtwgJavaParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtwgJavaParserVisitor ) return ((HtwgJavaParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(LPAREN);
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1443);
				expressionList();
				}
			}

			setState(1446);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 86:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001o\u05a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0001\u0000\u0003\u0000\u00da\b\u0000"+
		"\u0001\u0000\u0005\u0000\u00dd\b\u0000\n\u0000\f\u0000\u00e0\t\u0000\u0001"+
		"\u0000\u0005\u0000\u00e3\b\u0000\n\u0000\f\u0000\u00e6\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001\u00eb\b\u0001\n\u0001\f\u0001\u00ee"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00f6\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00fb\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0104\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0107\b\u0003\u0001\u0004\u0005\u0004\u010a\b\u0004\n\u0004\f\u0004"+
		"\u010d\t\u0004\u0001\u0004\u0003\u0004\u0110\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0113\b\u0004\u0001\u0004\u0003\u0004\u0116\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0119\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0005\u0007\u0120\b\u0007\n\u0007\f\u0007\u0123\t\u0007\u0001"+
		"\u0007\u0003\u0007\u0126\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u012a"+
		"\b\u0007\u0001\u0007\u0005\u0007\u012d\b\u0007\n\u0007\f\u0007\u0130\t"+
		"\u0007\u0003\u0007\u0132\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\t\u0138\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u013d\b\n\u0001\n\u0001\n"+
		"\u0003\n\u0141\b\n\u0001\n\u0001\n\u0003\n\u0145\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u014d\b\u000b\n"+
		"\u000b\f\u000b\u0150\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0155"+
		"\b\f\n\f\f\f\u0158\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u015d\b\f\n\f\f"+
		"\f\u0160\t\f\u0001\f\u0003\f\u0163\b\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0168\b\r\n\r\f\r\u016b\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0171\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0175"+
		"\b\u000e\u0001\u000e\u0003\u000e\u0178\b\u000e\u0001\u000e\u0003\u000e"+
		"\u017b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0182\b\u000f\n\u000f\f\u000f\u0185\t\u000f\u0001\u0010\u0005"+
		"\u0010\u0188\b\u0010\n\u0010\f\u0010\u018b\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u018f\b\u0010\u0001\u0010\u0003\u0010\u0192\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0196\b\u0011\n\u0011\f\u0011\u0199\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u019e\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01a2\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01a8\b\u0013\n\u0013\f\u0013\u01ab\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u01b1\b\u0014\n"+
		"\u0014\f\u0014\u01b4\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01ba\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01c0\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01cb\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01d2\b\u0017\n\u0017\f\u0017\u01d5\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01d9\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01df\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01e3\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01ef\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01fb\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0204\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u020a\b \n \f \u020d\t \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0005!\u0214\b!\n!\f!\u0217\t!\u0001!\u0001!\u0001!\u0001\"\u0005\""+
		"\u021d\b\"\n\"\f\"\u0220\t\"\u0001\"\u0001\"\u0001\"\u0005\"\u0225\b\""+
		"\n\"\f\"\u0228\t\"\u0001\"\u0001\"\u0003\"\u022c\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u0232\b\"\n\"\f\"\u0235\t\"\u0001\"\u0001\"\u0003\""+
		"\u0239\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0243\b#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u024b\b%\n"+
		"%\f%\u024e\t%\u0001&\u0001&\u0001&\u0003&\u0253\b&\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u0258\b\'\n\'\f\'\u025b\t\'\u0001(\u0001(\u0003(\u025f\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0265\b)\n)\f)\u0268\t)\u0001)\u0003)\u026b"+
		"\b)\u0003)\u026d\b)\u0001)\u0001)\u0001*\u0001*\u0003*\u0273\b*\u0001"+
		"*\u0001*\u0001*\u0003*\u0278\b*\u0005*\u027a\b*\n*\f*\u027d\t*\u0001+"+
		"\u0001+\u0005+\u0281\b+\n+\f+\u0284\t+\u0001+\u0001+\u0001+\u0003+\u0289"+
		"\b+\u0003+\u028b\b+\u0001,\u0001,\u0001,\u0005,\u0290\b,\n,\f,\u0293\t"+
		",\u0001-\u0001-\u0003-\u0297\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005"+
		".\u029e\b.\n.\f.\u02a1\t.\u0001.\u0001.\u0003.\u02a5\b.\u0001.\u0003."+
		"\u02a8\b.\u0001/\u0005/\u02ab\b/\n/\f/\u02ae\t/\u0001/\u0001/\u0001/\u0001"+
		"0\u00050\u02b4\b0\n0\f0\u02b7\t0\u00010\u00010\u00050\u02bb\b0\n0\f0\u02be"+
		"\t0\u00010\u00010\u00010\u00011\u00011\u00011\u00051\u02c6\b1\n1\f1\u02c9"+
		"\t1\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02d1\b2\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00055\u02d9\b5\n5\f5\u02dc\t5\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00036\u02e4\b6\u00016\u00016\u00016\u0003"+
		"6\u02e9\b6\u00016\u00036\u02ec\b6\u00017\u00017\u00017\u00057\u02f1\b"+
		"7\n7\f7\u02f4\t7\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0003"+
		"9\u02fd\b9\u0001:\u0001:\u0001:\u0001:\u0005:\u0303\b:\n:\f:\u0306\t:"+
		"\u0003:\u0308\b:\u0001:\u0003:\u030b\b:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0005<\u0316\b<\n<\f<\u0319\t<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0003=\u0321\b=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u0329\b>\u0001>\u0001>\u0003>\u032d\b>\u0001>\u0001"+
		">\u0003>\u0331\b>\u0001>\u0001>\u0003>\u0335\b>\u0003>\u0337\b>\u0001"+
		"?\u0001?\u0003?\u033b\b?\u0001@\u0001@\u0001@\u0001@\u0003@\u0341\b@\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001C\u0001C\u0005C\u034a\bC\nC\fC\u034d"+
		"\tC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0356\bD\u0001"+
		"E\u0005E\u0359\bE\nE\fE\u035c\tE\u0001E\u0001E\u0001E\u0001F\u0001F\u0001"+
		"F\u0003F\u0364\bF\u0001F\u0003F\u0367\bF\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u036e\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u0377\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0004G\u038c\bG\u000bG\fG\u038d\u0001G\u0003G\u0391\bG\u0001G\u0003"+
		"G\u0394\bG\u0001G\u0001G\u0001G\u0001G\u0005G\u039a\bG\nG\fG\u039d\tG"+
		"\u0001G\u0003G\u03a0\bG\u0001G\u0001G\u0001G\u0001G\u0005G\u03a6\bG\n"+
		"G\fG\u03a9\tG\u0001G\u0005G\u03ac\bG\nG\fG\u03af\tG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u03b9\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0003G\u03c2\bG\u0001G\u0001G\u0001G\u0003"+
		"G\u03c7\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u03d1\bG\u0001H\u0001H\u0001H\u0005H\u03d6\bH\nH\fH\u03d9\tH\u0001H"+
		"\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0005I\u03e3\bI\nI\f"+
		"I\u03e6\tI\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0003K\u03ee\bK\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0005L\u03f5\bL\nL\fL\u03f8\tL\u0001M\u0005"+
		"M\u03fb\bM\nM\fM\u03fe\tM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001N\u0004"+
		"N\u0406\bN\u000bN\fN\u0407\u0001N\u0004N\u040b\bN\u000bN\fN\u040c\u0001"+
		"O\u0001O\u0001O\u0003O\u0412\bO\u0001O\u0001O\u0001O\u0003O\u0417\bO\u0001"+
		"P\u0001P\u0003P\u041b\bP\u0001P\u0001P\u0003P\u041f\bP\u0001P\u0001P\u0003"+
		"P\u0423\bP\u0003P\u0425\bP\u0001Q\u0001Q\u0003Q\u0429\bQ\u0001R\u0005"+
		"R\u042c\bR\nR\fR\u042f\tR\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0001S\u0001T\u0001T\u0001T\u0005T\u043d\bT\nT\fT\u0440\tT\u0001"+
		"U\u0001U\u0001U\u0003U\u0445\bU\u0001U\u0001U\u0001U\u0001U\u0003U\u044b"+
		"\bU\u0001U\u0001U\u0001U\u0001U\u0003U\u0451\bU\u0001U\u0003U\u0454\b"+
		"U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0005V\u045d\bV\nV"+
		"\fV\u0460\tV\u0001V\u0001V\u0001V\u0005V\u0465\bV\nV\fV\u0468\tV\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0003V\u0475\bV\u0001V\u0001V\u0003V\u0479\bV\u0001V\u0001V\u0001V\u0003"+
		"V\u047e\bV\u0001V\u0001V\u0003V\u0482\bV\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003"+
		"V\u0492\bV\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003"+
		"V\u04ba\bV\u0001V\u0001V\u0001V\u0001V\u0003V\u04c0\bV\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0003V\u04cf\bV\u0001V\u0005V\u04d2\bV\nV\fV\u04d5\tV\u0001W\u0001W"+
		"\u0001W\u0001W\u0001X\u0001X\u0001X\u0003X\u04de\bX\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0005X\u04e5\bX\nX\fX\u04e8\tX\u0001X\u0003X\u04eb\bX"+
		"\u0001Y\u0001Y\u0003Y\u04ef\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0003Z\u0501\bZ\u0003Z\u0503\bZ\u0001[\u0001[\u0001[\u0003[\u0508\b"+
		"[\u0001[\u0005[\u050b\b[\n[\f[\u050e\t[\u0001[\u0001[\u0003[\u0512\b["+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u051b"+
		"\b\\\u0003\\\u051d\b\\\u0001]\u0001]\u0003]\u0521\b]\u0001]\u0001]\u0001"+
		"]\u0003]\u0526\b]\u0005]\u0528\b]\n]\f]\u052b\t]\u0001]\u0003]\u052e\b"+
		"]\u0001^\u0001^\u0003^\u0532\b^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001"+
		"_\u0005_\u053a\b_\n_\f_\u053d\t_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0005_\u0546\b_\n_\f_\u0549\t_\u0001_\u0001_\u0005_\u054d\b_"+
		"\n_\f_\u0550\t_\u0003_\u0552\b_\u0001`\u0001`\u0003`\u0556\b`\u0001a\u0001"+
		"a\u0001a\u0001b\u0001b\u0001b\u0003b\u055e\bb\u0001c\u0001c\u0001c\u0003"+
		"c\u0563\bc\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0005e\u056c"+
		"\be\ne\fe\u056f\te\u0001f\u0005f\u0572\bf\nf\ff\u0575\tf\u0001f\u0001"+
		"f\u0003f\u0579\bf\u0001f\u0005f\u057c\bf\nf\ff\u057f\tf\u0001f\u0001f"+
		"\u0005f\u0583\bf\nf\ff\u0586\tf\u0001g\u0001g\u0001h\u0001h\u0001h\u0001"+
		"h\u0005h\u058e\bh\nh\fh\u0591\th\u0001h\u0001h\u0001i\u0001i\u0001i\u0001"+
		"i\u0003i\u0599\bi\u0003i\u059b\bi\u0001j\u0001j\u0001j\u0001j\u0003j\u05a1"+
		"\bj\u0001k\u0001k\u0003k\u05a5\bk\u0001k\u0001k\u0001k\u0000\u0001\u00ac"+
		"l\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u0000\u000f\u0001\u0000!#\u0002\u0000"+
		"\u0001\u0001\u0012\u0012\u0006\u0000\u0012\u0012\u001e\u001e\'\'**..1"+
		"1\u0002\u0000\u0011\u0011((\u0001\u000036\u0001\u000078\u0001\u0000SV"+
		"\u0001\u0000IJ\u0002\u0000WX\\\\\u0001\u0000UV\u0002\u0000GHNO\u0002\u0000"+
		"MMPP\u0002\u0000FF]g\u0001\u0000ST\b\u0000\u0003\u0003\u0005\u0005\b\b"+
		"\u000e\u000e\u0014\u0014\u001b\u001b\u001d\u001d%%\u0640\u0000\u00d9\u0001"+
		"\u0000\u0000\u0000\u0002\u00ec\u0001\u0000\u0000\u0000\u0004\u00f3\u0001"+
		"\u0000\u0000\u0000\u0006\u0106\u0001\u0000\u0000\u0000\b\u010b\u0001\u0000"+
		"\u0000\u0000\n\u011a\u0001\u0000\u0000\u0000\f\u011c\u0001\u0000\u0000"+
		"\u0000\u000e\u0121\u0001\u0000\u0000\u0000\u0010\u0133\u0001\u0000\u0000"+
		"\u0000\u0012\u0137\u0001\u0000\u0000\u0000\u0014\u0139\u0001\u0000\u0000"+
		"\u0000\u0016\u0148\u0001\u0000\u0000\u0000\u0018\u0156\u0001\u0000\u0000"+
		"\u0000\u001a\u0164\u0001\u0000\u0000\u0000\u001c\u016c\u0001\u0000\u0000"+
		"\u0000\u001e\u017e\u0001\u0000\u0000\u0000 \u0189\u0001\u0000\u0000\u0000"+
		"\"\u0193\u0001\u0000\u0000\u0000$\u019a\u0001\u0000\u0000\u0000&\u01a5"+
		"\u0001\u0000\u0000\u0000(\u01ae\u0001\u0000\u0000\u0000*\u01bf\u0001\u0000"+
		"\u0000\u0000,\u01ca\u0001\u0000\u0000\u0000.\u01cc\u0001\u0000\u0000\u0000"+
		"0\u01de\u0001\u0000\u0000\u00002\u01e2\u0001\u0000\u0000\u00004\u01e4"+
		"\u0001\u0000\u0000\u00006\u01e7\u0001\u0000\u0000\u00008\u01ea\u0001\u0000"+
		"\u0000\u0000:\u01f2\u0001\u0000\u0000\u0000<\u01fa\u0001\u0000\u0000\u0000"+
		">\u0203\u0001\u0000\u0000\u0000@\u0205\u0001\u0000\u0000\u0000B\u0210"+
		"\u0001\u0000\u0000\u0000D\u021e\u0001\u0000\u0000\u0000F\u0242\u0001\u0000"+
		"\u0000\u0000H\u0244\u0001\u0000\u0000\u0000J\u0247\u0001\u0000\u0000\u0000"+
		"L\u024f\u0001\u0000\u0000\u0000N\u0254\u0001\u0000\u0000\u0000P\u025e"+
		"\u0001\u0000\u0000\u0000R\u0260\u0001\u0000\u0000\u0000T\u0270\u0001\u0000"+
		"\u0000\u0000V\u028a\u0001\u0000\u0000\u0000X\u028c\u0001\u0000\u0000\u0000"+
		"Z\u0294\u0001\u0000\u0000\u0000\\\u02a7\u0001\u0000\u0000\u0000^\u02ac"+
		"\u0001\u0000\u0000\u0000`\u02b5\u0001\u0000\u0000\u0000b\u02c2\u0001\u0000"+
		"\u0000\u0000d\u02d0\u0001\u0000\u0000\u0000f\u02d2\u0001\u0000\u0000\u0000"+
		"h\u02d4\u0001\u0000\u0000\u0000j\u02da\u0001\u0000\u0000\u0000l\u02e3"+
		"\u0001\u0000\u0000\u0000n\u02ed\u0001\u0000\u0000\u0000p\u02f5\u0001\u0000"+
		"\u0000\u0000r\u02fc\u0001\u0000\u0000\u0000t\u02fe\u0001\u0000\u0000\u0000"+
		"v\u030e\u0001\u0000\u0000\u0000x\u0313\u0001\u0000\u0000\u0000z\u0320"+
		"\u0001\u0000\u0000\u0000|\u0336\u0001\u0000\u0000\u0000~\u033a\u0001\u0000"+
		"\u0000\u0000\u0080\u033c\u0001\u0000\u0000\u0000\u0082\u0342\u0001\u0000"+
		"\u0000\u0000\u0084\u0344\u0001\u0000\u0000\u0000\u0086\u0347\u0001\u0000"+
		"\u0000\u0000\u0088\u0355\u0001\u0000\u0000\u0000\u008a\u035a\u0001\u0000"+
		"\u0000\u0000\u008c\u0366\u0001\u0000\u0000\u0000\u008e\u03d0\u0001\u0000"+
		"\u0000\u0000\u0090\u03d2\u0001\u0000\u0000\u0000\u0092\u03df\u0001\u0000"+
		"\u0000\u0000\u0094\u03e7\u0001\u0000\u0000\u0000\u0096\u03ea\u0001\u0000"+
		"\u0000\u0000\u0098\u03f1\u0001\u0000\u0000\u0000\u009a\u03fc\u0001\u0000"+
		"\u0000\u0000\u009c\u0405\u0001\u0000\u0000\u0000\u009e\u0416\u0001\u0000"+
		"\u0000\u0000\u00a0\u0424\u0001\u0000\u0000\u0000\u00a2\u0428\u0001\u0000"+
		"\u0000\u0000\u00a4\u042d\u0001\u0000\u0000\u0000\u00a6\u0435\u0001\u0000"+
		"\u0000\u0000\u00a8\u0439\u0001\u0000\u0000\u0000\u00aa\u0453\u0001\u0000"+
		"\u0000\u0000\u00ac\u0481\u0001\u0000\u0000\u0000\u00ae\u04d6\u0001\u0000"+
		"\u0000\u0000\u00b0\u04ea\u0001\u0000\u0000\u0000\u00b2\u04ee\u0001\u0000"+
		"\u0000\u0000\u00b4\u0502\u0001\u0000\u0000\u0000\u00b6\u0507\u0001\u0000"+
		"\u0000\u0000\u00b8\u051c\u0001\u0000\u0000\u0000\u00ba\u052d\u0001\u0000"+
		"\u0000\u0000\u00bc\u052f\u0001\u0000\u0000\u0000\u00be\u0535\u0001\u0000"+
		"\u0000\u0000\u00c0\u0553\u0001\u0000\u0000\u0000\u00c2\u0557\u0001\u0000"+
		"\u0000\u0000\u00c4\u055d\u0001\u0000\u0000\u0000\u00c6\u0562\u0001\u0000"+
		"\u0000\u0000\u00c8\u0564\u0001\u0000\u0000\u0000\u00ca\u0568\u0001\u0000"+
		"\u0000\u0000\u00cc\u0573\u0001\u0000\u0000\u0000\u00ce\u0587\u0001\u0000"+
		"\u0000\u0000\u00d0\u0589\u0001\u0000\u0000\u0000\u00d2\u059a\u0001\u0000"+
		"\u0000\u0000\u00d4\u05a0\u0001\u0000\u0000\u0000\u00d6\u05a2\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0003\u0002\u0001\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00de\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0003\u0004\u0002\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003\u0006"+
		"\u0003\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0000\u0000\u0001\u00e8\u0001\u0001\u0000"+
		"\u0000\u0000\u00e9\u00eb\u0003l6\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005 \u0000\u0000\u00f0"+
		"\u00f1\u0003b1\u0000\u00f1\u00f2\u0005C\u0000\u0000\u00f2\u0003\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0005\u0019\u0000\u0000\u00f4\u00f6\u0005"+
		"&\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fa\u0003b1\u0000"+
		"\u00f8\u00f9\u0005E\u0000\u0000\u00f9\u00fb\u0005W\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005C\u0000\u0000\u00fd\u0005\u0001"+
		"\u0000\u0000\u0000\u00fe\u0103\u0003\b\u0004\u0000\u00ff\u0104\u0003\u0014"+
		"\n\u0000\u0100\u0104\u0003\u001c\u000e\u0000\u0101\u0104\u0003$\u0012"+
		"\u0000\u0102\u0104\u0003v;\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0107\u0005C\u0000\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0007\u0001\u0000\u0000\u0000\u0108\u010a"+
		"\u0003l6\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u0110\u0003\n\u0005\u0000\u010f\u010e\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u0113\u0005&\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0003\f\u0006\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0005\'\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\t\u0001\u0000\u0000\u0000\u011a\u011b\u0007"+
		"\u0000\u0000\u0000\u011b\u000b\u0001\u0000\u0000\u0000\u011c\u011d\u0007"+
		"\u0001\u0000\u0000\u011d\r\u0001\u0000\u0000\u0000\u011e\u0120\u0003l"+
		"6\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0124\u0126\u0003\n\u0005\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0131\u0001\u0000\u0000\u0000"+
		"\u0127\u0132\u0005\u0001\u0000\u0000\u0128\u012a\u0005&\u0000\u0000\u0129"+
		"\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012e\u0001\u0000\u0000\u0000\u012b\u012d\u0003\u0010\b\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0132"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0127"+
		"\u0001\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0132\u000f"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0007\u0002\u0000\u0000\u0134\u0011"+
		"\u0001\u0000\u0000\u0000\u0135\u0138\u0005\u0012\u0000\u0000\u0136\u0138"+
		"\u0003l6\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0013\u0001\u0000\u0000\u0000\u0139\u013a\u0005\t\u0000"+
		"\u0000\u013a\u013c\u0005o\u0000\u0000\u013b\u013d\u0003\u0016\u000b\u0000"+
		"\u013c\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0011\u0000\u0000"+
		"\u013f\u0141\u0003\u00ccf\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0005\u0018\u0000\u0000\u0143\u0145\u0003\u00cae\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0003&\u0013\u0000\u0147\u0015\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005H\u0000\u0000\u0149\u014e\u0003\u0018"+
		"\f\u0000\u014a\u014b\u0005D\u0000\u0000\u014b\u014d\u0003\u0018\f\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005G\u0000\u0000\u0152\u0017\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0003l6\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0159\u0162\u0005o\u0000\u0000\u015a\u015e\u0005\u0011"+
		"\u0000\u0000\u015b\u015d\u0003l6\u0000\u015c\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0163\u0003\u001a\r\u0000\u0162"+
		"\u015a\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0019\u0001\u0000\u0000\u0000\u0164\u0169\u0003\u00ccf\u0000\u0165\u0166"+
		"\u0005Y\u0000\u0000\u0166\u0168\u0003\u00ccf\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u001b\u0001\u0000"+
		"\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0010"+
		"\u0000\u0000\u016d\u0170\u0005o\u0000\u0000\u016e\u016f\u0005\u0018\u0000"+
		"\u0000\u016f\u0171\u0003\u00cae\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u0005?\u0000\u0000\u0173\u0175\u0003\u001e\u000f\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0177\u0001\u0000\u0000\u0000\u0176\u0178\u0005D\u0000\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0003\"\u0011\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005@\u0000\u0000\u017d\u001d\u0001\u0000"+
		"\u0000\u0000\u017e\u0183\u0003 \u0010\u0000\u017f\u0180\u0005D\u0000\u0000"+
		"\u0180\u0182\u0003 \u0010\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182"+
		"\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184\u001f\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u0188\u0003l6\u0000\u0187\u0186\u0001"+
		"\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018e\u0005"+
		"o\u0000\u0000\u018d\u018f\u0003\u00d6k\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u0192\u0003&\u0013\u0000\u0191\u0190\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192!\u0001\u0000\u0000\u0000\u0193"+
		"\u0197\u0005C\u0000\u0000\u0194\u0196\u0003*\u0015\u0000\u0195\u0194\u0001"+
		"\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198#\u0001\u0000"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u001c"+
		"\u0000\u0000\u019b\u019d\u0005o\u0000\u0000\u019c\u019e\u0003\u0016\u000b"+
		"\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0011\u0000"+
		"\u0000\u01a0\u01a2\u0003\u00cae\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0003(\u0014\u0000\u01a4%\u0001\u0000\u0000\u0000\u01a5\u01a9"+
		"\u0005?\u0000\u0000\u01a6\u01a8\u0003*\u0015\u0000\u01a7\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005@\u0000"+
		"\u0000\u01ad\'\u0001\u0000\u0000\u0000\u01ae\u01b2\u0005?\u0000\u0000"+
		"\u01af\u01b1\u0003<\u001e\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005@\u0000\u0000\u01b6)\u0001"+
		"\u0000\u0000\u0000\u01b7\u01c0\u0005C\u0000\u0000\u01b8\u01ba\u0005&\u0000"+
		"\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01c0\u0003\u0086C\u0000"+
		"\u01bc\u01bd\u0003\u000e\u0007\u0000\u01bd\u01be\u0003,\u0016\u0000\u01be"+
		"\u01c0\u0001\u0000\u0000\u0000\u01bf\u01b7\u0001\u0000\u0000\u0000\u01bf"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01c0"+
		"+\u0001\u0000\u0000\u0000\u01c1\u01cb\u0003.\u0017\u0000\u01c2\u01cb\u0003"+
		"4\u001a\u0000\u01c3\u01cb\u0003:\u001d\u0000\u01c4\u01cb\u00038\u001c"+
		"\u0000\u01c5\u01cb\u00036\u001b\u0000\u01c6\u01cb\u0003$\u0012\u0000\u01c7"+
		"\u01cb\u0003v;\u0000\u01c8\u01cb\u0003\u0014\n\u0000\u01c9\u01cb\u0003"+
		"\u001c\u000e\u0000\u01ca\u01c1\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c3\u0001\u0000\u0000\u0000\u01ca\u01c4\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c5\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c7\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb-\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u00032\u0019\u0000\u01cd\u01ce\u0005o\u0000\u0000"+
		"\u01ce\u01d3\u0003Z-\u0000\u01cf\u01d0\u0005A\u0000\u0000\u01d0\u01d2"+
		"\u0005B\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d8\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0005-\u0000\u0000\u01d7\u01d9\u0003X,"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u00030\u0018\u0000"+
		"\u01db/\u0001\u0000\u0000\u0000\u01dc\u01df\u0003\u0086C\u0000\u01dd\u01df"+
		"\u0005C\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01dd\u0001"+
		"\u0000\u0000\u0000\u01df1\u0001\u0000\u0000\u0000\u01e0\u01e3\u0003\u00cc"+
		"f\u0000\u01e1\u01e3\u00050\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e33\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0003\u0016\u000b\u0000\u01e5\u01e6\u0003.\u0017\u0000\u01e65\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0003\u0016\u000b\u0000\u01e8\u01e9\u0003"+
		"8\u001c\u0000\u01e97\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005o\u0000"+
		"\u0000\u01eb\u01ee\u0003Z-\u0000\u01ec\u01ed\u0005-\u0000\u0000\u01ed"+
		"\u01ef\u0003X,\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003"+
		"\u0086C\u0000\u01f19\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003\u00ccf"+
		"\u0000\u01f3\u01f4\u0003J%\u0000\u01f4\u01f5\u0005C\u0000\u0000\u01f5"+
		";\u0001\u0000\u0000\u0000\u01f6\u01f7\u0003\u000e\u0007\u0000\u01f7\u01f8"+
		"\u0003>\u001f\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005"+
		"C\u0000\u0000\u01fa\u01f6\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb=\u0001\u0000\u0000\u0000\u01fc\u0204\u0003@ \u0000"+
		"\u01fd\u0204\u0003D\"\u0000\u01fe\u0204\u0003H$\u0000\u01ff\u0204\u0003"+
		"$\u0012\u0000\u0200\u0204\u0003v;\u0000\u0201\u0204\u0003\u0014\n\u0000"+
		"\u0202\u0204\u0003\u001c\u000e\u0000\u0203\u01fc\u0001\u0000\u0000\u0000"+
		"\u0203\u01fd\u0001\u0000\u0000\u0000\u0203\u01fe\u0001\u0000\u0000\u0000"+
		"\u0203\u01ff\u0001\u0000\u0000\u0000\u0203\u0200\u0001\u0000\u0000\u0000"+
		"\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000"+
		"\u0204?\u0001\u0000\u0000\u0000\u0205\u0206\u0003\u00ccf\u0000\u0206\u020b"+
		"\u0003B!\u0000\u0207\u0208\u0005D\u0000\u0000\u0208\u020a\u0003B!\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u020e\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0005C\u0000\u0000\u020fA\u0001\u0000\u0000\u0000\u0210\u0215"+
		"\u0005o\u0000\u0000\u0211\u0212\u0005A\u0000\u0000\u0212\u0214\u0005B"+
		"\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000"+
		"\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0005F\u0000\u0000\u0219\u021a\u0003P(\u0000"+
		"\u021aC\u0001\u0000\u0000\u0000\u021b\u021d\u0003F#\u0000\u021c\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u022b"+
		"\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u022c"+
		"\u00032\u0019\u0000\u0222\u0226\u0003\u0016\u000b\u0000\u0223\u0225\u0003"+
		"l6\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000"+
		"\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u00032\u0019\u0000\u022a\u022c\u0001\u0000\u0000\u0000"+
		"\u022b\u0221\u0001\u0000\u0000\u0000\u022b\u0222\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0005o\u0000\u0000\u022e"+
		"\u0233\u0003Z-\u0000\u022f\u0230\u0005A\u0000\u0000\u0230\u0232\u0005"+
		"B\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0238\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0005-\u0000\u0000\u0237\u0239\u0003X,\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u00030\u0018\u0000\u023b"+
		"E\u0001\u0000\u0000\u0000\u023c\u0243\u0003l6\u0000\u023d\u0243\u0005"+
		"#\u0000\u0000\u023e\u0243\u0005\u0001\u0000\u0000\u023f\u0243\u0005\f"+
		"\u0000\u0000\u0240\u0243\u0005&\u0000\u0000\u0241\u0243\u0005\'\u0000"+
		"\u0000\u0242\u023c\u0001\u0000\u0000\u0000\u0242\u023d\u0001\u0000\u0000"+
		"\u0000\u0242\u023e\u0001\u0000\u0000\u0000\u0242\u023f\u0001\u0000\u0000"+
		"\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0241\u0001\u0000\u0000"+
		"\u0000\u0243G\u0001\u0000\u0000\u0000\u0244\u0245\u0003\u0016\u000b\u0000"+
		"\u0245\u0246\u0003D\"\u0000\u0246I\u0001\u0000\u0000\u0000\u0247\u024c"+
		"\u0003L&\u0000\u0248\u0249\u0005D\u0000\u0000\u0249\u024b\u0003L&\u0000"+
		"\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000"+
		"\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024dK\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f"+
		"\u0252\u0003N\'\u0000\u0250\u0251\u0005F\u0000\u0000\u0251\u0253\u0003"+
		"P(\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000"+
		"\u0000\u0253M\u0001\u0000\u0000\u0000\u0254\u0259\u0005o\u0000\u0000\u0255"+
		"\u0256\u0005A\u0000\u0000\u0256\u0258\u0005B\u0000\u0000\u0257\u0255\u0001"+
		"\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u0257\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025aO\u0001\u0000"+
		"\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c\u025f\u0003R)\u0000"+
		"\u025d\u025f\u0003\u00acV\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e"+
		"\u025d\u0001\u0000\u0000\u0000\u025fQ\u0001\u0000\u0000\u0000\u0260\u026c"+
		"\u0005?\u0000\u0000\u0261\u0266\u0003P(\u0000\u0262\u0263\u0005D\u0000"+
		"\u0000\u0263\u0265\u0003P(\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265"+
		"\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0269\u026b\u0005D\u0000\u0000\u026a\u0269"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026d"+
		"\u0001\u0000\u0000\u0000\u026c\u0261\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0005@\u0000\u0000\u026fS\u0001\u0000\u0000\u0000\u0270\u0272\u0005o"+
		"\u0000\u0000\u0271\u0273\u0003\u00d0h\u0000\u0272\u0271\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u027b\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0005E\u0000\u0000\u0275\u0277\u0005o\u0000\u0000\u0276"+
		"\u0278\u0003\u00d0h\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0274"+
		"\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027cU\u0001"+
		"\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u028b\u0003"+
		"\u00ccf\u0000\u027f\u0281\u0003l6\u0000\u0280\u027f\u0001\u0000\u0000"+
		"\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000"+
		"\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000"+
		"\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0288\u0005K\u0000\u0000"+
		"\u0286\u0287\u0007\u0003\u0000\u0000\u0287\u0289\u0003\u00ccf\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u028b\u0001\u0000\u0000\u0000\u028a\u027e\u0001\u0000\u0000\u0000\u028a"+
		"\u0282\u0001\u0000\u0000\u0000\u028bW\u0001\u0000\u0000\u0000\u028c\u0291"+
		"\u0003b1\u0000\u028d\u028e\u0005D\u0000\u0000\u028e\u0290\u0003b1\u0000"+
		"\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000"+
		"\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000"+
		"\u0292Y\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294"+
		"\u0296\u0005=\u0000\u0000\u0295\u0297\u0003\\.\u0000\u0296\u0295\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0005>\u0000\u0000\u0299[\u0001\u0000\u0000"+
		"\u0000\u029a\u029f\u0003^/\u0000\u029b\u029c\u0005D\u0000\u0000\u029c"+
		"\u029e\u0003^/\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a1\u0001"+
		"\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a4\u0001\u0000\u0000\u0000\u02a1\u029f\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0005D\u0000\u0000\u02a3\u02a5\u0003`0"+
		"\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a8\u0003`0\u0000\u02a7"+
		"\u029a\u0001\u0000\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8"+
		"]\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003\u0012\t\u0000\u02aa\u02a9"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af"+
		"\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0003\u00ccf\u0000\u02b0\u02b1\u0003N\'\u0000\u02b1_\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b4\u0003\u0012\t\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02bc\u0003\u00ccf\u0000\u02b9"+
		"\u02bb\u0003l6\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb\u02be\u0001"+
		"\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bf\u0001\u0000\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0005k\u0000\u0000\u02c0\u02c1\u0003N\'"+
		"\u0000\u02c1a\u0001\u0000\u0000\u0000\u02c2\u02c7\u0005o\u0000\u0000\u02c3"+
		"\u02c4\u0005E\u0000\u0000\u02c4\u02c6\u0005o\u0000\u0000\u02c5\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8c\u0001\u0000"+
		"\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02d1\u0003f3\u0000"+
		"\u02cb\u02d1\u0003h4\u0000\u02cc\u02d1\u0005:\u0000\u0000\u02cd\u02d1"+
		"\u0005;\u0000\u0000\u02ce\u02d1\u00059\u0000\u0000\u02cf\u02d1\u0005<"+
		"\u0000\u0000\u02d0\u02ca\u0001\u0000\u0000\u0000\u02d0\u02cb\u0001\u0000"+
		"\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000\u0000\u02d0\u02cd\u0001\u0000"+
		"\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d1e\u0001\u0000\u0000\u0000\u02d2\u02d3\u0007\u0004\u0000"+
		"\u0000\u02d3g\u0001\u0000\u0000\u0000\u02d4\u02d5\u0007\u0005\u0000\u0000"+
		"\u02d5i\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005o\u0000\u0000\u02d7\u02d9"+
		"\u0005E\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001"+
		"\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001"+
		"\u0000\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc\u02da\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0005j\u0000\u0000\u02de\u02df\u0005o\u0000"+
		"\u0000\u02dfk\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005j\u0000\u0000\u02e1"+
		"\u02e4\u0003b1\u0000\u02e2\u02e4\u0003j5\u0000\u02e3\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4\u02eb\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e8\u0005=\u0000\u0000\u02e6\u02e9\u0003n7\u0000"+
		"\u02e7\u02e9\u0003r9\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02ec\u0005>\u0000\u0000\u02eb\u02e5\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ecm\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f2\u0003p8\u0000\u02ee\u02ef\u0005D\u0000\u0000"+
		"\u02ef\u02f1\u0003p8\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f3o\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0005o\u0000\u0000\u02f6\u02f7\u0005F\u0000"+
		"\u0000\u02f7\u02f8\u0003r9\u0000\u02f8q\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fd\u0003\u00acV\u0000\u02fa\u02fd\u0003l6\u0000\u02fb\u02fd\u0003"+
		"t:\u0000\u02fc\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fds\u0001\u0000\u0000\u0000"+
		"\u02fe\u0307\u0005?\u0000\u0000\u02ff\u0304\u0003r9\u0000\u0300\u0301"+
		"\u0005D\u0000\u0000\u0301\u0303\u0003r9\u0000\u0302\u0300\u0001\u0000"+
		"\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000"+
		"\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000"+
		"\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0307\u02ff\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a\u0001\u0000"+
		"\u0000\u0000\u0309\u030b\u0005D\u0000\u0000\u030a\u0309\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0005@\u0000\u0000\u030du\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0005j\u0000\u0000\u030f\u0310\u0005\u001c\u0000\u0000\u0310\u0311"+
		"\u0005o\u0000\u0000\u0311\u0312\u0003x<\u0000\u0312w\u0001\u0000\u0000"+
		"\u0000\u0313\u0317\u0005?\u0000\u0000\u0314\u0316\u0003z=\u0000\u0315"+
		"\u0314\u0001\u0000\u0000\u0000\u0316\u0319\u0001\u0000\u0000\u0000\u0317"+
		"\u0315\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318"+
		"\u031a\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0005@\u0000\u0000\u031by\u0001\u0000\u0000\u0000\u031c\u031d\u0003"+
		"\u000e\u0007\u0000\u031d\u031e\u0003|>\u0000\u031e\u0321\u0001\u0000\u0000"+
		"\u0000\u031f\u0321\u0005C\u0000\u0000\u0320\u031c\u0001\u0000\u0000\u0000"+
		"\u0320\u031f\u0001\u0000\u0000\u0000\u0321{\u0001\u0000\u0000\u0000\u0322"+
		"\u0323\u0003\u00ccf\u0000\u0323\u0324\u0003~?\u0000\u0324\u0325\u0005"+
		"C\u0000\u0000\u0325\u0337\u0001\u0000\u0000\u0000\u0326\u0328\u0003\u0014"+
		"\n\u0000\u0327\u0329\u0005C\u0000\u0000\u0328\u0327\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u0337\u0001\u0000\u0000"+
		"\u0000\u032a\u032c\u0003$\u0012\u0000\u032b\u032d\u0005C\u0000\u0000\u032c"+
		"\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d"+
		"\u0337\u0001\u0000\u0000\u0000\u032e\u0330\u0003\u001c\u000e\u0000\u032f"+
		"\u0331\u0005C\u0000\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331\u0337\u0001\u0000\u0000\u0000\u0332\u0334"+
		"\u0003v;\u0000\u0333\u0335\u0005C\u0000\u0000\u0334\u0333\u0001\u0000"+
		"\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0001\u0000"+
		"\u0000\u0000\u0336\u0322\u0001\u0000\u0000\u0000\u0336\u0326\u0001\u0000"+
		"\u0000\u0000\u0336\u032a\u0001\u0000\u0000\u0000\u0336\u032e\u0001\u0000"+
		"\u0000\u0000\u0336\u0332\u0001\u0000\u0000\u0000\u0337}\u0001\u0000\u0000"+
		"\u0000\u0338\u033b\u0003\u0080@\u0000\u0339\u033b\u0003\u0082A\u0000\u033a"+
		"\u0338\u0001\u0000\u0000\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033b"+
		"\u007f\u0001\u0000\u0000\u0000\u033c\u033d\u0005o\u0000\u0000\u033d\u033e"+
		"\u0005=\u0000\u0000\u033e\u0340\u0005>\u0000\u0000\u033f\u0341\u0003\u0084"+
		"B\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000"+
		"\u0000\u0341\u0081\u0001\u0000\u0000\u0000\u0342\u0343\u0003J%\u0000\u0343"+
		"\u0083\u0001\u0000\u0000\u0000\u0344\u0345\u0005\f\u0000\u0000\u0345\u0346"+
		"\u0003r9\u0000\u0346\u0085\u0001\u0000\u0000\u0000\u0347\u034b\u0005?"+
		"\u0000\u0000\u0348\u034a\u0003\u0088D\u0000\u0349\u0348\u0001\u0000\u0000"+
		"\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000"+
		"\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034e\u0001\u0000\u0000"+
		"\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u034f\u0005@\u0000\u0000"+
		"\u034f\u0087\u0001\u0000\u0000\u0000\u0350\u0351\u0003\u008aE\u0000\u0351"+
		"\u0352\u0005C\u0000\u0000\u0352\u0356\u0001\u0000\u0000\u0000\u0353\u0356"+
		"\u0003\u008eG\u0000\u0354\u0356\u0003\u008cF\u0000\u0355\u0350\u0001\u0000"+
		"\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000"+
		"\u0000\u0000\u0356\u0089\u0001\u0000\u0000\u0000\u0357\u0359\u0003\u0012"+
		"\t\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0359\u035c\u0001\u0000\u0000"+
		"\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000"+
		"\u0000\u035b\u035d\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000"+
		"\u0000\u035d\u035e\u0003\u00ccf\u0000\u035e\u035f\u0003J%\u0000\u035f"+
		"\u008b\u0001\u0000\u0000\u0000\u0360\u0363\u0003\b\u0004\u0000\u0361\u0364"+
		"\u0003\u0014\n\u0000\u0362\u0364\u0003$\u0012\u0000\u0363\u0361\u0001"+
		"\u0000\u0000\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0364\u0367\u0001"+
		"\u0000\u0000\u0000\u0365\u0367\u0005C\u0000\u0000\u0366\u0360\u0001\u0000"+
		"\u0000\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0367\u008d\u0001\u0000"+
		"\u0000\u0000\u0368\u03d1\u0003\u0086C\u0000\u0369\u036a\u0005\u0002\u0000"+
		"\u0000\u036a\u036d\u0003\u00acV\u0000\u036b\u036c\u0005L\u0000\u0000\u036c"+
		"\u036e\u0003\u00acV\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e"+
		"\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0005C\u0000\u0000\u0370\u03d1\u0001\u0000\u0000\u0000\u0371\u0372\u0005"+
		"\u0016\u0000\u0000\u0372\u0373\u0003\u00a6S\u0000\u0373\u0376\u0003\u008e"+
		"G\u0000\u0374\u0375\u0005\u000f\u0000\u0000\u0375\u0377\u0003\u008eG\u0000"+
		"\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377\u03d1\u0001\u0000\u0000\u0000\u0378\u0379\u0005\u0015\u0000\u0000"+
		"\u0379\u037a\u0005=\u0000\u0000\u037a\u037b\u0003\u00a0P\u0000\u037b\u037c"+
		"\u0005>\u0000\u0000\u037c\u037d\u0003\u008eG\u0000\u037d\u03d1\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u00052\u0000\u0000\u037f\u0380\u0003\u00a6S\u0000"+
		"\u0380\u0381\u0003\u008eG\u0000\u0381\u03d1\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\u0005\r\u0000\u0000\u0383\u0384\u0003\u008eG\u0000\u0384\u0385"+
		"\u00052\u0000\u0000\u0385\u0386\u0003\u00a6S\u0000\u0386\u0387\u0005C"+
		"\u0000\u0000\u0387\u03d1\u0001\u0000\u0000\u0000\u0388\u0389\u0005/\u0000"+
		"\u0000\u0389\u0393\u0003\u0086C\u0000\u038a\u038c\u0003\u0090H\u0000\u038b"+
		"\u038a\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d"+
		"\u038b\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e"+
		"\u0390\u0001\u0000\u0000\u0000\u038f\u0391\u0003\u0094J\u0000\u0390\u038f"+
		"\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0394"+
		"\u0001\u0000\u0000\u0000\u0392\u0394\u0003\u0094J\u0000\u0393\u038b\u0001"+
		"\u0000\u0000\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0394\u03d1\u0001"+
		"\u0000\u0000\u0000\u0395\u0396\u0005/\u0000\u0000\u0396\u0397\u0003\u0096"+
		"K\u0000\u0397\u039b\u0003\u0086C\u0000\u0398\u039a\u0003\u0090H\u0000"+
		"\u0399\u0398\u0001\u0000\u0000\u0000\u039a\u039d\u0001\u0000\u0000\u0000"+
		"\u039b\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000"+
		"\u039c\u039f\u0001\u0000\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000"+
		"\u039e\u03a0\u0003\u0094J\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u039f"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a0\u03d1\u0001\u0000\u0000\u0000\u03a1"+
		"\u03a2\u0005)\u0000\u0000\u03a2\u03a3\u0003\u00a6S\u0000\u03a3\u03a7\u0005"+
		"?\u0000\u0000\u03a4\u03a6\u0003\u009cN\u0000\u03a5\u03a4\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03ad\u0001\u0000\u0000"+
		"\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03ac\u0003\u009eO\u0000"+
		"\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ac\u03af\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000"+
		"\u03ae\u03b0\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0005@\u0000\u0000\u03b1\u03d1\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0005*\u0000\u0000\u03b3\u03b4\u0003\u00a6S\u0000\u03b4\u03b5\u0003"+
		"\u0086C\u0000\u03b5\u03d1\u0001\u0000\u0000\u0000\u03b6\u03b8\u0005$\u0000"+
		"\u0000\u03b7\u03b9\u0003\u00acV\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000"+
		"\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000"+
		"\u03ba\u03d1\u0005C\u0000\u0000\u03bb\u03bc\u0005,\u0000\u0000\u03bc\u03bd"+
		"\u0003\u00acV\u0000\u03bd\u03be\u0005C\u0000\u0000\u03be\u03d1\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c1\u0005\u0004\u0000\u0000\u03c0\u03c2\u0005o\u0000"+
		"\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03d1\u0005C\u0000\u0000"+
		"\u03c4\u03c6\u0005\u000b\u0000\u0000\u03c5\u03c7\u0005o\u0000\u0000\u03c6"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7"+
		"\u03c8\u0001\u0000\u0000\u0000\u03c8\u03d1\u0005C\u0000\u0000\u03c9\u03d1"+
		"\u0005C\u0000\u0000\u03ca\u03cb\u0003\u00acV\u0000\u03cb\u03cc\u0005C"+
		"\u0000\u0000\u03cc\u03d1\u0001\u0000\u0000\u0000\u03cd\u03ce\u0005o\u0000"+
		"\u0000\u03ce\u03cf\u0005L\u0000\u0000\u03cf\u03d1\u0003\u008eG\u0000\u03d0"+
		"\u0368\u0001\u0000\u0000\u0000\u03d0\u0369\u0001\u0000\u0000\u0000\u03d0"+
		"\u0371\u0001\u0000\u0000\u0000\u03d0\u0378\u0001\u0000\u0000\u0000\u03d0"+
		"\u037e\u0001\u0000\u0000\u0000\u03d0\u0382\u0001\u0000\u0000\u0000\u03d0"+
		"\u0388\u0001\u0000\u0000\u0000\u03d0\u0395\u0001\u0000\u0000\u0000\u03d0"+
		"\u03a1\u0001\u0000\u0000\u0000\u03d0\u03b2\u0001\u0000\u0000\u0000\u03d0"+
		"\u03b6\u0001\u0000\u0000\u0000\u03d0\u03bb\u0001\u0000\u0000\u0000\u03d0"+
		"\u03bf\u0001\u0000\u0000\u0000\u03d0\u03c4\u0001\u0000\u0000\u0000\u03d0"+
		"\u03c9\u0001\u0000\u0000\u0000\u03d0\u03ca\u0001\u0000\u0000\u0000\u03d0"+
		"\u03cd\u0001\u0000\u0000\u0000\u03d1\u008f\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d3\u0005\u0007\u0000\u0000\u03d3\u03d7\u0005=\u0000\u0000\u03d4\u03d6"+
		"\u0003\u0012\t\u0000\u03d5\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d9\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d8\u03da\u0001\u0000\u0000\u0000\u03d9\u03d7\u0001"+
		"\u0000\u0000\u0000\u03da\u03db\u0003\u0092I\u0000\u03db\u03dc\u0005o\u0000"+
		"\u0000\u03dc\u03dd\u0005>\u0000\u0000\u03dd\u03de\u0003\u0086C\u0000\u03de"+
		"\u0091\u0001\u0000\u0000\u0000\u03df\u03e4\u0003b1\u0000\u03e0\u03e1\u0005"+
		"Z\u0000\u0000\u03e1\u03e3\u0003b1\u0000\u03e2\u03e0\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e6\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u0093\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e7\u03e8\u0005\u0013\u0000"+
		"\u0000\u03e8\u03e9\u0003\u0086C\u0000\u03e9\u0095\u0001\u0000\u0000\u0000"+
		"\u03ea\u03eb\u0005=\u0000\u0000\u03eb\u03ed\u0003\u0098L\u0000\u03ec\u03ee"+
		"\u0005C\u0000\u0000\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005"+
		">\u0000\u0000\u03f0\u0097\u0001\u0000\u0000\u0000\u03f1\u03f6\u0003\u009a"+
		"M\u0000\u03f2\u03f3\u0005C\u0000\u0000\u03f3\u03f5\u0003\u009aM\u0000"+
		"\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f7\u0099\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000"+
		"\u03f9\u03fb\u0003\u0012\t\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fb"+
		"\u03fe\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fc"+
		"\u03fd\u0001\u0000\u0000\u0000\u03fd\u03ff\u0001\u0000\u0000\u0000\u03fe"+
		"\u03fc\u0001\u0000\u0000\u0000\u03ff\u0400\u0003T*\u0000\u0400\u0401\u0003"+
		"N\'\u0000\u0401\u0402\u0005F\u0000\u0000\u0402\u0403\u0003\u00acV\u0000"+
		"\u0403\u009b\u0001\u0000\u0000\u0000\u0404\u0406\u0003\u009eO\u0000\u0405"+
		"\u0404\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407"+
		"\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408"+
		"\u040a\u0001\u0000\u0000\u0000\u0409\u040b\u0003\u0088D\u0000\u040a\u0409"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040a"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u009d"+
		"\u0001\u0000\u0000\u0000\u040e\u0411\u0005\u0006\u0000\u0000\u040f\u0412"+
		"\u0003\u00acV\u0000\u0410\u0412\u0005o\u0000\u0000\u0411\u040f\u0001\u0000"+
		"\u0000\u0000\u0411\u0410\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000"+
		"\u0000\u0000\u0413\u0417\u0005L\u0000\u0000\u0414\u0415\u0005\f\u0000"+
		"\u0000\u0415\u0417\u0005L\u0000\u0000\u0416\u040e\u0001\u0000\u0000\u0000"+
		"\u0416\u0414\u0001\u0000\u0000\u0000\u0417\u009f\u0001\u0000\u0000\u0000"+
		"\u0418\u0425\u0003\u00a4R\u0000\u0419\u041b\u0003\u00a2Q\u0000\u041a\u0419"+
		"\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c"+
		"\u0001\u0000\u0000\u0000\u041c\u041e\u0005C\u0000\u0000\u041d\u041f\u0003"+
		"\u00acV\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000"+
		"\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0005C\u0000"+
		"\u0000\u0421\u0423\u0003\u00a8T\u0000\u0422\u0421\u0001\u0000\u0000\u0000"+
		"\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000"+
		"\u0424\u0418\u0001\u0000\u0000\u0000\u0424\u041a\u0001\u0000\u0000\u0000"+
		"\u0425\u00a1\u0001\u0000\u0000\u0000\u0426\u0429\u0003\u008aE\u0000\u0427"+
		"\u0429\u0003\u00a8T\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0428\u0427"+
		"\u0001\u0000\u0000\u0000\u0429\u00a3\u0001\u0000\u0000\u0000\u042a\u042c"+
		"\u0003\u0012\t\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042c\u042f\u0001"+
		"\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000\u0000\u042d\u042e\u0001"+
		"\u0000\u0000\u0000\u042e\u0430\u0001\u0000\u0000\u0000\u042f\u042d\u0001"+
		"\u0000\u0000\u0000\u0430\u0431\u0003\u00ccf\u0000\u0431\u0432\u0003N\'"+
		"\u0000\u0432\u0433\u0005L\u0000\u0000\u0433\u0434\u0003\u00acV\u0000\u0434"+
		"\u00a5\u0001\u0000\u0000\u0000\u0435\u0436\u0005=\u0000\u0000\u0436\u0437"+
		"\u0003\u00acV\u0000\u0437\u0438\u0005>\u0000\u0000\u0438\u00a7\u0001\u0000"+
		"\u0000\u0000\u0439\u043e\u0003\u00acV\u0000\u043a\u043b\u0005D\u0000\u0000"+
		"\u043b\u043d\u0003\u00acV\u0000\u043c\u043a\u0001\u0000\u0000\u0000\u043d"+
		"\u0440\u0001\u0000\u0000\u0000\u043e\u043c\u0001\u0000\u0000\u0000\u043e"+
		"\u043f\u0001\u0000\u0000\u0000\u043f\u00a9\u0001\u0000\u0000\u0000\u0440"+
		"\u043e\u0001\u0000\u0000\u0000\u0441\u0442\u0005o\u0000\u0000\u0442\u0444"+
		"\u0005=\u0000\u0000\u0443\u0445\u0003\u00a8T\u0000\u0444\u0443\u0001\u0000"+
		"\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000"+
		"\u0000\u0000\u0446\u0454\u0005>\u0000\u0000\u0447\u0448\u0005+\u0000\u0000"+
		"\u0448\u044a\u0005=\u0000\u0000\u0449\u044b\u0003\u00a8T\u0000\u044a\u0449"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044c"+
		"\u0001\u0000\u0000\u0000\u044c\u0454\u0005>\u0000\u0000\u044d\u044e\u0005"+
		"(\u0000\u0000\u044e\u0450\u0005=\u0000\u0000\u044f\u0451\u0003\u00a8T"+
		"\u0000\u0450\u044f\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000"+
		"\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0454\u0005>\u0000\u0000"+
		"\u0453\u0441\u0001\u0000\u0000\u0000\u0453\u0447\u0001\u0000\u0000\u0000"+
		"\u0453\u044d\u0001\u0000\u0000\u0000\u0454\u00ab\u0001\u0000\u0000\u0000"+
		"\u0455\u0456\u0006V\uffff\uffff\u0000\u0456\u0482\u0003\u00b4Z\u0000\u0457"+
		"\u0482\u0003\u00aaU\u0000\u0458\u0459\u0005\u001f\u0000\u0000\u0459\u0482"+
		"\u0003\u00b8\\\u0000\u045a\u045e\u0005=\u0000\u0000\u045b\u045d\u0003"+
		"l6\u0000\u045c\u045b\u0001\u0000\u0000\u0000\u045d\u0460\u0001\u0000\u0000"+
		"\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045e\u045f\u0001\u0000\u0000"+
		"\u0000\u045f\u0461\u0001\u0000\u0000\u0000\u0460\u045e\u0001\u0000\u0000"+
		"\u0000\u0461\u0466\u0003\u00ccf\u0000\u0462\u0463\u0005Y\u0000\u0000\u0463"+
		"\u0465\u0003\u00ccf\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0465\u0468"+
		"\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0001\u0000\u0000\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0466"+
		"\u0001\u0000\u0000\u0000\u0469\u046a\u0005>\u0000\u0000\u046a\u046b\u0003"+
		"\u00acV\u0015\u046b\u0482\u0001\u0000\u0000\u0000\u046c\u046d\u0007\u0006"+
		"\u0000\u0000\u046d\u0482\u0003\u00acV\u0013\u046e\u046f\u0007\u0007\u0000"+
		"\u0000\u046f\u0482\u0003\u00acV\u0012\u0470\u0482\u0003\u00aeW\u0000\u0471"+
		"\u0472\u0003\u00ccf\u0000\u0472\u0478\u0005i\u0000\u0000\u0473\u0475\u0003"+
		"\u00d0h\u0000\u0474\u0473\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000"+
		"\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0479\u0005o\u0000"+
		"\u0000\u0477\u0479\u0005\u001f\u0000\u0000\u0478\u0474\u0001\u0000\u0000"+
		"\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u0482\u0001\u0000\u0000"+
		"\u0000\u047a\u047b\u0003\u00b6[\u0000\u047b\u047d\u0005i\u0000\u0000\u047c"+
		"\u047e\u0003\u00d0h\u0000\u047d\u047c\u0001\u0000\u0000\u0000\u047d\u047e"+
		"\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u0480"+
		"\u0005\u001f\u0000\u0000\u0480\u0482\u0001\u0000\u0000\u0000\u0481\u0455"+
		"\u0001\u0000\u0000\u0000\u0481\u0457\u0001\u0000\u0000\u0000\u0481\u0458"+
		"\u0001\u0000\u0000\u0000\u0481\u045a\u0001\u0000\u0000\u0000\u0481\u046c"+
		"\u0001\u0000\u0000\u0000\u0481\u046e\u0001\u0000\u0000\u0000\u0481\u0470"+
		"\u0001\u0000\u0000\u0000\u0481\u0471\u0001\u0000\u0000\u0000\u0481\u047a"+
		"\u0001\u0000\u0000\u0000\u0482\u04d3\u0001\u0000\u0000\u0000\u0483\u0484"+
		"\n\u0011\u0000\u0000\u0484\u0485\u0007\b\u0000\u0000\u0485\u04d2\u0003"+
		"\u00acV\u0012\u0486\u0487\n\u0010\u0000\u0000\u0487\u0488\u0007\t\u0000"+
		"\u0000\u0488\u04d2\u0003\u00acV\u0011\u0489\u0491\n\u000f\u0000\u0000"+
		"\u048a\u048b\u0005H\u0000\u0000\u048b\u0492\u0005H\u0000\u0000\u048c\u048d"+
		"\u0005G\u0000\u0000\u048d\u048e\u0005G\u0000\u0000\u048e\u0492\u0005G"+
		"\u0000\u0000\u048f\u0490\u0005G\u0000\u0000\u0490\u0492\u0005G\u0000\u0000"+
		"\u0491\u048a\u0001\u0000\u0000\u0000\u0491\u048c\u0001\u0000\u0000\u0000"+
		"\u0491\u048f\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000\u0000\u0000"+
		"\u0493\u04d2\u0003\u00acV\u0010\u0494\u0495\n\u000e\u0000\u0000\u0495"+
		"\u0496\u0007\n\u0000\u0000\u0496\u04d2\u0003\u00acV\u000f\u0497\u0498"+
		"\n\f\u0000\u0000\u0498\u0499\u0007\u000b\u0000\u0000\u0499\u04d2\u0003"+
		"\u00acV\r\u049a\u049b\n\u000b\u0000\u0000\u049b\u049c\u0005Y\u0000\u0000"+
		"\u049c\u04d2\u0003\u00acV\f\u049d\u049e\n\n\u0000\u0000\u049e\u049f\u0005"+
		"[\u0000\u0000\u049f\u04d2\u0003\u00acV\u000b\u04a0\u04a1\n\t\u0000\u0000"+
		"\u04a1\u04a2\u0005Z\u0000\u0000\u04a2\u04d2\u0003\u00acV\n\u04a3\u04a4"+
		"\n\b\u0000\u0000\u04a4\u04a5\u0005Q\u0000\u0000\u04a5\u04d2\u0003\u00ac"+
		"V\t\u04a6\u04a7\n\u0007\u0000\u0000\u04a7\u04a8\u0005R\u0000\u0000\u04a8"+
		"\u04d2\u0003\u00acV\b\u04a9\u04aa\n\u0006\u0000\u0000\u04aa\u04ab\u0005"+
		"K\u0000\u0000\u04ab\u04ac\u0003\u00acV\u0000\u04ac\u04ad\u0005L\u0000"+
		"\u0000\u04ad\u04ae\u0003\u00acV\u0006\u04ae\u04d2\u0001\u0000\u0000\u0000"+
		"\u04af\u04b0\n\u0005\u0000\u0000\u04b0\u04b1\u0007\f\u0000\u0000\u04b1"+
		"\u04d2\u0003\u00acV\u0005\u04b2\u04b3\n\u0019\u0000\u0000\u04b3\u04bf"+
		"\u0005E\u0000\u0000\u04b4\u04c0\u0005o\u0000\u0000\u04b5\u04c0\u0003\u00aa"+
		"U\u0000\u04b6\u04c0\u0005+\u0000\u0000\u04b7\u04b9\u0005\u001f\u0000\u0000"+
		"\u04b8\u04ba\u0003\u00c8d\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04b9"+
		"\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb"+
		"\u04c0\u0003\u00bc^\u0000\u04bc\u04bd\u0005(\u0000\u0000\u04bd\u04c0\u0003"+
		"\u00d2i\u0000\u04be\u04c0\u0003\u00c2a\u0000\u04bf\u04b4\u0001\u0000\u0000"+
		"\u0000\u04bf\u04b5\u0001\u0000\u0000\u0000\u04bf\u04b6\u0001\u0000\u0000"+
		"\u0000\u04bf\u04b7\u0001\u0000\u0000\u0000\u04bf\u04bc\u0001\u0000\u0000"+
		"\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04c0\u04d2\u0001\u0000\u0000"+
		"\u0000\u04c1\u04c2\n\u0018\u0000\u0000\u04c2\u04c3\u0005A\u0000\u0000"+
		"\u04c3\u04c4\u0003\u00acV\u0000\u04c4\u04c5\u0005B\u0000\u0000\u04c5\u04d2"+
		"\u0001\u0000\u0000\u0000\u04c6\u04c7\n\u0014\u0000\u0000\u04c7\u04d2\u0007"+
		"\r\u0000\u0000\u04c8\u04c9\n\r\u0000\u0000\u04c9\u04ca\u0005\u001a\u0000"+
		"\u0000\u04ca\u04d2\u0003\u00ccf\u0000\u04cb\u04cc\n\u0003\u0000\u0000"+
		"\u04cc\u04ce\u0005i\u0000\u0000\u04cd\u04cf\u0003\u00d0h\u0000\u04ce\u04cd"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf\u04d0"+
		"\u0001\u0000\u0000\u0000\u04d0\u04d2\u0005o\u0000\u0000\u04d1\u0483\u0001"+
		"\u0000\u0000\u0000\u04d1\u0486\u0001\u0000\u0000\u0000\u04d1\u0489\u0001"+
		"\u0000\u0000\u0000\u04d1\u0494\u0001\u0000\u0000\u0000\u04d1\u0497\u0001"+
		"\u0000\u0000\u0000\u04d1\u049a\u0001\u0000\u0000\u0000\u04d1\u049d\u0001"+
		"\u0000\u0000\u0000\u04d1\u04a0\u0001\u0000\u0000\u0000\u04d1\u04a3\u0001"+
		"\u0000\u0000\u0000\u04d1\u04a6\u0001\u0000\u0000\u0000\u04d1\u04a9\u0001"+
		"\u0000\u0000\u0000\u04d1\u04af\u0001\u0000\u0000\u0000\u04d1\u04b2\u0001"+
		"\u0000\u0000\u0000\u04d1\u04c1\u0001\u0000\u0000\u0000\u04d1\u04c6\u0001"+
		"\u0000\u0000\u0000\u04d1\u04c8\u0001\u0000\u0000\u0000\u04d1\u04cb\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d5\u0001\u0000\u0000\u0000\u04d3\u04d1\u0001"+
		"\u0000\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u00ad\u0001"+
		"\u0000\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d6\u04d7\u0003"+
		"\u00b0X\u0000\u04d7\u04d8\u0005h\u0000\u0000\u04d8\u04d9\u0003\u00b2Y"+
		"\u0000\u04d9\u00af\u0001\u0000\u0000\u0000\u04da\u04eb\u0005o\u0000\u0000"+
		"\u04db\u04dd\u0005=\u0000\u0000\u04dc\u04de\u0003\\.\u0000\u04dd\u04dc"+
		"\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04df"+
		"\u0001\u0000\u0000\u0000\u04df\u04eb\u0005>\u0000\u0000\u04e0\u04e1\u0005"+
		"=\u0000\u0000\u04e1\u04e6\u0005o\u0000\u0000\u04e2\u04e3\u0005D\u0000"+
		"\u0000\u04e3\u04e5\u0005o\u0000\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000"+
		"\u04e5\u04e8\u0001\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000"+
		"\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7\u04e9\u0001\u0000\u0000\u0000"+
		"\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e9\u04eb\u0005>\u0000\u0000\u04ea"+
		"\u04da\u0001\u0000\u0000\u0000\u04ea\u04db\u0001\u0000\u0000\u0000\u04ea"+
		"\u04e0\u0001\u0000\u0000\u0000\u04eb\u00b1\u0001\u0000\u0000\u0000\u04ec"+
		"\u04ef\u0003\u00acV\u0000\u04ed\u04ef\u0003\u0086C\u0000\u04ee\u04ec\u0001"+
		"\u0000\u0000\u0000\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ef\u00b3\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f1\u0005=\u0000\u0000\u04f1\u04f2\u0003\u00ac"+
		"V\u0000\u04f2\u04f3\u0005>\u0000\u0000\u04f3\u0503\u0001\u0000\u0000\u0000"+
		"\u04f4\u0503\u0005+\u0000\u0000\u04f5\u0503\u0005(\u0000\u0000\u04f6\u0503"+
		"\u0003d2\u0000\u04f7\u0503\u0005o\u0000\u0000\u04f8\u04f9\u00032\u0019"+
		"\u0000\u04f9\u04fa\u0005E\u0000\u0000\u04fa\u04fb\u0005\t\u0000\u0000"+
		"\u04fb\u0503\u0001\u0000\u0000\u0000\u04fc\u0500\u0003\u00c8d\u0000\u04fd"+
		"\u0501\u0003\u00d4j\u0000\u04fe\u04ff\u0005+\u0000\u0000\u04ff\u0501\u0003"+
		"\u00d6k\u0000\u0500\u04fd\u0001\u0000\u0000\u0000\u0500\u04fe\u0001\u0000"+
		"\u0000\u0000\u0501\u0503\u0001\u0000\u0000\u0000\u0502\u04f0\u0001\u0000"+
		"\u0000\u0000\u0502\u04f4\u0001\u0000\u0000\u0000\u0502\u04f5\u0001\u0000"+
		"\u0000\u0000\u0502\u04f6\u0001\u0000\u0000\u0000\u0502\u04f7\u0001\u0000"+
		"\u0000\u0000\u0502\u04f8\u0001\u0000\u0000\u0000\u0502\u04fc\u0001\u0000"+
		"\u0000\u0000\u0503\u00b5\u0001\u0000\u0000\u0000\u0504\u0505\u0003T*\u0000"+
		"\u0505\u0506\u0005E\u0000\u0000\u0506\u0508\u0001\u0000\u0000\u0000\u0507"+
		"\u0504\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508"+
		"\u050c\u0001\u0000\u0000\u0000\u0509\u050b\u0003l6\u0000\u050a\u0509\u0001"+
		"\u0000\u0000\u0000\u050b\u050e\u0001\u0000\u0000\u0000\u050c\u050a\u0001"+
		"\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u050f\u0001"+
		"\u0000\u0000\u0000\u050e\u050c\u0001\u0000\u0000\u0000\u050f\u0511\u0005"+
		"o\u0000\u0000\u0510\u0512\u0003\u00d0h\u0000\u0511\u0510\u0001\u0000\u0000"+
		"\u0000\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u00b7\u0001\u0000\u0000"+
		"\u0000\u0513\u0514\u0003\u00c8d\u0000\u0514\u0515\u0003\u00ba]\u0000\u0515"+
		"\u0516\u0003\u00c0`\u0000\u0516\u051d\u0001\u0000\u0000\u0000\u0517\u051a"+
		"\u0003\u00ba]\u0000\u0518\u051b\u0003\u00be_\u0000\u0519\u051b\u0003\u00c0"+
		"`\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051a\u0519\u0001\u0000\u0000"+
		"\u0000\u051b\u051d\u0001\u0000\u0000\u0000\u051c\u0513\u0001\u0000\u0000"+
		"\u0000\u051c\u0517\u0001\u0000\u0000\u0000\u051d\u00b9\u0001\u0000\u0000"+
		"\u0000\u051e\u0520\u0005o\u0000\u0000\u051f\u0521\u0003\u00c4b\u0000\u0520"+
		"\u051f\u0001\u0000\u0000\u0000\u0520\u0521\u0001\u0000\u0000\u0000\u0521"+
		"\u0529\u0001\u0000\u0000\u0000\u0522\u0523\u0005E\u0000\u0000\u0523\u0525"+
		"\u0005o\u0000\u0000\u0524\u0526\u0003\u00c4b\u0000\u0525\u0524\u0001\u0000"+
		"\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u0528\u0001\u0000"+
		"\u0000\u0000\u0527\u0522\u0001\u0000\u0000\u0000\u0528\u052b\u0001\u0000"+
		"\u0000\u0000\u0529\u0527\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000"+
		"\u0000\u0000\u052a\u052e\u0001\u0000\u0000\u0000\u052b\u0529\u0001\u0000"+
		"\u0000\u0000\u052c\u052e\u0003\u00ceg\u0000\u052d\u051e\u0001\u0000\u0000"+
		"\u0000\u052d\u052c\u0001\u0000\u0000\u0000\u052e\u00bb\u0001\u0000\u0000"+
		"\u0000\u052f\u0531\u0005o\u0000\u0000\u0530\u0532\u0003\u00c6c\u0000\u0531"+
		"\u0530\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532"+
		"\u0533\u0001\u0000\u0000\u0000\u0533\u0534\u0003\u00c0`\u0000\u0534\u00bd"+
		"\u0001\u0000\u0000\u0000\u0535\u0551\u0005A\u0000\u0000\u0536\u053b\u0005"+
		"B\u0000\u0000\u0537\u0538\u0005A\u0000\u0000\u0538\u053a\u0005B\u0000"+
		"\u0000\u0539\u0537\u0001\u0000\u0000\u0000\u053a\u053d\u0001\u0000\u0000"+
		"\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000"+
		"\u0000\u053c\u053e\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000"+
		"\u0000\u053e\u0552\u0003R)\u0000\u053f\u0540\u0003\u00acV\u0000\u0540"+
		"\u0547\u0005B\u0000\u0000\u0541\u0542\u0005A\u0000\u0000\u0542\u0543\u0003"+
		"\u00acV\u0000\u0543\u0544\u0005B\u0000\u0000\u0544\u0546\u0001\u0000\u0000"+
		"\u0000\u0545\u0541\u0001\u0000\u0000\u0000\u0546\u0549\u0001\u0000\u0000"+
		"\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0547\u0548\u0001\u0000\u0000"+
		"\u0000\u0548\u054e\u0001\u0000\u0000\u0000\u0549\u0547\u0001\u0000\u0000"+
		"\u0000\u054a\u054b\u0005A\u0000\u0000\u054b\u054d\u0005B\u0000\u0000\u054c"+
		"\u054a\u0001\u0000\u0000\u0000\u054d\u0550\u0001\u0000\u0000\u0000\u054e"+
		"\u054c\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f"+
		"\u0552\u0001\u0000\u0000\u0000\u0550\u054e\u0001\u0000\u0000\u0000\u0551"+
		"\u0536\u0001\u0000\u0000\u0000\u0551\u053f\u0001\u0000\u0000\u0000\u0552"+
		"\u00bf\u0001\u0000\u0000\u0000\u0553\u0555\u0003\u00d6k\u0000\u0554\u0556"+
		"\u0003&\u0013\u0000\u0555\u0554\u0001\u0000\u0000\u0000\u0555\u0556\u0001"+
		"\u0000\u0000\u0000\u0556\u00c1\u0001\u0000\u0000\u0000\u0557\u0558\u0003"+
		"\u00c8d\u0000\u0558\u0559\u0003\u00d4j\u0000\u0559\u00c3\u0001\u0000\u0000"+
		"\u0000\u055a\u055b\u0005H\u0000\u0000\u055b\u055e\u0005G\u0000\u0000\u055c"+
		"\u055e\u0003\u00d0h\u0000\u055d\u055a\u0001\u0000\u0000\u0000\u055d\u055c"+
		"\u0001\u0000\u0000\u0000\u055e\u00c5\u0001\u0000\u0000\u0000\u055f\u0560"+
		"\u0005H\u0000\u0000\u0560\u0563\u0005G\u0000\u0000\u0561\u0563\u0003\u00c8"+
		"d\u0000\u0562\u055f\u0001\u0000\u0000\u0000\u0562\u0561\u0001\u0000\u0000"+
		"\u0000\u0563\u00c7\u0001\u0000\u0000\u0000\u0564\u0565\u0005H\u0000\u0000"+
		"\u0565\u0566\u0003\u00cae\u0000\u0566\u0567\u0005G\u0000\u0000\u0567\u00c9"+
		"\u0001\u0000\u0000\u0000\u0568\u056d\u0003\u00ccf\u0000\u0569\u056a\u0005"+
		"D\u0000\u0000\u056a\u056c\u0003\u00ccf\u0000\u056b\u0569\u0001\u0000\u0000"+
		"\u0000\u056c\u056f\u0001\u0000\u0000\u0000\u056d\u056b\u0001\u0000\u0000"+
		"\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u00cb\u0001\u0000\u0000"+
		"\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u0570\u0572\u0003l6\u0000\u0571"+
		"\u0570\u0001\u0000\u0000\u0000\u0572\u0575\u0001\u0000\u0000\u0000\u0573"+
		"\u0571\u0001\u0000\u0000\u0000\u0573\u0574\u0001\u0000\u0000\u0000\u0574"+
		"\u0578\u0001\u0000\u0000\u0000\u0575\u0573\u0001\u0000\u0000\u0000\u0576"+
		"\u0579\u0003T*\u0000\u0577\u0579\u0003\u00ceg\u0000\u0578\u0576\u0001"+
		"\u0000\u0000\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0579\u0584\u0001"+
		"\u0000\u0000\u0000\u057a\u057c\u0003l6\u0000\u057b\u057a\u0001\u0000\u0000"+
		"\u0000\u057c\u057f\u0001\u0000\u0000\u0000\u057d\u057b\u0001\u0000\u0000"+
		"\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u0580\u0001\u0000\u0000"+
		"\u0000\u057f\u057d\u0001\u0000\u0000\u0000\u0580\u0581\u0005A\u0000\u0000"+
		"\u0581\u0583\u0005B\u0000\u0000\u0582\u057d\u0001\u0000\u0000\u0000\u0583"+
		"\u0586\u0001\u0000\u0000\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0584"+
		"\u0585\u0001\u0000\u0000\u0000\u0585\u00cd\u0001\u0000\u0000\u0000\u0586"+
		"\u0584\u0001\u0000\u0000\u0000\u0587\u0588\u0007\u000e\u0000\u0000\u0588"+
		"\u00cf\u0001\u0000\u0000\u0000\u0589\u058a\u0005H\u0000\u0000\u058a\u058f"+
		"\u0003V+\u0000\u058b\u058c\u0005D\u0000\u0000\u058c\u058e\u0003V+\u0000"+
		"\u058d\u058b\u0001\u0000\u0000\u0000\u058e\u0591\u0001\u0000\u0000\u0000"+
		"\u058f\u058d\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000"+
		"\u0590\u0592\u0001\u0000\u0000\u0000\u0591\u058f\u0001\u0000\u0000\u0000"+
		"\u0592\u0593\u0005G\u0000\u0000\u0593\u00d1\u0001\u0000\u0000\u0000\u0594"+
		"\u059b\u0003\u00d6k\u0000\u0595\u0596\u0005E\u0000\u0000\u0596\u0598\u0005"+
		"o\u0000\u0000\u0597\u0599\u0003\u00d6k\u0000\u0598\u0597\u0001\u0000\u0000"+
		"\u0000\u0598\u0599\u0001\u0000\u0000\u0000\u0599\u059b\u0001\u0000\u0000"+
		"\u0000\u059a\u0594\u0001\u0000\u0000\u0000\u059a\u0595\u0001\u0000\u0000"+
		"\u0000\u059b\u00d3\u0001\u0000\u0000\u0000\u059c\u059d\u0005(\u0000\u0000"+
		"\u059d\u05a1\u0003\u00d2i\u0000\u059e\u059f\u0005o\u0000\u0000\u059f\u05a1"+
		"\u0003\u00d6k\u0000\u05a0\u059c\u0001\u0000\u0000\u0000\u05a0\u059e\u0001"+
		"\u0000\u0000\u0000\u05a1\u00d5\u0001\u0000\u0000\u0000\u05a2\u05a4\u0005"+
		"=\u0000\u0000\u05a3\u05a5\u0003\u00a8T\u0000\u05a4\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a4\u05a5\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a7\u0005>\u0000\u0000\u05a7\u00d7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00d9\u00de\u00e4\u00ec\u00f5\u00fa\u0103\u0106\u010b\u010f\u0112"+
		"\u0115\u0118\u0121\u0125\u0129\u012e\u0131\u0137\u013c\u0140\u0144\u014e"+
		"\u0156\u015e\u0162\u0169\u0170\u0174\u0177\u017a\u0183\u0189\u018e\u0191"+
		"\u0197\u019d\u01a1\u01a9\u01b2\u01b9\u01bf\u01ca\u01d3\u01d8\u01de\u01e2"+
		"\u01ee\u01fa\u0203\u020b\u0215\u021e\u0226\u022b\u0233\u0238\u0242\u024c"+
		"\u0252\u0259\u025e\u0266\u026a\u026c\u0272\u0277\u027b\u0282\u0288\u028a"+
		"\u0291\u0296\u029f\u02a4\u02a7\u02ac\u02b5\u02bc\u02c7\u02d0\u02da\u02e3"+
		"\u02e8\u02eb\u02f2\u02fc\u0304\u0307\u030a\u0317\u0320\u0328\u032c\u0330"+
		"\u0334\u0336\u033a\u0340\u034b\u0355\u035a\u0363\u0366\u036d\u0376\u038d"+
		"\u0390\u0393\u039b\u039f\u03a7\u03ad\u03b8\u03c1\u03c6\u03d0\u03d7\u03e4"+
		"\u03ed\u03f6\u03fc\u0407\u040c\u0411\u0416\u041a\u041e\u0422\u0424\u0428"+
		"\u042d\u043e\u0444\u044a\u0450\u0453\u045e\u0466\u0474\u0478\u047d\u0481"+
		"\u0491\u04b9\u04bf\u04ce\u04d1\u04d3\u04dd\u04e6\u04ea\u04ee\u0500\u0502"+
		"\u0507\u050c\u0511\u051a\u051c\u0520\u0525\u0529\u052d\u0531\u053b\u0547"+
		"\u054e\u0551\u0555\u055d\u0562\u056d\u0573\u0578\u057d\u0584\u058f\u0598"+
		"\u059a\u05a0\u05a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}