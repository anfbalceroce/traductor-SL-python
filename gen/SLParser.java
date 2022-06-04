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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, ID=51, NUM=52, STRING=53, 
		BOOL=54, COMMENT1=55, COMMENT2=56, ESP=57;
	public static final int
		RULE_start = 0, RULE_header = 1, RULE_var_list = 2, RULE_var = 3, RULE_id_list = 4, 
		RULE_next_id = 5, RULE_next_var = 6, RULE_const_list = 7, RULE_const = 8, 
		RULE_next_const = 9, RULE_tipos_list = 10, RULE_tipo_p = 11, RULE_next_tipo_p = 12, 
		RULE_sep_opt = 13, RULE_sent_sep = 14, RULE_main = 15, RULE_sentencias = 16, 
		RULE_next_sentencia = 17, RULE_sentencia = 18, RULE_assng_call = 19, RULE_for_start = 20, 
		RULE_for_end = 21, RULE_for_step = 22, RULE_sino = 23, RULE_sino_p = 24, 
		RULE_sino_pp = 25, RULE_sent_sep_sino = 26, RULE_sentenciasnoif = 27, 
		RULE_sentencianoif = 28, RULE_sentenciasif = 29, RULE_case = 30, RULE_sw_sino = 31, 
		RULE_assingment = 32, RULE_assingment_p = 33, RULE_m_expresion = 34, RULE_m_expresion_p = 35, 
		RULE_m_term = 36, RULE_m_factor = 37, RULE_expresion = 38, RULE_logic_expresion_p = 39, 
		RULE_logic_term = 40, RULE_logic_term_p = 41, RULE_logic_factor = 42, 
		RULE_logic_element = 43, RULE_relation_expresion = 44, RULE_relation_expresion_p = 45, 
		RULE_relation_term = 46, RULE_num_expresion = 47, RULE_num_expresion_p = 48, 
		RULE_num_term = 49, RULE_num_term_p = 50, RULE_num_factor = 51, RULE_num_factor_p = 52, 
		RULE_num_factor_pp = 53, RULE_base_element = 54, RULE_sub = 55, RULE_args = 56, 
		RULE_next_arg = 57, RULE_ref = 58, RULE_return = 59, RULE_subheader = 60, 
		RULE_subbody = 61, RULE_subheaderr = 62, RULE_subbodyr = 63, RULE_subsentencias = 64, 
		RULE_tipo = 65, RULE_tipos = 66, RULE_type_vector = 67, RULE_v_len = 68, 
		RULE_type_matrix = 69, RULE_dimention_list = 70, RULE_next_dimention = 71, 
		RULE_next_dimention_p = 72, RULE_dimention = 73, RULE_register = 74, RULE_id_extend = 75, 
		RULE_ids_options = 76, RULE_call = 77, RULE_call_opt = 78, RULE_params = 79, 
		RULE_next_param = 80, RULE_matrix = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "header", "var_list", "var", "id_list", "next_id", "next_var", 
			"const_list", "const", "next_const", "tipos_list", "tipo_p", "next_tipo_p", 
			"sep_opt", "sent_sep", "main", "sentencias", "next_sentencia", "sentencia", 
			"assng_call", "for_start", "for_end", "for_step", "sino", "sino_p", "sino_pp", 
			"sent_sep_sino", "sentenciasnoif", "sentencianoif", "sentenciasif", "case", 
			"sw_sino", "assingment", "assingment_p", "m_expresion", "m_expresion_p", 
			"m_term", "m_factor", "expresion", "logic_expresion_p", "logic_term", 
			"logic_term_p", "logic_factor", "logic_element", "relation_expresion", 
			"relation_expresion_p", "relation_term", "num_expresion", "num_expresion_p", 
			"num_term", "num_term_p", "num_factor", "num_factor_p", "num_factor_pp", 
			"base_element", "sub", "args", "next_arg", "ref", "return", "subheader", 
			"subbody", "subheaderr", "subbodyr", "subsentencias", "tipo", "tipos", 
			"type_vector", "v_len", "type_matrix", "dimention_list", "next_dimention", 
			"next_dimention_p", "dimention", "register", "id_extend", "ids_options", 
			"call", "call_opt", "params", "next_param", "matrix"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'const'", "'tipos'", "'var'", "':'", "','", "'='", 
			"';'", "'inicio'", "'fin'", "'si'", "'('", "')'", "'{'", "'}'", "'mientras'", 
			"'repetir'", "'hasta'", "'eval'", "'caso'", "'desde'", "'paso'", "'sino'", 
			"'.'", "'or'", "'and'", "'not'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'<>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'subrutina'", "'ref'", 
			"'retorna'", "'cadena'", "'logico'", "'numerico'", "'vector'", "'['", 
			"']'", "'matriz'", "'registro'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUM", "STRING", "BOOL", "COMMENT1", "COMMENT2", 
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
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__0);
				setState(165);
				match(ID);
				setState(166);
				header();
				setState(167);
				main();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				header();
				setState(170);
				main();
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

	public static class HeaderContext extends ParserRuleContext {
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public Tipos_listContext tipos_list() {
			return getRuleContext(Tipos_listContext.class,0);
		}
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
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
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__1);
				setState(175);
				const_list();
				setState(176);
				header();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__2);
				setState(179);
				tipos_list();
				setState(180);
				header();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__3);
				setState(183);
				var_list();
				setState(184);
				header();
				}
				break;
			case T__8:
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

	public static class Var_listContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Next_varContext next_var() {
			return getRuleContext(Next_varContext.class,0);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVar_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitVar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			var();
			setState(190);
			next_var();
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
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Sep_optContext sep_opt() {
			return getRuleContext(Sep_optContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			id_list();
			setState(193);
			match(T__4);
			setState(194);
			tipo();
			setState(195);
			sep_opt();
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Next_idContext next_id() {
			return getRuleContext(Next_idContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			next_id();
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

	public static class Next_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Next_idContext next_id() {
			return getRuleContext(Next_idContext.class,0);
		}
		public Next_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_idContext next_id() throws RecognitionException {
		Next_idContext _localctx = new Next_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_next_id);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__5);
				setState(201);
				match(ID);
				setState(202);
				next_id();
				}
				break;
			case T__4:
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

	public static class Next_varContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Next_varContext next_var() {
			return getRuleContext(Next_varContext.class,0);
		}
		public Next_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_varContext next_var() throws RecognitionException {
		Next_varContext _localctx = new Next_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_next_var);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				var();
				setState(207);
				next_var();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
			case T__14:
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

	public static class Const_listContext extends ParserRuleContext {
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public Next_constContext next_const() {
			return getRuleContext(Next_constContext.class,0);
		}
		public Const_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterConst_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitConst_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConst_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_listContext const_list() throws RecognitionException {
		Const_listContext _localctx = new Const_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_const_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			const_();
			setState(213);
			next_const();
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
		public Sep_optContext sep_opt() {
			return getRuleContext(Sep_optContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ID);
			setState(216);
			match(T__6);
			setState(217);
			expresion();
			setState(218);
			sep_opt();
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

	public static class Next_constContext extends ParserRuleContext {
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public Next_constContext next_const() {
			return getRuleContext(Next_constContext.class,0);
		}
		public Next_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_constContext next_const() throws RecognitionException {
		Next_constContext _localctx = new Next_constContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_next_const);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				const_();
				setState(221);
				next_const();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
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

	public static class Tipos_listContext extends ParserRuleContext {
		public Tipo_pContext tipo_p() {
			return getRuleContext(Tipo_pContext.class,0);
		}
		public Next_tipo_pContext next_tipo_p() {
			return getRuleContext(Next_tipo_pContext.class,0);
		}
		public Tipos_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipos_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipos_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipos_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_listContext tipos_list() throws RecognitionException {
		Tipos_listContext _localctx = new Tipos_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipos_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			tipo_p();
			setState(227);
			next_tipo_p();
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
		public Sep_optContext sep_opt() {
			return getRuleContext(Sep_optContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_tipo_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(230);
			match(T__4);
			setState(231);
			tipo();
			setState(232);
			sep_opt();
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

	public static class Next_tipo_pContext extends ParserRuleContext {
		public Tipo_pContext tipo_p() {
			return getRuleContext(Tipo_pContext.class,0);
		}
		public Next_tipo_pContext next_tipo_p() {
			return getRuleContext(Next_tipo_pContext.class,0);
		}
		public Next_tipo_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_tipo_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_tipo_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_tipo_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_tipo_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_tipo_pContext next_tipo_p() throws RecognitionException {
		Next_tipo_pContext _localctx = new Next_tipo_pContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_next_tipo_p);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				tipo_p();
				setState(235);
				next_tipo_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
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

	public static class Sep_optContext extends ParserRuleContext {
		public Sep_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSep_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSep_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSep_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sep_optContext sep_opt() throws RecognitionException {
		Sep_optContext _localctx = new Sep_optContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sep_opt);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__7);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
			case T__14:
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

	public static class Sent_sepContext extends ParserRuleContext {
		public Sent_sepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSent_sep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSent_sep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSent_sep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_sepContext sent_sep() throws RecognitionException {
		Sent_sepContext _localctx = new Sent_sepContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sent_sep);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__7);
				}
				break;
			case T__9:
			case T__10:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__41:
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

	public static class MainContext extends ParserRuleContext {
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
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
		enterRule(_localctx, 30, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__8);
			setState(249);
			sentencias();
			setState(250);
			match(T__9);
			setState(251);
			sub();
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

	public static class SentenciasContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Sent_sepContext sent_sep() {
			return getRuleContext(Sent_sepContext.class,0);
		}
		public Next_sentenciaContext next_sentencia() {
			return getRuleContext(Next_sentenciaContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sentencias);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				sentencia();
				setState(254);
				sent_sep();
				setState(255);
				next_sentencia();
				}
				break;
			case T__9:
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

	public static class Next_sentenciaContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Sent_sepContext sent_sep() {
			return getRuleContext(Sent_sepContext.class,0);
		}
		public Next_sentenciaContext next_sentencia() {
			return getRuleContext(Next_sentenciaContext.class,0);
		}
		public Next_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNext_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNext_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNext_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_sentenciaContext next_sentencia() throws RecognitionException {
		Next_sentenciaContext _localctx = new Next_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_next_sentencia);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				sentencia();
				setState(261);
				sent_sep();
				setState(262);
				next_sentencia();
				}
				break;
			case T__9:
			case T__14:
			case T__17:
			case T__19:
			case T__22:
			case T__41:
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

	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Assng_callContext assng_call() {
			return getRuleContext(Assng_callContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciasifContext sentenciasif() {
			return getRuleContext(SentenciasifContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public Sw_sinoContext sw_sino() {
			return getRuleContext(Sw_sinoContext.class,0);
		}
		public For_startContext for_start() {
			return getRuleContext(For_startContext.class,0);
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
		enterRule(_localctx, 36, RULE_sentencia);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(ID);
				setState(268);
				assng_call();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__10);
				setState(270);
				match(T__11);
				setState(271);
				expresion();
				setState(272);
				match(T__12);
				setState(273);
				match(T__13);
				setState(274);
				sentenciasif();
				setState(275);
				sino();
				setState(276);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(T__15);
				setState(279);
				match(T__11);
				setState(280);
				expresion();
				setState(281);
				match(T__12);
				setState(282);
				match(T__13);
				setState(283);
				sentenciasif();
				setState(284);
				match(T__14);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(T__16);
				setState(287);
				sentenciasif();
				setState(288);
				match(T__17);
				setState(289);
				match(T__11);
				setState(290);
				expresion();
				setState(291);
				match(T__12);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(T__18);
				setState(294);
				match(T__13);
				setState(295);
				match(T__19);
				setState(296);
				match(T__11);
				setState(297);
				expresion();
				setState(298);
				match(T__12);
				setState(299);
				sentenciasif();
				setState(300);
				case_();
				setState(301);
				sw_sino();
				setState(302);
				match(T__14);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				match(T__20);
				setState(305);
				for_start();
				setState(306);
				match(T__13);
				setState(307);
				sentenciasif();
				setState(308);
				match(T__14);
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

	public static class Assng_callContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Id_extendContext id_extend() {
			return getRuleContext(Id_extendContext.class,0);
		}
		public AssingmentContext assingment() {
			return getRuleContext(AssingmentContext.class,0);
		}
		public Assng_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assng_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAssng_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAssng_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitAssng_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assng_callContext assng_call() throws RecognitionException {
		Assng_callContext _localctx = new Assng_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assng_call);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__11);
				setState(313);
				params();
				setState(314);
				match(T__12);
				}
				break;
			case T__6:
			case T__23:
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				id_extend();
				setState(317);
				assingment();
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

	public static class For_startContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public For_endContext for_end() {
			return getRuleContext(For_endContext.class,0);
		}
		public For_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFor_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFor_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFor_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_startContext for_start() throws RecognitionException {
		For_startContext _localctx = new For_startContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ID);
			setState(322);
			match(T__6);
			setState(323);
			num_expresion();
			setState(324);
			for_end();
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

	public static class For_endContext extends ParserRuleContext {
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public For_stepContext for_step() {
			return getRuleContext(For_stepContext.class,0);
		}
		public For_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFor_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFor_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFor_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_endContext for_end() throws RecognitionException {
		For_endContext _localctx = new For_endContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__17);
			setState(327);
			num_expresion();
			setState(328);
			for_step();
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

	public static class For_stepContext extends ParserRuleContext {
		public Num_expresionContext num_expresion() {
			return getRuleContext(Num_expresionContext.class,0);
		}
		public For_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFor_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFor_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFor_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stepContext for_step() throws RecognitionException {
		For_stepContext _localctx = new For_stepContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_step);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(T__21);
				setState(331);
				num_expresion();
				}
				break;
			case T__13:
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

	public static class SinoContext extends ParserRuleContext {
		public Sino_pContext sino_p() {
			return getRuleContext(Sino_pContext.class,0);
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
		enterRule(_localctx, 46, RULE_sino);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(T__22);
				setState(336);
				sino_p();
				}
				break;
			case T__14:
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

	public static class Sino_pContext extends ParserRuleContext {
		public SentenciasnoifContext sentenciasnoif() {
			return getRuleContext(SentenciasnoifContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sino_ppContext sino_pp() {
			return getRuleContext(Sino_ppContext.class,0);
		}
		public Sino_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSino_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSino_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSino_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sino_pContext sino_p() throws RecognitionException {
		Sino_pContext _localctx = new Sino_pContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sino_p);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				sentenciasnoif();
				setState(341);
				sino();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T__10);
				setState(344);
				match(T__11);
				setState(345);
				expresion();
				setState(346);
				match(T__12);
				setState(347);
				sino_pp();
				setState(348);
				sino();
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

	public static class Sino_ppContext extends ParserRuleContext {
		public SentenciasifContext sentenciasif() {
			return getRuleContext(SentenciasifContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public Sent_sep_sinoContext sent_sep_sino() {
			return getRuleContext(Sent_sep_sinoContext.class,0);
		}
		public Next_sentenciaContext next_sentencia() {
			return getRuleContext(Next_sentenciaContext.class,0);
		}
		public Sino_ppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino_pp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSino_pp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSino_pp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSino_pp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sino_ppContext sino_pp() throws RecognitionException {
		Sino_ppContext _localctx = new Sino_ppContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sino_pp);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				sentenciasif();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__13);
				setState(354);
				sentenciasif();
				setState(355);
				sino();
				setState(356);
				match(T__14);
				setState(357);
				sent_sep_sino();
				setState(358);
				next_sentencia();
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

	public static class Sent_sep_sinoContext extends ParserRuleContext {
		public Sent_sep_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_sep_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSent_sep_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSent_sep_sino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSent_sep_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_sep_sinoContext sent_sep_sino() throws RecognitionException {
		Sent_sep_sinoContext _localctx = new Sent_sep_sinoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sent_sep_sino);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__7);
				}
				break;
			case T__10:
			case T__14:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case T__22:
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

	public static class SentenciasnoifContext extends ParserRuleContext {
		public SentencianoifContext sentencianoif() {
			return getRuleContext(SentencianoifContext.class,0);
		}
		public Sent_sepContext sent_sep() {
			return getRuleContext(Sent_sepContext.class,0);
		}
		public Next_sentenciaContext next_sentencia() {
			return getRuleContext(Next_sentenciaContext.class,0);
		}
		public SentenciasnoifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasnoif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentenciasnoif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentenciasnoif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentenciasnoif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasnoifContext sentenciasnoif() throws RecognitionException {
		SentenciasnoifContext _localctx = new SentenciasnoifContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sentenciasnoif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			sentencianoif();
			setState(367);
			sent_sep();
			setState(368);
			next_sentencia();
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

	public static class SentencianoifContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Assng_callContext assng_call() {
			return getRuleContext(Assng_callContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciasifContext sentenciasif() {
			return getRuleContext(SentenciasifContext.class,0);
		}
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public Sw_sinoContext sw_sino() {
			return getRuleContext(Sw_sinoContext.class,0);
		}
		public For_startContext for_start() {
			return getRuleContext(For_startContext.class,0);
		}
		public SentencianoifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencianoif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencianoif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencianoif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentencianoif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencianoifContext sentencianoif() throws RecognitionException {
		SentencianoifContext _localctx = new SentencianoifContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sentencianoif);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(ID);
				setState(371);
				assng_call();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(T__15);
				setState(373);
				match(T__11);
				setState(374);
				expresion();
				setState(375);
				match(T__12);
				setState(376);
				match(T__13);
				setState(377);
				sentenciasif();
				setState(378);
				match(T__14);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(T__16);
				setState(381);
				sentenciasif();
				setState(382);
				match(T__17);
				setState(383);
				match(T__11);
				setState(384);
				expresion();
				setState(385);
				match(T__12);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(T__18);
				setState(388);
				match(T__13);
				setState(389);
				match(T__19);
				setState(390);
				match(T__11);
				setState(391);
				expresion();
				setState(392);
				match(T__12);
				setState(393);
				sentenciasif();
				setState(394);
				case_();
				setState(395);
				sw_sino();
				setState(396);
				match(T__14);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(T__20);
				setState(399);
				for_start();
				setState(400);
				match(T__13);
				setState(401);
				sentenciasif();
				setState(402);
				match(T__14);
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

	public static class SentenciasifContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Sent_sepContext sent_sep() {
			return getRuleContext(Sent_sepContext.class,0);
		}
		public Next_sentenciaContext next_sentencia() {
			return getRuleContext(Next_sentenciaContext.class,0);
		}
		public SentenciasifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentenciasif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentenciasif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentenciasif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasifContext sentenciasif() throws RecognitionException {
		SentenciasifContext _localctx = new SentenciasifContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sentenciasif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			sentencia();
			setState(407);
			sent_sep();
			setState(408);
			next_sentencia();
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
		public SentenciasifContext sentenciasif() {
			return getRuleContext(SentenciasifContext.class,0);
		}
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
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
		enterRule(_localctx, 60, RULE_case);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(T__19);
				setState(411);
				match(T__11);
				setState(412);
				expresion();
				setState(413);
				match(T__12);
				setState(414);
				sentenciasif();
				setState(415);
				case_();
				}
				break;
			case T__14:
			case T__22:
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

	public static class Sw_sinoContext extends ParserRuleContext {
		public SentenciasifContext sentenciasif() {
			return getRuleContext(SentenciasifContext.class,0);
		}
		public Sw_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSw_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSw_sino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSw_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_sinoContext sw_sino() throws RecognitionException {
		Sw_sinoContext _localctx = new Sw_sinoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sw_sino);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(T__22);
				setState(421);
				sentenciasif();
				}
				break;
			case T__14:
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

	public static class AssingmentContext extends ParserRuleContext {
		public Assingment_pContext assingment_p() {
			return getRuleContext(Assingment_pContext.class,0);
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
		enterRule(_localctx, 64, RULE_assingment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__6);
			setState(426);
			assingment_p();
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

	public static class Assingment_pContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public M_expresionContext m_expresion() {
			return getRuleContext(M_expresionContext.class,0);
		}
		public Assingment_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAssingment_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAssingment_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitAssingment_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingment_pContext assingment_p() throws RecognitionException {
		Assingment_pContext _localctx = new Assingment_pContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assingment_p);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__26:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				expresion();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(T__13);
				setState(430);
				m_expresion();
				setState(431);
				match(T__14);
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
		enterRule(_localctx, 68, RULE_m_expresion);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__23:
			case T__26:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				m_term();
				setState(436);
				m_expresion_p();
				}
				break;
			case T__14:
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
		enterRule(_localctx, 70, RULE_m_expresion_p);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(T__5);
				setState(442);
				m_term();
				setState(443);
				m_expresion_p();
				}
				break;
			case T__14:
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
		enterRule(_localctx, 72, RULE_m_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		enterRule(_localctx, 74, RULE_m_factor);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__13);
				setState(451);
				m_expresion();
				setState(452);
				match(T__14);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(T__23);
				setState(455);
				match(T__23);
				setState(456);
				match(T__23);
				}
				break;
			case T__11:
			case T__26:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
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
		enterRule(_localctx, 76, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			logic_term();
			setState(461);
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
		enterRule(_localctx, 78, RULE_logic_expresion_p);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(T__24);
				setState(464);
				logic_term();
				setState(465);
				logic_expresion_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__41:
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
		enterRule(_localctx, 80, RULE_logic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			logic_factor();
			setState(471);
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
		enterRule(_localctx, 82, RULE_logic_term_p);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(T__25);
				setState(474);
				logic_factor();
				setState(475);
				logic_term_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__24:
			case T__41:
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
		enterRule(_localctx, 84, RULE_logic_factor);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				logic_element();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(T__26);
				setState(482);
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
		enterRule(_localctx, 86, RULE_logic_element);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(BOOL);
				}
				break;
			case T__11:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
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
		enterRule(_localctx, 88, RULE_relation_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			relation_term();
			setState(490);
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
		enterRule(_localctx, 90, RULE_relation_expresion_p);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(T__27);
				setState(493);
				relation_term();
				setState(494);
				relation_expresion_p();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(T__28);
				setState(497);
				relation_term();
				setState(498);
				relation_expresion_p();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(T__29);
				setState(501);
				relation_term();
				setState(502);
				relation_expresion_p();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				match(T__30);
				setState(505);
				relation_term();
				setState(506);
				relation_expresion_p();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				match(T__31);
				setState(509);
				relation_term();
				setState(510);
				relation_expresion_p();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(512);
				match(T__32);
				setState(513);
				relation_term();
				setState(514);
				relation_expresion_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__24:
			case T__25:
			case T__41:
			case ID:
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
		enterRule(_localctx, 92, RULE_relation_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 94, RULE_num_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			num_term();
			setState(522);
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
		enterRule(_localctx, 96, RULE_num_expresion_p);
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(T__33);
				setState(525);
				num_term();
				setState(526);
				num_expresion_p();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(T__34);
				setState(529);
				num_term();
				setState(530);
				num_expresion_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
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
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__41:
			case T__47:
			case ID:
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
		enterRule(_localctx, 98, RULE_num_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			num_factor();
			setState(536);
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
		enterRule(_localctx, 100, RULE_num_term_p);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(T__35);
				setState(539);
				num_factor();
				setState(540);
				num_term_p();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(T__36);
				setState(543);
				num_factor();
				setState(544);
				num_term_p();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				match(T__37);
				setState(547);
				num_factor();
				setState(548);
				num_term_p();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
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
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__41:
			case T__47:
			case ID:
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
		enterRule(_localctx, 102, RULE_num_factor);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				num_factor_p();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(T__33);
				setState(555);
				num_factor_p();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(T__34);
				setState(557);
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
		enterRule(_localctx, 104, RULE_num_factor_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			base_element();
			setState(561);
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
		enterRule(_localctx, 106, RULE_num_factor_pp);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(T__38);
				setState(564);
				base_element();
				setState(565);
				num_factor_pp();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
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
			case T__21:
			case T__22:
			case T__24:
			case T__25:
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
			case T__41:
			case T__47:
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

	public static class Base_elementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SLParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(SLParser.NUM, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
		enterRule(_localctx, 108, RULE_base_element);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(STRING);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(NUM);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				match(T__11);
				setState(573);
				expresion();
				setState(574);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				call();
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
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
		enterRule(_localctx, 110, RULE_sub);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(T__39);
				setState(580);
				match(ID);
				setState(581);
				match(T__11);
				setState(582);
				args();
				setState(583);
				match(T__12);
				setState(584);
				return_();
				}
				break;
			case EOF:
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

	public static class ArgsContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
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
		enterRule(_localctx, 112, RULE_args);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				ref();
				setState(590);
				id_list();
				setState(591);
				match(T__4);
				setState(592);
				tipo();
				setState(593);
				next_arg();
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

	public static class Next_argContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
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
		enterRule(_localctx, 114, RULE_next_arg);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(T__7);
				setState(599);
				ref();
				setState(600);
				id_list();
				setState(601);
				match(T__4);
				setState(602);
				tipo();
				setState(603);
				next_arg();
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
		enterRule(_localctx, 116, RULE_ref);
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
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

	public static class ReturnContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public SubheaderrContext subheaderr() {
			return getRuleContext(SubheaderrContext.class,0);
		}
		public SubheaderContext subheader() {
			return getRuleContext(SubheaderContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_return);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(T__41);
				setState(613);
				tipo();
				setState(614);
				subheaderr();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				subheader();
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

	public static class SubheaderContext extends ParserRuleContext {
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public SubheaderContext subheader() {
			return getRuleContext(SubheaderContext.class,0);
		}
		public Tipos_listContext tipos_list() {
			return getRuleContext(Tipos_listContext.class,0);
		}
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public SubbodyContext subbody() {
			return getRuleContext(SubbodyContext.class,0);
		}
		public SubheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubheaderContext subheader() throws RecognitionException {
		SubheaderContext _localctx = new SubheaderContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_subheader);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(T__1);
				setState(620);
				const_list();
				setState(621);
				subheader();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(T__2);
				setState(624);
				tipos_list();
				setState(625);
				subheader();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				match(T__3);
				setState(628);
				var_list();
				setState(629);
				subheader();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				subbody();
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

	public static class SubbodyContext extends ParserRuleContext {
		public SubsentenciasContext subsentencias() {
			return getRuleContext(SubsentenciasContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public SubbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubbodyContext subbody() throws RecognitionException {
		SubbodyContext _localctx = new SubbodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_subbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(T__8);
			setState(635);
			subsentencias();
			setState(636);
			match(T__9);
			setState(637);
			sub();
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

	public static class SubheaderrContext extends ParserRuleContext {
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public SubheaderrContext subheaderr() {
			return getRuleContext(SubheaderrContext.class,0);
		}
		public Tipos_listContext tipos_list() {
			return getRuleContext(Tipos_listContext.class,0);
		}
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public SubbodyrContext subbodyr() {
			return getRuleContext(SubbodyrContext.class,0);
		}
		public SubheaderrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subheaderr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubheaderr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubheaderr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubheaderr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubheaderrContext subheaderr() throws RecognitionException {
		SubheaderrContext _localctx = new SubheaderrContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_subheaderr);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(T__1);
				setState(640);
				const_list();
				setState(641);
				subheaderr();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(T__2);
				setState(644);
				tipos_list();
				setState(645);
				subheaderr();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				match(T__3);
				setState(648);
				var_list();
				setState(649);
				subheaderr();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				subbodyr();
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

	public static class SubbodyrContext extends ParserRuleContext {
		public SubsentenciasContext subsentencias() {
			return getRuleContext(SubsentenciasContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public SubbodyrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subbodyr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubbodyr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubbodyr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubbodyr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubbodyrContext subbodyr() throws RecognitionException {
		SubbodyrContext _localctx = new SubbodyrContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_subbodyr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(T__8);
			setState(655);
			subsentencias();
			setState(656);
			match(T__41);
			setState(657);
			match(T__11);
			setState(658);
			expresion();
			setState(659);
			match(T__12);
			setState(660);
			match(T__9);
			setState(661);
			sub();
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

	public static class SubsentenciasContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Sent_sepContext sent_sep() {
			return getRuleContext(Sent_sepContext.class,0);
		}
		public Next_sentenciaContext next_sentencia() {
			return getRuleContext(Next_sentenciaContext.class,0);
		}
		public SubsentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubsentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubsentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubsentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsentenciasContext subsentencias() throws RecognitionException {
		SubsentenciasContext _localctx = new SubsentenciasContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_subsentencias);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				sentencia();
				setState(664);
				sent_sep();
				setState(665);
				next_sentencia();
				}
				break;
			case T__9:
			case T__41:
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
		enterRule(_localctx, 130, RULE_tipo);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
			case T__44:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				tipos();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				type_vector();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				type_matrix();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
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
		enterRule(_localctx, 132, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << ID))) != 0)) ) {
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
		enterRule(_localctx, 134, RULE_type_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(T__45);
			setState(679);
			match(T__46);
			setState(680);
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
		enterRule(_localctx, 136, RULE_v_len);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				num_expresion();
				setState(683);
				match(T__47);
				setState(684);
				tipo();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(T__35);
				setState(687);
				match(T__47);
				setState(688);
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
		enterRule(_localctx, 138, RULE_type_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__48);
			setState(692);
			match(T__46);
			setState(693);
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
		enterRule(_localctx, 140, RULE_dimention_list);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(T__35);
				setState(696);
				next_dimention();
				setState(697);
				match(T__47);
				setState(698);
				tipo();
				}
				break;
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				dimention();
				setState(701);
				next_dimention();
				setState(702);
				match(T__47);
				setState(703);
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
		enterRule(_localctx, 142, RULE_next_dimention);
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(T__5);
				setState(708);
				next_dimention_p();
				}
				break;
			case T__47:
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
		enterRule(_localctx, 144, RULE_next_dimention_p);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(T__35);
				setState(713);
				next_dimention();
				}
				break;
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				dimention();
				setState(715);
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
		enterRule(_localctx, 146, RULE_dimention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
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
		enterRule(_localctx, 148, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(T__49);
			setState(722);
			match(T__13);
			setState(723);
			var_list();
			setState(724);
			match(T__14);
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
		enterRule(_localctx, 150, RULE_id_extend);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				ids_options();
				setState(727);
				id_extend();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
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
			case T__21:
			case T__22:
			case T__24:
			case T__25:
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
			case T__38:
			case T__41:
			case T__47:
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
		enterRule(_localctx, 152, RULE_ids_options);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				match(T__46);
				setState(733);
				num_expresion();
				setState(734);
				matrix();
				setState(735);
				match(T__47);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(T__23);
				setState(738);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Call_optContext call_opt() {
			return getRuleContext(Call_optContext.class,0);
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
		enterRule(_localctx, 154, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(ID);
			setState(742);
			call_opt();
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

	public static class Call_optContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Id_extendContext id_extend() {
			return getRuleContext(Id_extendContext.class,0);
		}
		public Call_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCall_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCall_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCall_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_optContext call_opt() throws RecognitionException {
		Call_optContext _localctx = new Call_optContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_call_opt);
		try {
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(T__11);
				setState(745);
				params();
				setState(746);
				match(T__12);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
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
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
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
			case T__38:
			case T__41:
			case T__46:
			case T__47:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				id_extend();
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
		enterRule(_localctx, 158, RULE_params);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__26:
			case T__33:
			case T__34:
			case ID:
			case NUM:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				expresion();
				setState(752);
				next_param();
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
		enterRule(_localctx, 160, RULE_next_param);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				match(T__5);
				setState(758);
				expresion();
				setState(759);
				next_param();
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
		enterRule(_localctx, 162, RULE_matrix);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(T__5);
				setState(765);
				num_expresion();
				setState(766);
				matrix();
				}
				break;
			case T__47:
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
		"\u0004\u00019\u0304\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0002Q\u0007Q\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00ad\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00bc\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00cd\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00d3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00e1\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ef"+
		"\b\f\u0001\r\u0001\r\u0003\r\u00f3\b\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00f7\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0103\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u010a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0137\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0140\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u014e\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0153\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u015f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0169\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u016d\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0195\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a3\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01a8\b\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01b2\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01b8\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01bf\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u01cb\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u01d5\b\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u01df\b)\u0001*\u0001*\u0001*\u0003*\u01e4"+
		"\b*\u0001+\u0001+\u0003+\u01e8\b+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0206\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0216"+
		"\b0\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0228\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u022f\b3\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u0239\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u0242\b6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u024c\b7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u0255\b8\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u025f\b9\u0001:\u0001:\u0003:\u0263\b:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u026a\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0279\b<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u028d\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u029d\b@\u0001A\u0001A\u0001A\u0001A\u0003"+
		"A\u02a3\bA\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0003D\u02b2\bD\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u02c2\bF\u0001G\u0001G\u0001G\u0003G\u02c7\bG\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u02ce\bH\u0001I\u0001I\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001K\u0001K\u0001K\u0001K\u0003K\u02db\bK\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0003L\u02e4\bL\u0001M\u0001M\u0001M\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0003N\u02ee\bN\u0001O\u0001O\u0001O\u0001"+
		"O\u0003O\u02f4\bO\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u02fb\bP\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0302\bQ\u0001Q\u0000\u0000R\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u0000\u0002\u0002\u0000+-33\u0001\u000034\u0301\u0000"+
		"\u00ac\u0001\u0000\u0000\u0000\u0002\u00bb\u0001\u0000\u0000\u0000\u0004"+
		"\u00bd\u0001\u0000\u0000\u0000\u0006\u00c0\u0001\u0000\u0000\u0000\b\u00c5"+
		"\u0001\u0000\u0000\u0000\n\u00cc\u0001\u0000\u0000\u0000\f\u00d2\u0001"+
		"\u0000\u0000\u0000\u000e\u00d4\u0001\u0000\u0000\u0000\u0010\u00d7\u0001"+
		"\u0000\u0000\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00e2\u0001"+
		"\u0000\u0000\u0000\u0016\u00e5\u0001\u0000\u0000\u0000\u0018\u00ee\u0001"+
		"\u0000\u0000\u0000\u001a\u00f2\u0001\u0000\u0000\u0000\u001c\u00f6\u0001"+
		"\u0000\u0000\u0000\u001e\u00f8\u0001\u0000\u0000\u0000 \u0102\u0001\u0000"+
		"\u0000\u0000\"\u0109\u0001\u0000\u0000\u0000$\u0136\u0001\u0000\u0000"+
		"\u0000&\u013f\u0001\u0000\u0000\u0000(\u0141\u0001\u0000\u0000\u0000*"+
		"\u0146\u0001\u0000\u0000\u0000,\u014d\u0001\u0000\u0000\u0000.\u0152\u0001"+
		"\u0000\u0000\u00000\u015e\u0001\u0000\u0000\u00002\u0168\u0001\u0000\u0000"+
		"\u00004\u016c\u0001\u0000\u0000\u00006\u016e\u0001\u0000\u0000\u00008"+
		"\u0194\u0001\u0000\u0000\u0000:\u0196\u0001\u0000\u0000\u0000<\u01a2\u0001"+
		"\u0000\u0000\u0000>\u01a7\u0001\u0000\u0000\u0000@\u01a9\u0001\u0000\u0000"+
		"\u0000B\u01b1\u0001\u0000\u0000\u0000D\u01b7\u0001\u0000\u0000\u0000F"+
		"\u01be\u0001\u0000\u0000\u0000H\u01c0\u0001\u0000\u0000\u0000J\u01ca\u0001"+
		"\u0000\u0000\u0000L\u01cc\u0001\u0000\u0000\u0000N\u01d4\u0001\u0000\u0000"+
		"\u0000P\u01d6\u0001\u0000\u0000\u0000R\u01de\u0001\u0000\u0000\u0000T"+
		"\u01e3\u0001\u0000\u0000\u0000V\u01e7\u0001\u0000\u0000\u0000X\u01e9\u0001"+
		"\u0000\u0000\u0000Z\u0205\u0001\u0000\u0000\u0000\\\u0207\u0001\u0000"+
		"\u0000\u0000^\u0209\u0001\u0000\u0000\u0000`\u0215\u0001\u0000\u0000\u0000"+
		"b\u0217\u0001\u0000\u0000\u0000d\u0227\u0001\u0000\u0000\u0000f\u022e"+
		"\u0001\u0000\u0000\u0000h\u0230\u0001\u0000\u0000\u0000j\u0238\u0001\u0000"+
		"\u0000\u0000l\u0241\u0001\u0000\u0000\u0000n\u024b\u0001\u0000\u0000\u0000"+
		"p\u0254\u0001\u0000\u0000\u0000r\u025e\u0001\u0000\u0000\u0000t\u0262"+
		"\u0001\u0000\u0000\u0000v\u0269\u0001\u0000\u0000\u0000x\u0278\u0001\u0000"+
		"\u0000\u0000z\u027a\u0001\u0000\u0000\u0000|\u028c\u0001\u0000\u0000\u0000"+
		"~\u028e\u0001\u0000\u0000\u0000\u0080\u029c\u0001\u0000\u0000\u0000\u0082"+
		"\u02a2\u0001\u0000\u0000\u0000\u0084\u02a4\u0001\u0000\u0000\u0000\u0086"+
		"\u02a6\u0001\u0000\u0000\u0000\u0088\u02b1\u0001\u0000\u0000\u0000\u008a"+
		"\u02b3\u0001\u0000\u0000\u0000\u008c\u02c1\u0001\u0000\u0000\u0000\u008e"+
		"\u02c6\u0001\u0000\u0000\u0000\u0090\u02cd\u0001\u0000\u0000\u0000\u0092"+
		"\u02cf\u0001\u0000\u0000\u0000\u0094\u02d1\u0001\u0000\u0000\u0000\u0096"+
		"\u02da\u0001\u0000\u0000\u0000\u0098\u02e3\u0001\u0000\u0000\u0000\u009a"+
		"\u02e5\u0001\u0000\u0000\u0000\u009c\u02ed\u0001\u0000\u0000\u0000\u009e"+
		"\u02f3\u0001\u0000\u0000\u0000\u00a0\u02fa\u0001\u0000\u0000\u0000\u00a2"+
		"\u0301\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000\u00a5"+
		"\u00a6\u00053\u0000\u0000\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7\u00a8"+
		"\u0003\u001e\u000f\u0000\u00a8\u00ad\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0003\u0002\u0001\u0000\u00aa\u00ab\u0003\u001e\u000f\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ad\u0001\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0002\u0000\u0000\u00af\u00b0\u0003\u000e\u0007\u0000\u00b0\u00b1"+
		"\u0003\u0002\u0001\u0000\u00b1\u00bc\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0003\u0000\u0000\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00b5\u0003"+
		"\u0002\u0001\u0000\u00b5\u00bc\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\u0004\u0000\u0000\u00b7\u00b8\u0003\u0004\u0002\u0000\u00b8\u00b9\u0003"+
		"\u0002\u0001\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ae\u0001\u0000\u0000\u0000\u00bb\u00b2\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u0003\u0001\u0000\u0000\u0000\u00bd\u00be\u0003"+
		"\u0006\u0003\u0000\u00be\u00bf\u0003\f\u0006\u0000\u00bf\u0005\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0003\b\u0004\u0000\u00c1\u00c2\u0005\u0005\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0082A\u0000\u00c3\u00c4\u0003\u001a\r\u0000"+
		"\u00c4\u0007\u0001\u0000\u0000\u0000\u00c5\u00c6\u00053\u0000\u0000\u00c6"+
		"\u00c7\u0003\n\u0005\u0000\u00c7\t\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0006\u0000\u0000\u00c9\u00ca\u00053\u0000\u0000\u00ca\u00cd\u0003"+
		"\n\u0005\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u000b\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0003\u0006\u0003\u0000\u00cf\u00d0\u0003\f\u0006"+
		"\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\r\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0010\b\u0000"+
		"\u00d5\u00d6\u0003\u0012\t\u0000\u00d6\u000f\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u00053\u0000\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000\u00d9\u00da"+
		"\u0003L&\u0000\u00da\u00db\u0003\u001a\r\u0000\u00db\u0011\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0003\u0010\b\u0000\u00dd\u00de\u0003\u0012\t"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u0013\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u0016\u000b"+
		"\u0000\u00e3\u00e4\u0003\u0018\f\u0000\u00e4\u0015\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u00053\u0000\u0000\u00e6\u00e7\u0005\u0005\u0000\u0000\u00e7"+
		"\u00e8\u0003\u0082A\u0000\u00e8\u00e9\u0003\u001a\r\u0000\u00e9\u0017"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003\u0016\u000b\u0000\u00eb\u00ec"+
		"\u0003\u0018\f\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u0019\u0001\u0000\u0000\u0000\u00f0\u00f3\u0005"+
		"\b\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u001b\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f7\u0005\b\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u001d\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\t\u0000\u0000"+
		"\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u00fb\u0005\n\u0000\u0000\u00fb"+
		"\u00fc\u0003n7\u0000\u00fc\u001f\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003"+
		"$\u0012\u0000\u00fe\u00ff\u0003\u001c\u000e\u0000\u00ff\u0100\u0003\""+
		"\u0011\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000"+
		"\u0000\u0000\u0102\u00fd\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103!\u0001\u0000\u0000\u0000\u0104\u0105\u0003$\u0012\u0000"+
		"\u0105\u0106\u0003\u001c\u000e\u0000\u0106\u0107\u0003\"\u0011\u0000\u0107"+
		"\u010a\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0104\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a"+
		"#\u0001\u0000\u0000\u0000\u010b\u010c\u00053\u0000\u0000\u010c\u0137\u0003"+
		"&\u0013\u0000\u010d\u010e\u0005\u000b\u0000\u0000\u010e\u010f\u0005\f"+
		"\u0000\u0000\u010f\u0110\u0003L&\u0000\u0110\u0111\u0005\r\u0000\u0000"+
		"\u0111\u0112\u0005\u000e\u0000\u0000\u0112\u0113\u0003:\u001d\u0000\u0113"+
		"\u0114\u0003.\u0017\u0000\u0114\u0115\u0005\u000f\u0000\u0000\u0115\u0137"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0010\u0000\u0000\u0117\u0118"+
		"\u0005\f\u0000\u0000\u0118\u0119\u0003L&\u0000\u0119\u011a\u0005\r\u0000"+
		"\u0000\u011a\u011b\u0005\u000e\u0000\u0000\u011b\u011c\u0003:\u001d\u0000"+
		"\u011c\u011d\u0005\u000f\u0000\u0000\u011d\u0137\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u0011\u0000\u0000\u011f\u0120\u0003:\u001d\u0000\u0120"+
		"\u0121\u0005\u0012\u0000\u0000\u0121\u0122\u0005\f\u0000\u0000\u0122\u0123"+
		"\u0003L&\u0000\u0123\u0124\u0005\r\u0000\u0000\u0124\u0137\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\u0013\u0000\u0000\u0126\u0127\u0005\u000e"+
		"\u0000\u0000\u0127\u0128\u0005\u0014\u0000\u0000\u0128\u0129\u0005\f\u0000"+
		"\u0000\u0129\u012a\u0003L&\u0000\u012a\u012b\u0005\r\u0000\u0000\u012b"+
		"\u012c\u0003:\u001d\u0000\u012c\u012d\u0003<\u001e\u0000\u012d\u012e\u0003"+
		">\u001f\u0000\u012e\u012f\u0005\u000f\u0000\u0000\u012f\u0137\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0005\u0015\u0000\u0000\u0131\u0132\u0003(\u0014"+
		"\u0000\u0132\u0133\u0005\u000e\u0000\u0000\u0133\u0134\u0003:\u001d\u0000"+
		"\u0134\u0135\u0005\u000f\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u010b\u0001\u0000\u0000\u0000\u0136\u010d\u0001\u0000\u0000\u0000"+
		"\u0136\u0116\u0001\u0000\u0000\u0000\u0136\u011e\u0001\u0000\u0000\u0000"+
		"\u0136\u0125\u0001\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000\u0000"+
		"\u0137%\u0001\u0000\u0000\u0000\u0138\u0139\u0005\f\u0000\u0000\u0139"+
		"\u013a\u0003\u009eO\u0000\u013a\u013b\u0005\r\u0000\u0000\u013b\u0140"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0003\u0096K\u0000\u013d\u013e\u0003"+
		"@ \u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0138\u0001\u0000\u0000"+
		"\u0000\u013f\u013c\u0001\u0000\u0000\u0000\u0140\'\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u00053\u0000\u0000\u0142\u0143\u0005\u0007\u0000\u0000\u0143"+
		"\u0144\u0003^/\u0000\u0144\u0145\u0003*\u0015\u0000\u0145)\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0012\u0000\u0000\u0147\u0148\u0003^/\u0000"+
		"\u0148\u0149\u0003,\u0016\u0000\u0149+\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005\u0016\u0000\u0000\u014b\u014e\u0003^/\u0000\u014c\u014e\u0001\u0000"+
		"\u0000\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e-\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0017\u0000"+
		"\u0000\u0150\u0153\u00030\u0018\u0000\u0151\u0153\u0001\u0000\u0000\u0000"+
		"\u0152\u014f\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000"+
		"\u0153/\u0001\u0000\u0000\u0000\u0154\u0155\u00036\u001b\u0000\u0155\u0156"+
		"\u0003.\u0017\u0000\u0156\u015f\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"\u000b\u0000\u0000\u0158\u0159\u0005\f\u0000\u0000\u0159\u015a\u0003L"+
		"&\u0000\u015a\u015b\u0005\r\u0000\u0000\u015b\u015c\u00032\u0019\u0000"+
		"\u015c\u015d\u0003.\u0017\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e"+
		"\u0154\u0001\u0000\u0000\u0000\u015e\u0157\u0001\u0000\u0000\u0000\u015f"+
		"1\u0001\u0000\u0000\u0000\u0160\u0169\u0003:\u001d\u0000\u0161\u0162\u0005"+
		"\u000e\u0000\u0000\u0162\u0163\u0003:\u001d\u0000\u0163\u0164\u0003.\u0017"+
		"\u0000\u0164\u0165\u0005\u000f\u0000\u0000\u0165\u0166\u00034\u001a\u0000"+
		"\u0166\u0167\u0003\"\u0011\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168"+
		"\u0160\u0001\u0000\u0000\u0000\u0168\u0161\u0001\u0000\u0000\u0000\u0169"+
		"3\u0001\u0000\u0000\u0000\u016a\u016d\u0005\b\u0000\u0000\u016b\u016d"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b"+
		"\u0001\u0000\u0000\u0000\u016d5\u0001\u0000\u0000\u0000\u016e\u016f\u0003"+
		"8\u001c\u0000\u016f\u0170\u0003\u001c\u000e\u0000\u0170\u0171\u0003\""+
		"\u0011\u0000\u01717\u0001\u0000\u0000\u0000\u0172\u0173\u00053\u0000\u0000"+
		"\u0173\u0195\u0003&\u0013\u0000\u0174\u0175\u0005\u0010\u0000\u0000\u0175"+
		"\u0176\u0005\f\u0000\u0000\u0176\u0177\u0003L&\u0000\u0177\u0178\u0005"+
		"\r\u0000\u0000\u0178\u0179\u0005\u000e\u0000\u0000\u0179\u017a\u0003:"+
		"\u001d\u0000\u017a\u017b\u0005\u000f\u0000\u0000\u017b\u0195\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0005\u0011\u0000\u0000\u017d\u017e\u0003:\u001d"+
		"\u0000\u017e\u017f\u0005\u0012\u0000\u0000\u017f\u0180\u0005\f\u0000\u0000"+
		"\u0180\u0181\u0003L&\u0000\u0181\u0182\u0005\r\u0000\u0000\u0182\u0195"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0013\u0000\u0000\u0184\u0185"+
		"\u0005\u000e\u0000\u0000\u0185\u0186\u0005\u0014\u0000\u0000\u0186\u0187"+
		"\u0005\f\u0000\u0000\u0187\u0188\u0003L&\u0000\u0188\u0189\u0005\r\u0000"+
		"\u0000\u0189\u018a\u0003:\u001d\u0000\u018a\u018b\u0003<\u001e\u0000\u018b"+
		"\u018c\u0003>\u001f\u0000\u018c\u018d\u0005\u000f\u0000\u0000\u018d\u0195"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0015\u0000\u0000\u018f\u0190"+
		"\u0003(\u0014\u0000\u0190\u0191\u0005\u000e\u0000\u0000\u0191\u0192\u0003"+
		":\u001d\u0000\u0192\u0193\u0005\u000f\u0000\u0000\u0193\u0195\u0001\u0000"+
		"\u0000\u0000\u0194\u0172\u0001\u0000\u0000\u0000\u0194\u0174\u0001\u0000"+
		"\u0000\u0000\u0194\u017c\u0001\u0000\u0000\u0000\u0194\u0183\u0001\u0000"+
		"\u0000\u0000\u0194\u018e\u0001\u0000\u0000\u0000\u01959\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0003$\u0012\u0000\u0197\u0198\u0003\u001c\u000e\u0000"+
		"\u0198\u0199\u0003\"\u0011\u0000\u0199;\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005\u0014\u0000\u0000\u019b\u019c\u0005\f\u0000\u0000\u019c\u019d"+
		"\u0003L&\u0000\u019d\u019e\u0005\r\u0000\u0000\u019e\u019f\u0003:\u001d"+
		"\u0000\u019f\u01a0\u0003<\u001e\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u019a\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3=\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0005\u0017\u0000\u0000\u01a5\u01a8\u0003:\u001d\u0000\u01a6\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8?\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005"+
		"\u0007\u0000\u0000\u01aa\u01ab\u0003B!\u0000\u01abA\u0001\u0000\u0000"+
		"\u0000\u01ac\u01b2\u0003L&\u0000\u01ad\u01ae\u0005\u000e\u0000\u0000\u01ae"+
		"\u01af\u0003D\"\u0000\u01af\u01b0\u0005\u000f\u0000\u0000\u01b0\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b1\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b2C\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003"+
		"H$\u0000\u01b4\u01b5\u0003F#\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8E\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005\u0006\u0000\u0000\u01ba\u01bb\u0003H$\u0000\u01bb\u01bc\u0003"+
		"F#\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000"+
		"\u0000\u01be\u01b9\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bfG\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003J%\u0000\u01c1"+
		"I\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u000e\u0000\u0000\u01c3\u01c4"+
		"\u0003D\"\u0000\u01c4\u01c5\u0005\u000f\u0000\u0000\u01c5\u01cb\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0005\u0018\u0000\u0000\u01c7\u01c8\u0005"+
		"\u0018\u0000\u0000\u01c8\u01cb\u0005\u0018\u0000\u0000\u01c9\u01cb\u0003"+
		"L&\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cbK\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0003P(\u0000\u01cd\u01ce\u0003N\'\u0000\u01ceM\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0005\u0019\u0000\u0000\u01d0\u01d1\u0003P(\u0000"+
		"\u01d1\u01d2\u0003N\'\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d4\u01cf\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5O\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0003T*\u0000\u01d7\u01d8\u0003R)\u0000\u01d8Q\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\u001a\u0000\u0000\u01da\u01db\u0003T*\u0000\u01db\u01dc"+
		"\u0003R)\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000"+
		"\u0000\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dfS\u0001\u0000\u0000\u0000\u01e0\u01e4\u0003V+\u0000"+
		"\u01e1\u01e2\u0005\u001b\u0000\u0000\u01e2\u01e4\u0003V+\u0000\u01e3\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4U\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e8\u00056\u0000\u0000\u01e6\u01e8\u0003X,"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e8W\u0001\u0000\u0000\u0000\u01e9\u01ea\u0003\\.\u0000\u01ea"+
		"\u01eb\u0003Z-\u0000\u01ebY\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005"+
		"\u001c\u0000\u0000\u01ed\u01ee\u0003\\.\u0000\u01ee\u01ef\u0003Z-\u0000"+
		"\u01ef\u0206\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u001d\u0000\u0000"+
		"\u01f1\u01f2\u0003\\.\u0000\u01f2\u01f3\u0003Z-\u0000\u01f3\u0206\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0005\u001e\u0000\u0000\u01f5\u01f6\u0003"+
		"\\.\u0000\u01f6\u01f7\u0003Z-\u0000\u01f7\u0206\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0005\u001f\u0000\u0000\u01f9\u01fa\u0003\\.\u0000\u01fa"+
		"\u01fb\u0003Z-\u0000\u01fb\u0206\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		" \u0000\u0000\u01fd\u01fe\u0003\\.\u0000\u01fe\u01ff\u0003Z-\u0000\u01ff"+
		"\u0206\u0001\u0000\u0000\u0000\u0200\u0201\u0005!\u0000\u0000\u0201\u0202"+
		"\u0003\\.\u0000\u0202\u0203\u0003Z-\u0000\u0203\u0206\u0001\u0000\u0000"+
		"\u0000\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u01ec\u0001\u0000\u0000"+
		"\u0000\u0205\u01f0\u0001\u0000\u0000\u0000\u0205\u01f4\u0001\u0000\u0000"+
		"\u0000\u0205\u01f8\u0001\u0000\u0000\u0000\u0205\u01fc\u0001\u0000\u0000"+
		"\u0000\u0205\u0200\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000"+
		"\u0000\u0206[\u0001\u0000\u0000\u0000\u0207\u0208\u0003^/\u0000\u0208"+
		"]\u0001\u0000\u0000\u0000\u0209\u020a\u0003b1\u0000\u020a\u020b\u0003"+
		"`0\u0000\u020b_\u0001\u0000\u0000\u0000\u020c\u020d\u0005\"\u0000\u0000"+
		"\u020d\u020e\u0003b1\u0000\u020e\u020f\u0003`0\u0000\u020f\u0216\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0005#\u0000\u0000\u0211\u0212\u0003b1"+
		"\u0000\u0212\u0213\u0003`0\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214"+
		"\u0216\u0001\u0000\u0000\u0000\u0215\u020c\u0001\u0000\u0000\u0000\u0215"+
		"\u0210\u0001\u0000\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216"+
		"a\u0001\u0000\u0000\u0000\u0217\u0218\u0003f3\u0000\u0218\u0219\u0003"+
		"d2\u0000\u0219c\u0001\u0000\u0000\u0000\u021a\u021b\u0005$\u0000\u0000"+
		"\u021b\u021c\u0003f3\u0000\u021c\u021d\u0003d2\u0000\u021d\u0228\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0005%\u0000\u0000\u021f\u0220\u0003f3"+
		"\u0000\u0220\u0221\u0003d2\u0000\u0221\u0228\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0005&\u0000\u0000\u0223\u0224\u0003f3\u0000\u0224\u0225\u0003"+
		"d2\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0228\u0001\u0000\u0000"+
		"\u0000\u0227\u021a\u0001\u0000\u0000\u0000\u0227\u021e\u0001\u0000\u0000"+
		"\u0000\u0227\u0222\u0001\u0000\u0000\u0000\u0227\u0226\u0001\u0000\u0000"+
		"\u0000\u0228e\u0001\u0000\u0000\u0000\u0229\u022f\u0003h4\u0000\u022a"+
		"\u022b\u0005\"\u0000\u0000\u022b\u022f\u0003h4\u0000\u022c\u022d\u0005"+
		"#\u0000\u0000\u022d\u022f\u0003h4\u0000\u022e\u0229\u0001\u0000\u0000"+
		"\u0000\u022e\u022a\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022fg\u0001\u0000\u0000\u0000\u0230\u0231\u0003l6\u0000\u0231"+
		"\u0232\u0003j5\u0000\u0232i\u0001\u0000\u0000\u0000\u0233\u0234\u0005"+
		"\'\u0000\u0000\u0234\u0235\u0003l6\u0000\u0235\u0236\u0003j5\u0000\u0236"+
		"\u0239\u0001\u0000\u0000\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238"+
		"\u0233\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239"+
		"k\u0001\u0000\u0000\u0000\u023a\u0242\u00055\u0000\u0000\u023b\u0242\u0005"+
		"4\u0000\u0000\u023c\u023d\u0005\f\u0000\u0000\u023d\u023e\u0003L&\u0000"+
		"\u023e\u023f\u0005\r\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240"+
		"\u0242\u0003\u009aM\u0000\u0241\u023a\u0001\u0000\u0000\u0000\u0241\u023b"+
		"\u0001\u0000\u0000\u0000\u0241\u023c\u0001\u0000\u0000\u0000\u0241\u0240"+
		"\u0001\u0000\u0000\u0000\u0242m\u0001\u0000\u0000\u0000\u0243\u0244\u0005"+
		"(\u0000\u0000\u0244\u0245\u00053\u0000\u0000\u0245\u0246\u0005\f\u0000"+
		"\u0000\u0246\u0247\u0003p8\u0000\u0247\u0248\u0005\r\u0000\u0000\u0248"+
		"\u0249\u0003v;\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u024c\u0001"+
		"\u0000\u0000\u0000\u024b\u0243\u0001\u0000\u0000\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024co\u0001\u0000\u0000\u0000\u024d\u024e\u0003t:"+
		"\u0000\u024e\u024f\u0003\b\u0004\u0000\u024f\u0250\u0005\u0005\u0000\u0000"+
		"\u0250\u0251\u0003\u0082A\u0000\u0251\u0252\u0003r9\u0000\u0252\u0255"+
		"\u0001\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u024d"+
		"\u0001\u0000\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255q\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0005\b\u0000\u0000\u0257\u0258\u0003t"+
		":\u0000\u0258\u0259\u0003\b\u0004\u0000\u0259\u025a\u0005\u0005\u0000"+
		"\u0000\u025a\u025b\u0003\u0082A\u0000\u025b\u025c\u0003r9\u0000\u025c"+
		"\u025f\u0001\u0000\u0000\u0000\u025d\u025f\u0001\u0000\u0000\u0000\u025e"+
		"\u0256\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f"+
		"s\u0001\u0000\u0000\u0000\u0260\u0263\u0005)\u0000\u0000\u0261\u0263\u0001"+
		"\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0261\u0001"+
		"\u0000\u0000\u0000\u0263u\u0001\u0000\u0000\u0000\u0264\u0265\u0005*\u0000"+
		"\u0000\u0265\u0266\u0003\u0082A\u0000\u0266\u0267\u0003|>\u0000\u0267"+
		"\u026a\u0001\u0000\u0000\u0000\u0268\u026a\u0003x<\u0000\u0269\u0264\u0001"+
		"\u0000\u0000\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026aw\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0005\u0002\u0000\u0000\u026c\u026d\u0003\u000e"+
		"\u0007\u0000\u026d\u026e\u0003x<\u0000\u026e\u0279\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0005\u0003\u0000\u0000\u0270\u0271\u0003\u0014\n\u0000\u0271"+
		"\u0272\u0003x<\u0000\u0272\u0279\u0001\u0000\u0000\u0000\u0273\u0274\u0005"+
		"\u0004\u0000\u0000\u0274\u0275\u0003\u0004\u0002\u0000\u0275\u0276\u0003"+
		"x<\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0279\u0003z=\u0000"+
		"\u0278\u026b\u0001\u0000\u0000\u0000\u0278\u026f\u0001\u0000\u0000\u0000"+
		"\u0278\u0273\u0001\u0000\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0279y\u0001\u0000\u0000\u0000\u027a\u027b\u0005\t\u0000\u0000\u027b"+
		"\u027c\u0003\u0080@\u0000\u027c\u027d\u0005\n\u0000\u0000\u027d\u027e"+
		"\u0003n7\u0000\u027e{\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0002"+
		"\u0000\u0000\u0280\u0281\u0003\u000e\u0007\u0000\u0281\u0282\u0003|>\u0000"+
		"\u0282\u028d\u0001\u0000\u0000\u0000\u0283\u0284\u0005\u0003\u0000\u0000"+
		"\u0284\u0285\u0003\u0014\n\u0000\u0285\u0286\u0003|>\u0000\u0286\u028d"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u0004\u0000\u0000\u0288\u0289"+
		"\u0003\u0004\u0002\u0000\u0289\u028a\u0003|>\u0000\u028a\u028d\u0001\u0000"+
		"\u0000\u0000\u028b\u028d\u0003~?\u0000\u028c\u027f\u0001\u0000\u0000\u0000"+
		"\u028c\u0283\u0001\u0000\u0000\u0000\u028c\u0287\u0001\u0000\u0000\u0000"+
		"\u028c\u028b\u0001\u0000\u0000\u0000\u028d}\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0005\t\u0000\u0000\u028f\u0290\u0003\u0080@\u0000\u0290\u0291"+
		"\u0005*\u0000\u0000\u0291\u0292\u0005\f\u0000\u0000\u0292\u0293\u0003"+
		"L&\u0000\u0293\u0294\u0005\r\u0000\u0000\u0294\u0295\u0005\n\u0000\u0000"+
		"\u0295\u0296\u0003n7\u0000\u0296\u007f\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0003$\u0012\u0000\u0298\u0299\u0003\u001c\u000e\u0000\u0299\u029a\u0003"+
		"\"\u0011\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u029d\u0001\u0000"+
		"\u0000\u0000\u029c\u0297\u0001\u0000\u0000\u0000\u029c\u029b\u0001\u0000"+
		"\u0000\u0000\u029d\u0081\u0001\u0000\u0000\u0000\u029e\u02a3\u0003\u0084"+
		"B\u0000\u029f\u02a3\u0003\u0086C\u0000\u02a0\u02a3\u0003\u008aE\u0000"+
		"\u02a1\u02a3\u0003\u0094J\u0000\u02a2\u029e\u0001\u0000\u0000\u0000\u02a2"+
		"\u029f\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a3\u0083\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a5\u0007\u0000\u0000\u0000\u02a5\u0085\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a7\u0005.\u0000\u0000\u02a7\u02a8\u0005/\u0000\u0000\u02a8\u02a9\u0003"+
		"\u0088D\u0000\u02a9\u0087\u0001\u0000\u0000\u0000\u02aa\u02ab\u0003^/"+
		"\u0000\u02ab\u02ac\u00050\u0000\u0000\u02ac\u02ad\u0003\u0082A\u0000\u02ad"+
		"\u02b2\u0001\u0000\u0000\u0000\u02ae\u02af\u0005$\u0000\u0000\u02af\u02b0"+
		"\u00050\u0000\u0000\u02b0\u02b2\u0003\u0082A\u0000\u02b1\u02aa\u0001\u0000"+
		"\u0000\u0000\u02b1\u02ae\u0001\u0000\u0000\u0000\u02b2\u0089\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b4\u00051\u0000\u0000\u02b4\u02b5\u0005/\u0000\u0000"+
		"\u02b5\u02b6\u0003\u008cF\u0000\u02b6\u008b\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0005$\u0000\u0000\u02b8\u02b9\u0003\u008eG\u0000\u02b9\u02ba\u0005"+
		"0\u0000\u0000\u02ba\u02bb\u0003\u0082A\u0000\u02bb\u02c2\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0003\u0092I\u0000\u02bd\u02be\u0003\u008eG\u0000\u02be"+
		"\u02bf\u00050\u0000\u0000\u02bf\u02c0\u0003\u0082A\u0000\u02c0\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c1\u02b7\u0001\u0000\u0000\u0000\u02c1\u02bc\u0001"+
		"\u0000\u0000\u0000\u02c2\u008d\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005"+
		"\u0006\u0000\u0000\u02c4\u02c7\u0003\u0090H\u0000\u02c5\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c7\u008f\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005$\u0000"+
		"\u0000\u02c9\u02ce\u0003\u008eG\u0000\u02ca\u02cb\u0003\u0092I\u0000\u02cb"+
		"\u02cc\u0003\u008eG\u0000\u02cc\u02ce\u0001\u0000\u0000\u0000\u02cd\u02c8"+
		"\u0001\u0000\u0000\u0000\u02cd\u02ca\u0001\u0000\u0000\u0000\u02ce\u0091"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d0\u0007\u0001\u0000\u0000\u02d0\u0093"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d2\u00052\u0000\u0000\u02d2\u02d3\u0005"+
		"\u000e\u0000\u0000\u02d3\u02d4\u0003\u0004\u0002\u0000\u02d4\u02d5\u0005"+
		"\u000f\u0000\u0000\u02d5\u0095\u0001\u0000\u0000\u0000\u02d6\u02d7\u0003"+
		"\u0098L\u0000\u02d7\u02d8\u0003\u0096K\u0000\u02d8\u02db\u0001\u0000\u0000"+
		"\u0000\u02d9\u02db\u0001\u0000\u0000\u0000\u02da\u02d6\u0001\u0000\u0000"+
		"\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02db\u0097\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0005/\u0000\u0000\u02dd\u02de\u0003^/\u0000\u02de"+
		"\u02df\u0003\u00a2Q\u0000\u02df\u02e0\u00050\u0000\u0000\u02e0\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0005\u0018\u0000\u0000\u02e2\u02e4\u0005"+
		"3\u0000\u0000\u02e3\u02dc\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e4\u0099\u0001\u0000\u0000\u0000\u02e5\u02e6\u00053\u0000"+
		"\u0000\u02e6\u02e7\u0003\u009cN\u0000\u02e7\u009b\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e9\u0005\f\u0000\u0000\u02e9\u02ea\u0003\u009eO\u0000\u02ea"+
		"\u02eb\u0005\r\u0000\u0000\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ee"+
		"\u0003\u0096K\u0000\u02ed\u02e8\u0001\u0000\u0000\u0000\u02ed\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ee\u009d\u0001\u0000\u0000\u0000\u02ef\u02f0\u0003"+
		"L&\u0000\u02f0\u02f1\u0003\u00a0P\u0000\u02f1\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f4\u0001\u0000\u0000\u0000\u02f3\u02ef\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u009f\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0005\u0006\u0000\u0000\u02f6\u02f7\u0003L&\u0000\u02f7"+
		"\u02f8\u0003\u00a0P\u0000\u02f8\u02fb\u0001\u0000\u0000\u0000\u02f9\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fa\u02f5\u0001\u0000\u0000\u0000\u02fa\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fb\u00a1\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0005\u0006\u0000\u0000\u02fd\u02fe\u0003^/\u0000\u02fe\u02ff\u0003\u00a2"+
		"Q\u0000\u02ff\u0302\u0001\u0000\u0000\u0000\u0300\u0302\u0001\u0000\u0000"+
		"\u0000\u0301\u02fc\u0001\u0000\u0000\u0000\u0301\u0300\u0001\u0000\u0000"+
		"\u0000\u0302\u00a3\u0001\u0000\u0000\u00005\u00ac\u00bb\u00cc\u00d2\u00e0"+
		"\u00ee\u00f2\u00f6\u0102\u0109\u0136\u013f\u014d\u0152\u015e\u0168\u016c"+
		"\u0194\u01a2\u01a7\u01b1\u01b7\u01be\u01ca\u01d4\u01de\u01e3\u01e7\u0205"+
		"\u0215\u0227\u022e\u0238\u0241\u024b\u0254\u025e\u0262\u0269\u0278\u028c"+
		"\u029c\u02a2\u02b1\u02c1\u02c6\u02cd\u02da\u02e3\u02ed\u02f3\u02fa\u0301";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}