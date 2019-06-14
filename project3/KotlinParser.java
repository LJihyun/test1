// Generated from Kotlin.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, Type=34, Id=35, INT=36, REAL=37, WhiteSpace=38, Newline=39;
	public static final int
		RULE_prog = 0, RULE_packageList = 1, RULE_importList = 2, RULE_declaration = 3, 
		RULE_function = 4, RULE_functionBody = 5, RULE_identifier = 6, RULE_paramList = 7, 
		RULE_compoundStmt = 8, RULE_stmtList = 9, RULE_stmt = 10, RULE_simpleStmt = 11, 
		RULE_forStmt = 12, RULE_ifExpression = 13, RULE_callStmt = 14, RULE_call = 15, 
		RULE_argList = 16, RULE_variable = 17, RULE_multiVariable = 18, RULE_expression = 19, 
		RULE_functionCall = 20, RULE_opExpression = 21, RULE_opOperator = 22, 
		RULE_num = 23, RULE_elvis = 24, RULE_rangeExpression = 25, RULE_rangeOperation = 26, 
		RULE_downTo = 27, RULE_returnExpression = 28, RULE_stringLiteral = 29, 
		RULE_stringContent = 30, RULE_stringExpression = 31, RULE_strText = 32, 
		RULE_strRef = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "packageList", "importList", "declaration", "function", "functionBody", 
			"identifier", "paramList", "compoundStmt", "stmtList", "stmt", "simpleStmt", 
			"forStmt", "ifExpression", "callStmt", "call", "argList", "variable", 
			"multiVariable", "expression", "functionCall", "opExpression", "opOperator", 
			"num", "elvis", "rangeExpression", "rangeOperation", "downTo", "returnExpression", 
			"stringLiteral", "stringContent", "stringExpression", "strText", "strRef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'.'", "'import'", "'*'", "'fun'", "'('", "')'", "':'", 
			"'='", "','", "'{'", "'}'", "'var'", "'val'", "'for'", "'in'", "'if'", 
			"';'", "'else'", "'+'", "'-'", "'/'", "'%'", "'is'", "'?'", "'!'", "'..'", 
			"'step'", "'downTo'", "'return'", "'\"'", "'${'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Type", "Id", 
			"INT", "REAL", "WhiteSpace", "Newline"
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
	public String getGrammarFileName() { return "Kotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public PackageListContext packageList() {
			return getRuleContext(PackageListContext.class,0);
		}
		public List<ImportListContext> importList() {
			return getRuleContexts(ImportListContext.class);
		}
		public ImportListContext importList(int i) {
			return getRuleContext(ImportListContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(68);
				packageList();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(71);
				importList();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << Id))) != 0)) {
				{
				{
				setState(77);
				declaration();
				}
				}
				setState(82);
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

	public static class PackageListContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(KotlinParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(KotlinParser.Id, i);
		}
		public PackageListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPackageList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPackageList(this);
		}
	}

	public final PackageListContext packageList() throws RecognitionException {
		PackageListContext _localctx = new PackageListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__0);
			setState(84);
			match(Id);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				match(T__1);
				setState(86);
				match(Id);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class ImportListContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(KotlinParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(KotlinParser.Id, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitImportList(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(92);
			match(Id);
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(93);
					match(T__1);
					setState(94);
					match(Id);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(99);
			match(T__1);
			setState(100);
			match(T__3);
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				function();
				}
				break;
			case T__12:
			case T__13:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				simpleStmt();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode Type() { return getToken(KotlinParser.Type, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__4);
			setState(107);
			match(Id);
			setState(108);
			match(T__5);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(109);
				paramList();
				}
			}

			setState(112);
			match(T__6);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(113);
				match(T__7);
				setState(114);
				match(Type);
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__10) {
				{
				setState(117);
				functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				compoundStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__8);
				setState(122);
				expression();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Id);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Type() { return getTokens(KotlinParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(KotlinParser.Type, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			identifier();
			setState(128);
			match(T__7);
			setState(129);
			match(Type);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(T__9);
				setState(131);
				identifier();
				setState(132);
				match(T__7);
				setState(133);
				match(Type);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitCompoundStmt(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compoundStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__10);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << Type) | (1L << Id) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				setState(140);
				stmtList();
				}
			}

			setState(143);
			match(T__11);
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

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStmtList(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				stmt();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << Type) | (1L << Id) | (1L << INT) | (1L << REAL))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				forStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				callStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				expression();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public TerminalNode Type() { return getToken(KotlinParser.Type, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(159);
			match(Id);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(160);
				match(T__7);
				setState(161);
				match(Type);
				}
				break;
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(164);
				match(T__8);
				setState(165);
				expression();
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

	public static class ForStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MultiVariableContext multiVariable() {
			return getRuleContext(MultiVariableContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__14);
			setState(169);
			match(T__5);
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(170);
				variable();
				}
				break;
			case T__5:
				{
				setState(171);
				multiVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(174);
			match(T__15);
			setState(175);
			expression();
			setState(176);
			match(T__6);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(177);
				compoundStmt();
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

	public static class IfExpressionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<CompoundStmtContext> compoundStmt() {
			return getRuleContexts(CompoundStmtContext.class);
		}
		public CompoundStmtContext compoundStmt(int i) {
			return getRuleContext(CompoundStmtContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIfExpression(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifExpression);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__16);
				setState(181);
				match(T__5);
				setState(182);
				declaration();
				setState(183);
				match(T__6);
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(184);
					compoundStmt();
					}
					break;
				case 2:
					{
					setState(185);
					expression();
					}
					break;
				case 3:
					{
					setState(186);
					match(T__17);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__16);
				setState(190);
				match(T__5);
				setState(191);
				expression();
				setState(192);
				match(T__6);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(193);
					compoundStmt();
					}
				}

				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << Type) | (1L << Id) | (1L << INT) | (1L << REAL))) != 0)) {
					{
					setState(196);
					expression();
					}
				}

				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(199);
					match(T__17);
					}
				}

				setState(202);
				match(T__18);
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(203);
					compoundStmt();
					}
					break;
				case T__17:
					{
					setState(204);
					match(T__17);
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

	public static class CallStmtContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitCallStmt(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			call();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Id);
			setState(212);
			match(T__5);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << Type) | (1L << Id) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				setState(213);
				argList();
				}
			}

			setState(216);
			match(T__6);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			expression();
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(219);
					match(T__9);
					setState(220);
					expression();
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				}
				break;
			case T__19:
				{
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(T__19);
					setState(226);
					expression();
					}
					}
					setState(229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__19 );
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public TerminalNode Type() { return getToken(KotlinParser.Type, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Id);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(234);
				match(T__7);
				setState(235);
				match(Type);
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

	public static class MultiVariableContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public MultiVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterMultiVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitMultiVariable(this);
		}
	}

	public final MultiVariableContext multiVariable() throws RecognitionException {
		MultiVariableContext _localctx = new MultiVariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__5);
			setState(239);
			variable();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(240);
				match(T__9);
				setState(241);
				variable();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__6);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OpExpressionContext opExpression() {
			return getRuleContext(OpExpressionContext.class,0);
		}
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public ElvisContext elvis() {
			return getRuleContext(ElvisContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode Type() { return getToken(KotlinParser.Type, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				opExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				rangeExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				elvis();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				stringLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				ifExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				returnExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(Id);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				num();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(258);
				match(Type);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(KotlinParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(KotlinParser.Id, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Id);
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(262);
				match(T__5);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(263);
					argList();
					}
					break;
				case 2:
					{
					setState(264);
					expression();
					}
					break;
				}
				setState(267);
				match(T__6);
				}
				break;
			case T__1:
				{
				setState(269);
				match(T__1);
				setState(270);
				match(Id);
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

	public static class OpExpressionContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(KotlinParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(KotlinParser.Id, i);
		}
		public List<OpOperatorContext> opOperator() {
			return getRuleContexts(OpOperatorContext.class);
		}
		public OpOperatorContext opOperator(int i) {
			return getRuleContext(OpOperatorContext.class,i);
		}
		public List<TerminalNode> Type() { return getTokens(KotlinParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(KotlinParser.Type, i);
		}
		public OpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitOpExpression(this);
		}
	}

	public final OpExpressionContext opExpression() throws RecognitionException {
		OpExpressionContext _localctx = new OpExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				{
				setState(273);
				num();
				}
				break;
			case Id:
				{
				setState(274);
				match(Id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(277);
					opOperator();
					setState(281);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case REAL:
						{
						setState(278);
						num();
						}
						break;
					case Id:
						{
						setState(279);
						match(Id);
						}
						break;
					case Type:
						{
						setState(280);
						match(Type);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class OpOperatorContext extends ParserRuleContext {
		public OpOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterOpOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitOpOperator(this);
		}
	}

	public final OpOperatorContext opOperator() throws RecognitionException {
		OpOperatorContext _localctx = new OpOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public TerminalNode REAL() { return getToken(KotlinParser.REAL, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
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

	public static class ElvisContext extends ParserRuleContext {
		public ElvisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterElvis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitElvis(this);
		}
	}

	public final ElvisContext elvis() throws RecognitionException {
		ElvisContext _localctx = new ElvisContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elvis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public RangeOperationContext rangeOperation() {
			return getRuleContext(RangeOperationContext.class,0);
		}
		public DownToContext downTo() {
			return getRuleContext(DownToContext.class,0);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitRangeExpression(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rangeExpression);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				rangeOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				downTo();
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

	public static class RangeOperationContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public RangeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterRangeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitRangeOperation(this);
		}
	}

	public final RangeOperationContext rangeOperation() throws RecognitionException {
		RangeOperationContext _localctx = new RangeOperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rangeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			num();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(298);
				match(T__26);
				setState(299);
				num();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(305);
				match(T__27);
				setState(306);
				num();
				}
				}
				setState(311);
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

	public static class DownToContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public DownToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_downTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterDownTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitDownTo(this);
		}
	}

	public final DownToContext downTo() throws RecognitionException {
		DownToContext _localctx = new DownToContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_downTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			num();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(313);
				match(T__28);
				setState(314);
				num();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(317);
				match(T__27);
				setState(318);
				num();
				}
				}
				setState(323);
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitReturnExpression(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__29);
			setState(325);
			expression();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__30);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << Type) | (1L << Id) | (1L << INT) | (1L << REAL) | (1L << WhiteSpace) | (1L << Newline))) != 0)) {
				{
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(328);
					stringContent();
					}
					break;
				case 2:
					{
					setState(329);
					stringExpression();
					}
					break;
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(T__30);
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

	public static class StringContentContext extends ParserRuleContext {
		public StrTextContext strText() {
			return getRuleContext(StrTextContext.class,0);
		}
		public StrRefContext strRef() {
			return getRuleContext(StrRefContext.class,0);
		}
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStringContent(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringContent);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				strText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				strRef();
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

	public static class StringExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__31);
			setState(342);
			expression();
			setState(343);
			match(T__11);
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

	public static class StrTextContext extends ParserRuleContext {
		public StrTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStrText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStrText(this);
		}
	}

	public final StrTextContext strText() throws RecognitionException {
		StrTextContext _localctx = new StrTextContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_strText);
		int _la;
		try {
			int _alt;
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case Type:
			case Id:
			case INT:
			case REAL:
			case WhiteSpace:
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(346); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(345);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==T__30 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(348); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__32);
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

	public static class StrRefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(KotlinParser.Id, 0); }
		public StrRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStrRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStrRef(this);
		}
	}

	public final StrRefContext strRef() throws RecognitionException {
		StrRefContext _localctx = new StrRefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_strRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__32);
			setState(354);
			match(Id);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\5\2H\n\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\7\2Q\n"+
		"\2\f\2\16\2T\13\2\3\3\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\4\3\4\3\4\3\4\6"+
		"\4b\n\4\r\4\16\4c\3\4\3\4\3\4\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\5\6q\n"+
		"\6\3\6\3\6\3\6\5\6v\n\6\3\6\5\6y\n\6\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u008a\n\t\r\t\16\t\u008b\3\n\3\n\5\n"+
		"\u0090\n\n\3\n\3\n\3\13\6\13\u0095\n\13\r\13\16\13\u0096\3\f\3\f\3\f\3"+
		"\f\5\f\u009d\n\f\3\r\5\r\u00a0\n\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\5"+
		"\r\u00a9\n\r\3\16\3\16\3\16\3\16\5\16\u00af\n\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00be\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00c5\n\17\3\17\5\17\u00c8\n\17\3\17\5\17\u00cb"+
		"\n\17\3\17\3\17\3\17\5\17\u00d0\n\17\5\17\u00d2\n\17\3\20\3\20\3\21\3"+
		"\21\3\21\5\21\u00d9\n\21\3\21\3\21\3\22\3\22\3\22\6\22\u00e0\n\22\r\22"+
		"\16\22\u00e1\3\22\3\22\6\22\u00e6\n\22\r\22\16\22\u00e7\5\22\u00ea\n\22"+
		"\3\23\3\23\3\23\5\23\u00ef\n\23\3\24\3\24\3\24\3\24\7\24\u00f5\n\24\f"+
		"\24\16\24\u00f8\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0106\n\25\3\26\3\26\3\26\3\26\5\26\u010c\n\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\5\27\u0116\n\27\3\27\3\27\3\27"+
		"\3\27\5\27\u011c\n\27\6\27\u011e\n\27\r\27\16\27\u011f\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\5\33\u012a\n\33\3\34\3\34\3\34\7\34\u012f\n"+
		"\34\f\34\16\34\u0132\13\34\3\34\3\34\7\34\u0136\n\34\f\34\16\34\u0139"+
		"\13\34\3\35\3\35\3\35\5\35\u013e\n\35\3\35\3\35\7\35\u0142\n\35\f\35\16"+
		"\35\u0145\13\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u014d\n\37\f\37\16"+
		"\37\u0150\13\37\3\37\3\37\3 \3 \5 \u0156\n \3!\3!\3!\3!\3\"\6\"\u015d"+
		"\n\"\r\"\16\"\u015e\3\"\5\"\u0162\n\"\3#\3#\3#\3#\2\2$\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\17\20\4\2"+
		"\6\6\26\32\3\2&\'\4\2\n\n\33\34\4\2!!##\2\u0180\2G\3\2\2\2\4U\3\2\2\2"+
		"\6]\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\f}\3\2\2\2\16\177\3\2\2\2\20\u0081\3"+
		"\2\2\2\22\u008d\3\2\2\2\24\u0094\3\2\2\2\26\u009c\3\2\2\2\30\u009f\3\2"+
		"\2\2\32\u00aa\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 \u00d5\3\2\2\2"+
		"\"\u00dc\3\2\2\2$\u00eb\3\2\2\2&\u00f0\3\2\2\2(\u0105\3\2\2\2*\u0107\3"+
		"\2\2\2,\u0115\3\2\2\2.\u0121\3\2\2\2\60\u0123\3\2\2\2\62\u0125\3\2\2\2"+
		"\64\u0129\3\2\2\2\66\u012b\3\2\2\28\u013a\3\2\2\2:\u0146\3\2\2\2<\u0149"+
		"\3\2\2\2>\u0155\3\2\2\2@\u0157\3\2\2\2B\u0161\3\2\2\2D\u0163\3\2\2\2F"+
		"H\5\4\3\2GF\3\2\2\2GH\3\2\2\2HL\3\2\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\b\5\2PO\3\2\2\2QT\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2S\3\3\2\2\2TR\3\2\2\2UV\7\3\2\2VY\7%\2\2WX\7\4\2\2"+
		"XZ\7%\2\2YW\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2]^\7\5\2"+
		"\2^a\7%\2\2_`\7\4\2\2`b\7%\2\2a_\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
		"de\3\2\2\2ef\7\4\2\2fg\7\6\2\2g\7\3\2\2\2hk\5\n\6\2ik\5\30\r\2jh\3\2\2"+
		"\2ji\3\2\2\2k\t\3\2\2\2lm\7\7\2\2mn\7%\2\2np\7\b\2\2oq\5\20\t\2po\3\2"+
		"\2\2pq\3\2\2\2qr\3\2\2\2ru\7\t\2\2st\7\n\2\2tv\7$\2\2us\3\2\2\2uv\3\2"+
		"\2\2vx\3\2\2\2wy\5\f\7\2xw\3\2\2\2xy\3\2\2\2y\13\3\2\2\2z~\5\22\n\2{|"+
		"\7\13\2\2|~\5(\25\2}z\3\2\2\2}{\3\2\2\2~\r\3\2\2\2\177\u0080\7%\2\2\u0080"+
		"\17\3\2\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\n\2\2\u0083\u0089\7$\2"+
		"\2\u0084\u0085\7\f\2\2\u0085\u0086\5\16\b\2\u0086\u0087\7\n\2\2\u0087"+
		"\u0088\7$\2\2\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\21\3\2\2\2\u008d\u008f"+
		"\7\r\2\2\u008e\u0090\5\24\13\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\7\16\2\2\u0092\23\3\2\2\2\u0093\u0095"+
		"\5\26\f\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\25\3\2\2\2\u0098\u009d\5\b\5\2\u0099\u009d"+
		"\5\32\16\2\u009a\u009d\5\36\20\2\u009b\u009d\5(\25\2\u009c\u0098\3\2\2"+
		"\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\27"+
		"\3\2\2\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a4\7%\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a5\7$\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7"+
		"\7\13\2\2\u00a7\u00a9\5(\25\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\31\3\2\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ae\7\b\2\2\u00ac\u00af"+
		"\5$\23\2\u00ad\u00af\5&\24\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b4\7"+
		"\t\2\2\u00b3\u00b5\5\22\n\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\33\3\2\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\5\b\5"+
		"\2\u00b9\u00bd\7\t\2\2\u00ba\u00be\5\22\n\2\u00bb\u00be\5(\25\2\u00bc"+
		"\u00be\7\24\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00d2\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0"+
		"\u00c1\7\b\2\2\u00c1\u00c2\5(\25\2\u00c2\u00c4\7\t\2\2\u00c3\u00c5\5\22"+
		"\n\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c8\5(\25\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00cb\7\24\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\7\25\2\2\u00cd\u00d0\5\22\n\2\u00ce\u00d0\7"+
		"\24\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00b6\3\2\2\2\u00d1\u00bf\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d4\5 \21"+
		"\2\u00d4\37\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d8\7\b\2\2\u00d7\u00d9"+
		"\5\"\22\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\7\t\2\2\u00db!\3\2\2\2\u00dc\u00e9\5(\25\2\u00dd\u00de\7"+
		"\f\2\2\u00de\u00e0\5(\25\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e4\7\26"+
		"\2\2\u00e4\u00e6\5(\25\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2"+
		"\2\2\u00e9\u00e5\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00ee\7%\2\2\u00ec\u00ed"+
		"\7\n\2\2\u00ed\u00ef\7$\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"%\3\2\2\2\u00f0\u00f1\7\b\2\2\u00f1\u00f6\5$\23\2\u00f2\u00f3\7\f\2\2"+
		"\u00f3\u00f5\5$\23\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7\t\2\2\u00fa\'\3\2\2\2\u00fb\u0106\5*\26\2\u00fc\u0106\5,\27\2"+
		"\u00fd\u0106\5\64\33\2\u00fe\u0106\5\62\32\2\u00ff\u0106\5<\37\2\u0100"+
		"\u0106\5\34\17\2\u0101\u0106\5:\36\2\u0102\u0106\7%\2\2\u0103\u0106\5"+
		"\60\31\2\u0104\u0106\7$\2\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105"+
		"\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2"+
		"\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106)\3\2\2\2\u0107\u0111\7%\2\2\u0108\u010b\7\b\2\2\u0109"+
		"\u010c\5\"\22\2\u010a\u010c\5(\25\2\u010b\u0109\3\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\t\2\2\u010e\u0112\3\2\2\2\u010f"+
		"\u0110\7\4\2\2\u0110\u0112\7%\2\2\u0111\u0108\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112+\3\2\2\2\u0113\u0116\5\60\31\2\u0114\u0116\7%\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u011d\3\2\2\2\u0117\u011b\5.\30\2\u0118"+
		"\u011c\5\60\31\2\u0119\u011c\7%\2\2\u011a\u011c\7$\2\2\u011b\u0118\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0117\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120-\3\2\2\2\u0121\u0122\t\3\2\2\u0122/\3\2\2\2\u0123\u0124\t\4"+
		"\2\2\u0124\61\3\2\2\2\u0125\u0126\t\5\2\2\u0126\63\3\2\2\2\u0127\u012a"+
		"\5\66\34\2\u0128\u012a\58\35\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2"+
		"\u012a\65\3\2\2\2\u012b\u0130\5\60\31\2\u012c\u012d\7\35\2\2\u012d\u012f"+
		"\5\60\31\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u0137\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134"+
		"\7\36\2\2\u0134\u0136\5\60\31\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2"+
		"\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\67\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013d\5\60\31\2\u013b\u013c\7\37\2\2\u013c\u013e\5\60\31"+
		"\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u0140"+
		"\7\36\2\2\u0140\u0142\5\60\31\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2"+
		"\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u01449\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0147\7 \2\2\u0147\u0148\5(\25\2\u0148;\3\2\2\2\u0149\u014e"+
		"\7!\2\2\u014a\u014d\5> \2\u014b\u014d\5@!\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7!\2\2\u0152"+
		"=\3\2\2\2\u0153\u0156\5B\"\2\u0154\u0156\5D#\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156?\3\2\2\2\u0157\u0158\7\"\2\2\u0158\u0159\5(\25\2"+
		"\u0159\u015a\7\16\2\2\u015aA\3\2\2\2\u015b\u015d\n\6\2\2\u015c\u015b\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u0162\7#\2\2\u0161\u015c\3\2\2\2\u0161\u0160\3\2"+
		"\2\2\u0162C\3\2\2\2\u0163\u0164\7#\2\2\u0164\u0165\7%\2\2\u0165E\3\2\2"+
		"\2\61GLR[cjpux}\u008b\u008f\u0096\u009c\u009f\u00a4\u00a8\u00ae\u00b4"+
		"\u00bd\u00c4\u00c7\u00ca\u00cf\u00d1\u00d8\u00e1\u00e7\u00e9\u00ee\u00f6"+
		"\u0105\u010b\u0111\u0115\u011b\u011f\u0129\u0130\u0137\u013d\u0143\u014c"+
		"\u014e\u0155\u015e\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}