// Generated from C:/Users/Platez/Documents/UN/Sistemas/2022-1/lenguajes/traductor/grammar\SL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, ID=50, NUM=51, STRING=52, BOOL=53, 
		SEP=54, COMMENT1=55, COMMENT2=56, ESP=57;
	public static final int
		RULE_start = 0, RULE_header = 1, RULE_var = 2, RULE_const = 3, RULE_tipo_p = 4, 
		RULE_main = 5, RULE_sentencia = 6, RULE_call = 7, RULE_assingment = 8, 
		RULE_if = 9, RULE_sinosi = 10, RULE_while = 11, RULE_do_while = 12, RULE_switch = 13, 
		RULE_case = 14, RULE_sino = 15, RULE_for = 16, RULE_m_expresion = 17, 
		RULE_m_expresion_p = 18, RULE_m_term = 19, RULE_m_factor = 20, RULE_expresion = 21, 
		RULE_logic_expresion_p = 22, RULE_logic_term = 23, RULE_logic_term_p = 24, 
		RULE_logic_factor = 25, RULE_logic_element = 26, RULE_relation_expresion = 27, 
		RULE_relation_expresion_p = 28, RULE_relation_term = 29, RULE_num_expresion = 30, 
		RULE_num_expresion_p = 31, RULE_num_term = 32, RULE_num_term_p = 33, RULE_num_factor = 34, 
		RULE_num_factor_p = 35, RULE_num_factor_pp = 36, RULE_base_element = 37, 
		RULE_sub = 38, RULE_args = 39, RULE_next_arg = 40, RULE_ref = 41, RULE_submain = 42, 
		RULE_submainr = 43, RULE_tipo = 44, RULE_tipos = 45, RULE_type_vector = 46, 
		RULE_v_len = 47, RULE_type_matrix = 48, RULE_dimention_list = 49, RULE_next_dimention = 50, 
		RULE_next_dimention_p = 51, RULE_dimention = 52, RULE_register = 53, RULE_id_extend = 54, 
		RULE_ids_options = 55, RULE_params = 56, RULE_next_param = 57, RULE_matrix = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "header", "var", "const", "tipo_p", "main", "sentencia", "call", 
			"assingment", "if", "sinosi", "while", "do_while", "switch", "case", 
			"sino", "for", "m_expresion", "m_expresion_p", "m_term", "m_factor", 
			"expresion", "logic_expresion_p", "logic_term", "logic_term_p", "logic_factor", 
			"logic_element", "relation_expresion", "relation_expresion_p", "relation_term", 
			"num_expresion", "num_expresion_p", "num_term", "num_term_p", "num_factor", 
			"num_factor_p", "num_factor_pp", "base_element", "sub", "args", "next_arg", 
			"ref", "submain", "submainr", "tipo", "tipos", "type_vector", "v_len", 
			"type_matrix", "dimention_list", "next_dimention", "next_dimention_p", 
			"dimention", "register", "id_extend", "ids_options", "params", "next_param", 
			"matrix"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'const'", "'tipos'", "'var'", "','", "':'", "'='", 
			"'inicio'", "'fin'", "'('", "')'", "'{'", "'}'", "'si'", "'sino'", "'mientras'", 
			"'repetir'", "'hasta'", "'eval'", "'caso'", "'desde'", "'paso'", "'.'", 
			"'or'", "'and'", "'not'", "'<'", "'>'", "'<='", "'>='", "'=='", "'<>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'subrutina'", "'retorna'", 
			"'ref'", "'cadena'", "'logico'", "'numerico'", "'vector'", "'['", "']'", 
			"'matriz'", "'registro'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "NUM", "STRING", "BOOL", "SEP", "COMMENT1", "COMMENT2", 
			"ESP"
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
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(118);
				match(T__0);
				setState(119);
				match(ID);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(122);
				header();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			main();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(129);
				sub();
				}
				}
				setState(134);
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

	public static class HeaderContext extends ParserRuleContext {
		public List<ConstContext> const_() {
			return getRuleContexts(ConstContext.class);
		}
		public ConstContext const_(int i) {
			return getRuleContext(ConstContext.class,i);
		}
		public List<Tipo_pContext> tipo_p() {
			return getRuleContexts(Tipo_pContext.class);
		}
		public Tipo_pContext tipo_p(int i) {
			return getRuleContext(Tipo_pContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__1);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					const_();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__2);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					tipo_p();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__3);
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					var();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SLParser.SEP, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(156);
				match(T__4);
				setState(157);
				match(ID);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__5);
			setState(164);
			tipo();
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEP:
				{
				setState(165);
				match(SEP);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__7:
			case T__12:
			case ID:
				{
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

	public static class ConstContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SLParser.SEP, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			match(T__6);
			setState(171);
			expresion();
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEP:
				{
				setState(172);
				match(SEP);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__7:
			case ID:
				{
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

	public static class Tipo_pContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SLParser.SEP, 0); }
		public Tipo_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_pContext tipo_p() throws RecognitionException {
		Tipo_pContext _localctx = new Tipo_pContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(T__5);
			setState(178);
			tipo();
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEP:
				{
				setState(179);
				match(SEP);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__7:
			case ID:
				{
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

	public static class MainContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__7);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(184);
				sentencia();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__8);
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

	public static class SentenciaContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SLParser.SEP, 0); }
		public AssingmentContext assingment() {
			return getRuleContext(AssingmentContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				call();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(193);
					match(SEP);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				assingment();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(197);
					match(SEP);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				if_();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(201);
					match(SEP);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				while_();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(205);
					match(SEP);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				do_while();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(209);
					match(SEP);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				switch_();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(213);
					match(SEP);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				for_();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(217);
					match(SEP);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(T__9);
			setState(224);
			params();
			setState(225);
			match(T__10);
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

	public static class AssingmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Id_extendContext id_extend() {
			return getRuleContext(Id_extendContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public M_expresionContext m_expresion() {
			return getRuleContext(M_expresionContext.class,0);
		}
		public AssingmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAssingment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAssingment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitAssingment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssingmentContext assingment() throws RecognitionException {
		AssingmentContext _localctx = new AssingmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assingment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			id_extend();
			setState(229);
			match(T__6);
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__25:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				{
				setState(230);
				expresion();
				}
				break;
			case T__11:
				{
				setState(231);
				match(T__11);
				setState(232);
				m_expresion();
				setState(233);
				match(T__12);
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

	public static class IfContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<SinosiContext> sinosi() {
			return getRuleContexts(SinosiContext.class);
		}
		public SinosiContext sinosi(int i) {
			return getRuleContext(SinosiContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__13);
			setState(238);
			match(T__9);
			setState(239);
			expresion();
			setState(240);
			match(T__10);
			setState(241);
			match(T__11);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				sentencia();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					sinosi();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(253);
				sino();
				}
			}

			setState(256);
			match(T__12);
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

	public static class SinosiContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SinosiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinosi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSinosi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSinosi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSinosi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinosiContext sinosi() throws RecognitionException {
		SinosiContext _localctx = new SinosiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sinosi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__14);
			setState(259);
			match(T__13);
			setState(260);
			match(T__9);
			setState(261);
			expresion();
			setState(262);
			match(T__10);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				sentencia();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
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

	public static class WhileContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__15);
			setState(269);
			match(T__9);
			setState(270);
			expresion();
			setState(271);
			match(T__10);
			setState(272);
			match(T__11);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				sentencia();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(278);
			match(T__12);
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

	public static class Do_whileContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__16);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				sentencia();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(286);
			match(T__17);
			setState(287);
			match(T__9);
			setState(288);
			expresion();
			setState(289);
			match(T__10);
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

	public static class SwitchContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__18);
			setState(292);
			match(T__11);
			setState(293);
			match(T__19);
			setState(294);
			match(T__9);
			setState(295);
			expresion();
			setState(296);
			match(T__10);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				sentencia();
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(302);
				case_();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(308);
				sino();
				}
			}

			setState(311);
			match(T__12);
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

	public static class CaseContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__19);
			setState(314);
			match(T__9);
			setState(315);
			expresion();
			setState(316);
			match(T__10);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				sentencia();
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
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

	public static class SinoContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__14);
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				sentencia();
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<Num_expresionContext> num_expresion() {
			return getRuleContexts(Num_expresionContext.class);
		}
		public Num_expresionContext num_expresion(int i) {
			return getRuleContext(Num_expresionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__20);
			setState(329);
			match(ID);
			setState(330);
			match(T__6);
			setState(331);
			num_expresion();
			setState(332);
			match(T__17);
			setState(333);
			num_expresion();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(334);
				match(T__21);
				setState(335);
				num_expresion();
				}
			}

			setState(338);
			match(T__11);
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				sentencia();
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(344);
			match(T__12);
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

	public static class M_expresionContext extends ParserRuleContext {
		public M_termContext m_term() {
			return getRuleContext(M_termContext.class,0);
		}
		public M_expresion_pContext m_expresion_p() {
			return getRuleContext(M_expresion_pContext.class,0);
		}
		public M_expresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterM_expresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitM_expresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitM_expresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_expresionContext m_expresion() throws RecognitionException {
		M_expresionContext _localctx = new M_expresionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_m_expresion);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case T__22:
			case T__25:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				m_term();
				setState(347);
				m_expresion_p();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class M_expresion_pContext extends ParserRuleContext {
		public M_termContext m_term() {
			return getRuleContext(M_termContext.class,0);
		}
		public M_expresion_pContext m_expresion_p() {
			return getRuleContext(M_expresion_pContext.class,0);
		}
		public M_expresion_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_expresion_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterM_expresion_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitM_expresion_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitM_expresion_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_expresion_pContext m_expresion_p() throws RecognitionException {
		M_expresion_pContext _localctx = new M_expresion_pContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_m_expresion_p);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__4);
				setState(353);
				m_term();
				setState(354);
				m_expresion_p();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class M_termContext extends ParserRuleContext {
		public M_factorContext m_factor() {
			return getRuleContext(M_factorContext.class,0);
		}
		public M_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterM_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitM_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitM_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_termContext m_term() throws RecognitionException {
		M_termContext _localctx = new M_termContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_m_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			m_factor();
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

	public static class M_factorContext extends ParserRuleContext {
		public M_expresionContext m_expresion() {
			return getRuleContext(M_expresionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public M_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterM_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitM_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitM_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_factorContext m_factor() throws RecognitionException {
		M_factorContext _localctx = new M_factorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_m_factor);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T__11);
				setState(362);
				m_expresion();
				setState(363);
				match(T__12);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T__22);
				setState(366);
				match(T__22);
				setState(367);
				match(T__22);
				}
				break;
			case T__9:
			case T__25:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				expresion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public Logic_termContext logic_term() {
			return getRuleContext(Logic_termContext.class,0);
		}
		public Logic_expresion_pContext logic_expresion_p() {
			return getRuleContext(Logic_expresion_pContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			logic_term();
			setState(372);
			logic_expresion_p();
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

	public static class Logic_expresion_pContext extends ParserRuleContext {
		public Logic_termContext logic_term() {
			return getRuleContext(Logic_termContext.class,0);
		}
		public Logic_expresion_pContext logic_expresion_p() {
			return getRuleContext(Logic_expresion_pContext.class,0);
		}
		public Logic_expresion_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expresion_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLogic_expresion_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLogic_expresion_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLogic_expresion_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expresion_pContext logic_expresion_p() throws RecognitionException {
		Logic_expresion_pContext _localctx = new Logic_expresion_pContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logic_expresion_p);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__23);
				setState(375);
				logic_term();
				setState(376);
				logic_expresion_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__39:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Logic_termContext extends ParserRuleContext {
		public Logic_factorContext logic_factor() {
			return getRuleContext(Logic_factorContext.class,0);
		}
		public Logic_term_pContext logic_term_p() {
			return getRuleContext(Logic_term_pContext.class,0);
		}
		public Logic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLogic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLogic_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLogic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_termContext logic_term() throws RecognitionException {
		Logic_termContext _localctx = new Logic_termContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			logic_factor();
			setState(382);
			logic_term_p();
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

	public static class Logic_term_pContext extends ParserRuleContext {
		public Logic_factorContext logic_factor() {
			return getRuleContext(Logic_factorContext.class,0);
		}
		public Logic_term_pContext logic_term_p() {
			return getRuleContext(Logic_term_pContext.class,0);
		}
		public Logic_term_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLogic_term_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLogic_term_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLogic_term_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_term_pContext logic_term_p() throws RecognitionException {
		Logic_term_pContext _localctx = new Logic_term_pContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic_term_p);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__24);
				setState(385);
				logic_factor();
				setState(386);
				logic_term_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__39:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Logic_factorContext extends ParserRuleContext {
		public Logic_elementContext logic_element() {
			return getRuleContext(Logic_elementContext.class,0);
		}
		public Logic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLogic_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLogic_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLogic_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_factorContext logic_factor() throws RecognitionException {
		Logic_factorContext _localctx = new Logic_factorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic_factor);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				logic_element();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T__25);
				setState(393);
				logic_element();
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

	public static class Logic_elementContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SLParser.BOOL, 0); }
		public Relation_expresionContext relation_expresion() {
			return getRuleContext(Relation_expresionContext.class,0);
		}
		public Logic_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLogic_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLogic_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLogic_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_elementContext logic_element() throws RecognitionException {
		Logic_elementContext _localctx = new Logic_elementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logic_element);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(BOOL);
				}
				break;
			case T__9:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				relation_expresion();
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

	public static class Relation_expresionContext extends ParserRuleContext {
		public Relation_termContext relation_term() {
			return getRuleContext(Relation_termContext.class,0);
		}
		public Relation_expresion_pContext relation_expresion_p() {
			return getRuleContext(Relation_expresion_pContext.class,0);
		}
		public Relation_expresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRelation_expresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRelation_expresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRelation_expresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_expresionContext relation_expresion() throws RecognitionException {
		Relation_expresionContext _localctx = new Relation_expresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relation_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			relation_term();
			setState(401);
			relation_expresion_p();
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

	public static class Relation_expresion_pContext extends ParserRuleContext {
		public Relation_termContext relation_term() {
			return getRuleContext(Relation_termContext.class,0);
		}
		public Relation_expresion_pContext relation_expresion_p() {
			return getRuleContext(Relation_expresion_pContext.class,0);
		}
		public Relation_expresion_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_expresion_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRelation_expresion_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRelation_expresion_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRelation_expresion_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_expresion_pContext relation_expresion_p() throws RecognitionException {
		Relation_expresion_pContext _localctx = new Relation_expresion_pContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relation_expresion_p);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__26);
				setState(404);
				relation_term();
				setState(405);
				relation_expresion_p();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(T__27);
				setState(408);
				relation_term();
				setState(409);
				relation_expresion_p();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(T__28);
				setState(412);
				relation_term();
				setState(413);
				relation_expresion_p();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				match(T__29);
				setState(416);
				relation_term();
				setState(417);
				relation_expresion_p();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(T__30);
				setState(420);
				relation_term();
				setState(421);
				relation_expresion_p();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				match(T__31);
				setState(424);
				relation_term();
				setState(425);
				relation_expresion_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__24:
			case T__39:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 7);
				{
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

	public static class Relation_termContext extends ParserRuleContext {
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public Relation_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRelation_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRelation_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRelation_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_termContext relation_term() throws RecognitionException {
		Relation_termContext _localctx = new Relation_termContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relation_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			num_expresion();
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

	public static class Num_expresionContext extends ParserRuleContext {
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public Num_expresion_pContext num_expresion_p() {
			return getRuleContext(Num_expresion_pContext.class,0);
		}
		public Num_expresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_expresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_expresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_expresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expresionContext num_expresion() throws RecognitionException {
		Num_expresionContext _localctx = new Num_expresionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_num_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			num_term();
			setState(433);
			num_expresion_p();
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

	public static class Num_expresion_pContext extends ParserRuleContext {
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public Num_expresion_pContext num_expresion_p() {
			return getRuleContext(Num_expresion_pContext.class,0);
		}
		public Num_expresion_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expresion_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_expresion_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_expresion_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_expresion_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expresion_pContext num_expresion_p() throws RecognitionException {
		Num_expresion_pContext _localctx = new Num_expresion_pContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_num_expresion_p);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__32);
				setState(436);
				num_term();
				setState(437);
				num_expresion_p();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(T__33);
				setState(440);
				num_term();
				setState(441);
				num_expresion_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
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
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__39:
			case T__46:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Num_termContext extends ParserRuleContext {
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Num_term_pContext num_term_p() {
			return getRuleContext(Num_term_pContext.class,0);
		}
		public Num_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_termContext num_term() throws RecognitionException {
		Num_termContext _localctx = new Num_termContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_num_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			num_factor();
			setState(447);
			num_term_p();
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

	public static class Num_term_pContext extends ParserRuleContext {
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Num_term_pContext num_term_p() {
			return getRuleContext(Num_term_pContext.class,0);
		}
		public Num_term_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_term_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_term_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_term_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_term_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_term_pContext num_term_p() throws RecognitionException {
		Num_term_pContext _localctx = new Num_term_pContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_num_term_p);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__34);
				setState(450);
				num_factor();
				setState(451);
				num_term_p();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(T__35);
				setState(454);
				num_factor();
				setState(455);
				num_term_p();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(T__36);
				setState(458);
				num_factor();
				setState(459);
				num_term_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
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
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__39:
			case T__46:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Num_factorContext extends ParserRuleContext {
		public Num_factor_pContext num_factor_p() {
			return getRuleContext(Num_factor_pContext.class,0);
		}
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_num_factor);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				num_factor_p();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(T__32);
				setState(466);
				num_factor_p();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(T__33);
				setState(468);
				num_factor_p();
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

	public static class Num_factor_pContext extends ParserRuleContext {
		public Base_elementContext base_element() {
			return getRuleContext(Base_elementContext.class,0);
		}
		public Num_factor_ppContext num_factor_pp() {
			return getRuleContext(Num_factor_ppContext.class,0);
		}
		public Num_factor_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_factor_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_factor_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_factor_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_factor_pContext num_factor_p() throws RecognitionException {
		Num_factor_pContext _localctx = new Num_factor_pContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_num_factor_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			base_element();
			setState(472);
			num_factor_pp();
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

	public static class Num_factor_ppContext extends ParserRuleContext {
		public Base_elementContext base_element() {
			return getRuleContext(Base_elementContext.class,0);
		}
		public Num_factor_ppContext num_factor_pp() {
			return getRuleContext(Num_factor_ppContext.class,0);
		}
		public Num_factor_ppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor_pp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNum_factor_pp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNum_factor_pp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNum_factor_pp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_factor_ppContext num_factor_pp() throws RecognitionException {
		Num_factor_ppContext _localctx = new Num_factor_ppContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_num_factor_pp);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(T__37);
				setState(475);
				base_element();
				setState(476);
				num_factor_pp();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
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
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__46:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Base_elementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SLParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(SLParser.NUM, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Id_extendContext id_extend() {
			return getRuleContext(Id_extendContext.class,0);
		}
		public Base_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterBase_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitBase_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitBase_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_elementContext base_element() throws RecognitionException {
		Base_elementContext _localctx = new Base_elementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_base_element);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(T__9);
				setState(484);
				expresion();
				setState(485);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				match(ID);
				setState(489);
				id_extend();
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public SubmainContext submain() {
			return getRuleContext(SubmainContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public SubmainrContext submainr() {
			return getRuleContext(SubmainrContext.class,0);
		}
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__38);
			setState(493);
			match(ID);
			setState(494);
			match(T__9);
			setState(495);
			args();
			setState(496);
			match(T__10);
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__7:
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
					{
					{
					setState(497);
					header();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				submain();
				}
				break;
			case T__39:
				{
				setState(504);
				match(T__39);
				setState(505);
				tipo();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
					{
					{
					setState(506);
					header();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				submainr();
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

	public static class ArgsContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Next_argContext next_arg() {
			return getRuleContext(Next_argContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_args);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				ref();
				setState(517);
				match(ID);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(518);
					match(T__4);
					setState(519);
					match(ID);
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(T__5);
				setState(526);
				tipo();
				setState(527);
				next_arg();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Next_argContext extends ParserRuleContext {
		public TerminalNode SEP() { return getToken(SLParser.SEP, 0); }
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Next_argContext next_arg() {
			return getRuleContext(Next_argContext.class,0);
		}
		public Next_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_argContext next_arg() throws RecognitionException {
		Next_argContext _localctx = new Next_argContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_next_arg);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(SEP);
				setState(533);
				ref();
				setState(534);
				match(ID);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(535);
					match(T__4);
					setState(536);
					match(ID);
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(542);
				match(T__5);
				setState(543);
				tipo();
				setState(544);
				next_arg();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RefContext extends ParserRuleContext {
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ref);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(T__40);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SubmainContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SubmainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubmain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubmain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubmain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubmainContext submain() throws RecognitionException {
		SubmainContext _localctx = new SubmainContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_submain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__7);
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				sentencia();
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(559);
			match(T__8);
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

	public static class SubmainrContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SubmainrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submainr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubmainr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubmainr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubmainr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubmainrContext submainr() throws RecognitionException {
		SubmainrContext _localctx = new SubmainrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_submainr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__7);
			setState(563); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(562);
				sentencia();
				}
				}
				setState(565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0) );
			setState(567);
			match(T__39);
			setState(568);
			match(T__9);
			setState(569);
			expresion();
			setState(570);
			match(T__10);
			setState(571);
			match(T__8);
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

	public static class TipoContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Type_vectorContext type_vector() {
			return getRuleContext(Type_vectorContext.class,0);
		}
		public Type_matrixContext type_matrix() {
			return getRuleContext(Type_matrixContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tipo);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				tipos();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				type_vector();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				type_matrix();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				register();
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << ID))) != 0)) ) {
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

	public static class Type_vectorContext extends ParserRuleContext {
		public V_lenContext v_len() {
			return getRuleContext(V_lenContext.class,0);
		}
		public Type_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterType_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitType_vector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitType_vector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_vectorContext type_vector() throws RecognitionException {
		Type_vectorContext _localctx = new Type_vectorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_type_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__44);
			setState(582);
			match(T__45);
			setState(583);
			v_len();
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

	public static class V_lenContext extends ParserRuleContext {
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public V_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterV_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitV_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitV_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_lenContext v_len() throws RecognitionException {
		V_lenContext _localctx = new V_lenContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_v_len);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				num_expresion();
				setState(586);
				match(T__46);
				setState(587);
				tipo();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(T__34);
				setState(590);
				match(T__46);
				setState(591);
				tipo();
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

	public static class Type_matrixContext extends ParserRuleContext {
		public Dimention_listContext dimention_list() {
			return getRuleContext(Dimention_listContext.class,0);
		}
		public Type_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterType_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitType_matrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitType_matrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_matrixContext type_matrix() throws RecognitionException {
		Type_matrixContext _localctx = new Type_matrixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_type_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__47);
			setState(595);
			match(T__45);
			setState(596);
			dimention_list();
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

	public static class Dimention_listContext extends ParserRuleContext {
		public Next_dimentionContext next_dimention() {
			return getRuleContext(Next_dimentionContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DimentionContext dimention() {
			return getRuleContext(DimentionContext.class,0);
		}
		public Dimention_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimention_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDimention_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDimention_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDimention_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimention_listContext dimention_list() throws RecognitionException {
		Dimention_listContext _localctx = new Dimention_listContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dimention_list);
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(T__34);
				setState(599);
				next_dimention();
				setState(600);
				match(T__46);
				setState(601);
				tipo();
				}
				break;
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				dimention();
				setState(604);
				next_dimention();
				setState(605);
				match(T__46);
				setState(606);
				tipo();
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

	public static class Next_dimentionContext extends ParserRuleContext {
		public Next_dimention_pContext next_dimention_p() {
			return getRuleContext(Next_dimention_pContext.class,0);
		}
		public Next_dimentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_dimention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_dimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_dimention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_dimention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_dimentionContext next_dimention() throws RecognitionException {
		Next_dimentionContext _localctx = new Next_dimentionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_next_dimention);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(T__4);
				setState(611);
				next_dimention_p();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Next_dimention_pContext extends ParserRuleContext {
		public Next_dimentionContext next_dimention() {
			return getRuleContext(Next_dimentionContext.class,0);
		}
		public DimentionContext dimention() {
			return getRuleContext(DimentionContext.class,0);
		}
		public Next_dimention_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_dimention_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_dimention_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_dimention_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_dimention_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_dimention_pContext next_dimention_p() throws RecognitionException {
		Next_dimention_pContext _localctx = new Next_dimention_pContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_next_dimention_p);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(T__34);
				setState(616);
				next_dimention();
				}
				break;
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				dimention();
				setState(618);
				next_dimention();
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

	public static class DimentionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SLParser.NUM, 0); }
		public DimentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDimention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDimention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimentionContext dimention() throws RecognitionException {
		DimentionContext _localctx = new DimentionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_dimention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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

	public static class RegisterContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__48);
			setState(625);
			match(T__11);
			setState(627); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(626);
				var();
				}
				}
				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(631);
			match(T__12);
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

	public static class Id_extendContext extends ParserRuleContext {
		public Ids_optionsContext ids_options() {
			return getRuleContext(Ids_optionsContext.class,0);
		}
		public Id_extendContext id_extend() {
			return getRuleContext(Id_extendContext.class,0);
		}
		public Id_extendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterId_extend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitId_extend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitId_extend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_extendContext id_extend() throws RecognitionException {
		Id_extendContext _localctx = new Id_extendContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_id_extend);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				ids_options();
				setState(634);
				id_extend();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
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
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__39:
			case T__46:
			case ID:
			case SEP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Ids_optionsContext extends ParserRuleContext {
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Ids_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterIds_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitIds_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitIds_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ids_optionsContext ids_options() throws RecognitionException {
		Ids_optionsContext _localctx = new Ids_optionsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ids_options);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(T__45);
				setState(640);
				num_expresion();
				setState(641);
				matrix();
				setState(642);
				match(T__46);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				match(T__22);
				setState(645);
				match(ID);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Next_paramContext next_param() {
			return getRuleContext(Next_paramContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_params);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__25:
			case T__32:
			case T__33:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				expresion();
				setState(649);
				next_param();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Next_paramContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Next_paramContext next_param() {
			return getRuleContext(Next_paramContext.class,0);
		}
		public Next_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_paramContext next_param() throws RecognitionException {
		Next_paramContext _localctx = new Next_paramContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_next_param);
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(T__4);
				setState(655);
				expresion();
				setState(656);
				next_param();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MatrixContext extends ParserRuleContext {
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_matrix);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				match(T__4);
				setState(662);
				num_expresion();
				setState(663);
				matrix();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\u0004\u00019\u029d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0001\u0000"+
		"\u0003\u0000y\b\u0000\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000"+
		"\u007f\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0083\b\u0000\n\u0000"+
		"\f\u0000\u0086\t\u0000\u0001\u0001\u0001\u0001\u0004\u0001\u008a\b\u0001"+
		"\u000b\u0001\f\u0001\u008b\u0001\u0001\u0001\u0001\u0004\u0001\u0090\b"+
		"\u0001\u000b\u0001\f\u0001\u0091\u0001\u0001\u0001\u0001\u0004\u0001\u0096"+
		"\b\u0001\u000b\u0001\f\u0001\u0097\u0003\u0001\u009a\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u009f\b\u0002\n\u0002\f\u0002\u00a2"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a8"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00af\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b6\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u00ba"+
		"\b\u0005\n\u0005\f\u0005\u00bd\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00c3\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00d3\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d7\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00db\b\u0006\u0003\u0006\u00dd\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ec"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00f4\b\t"+
		"\u000b\t\f\t\u00f5\u0001\t\u0005\t\u00f9\b\t\n\t\f\t\u00fc\t\t\u0001\t"+
		"\u0003\t\u00ff\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u0109\b\n\u000b\n\f\n\u010a\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0113\b\u000b"+
		"\u000b\u000b\f\u000b\u0114\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004"+
		"\f\u011b\b\f\u000b\f\f\f\u011c\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u012b"+
		"\b\r\u000b\r\f\r\u012c\u0001\r\u0005\r\u0130\b\r\n\r\f\r\u0133\t\r\u0001"+
		"\r\u0003\r\u0136\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u013f\b\u000e\u000b\u000e\f\u000e"+
		"\u0140\u0001\u000f\u0001\u000f\u0004\u000f\u0145\b\u000f\u000b\u000f\f"+
		"\u000f\u0146\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0151\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u0155\b\u0010\u000b\u0010\f\u0010\u0156\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u015f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0166\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0172\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u017c"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0186\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u018b\b\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u018f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01ad\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01bd\b\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01cf\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01d6\b\"\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01e0\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u01eb\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u01f3\b&\n&\f&\u01f6\t&\u0001&\u0001&\u0001&\u0001"+
		"&\u0005&\u01fc\b&\n&\f&\u01ff\t&\u0001&\u0001&\u0003&\u0203\b&\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0005\'\u0209\b\'\n\'\f\'\u020c\t\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0213\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u021a\b(\n(\f(\u021d\t(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u0224\b(\u0001)\u0001)\u0003)\u0228\b)\u0001*\u0001*\u0004*\u022c"+
		"\b*\u000b*\f*\u022d\u0001*\u0001*\u0001+\u0001+\u0004+\u0234\b+\u000b"+
		"+\f+\u0235\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0242\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0251\b/\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u0261\b1\u00012\u00012\u00012\u00032\u0266\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u026d\b3\u00014\u00014\u00015\u0001"+
		"5\u00015\u00045\u0274\b5\u000b5\f5\u0275\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00036\u027e\b6\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u0287\b7\u00018\u00018\u00018\u00018\u00038\u028d\b8\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u0294\b9\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u029b\b:\u0001:\u0000\u0000;\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0002\u0002\u0000*,22\u0001\u000023\u02ba"+
		"\u0000x\u0001\u0000\u0000\u0000\u0002\u0099\u0001\u0000\u0000\u0000\u0004"+
		"\u009b\u0001\u0000\u0000\u0000\u0006\u00a9\u0001\u0000\u0000\u0000\b\u00b0"+
		"\u0001\u0000\u0000\u0000\n\u00b7\u0001\u0000\u0000\u0000\f\u00dc\u0001"+
		"\u0000\u0000\u0000\u000e\u00de\u0001\u0000\u0000\u0000\u0010\u00e3\u0001"+
		"\u0000\u0000\u0000\u0012\u00ed\u0001\u0000\u0000\u0000\u0014\u0102\u0001"+
		"\u0000\u0000\u0000\u0016\u010c\u0001\u0000\u0000\u0000\u0018\u0118\u0001"+
		"\u0000\u0000\u0000\u001a\u0123\u0001\u0000\u0000\u0000\u001c\u0139\u0001"+
		"\u0000\u0000\u0000\u001e\u0142\u0001\u0000\u0000\u0000 \u0148\u0001\u0000"+
		"\u0000\u0000\"\u015e\u0001\u0000\u0000\u0000$\u0165\u0001\u0000\u0000"+
		"\u0000&\u0167\u0001\u0000\u0000\u0000(\u0171\u0001\u0000\u0000\u0000*"+
		"\u0173\u0001\u0000\u0000\u0000,\u017b\u0001\u0000\u0000\u0000.\u017d\u0001"+
		"\u0000\u0000\u00000\u0185\u0001\u0000\u0000\u00002\u018a\u0001\u0000\u0000"+
		"\u00004\u018e\u0001\u0000\u0000\u00006\u0190\u0001\u0000\u0000\u00008"+
		"\u01ac\u0001\u0000\u0000\u0000:\u01ae\u0001\u0000\u0000\u0000<\u01b0\u0001"+
		"\u0000\u0000\u0000>\u01bc\u0001\u0000\u0000\u0000@\u01be\u0001\u0000\u0000"+
		"\u0000B\u01ce\u0001\u0000\u0000\u0000D\u01d5\u0001\u0000\u0000\u0000F"+
		"\u01d7\u0001\u0000\u0000\u0000H\u01df\u0001\u0000\u0000\u0000J\u01ea\u0001"+
		"\u0000\u0000\u0000L\u01ec\u0001\u0000\u0000\u0000N\u0212\u0001\u0000\u0000"+
		"\u0000P\u0223\u0001\u0000\u0000\u0000R\u0227\u0001\u0000\u0000\u0000T"+
		"\u0229\u0001\u0000\u0000\u0000V\u0231\u0001\u0000\u0000\u0000X\u0241\u0001"+
		"\u0000\u0000\u0000Z\u0243\u0001\u0000\u0000\u0000\\\u0245\u0001\u0000"+
		"\u0000\u0000^\u0250\u0001\u0000\u0000\u0000`\u0252\u0001\u0000\u0000\u0000"+
		"b\u0260\u0001\u0000\u0000\u0000d\u0265\u0001\u0000\u0000\u0000f\u026c"+
		"\u0001\u0000\u0000\u0000h\u026e\u0001\u0000\u0000\u0000j\u0270\u0001\u0000"+
		"\u0000\u0000l\u027d\u0001\u0000\u0000\u0000n\u0286\u0001\u0000\u0000\u0000"+
		"p\u028c\u0001\u0000\u0000\u0000r\u0293\u0001\u0000\u0000\u0000t\u029a"+
		"\u0001\u0000\u0000\u0000vw\u0005\u0001\u0000\u0000wy\u00052\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y}\u0001\u0000\u0000"+
		"\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0084"+
		"\u0003\n\u0005\u0000\u0081\u0083\u0003L&\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0001\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0005\u0002"+
		"\u0000\u0000\u0088\u008a\u0003\u0006\u0003\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u009a\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0005\u0003\u0000\u0000\u008e\u0090\u0003\b\u0004"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u009a\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u0004\u0000"+
		"\u0000\u0094\u0096\u0003\u0004\u0002\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0087\u0001\u0000\u0000\u0000\u0099\u008d\u0001\u0000\u0000"+
		"\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u009a\u0003\u0001\u0000\u0000"+
		"\u0000\u009b\u00a0\u00052\u0000\u0000\u009c\u009d\u0005\u0005\u0000\u0000"+
		"\u009d\u009f\u00052\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4"+
		"\u00a7\u0003X,\u0000\u00a5\u00a8\u00056\u0000\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u0005\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"2\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ae\u0003*\u0015"+
		"\u0000\u00ac\u00af\u00056\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u0007\u0001\u0000\u0000\u0000\u00b0\u00b1\u00052\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b5\u0003X,\u0000\u00b3\u00b6\u0005"+
		"6\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\t\u0001\u0000\u0000"+
		"\u0000\u00b7\u00bb\u0005\b\u0000\u0000\u00b8\u00ba\u0003\f\u0006\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u000b\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0003\u000e\u0007\u0000\u00c1\u00c3\u00056\u0000\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00dd"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003\u0010\b\u0000\u00c5\u00c7\u0005"+
		"6\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00dd\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\u0012"+
		"\t\u0000\u00c9\u00cb\u00056\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00dd\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0003\u0016\u000b\u0000\u00cd\u00cf\u00056\u0000\u0000"+
		"\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00dd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u0018\f\u0000\u00d1"+
		"\u00d3\u00056\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00dd\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0003\u001a\r\u0000\u00d5\u00d7\u00056\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00dd\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0003 \u0010\u0000\u00d9\u00db\u00056\u0000"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00c0\u0001\u0000\u0000"+
		"\u0000\u00dc\u00c4\u0001\u0000\u0000\u0000\u00dc\u00c8\u0001\u0000\u0000"+
		"\u0000\u00dc\u00cc\u0001\u0000\u0000\u0000\u00dc\u00d0\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000"+
		"\u0000\u00dd\r\u0001\u0000\u0000\u0000\u00de\u00df\u00052\u0000\u0000"+
		"\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0003p8\u0000\u00e1\u00e2"+
		"\u0005\u000b\u0000\u0000\u00e2\u000f\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u00052\u0000\u0000\u00e4\u00e5\u0003l6\u0000\u00e5\u00eb\u0005\u0007"+
		"\u0000\u0000\u00e6\u00ec\u0003*\u0015\u0000\u00e7\u00e8\u0005\f\u0000"+
		"\u0000\u00e8\u00e9\u0003\"\u0011\u0000\u00e9\u00ea\u0005\r\u0000\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e7\u0001\u0000\u0000\u0000\u00ec\u0011\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005\u000e\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef"+
		"\u00f0\u0003*\u0015\u0000\u00f0\u00f1\u0005\u000b\u0000\u0000\u00f1\u00f3"+
		"\u0005\f\u0000\u0000\u00f2\u00f4\u0003\f\u0006\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0003\u0014\n\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003\u001e"+
		"\u000f\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\r\u0000"+
		"\u0000\u0101\u0013\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u000f\u0000"+
		"\u0000\u0103\u0104\u0005\u000e\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000"+
		"\u0105\u0106\u0003*\u0015\u0000\u0106\u0108\u0005\u000b\u0000\u0000\u0107"+
		"\u0109\u0003\f\u0006\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u0015\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005\u0010\u0000\u0000\u010d\u010e\u0005\n\u0000\u0000\u010e\u010f\u0003"+
		"*\u0015\u0000\u010f\u0110\u0005\u000b\u0000\u0000\u0110\u0112\u0005\f"+
		"\u0000\u0000\u0111\u0113\u0003\f\u0006\u0000\u0112\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\r\u0000\u0000\u0117\u0017\u0001\u0000\u0000\u0000"+
		"\u0118\u011a\u0005\u0011\u0000\u0000\u0119\u011b\u0003\f\u0006\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0012\u0000\u0000\u011f"+
		"\u0120\u0005\n\u0000\u0000\u0120\u0121\u0003*\u0015\u0000\u0121\u0122"+
		"\u0005\u000b\u0000\u0000\u0122\u0019\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005\u0013\u0000\u0000\u0124\u0125\u0005\f\u0000\u0000\u0125\u0126\u0005"+
		"\u0014\u0000\u0000\u0126\u0127\u0005\n\u0000\u0000\u0127\u0128\u0003*"+
		"\u0015\u0000\u0128\u012a\u0005\u000b\u0000\u0000\u0129\u012b\u0003\f\u0006"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u0131\u0001\u0000\u0000\u0000\u012e\u0130\u0003\u001c\u000e"+
		"\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0003\u001e\u000f\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005\r\u0000\u0000\u0138\u001b\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0005\u0014\u0000\u0000\u013a\u013b\u0005\n\u0000\u0000\u013b"+
		"\u013c\u0003*\u0015\u0000\u013c\u013e\u0005\u000b\u0000\u0000\u013d\u013f"+
		"\u0003\f\u0006\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u001d\u0001\u0000\u0000\u0000\u0142\u0144\u0005"+
		"\u000f\u0000\u0000\u0143\u0145\u0003\f\u0006\u0000\u0144\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u001f\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0015\u0000\u0000\u0149\u014a\u00052\u0000"+
		"\u0000\u014a\u014b\u0005\u0007\u0000\u0000\u014b\u014c\u0003<\u001e\u0000"+
		"\u014c\u014d\u0005\u0012\u0000\u0000\u014d\u0150\u0003<\u001e\u0000\u014e"+
		"\u014f\u0005\u0016\u0000\u0000\u014f\u0151\u0003<\u001e\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0005\f\u0000\u0000\u0153\u0155\u0003"+
		"\f\u0006\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005\r\u0000"+
		"\u0000\u0159!\u0001\u0000\u0000\u0000\u015a\u015b\u0003&\u0013\u0000\u015b"+
		"\u015c\u0003$\u0012\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0001\u0000\u0000\u0000\u015e\u015a\u0001\u0000\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015f#\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\u0005\u0000\u0000\u0161\u0162\u0003&\u0013\u0000\u0162\u0163\u0003$\u0012"+
		"\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000"+
		"\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0166%\u0001\u0000\u0000\u0000\u0167\u0168\u0003(\u0014\u0000\u0168"+
		"\'\u0001\u0000\u0000\u0000\u0169\u016a\u0005\f\u0000\u0000\u016a\u016b"+
		"\u0003\"\u0011\u0000\u016b\u016c\u0005\r\u0000\u0000\u016c\u0172\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0005\u0017\u0000\u0000\u016e\u016f\u0005"+
		"\u0017\u0000\u0000\u016f\u0172\u0005\u0017\u0000\u0000\u0170\u0172\u0003"+
		"*\u0015\u0000\u0171\u0169\u0001\u0000\u0000\u0000\u0171\u016d\u0001\u0000"+
		"\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172)\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0003.\u0017\u0000\u0174\u0175\u0003,\u0016\u0000\u0175"+
		"+\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0018\u0000\u0000\u0177\u0178"+
		"\u0003.\u0017\u0000\u0178\u0179\u0003,\u0016\u0000\u0179\u017c\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0176\u0001\u0000"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c-\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u00032\u0019\u0000\u017e\u017f\u00030\u0018\u0000\u017f"+
		"/\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0019\u0000\u0000\u0181\u0182"+
		"\u00032\u0019\u0000\u0182\u0183\u00030\u0018\u0000\u0183\u0186\u0001\u0000"+
		"\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0180\u0001\u0000"+
		"\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u01861\u0001\u0000\u0000"+
		"\u0000\u0187\u018b\u00034\u001a\u0000\u0188\u0189\u0005\u001a\u0000\u0000"+
		"\u0189\u018b\u00034\u001a\u0000\u018a\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u0188\u0001\u0000\u0000\u0000\u018b3\u0001\u0000\u0000\u0000\u018c\u018f"+
		"\u00055\u0000\u0000\u018d\u018f\u00036\u001b\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f5\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0003:\u001d\u0000\u0191\u0192\u00038\u001c\u0000\u0192"+
		"7\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u001b\u0000\u0000\u0194\u0195"+
		"\u0003:\u001d\u0000\u0195\u0196\u00038\u001c\u0000\u0196\u01ad\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0005\u001c\u0000\u0000\u0198\u0199\u0003:\u001d"+
		"\u0000\u0199\u019a\u00038\u001c\u0000\u019a\u01ad\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005\u001d\u0000\u0000\u019c\u019d\u0003:\u001d\u0000\u019d"+
		"\u019e\u00038\u001c\u0000\u019e\u01ad\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0005\u001e\u0000\u0000\u01a0\u01a1\u0003:\u001d\u0000\u01a1\u01a2\u0003"+
		"8\u001c\u0000\u01a2\u01ad\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u001f"+
		"\u0000\u0000\u01a4\u01a5\u0003:\u001d\u0000\u01a5\u01a6\u00038\u001c\u0000"+
		"\u01a6\u01ad\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005 \u0000\u0000\u01a8"+
		"\u01a9\u0003:\u001d\u0000\u01a9\u01aa\u00038\u001c\u0000\u01aa\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u0193\u0001"+
		"\u0000\u0000\u0000\u01ac\u0197\u0001\u0000\u0000\u0000\u01ac\u019b\u0001"+
		"\u0000\u0000\u0000\u01ac\u019f\u0001\u0000\u0000\u0000\u01ac\u01a3\u0001"+
		"\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad9\u0001\u0000\u0000\u0000\u01ae\u01af\u0003<\u001e"+
		"\u0000\u01af;\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003@ \u0000\u01b1"+
		"\u01b2\u0003>\u001f\u0000\u01b2=\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"!\u0000\u0000\u01b4\u01b5\u0003@ \u0000\u01b5\u01b6\u0003>\u001f\u0000"+
		"\u01b6\u01bd\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\"\u0000\u0000\u01b8"+
		"\u01b9\u0003@ \u0000\u01b9\u01ba\u0003>\u001f\u0000\u01ba\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b3\u0001"+
		"\u0000\u0000\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd?\u0001\u0000\u0000\u0000\u01be\u01bf\u0003D\""+
		"\u0000\u01bf\u01c0\u0003B!\u0000\u01c0A\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005#\u0000\u0000\u01c2\u01c3\u0003D\"\u0000\u01c3\u01c4\u0003"+
		"B!\u0000\u01c4\u01cf\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005$\u0000"+
		"\u0000\u01c6\u01c7\u0003D\"\u0000\u01c7\u01c8\u0003B!\u0000\u01c8\u01cf"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005%\u0000\u0000\u01ca\u01cb\u0003"+
		"D\"\u0000\u01cb\u01cc\u0003B!\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01c1\u0001\u0000\u0000\u0000"+
		"\u01ce\u01c5\u0001\u0000\u0000\u0000\u01ce\u01c9\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cfC\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d6\u0003F#\u0000\u01d1\u01d2\u0005!\u0000\u0000\u01d2\u01d6\u0003"+
		"F#\u0000\u01d3\u01d4\u0005\"\u0000\u0000\u01d4\u01d6\u0003F#\u0000\u01d5"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d6E\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0003J%\u0000\u01d8\u01d9\u0003H$\u0000\u01d9G\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0005&\u0000\u0000\u01db\u01dc\u0003J%\u0000\u01dc\u01dd"+
		"\u0003H$\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000"+
		"\u0000\u0000\u01df\u01da\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000"+
		"\u0000\u0000\u01e0I\u0001\u0000\u0000\u0000\u01e1\u01eb\u00054\u0000\u0000"+
		"\u01e2\u01eb\u00053\u0000\u0000\u01e3\u01e4\u0005\n\u0000\u0000\u01e4"+
		"\u01e5\u0003*\u0015\u0000\u01e5\u01e6\u0005\u000b\u0000\u0000\u01e6\u01eb"+
		"\u0001\u0000\u0000\u0000\u01e7\u01eb\u0003\u000e\u0007\u0000\u01e8\u01e9"+
		"\u00052\u0000\u0000\u01e9\u01eb\u0003l6\u0000\u01ea\u01e1\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e2\u0001\u0000\u0000\u0000\u01ea\u01e3\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ebK\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\'\u0000"+
		"\u0000\u01ed\u01ee\u00052\u0000\u0000\u01ee\u01ef\u0005\n\u0000\u0000"+
		"\u01ef\u01f0\u0003N\'\u0000\u01f0\u0202\u0005\u000b\u0000\u0000\u01f1"+
		"\u01f3\u0003\u0002\u0001\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f7\u0203\u0003T*\u0000\u01f8\u01f9\u0005"+
		"(\u0000\u0000\u01f9\u01fd\u0003X,\u0000\u01fa\u01fc\u0003\u0002\u0001"+
		"\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0003V+\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202"+
		"\u01f4\u0001\u0000\u0000\u0000\u0202\u01f8\u0001\u0000\u0000\u0000\u0203"+
		"M\u0001\u0000\u0000\u0000\u0204\u0205\u0003R)\u0000\u0205\u020a\u0005"+
		"2\u0000\u0000\u0206\u0207\u0005\u0005\u0000\u0000\u0207\u0209\u00052\u0000"+
		"\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005\u0006\u0000\u0000\u020e\u020f\u0003X,\u0000\u020f"+
		"\u0210\u0003P(\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u0213\u0001"+
		"\u0000\u0000\u0000\u0212\u0204\u0001\u0000\u0000\u0000\u0212\u0211\u0001"+
		"\u0000\u0000\u0000\u0213O\u0001\u0000\u0000\u0000\u0214\u0215\u00056\u0000"+
		"\u0000\u0215\u0216\u0003R)\u0000\u0216\u021b\u00052\u0000\u0000\u0217"+
		"\u0218\u0005\u0005\u0000\u0000\u0218\u021a\u00052\u0000\u0000\u0219\u0217"+
		"\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021e"+
		"\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\u0006\u0000\u0000\u021f\u0220\u0003X,\u0000\u0220\u0221\u0003P"+
		"(\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000\u0000"+
		"\u0000\u0223\u0214\u0001\u0000\u0000\u0000\u0223\u0222\u0001\u0000\u0000"+
		"\u0000\u0224Q\u0001\u0000\u0000\u0000\u0225\u0228\u0005)\u0000\u0000\u0226"+
		"\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u0226\u0001\u0000\u0000\u0000\u0228S\u0001\u0000\u0000\u0000\u0229\u022b"+
		"\u0005\b\u0000\u0000\u022a\u022c\u0003\f\u0006\u0000\u022b\u022a\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022b\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0005\t\u0000\u0000\u0230U\u0001\u0000"+
		"\u0000\u0000\u0231\u0233\u0005\b\u0000\u0000\u0232\u0234\u0003\f\u0006"+
		"\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000"+
		"\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0005(\u0000\u0000"+
		"\u0238\u0239\u0005\n\u0000\u0000\u0239\u023a\u0003*\u0015\u0000\u023a"+
		"\u023b\u0005\u000b\u0000\u0000\u023b\u023c\u0005\t\u0000\u0000\u023cW"+
		"\u0001\u0000\u0000\u0000\u023d\u0242\u0003Z-\u0000\u023e\u0242\u0003\\"+
		".\u0000\u023f\u0242\u0003`0\u0000\u0240\u0242\u0003j5\u0000\u0241\u023d"+
		"\u0001\u0000\u0000\u0000\u0241\u023e\u0001\u0000\u0000\u0000\u0241\u023f"+
		"\u0001\u0000\u0000\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0242Y\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0007\u0000\u0000\u0000\u0244[\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0005-\u0000\u0000\u0246\u0247\u0005.\u0000\u0000"+
		"\u0247\u0248\u0003^/\u0000\u0248]\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0003<\u001e\u0000\u024a\u024b\u0005/\u0000\u0000\u024b\u024c\u0003X"+
		",\u0000\u024c\u0251\u0001\u0000\u0000\u0000\u024d\u024e\u0005#\u0000\u0000"+
		"\u024e\u024f\u0005/\u0000\u0000\u024f\u0251\u0003X,\u0000\u0250\u0249"+
		"\u0001\u0000\u0000\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0251_\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u00050\u0000\u0000\u0253\u0254\u0005.\u0000"+
		"\u0000\u0254\u0255\u0003b1\u0000\u0255a\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0005#\u0000\u0000\u0257\u0258\u0003d2\u0000\u0258\u0259\u0005"+
		"/\u0000\u0000\u0259\u025a\u0003X,\u0000\u025a\u0261\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0003h4\u0000\u025c\u025d\u0003d2\u0000\u025d\u025e"+
		"\u0005/\u0000\u0000\u025e\u025f\u0003X,\u0000\u025f\u0261\u0001\u0000"+
		"\u0000\u0000\u0260\u0256\u0001\u0000\u0000\u0000\u0260\u025b\u0001\u0000"+
		"\u0000\u0000\u0261c\u0001\u0000\u0000\u0000\u0262\u0263\u0005\u0005\u0000"+
		"\u0000\u0263\u0266\u0003f3\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265"+
		"\u0262\u0001\u0000\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266"+
		"e\u0001\u0000\u0000\u0000\u0267\u0268\u0005#\u0000\u0000\u0268\u026d\u0003"+
		"d2\u0000\u0269\u026a\u0003h4\u0000\u026a\u026b\u0003d2\u0000\u026b\u026d"+
		"\u0001\u0000\u0000\u0000\u026c\u0267\u0001\u0000\u0000\u0000\u026c\u0269"+
		"\u0001\u0000\u0000\u0000\u026dg\u0001\u0000\u0000\u0000\u026e\u026f\u0007"+
		"\u0001\u0000\u0000\u026fi\u0001\u0000\u0000\u0000\u0270\u0271\u00051\u0000"+
		"\u0000\u0271\u0273\u0005\f\u0000\u0000\u0272\u0274\u0003\u0004\u0002\u0000"+
		"\u0273\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0005\r\u0000\u0000\u0278"+
		"k\u0001\u0000\u0000\u0000\u0279\u027a\u0003n7\u0000\u027a\u027b\u0003"+
		"l6\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000"+
		"\u0000\u027d\u0279\u0001\u0000\u0000\u0000\u027d\u027c\u0001\u0000\u0000"+
		"\u0000\u027em\u0001\u0000\u0000\u0000\u027f\u0280\u0005.\u0000\u0000\u0280"+
		"\u0281\u0003<\u001e\u0000\u0281\u0282\u0003t:\u0000\u0282\u0283\u0005"+
		"/\u0000\u0000\u0283\u0287\u0001\u0000\u0000\u0000\u0284\u0285\u0005\u0017"+
		"\u0000\u0000\u0285\u0287\u00052\u0000\u0000\u0286\u027f\u0001\u0000\u0000"+
		"\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0287o\u0001\u0000\u0000\u0000"+
		"\u0288\u0289\u0003*\u0015\u0000\u0289\u028a\u0003r9\u0000\u028a\u028d"+
		"\u0001\u0000\u0000\u0000\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u0288"+
		"\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028dq\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0005\u0005\u0000\u0000\u028f\u0290\u0003"+
		"*\u0015\u0000\u0290\u0291\u0003r9\u0000\u0291\u0294\u0001\u0000\u0000"+
		"\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u028e\u0001\u0000\u0000"+
		"\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294s\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u0005\u0005\u0000\u0000\u0296\u0297\u0003<\u001e\u0000\u0297"+
		"\u0298\u0003t:\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u029b\u0001"+
		"\u0000\u0000\u0000\u029a\u0295\u0001\u0000\u0000\u0000\u029a\u0299\u0001"+
		"\u0000\u0000\u0000\u029bu\u0001\u0000\u0000\u0000Dx}\u0084\u008b\u0091"+
		"\u0097\u0099\u00a0\u00a7\u00ae\u00b5\u00bb\u00c2\u00c6\u00ca\u00ce\u00d2"+
		"\u00d6\u00da\u00dc\u00eb\u00f5\u00fa\u00fe\u010a\u0114\u011c\u012c\u0131"+
		"\u0135\u0140\u0146\u0150\u0156\u015e\u0165\u0171\u017b\u0185\u018a\u018e"+
		"\u01ac\u01bc\u01ce\u01d5\u01df\u01ea\u01f4\u01fd\u0202\u020a\u0212\u021b"+
		"\u0223\u0227\u022d\u0235\u0241\u0250\u0260\u0265\u026c\u0275\u027d\u0286"+
		"\u028c\u0293\u029a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}