package gen;
// Generated from java-escape by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PARSER extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, TYPE=2, CLASS=3, STATIC=4, RETURN=5, EXTENDS=6, OVERRIDE=7, PRINT=8, 
		BIG=9, SMALL=10, BODY=11, CIRCLEAVATAR=12, COLUMN=13, CHILDREN=14, BACKGROUNDCOLOR=15, 
		ICON=16, SIZE=17, RADIUS=18, APPBARR=19, TITLE=20, IF=21, FOR=22, TRUE=23, 
		FALSE=24, IN=25, ELSE=26, WHILE=27, NOT=28, OR=29, TEXT=30, STYLE=31, 
		TEXTSTYLE=32, WIDGET=33, BUILD=34, FIT=35, BUILDCONTEXT=36, CONTEXT=37, 
		INKWEL=38, ONTAP=39, ONPRESSED=40, CHILD=41, PADD=42, TEXTFIELD=43, DECORATION=44, 
		INPUT=45, PADDING=46, CONTAINER=47, HEIGHT=48, SIZEBOX=49, LABELTEXT=50, 
		BOXDECORATION=51, WIDTH=52, TEXTBUTTON=53, BORDER=54, ALIGMENT=55, CLIPRRECT=56, 
		STATELESSWIDGET=57, REQUIRED=58, THIS=59, SCAFOLD=60, APPBAR=61, COLOR=62, 
		CENTER=63, BACKCOLOR=64, PRODUCT=65, NAVIGATOR=66, FINAL=67, CONST=68, 
		SEMI=69, DOT=70, COLOMN=71, COMA=72, CURLYOPEN=73, CURLYCLOSE=74, BRACOPEN=75, 
		BRACCLOSE=76, SEQOPEN=77, SEQCLOSE=78, STRING=79, CHAR=80, URL=81, OPER=82, 
		SIGNAL=83, SIGNALS=84, EQUAL=85, COMPARISON=86, TAG_WHITESPACE=87, NAME=88, 
		NUMBER=89, LATE=90;
	public static final int
		RULE_start_program = 0, RULE_flutter_class = 1, RULE_widget = 2, RULE_element = 3, 
		RULE_build = 4, RULE_build_inst = 5, RULE_inwell = 6, RULE_inkwell_child = 7, 
		RULE_ontap = 8, RULE_child = 9, RULE_navigator = 10, RULE_textbutton = 11, 
		RULE_onpressed = 12, RULE_width = 13, RULE_icon = 14, RULE_column = 15, 
		RULE_textFromField = 16, RULE_decorationn = 17, RULE_labeltext = 18, RULE_sizebox = 19, 
		RULE_circleAvatar = 20, RULE_backgroundcolor = 21, RULE_text = 22, RULE_style = 23, 
		RULE_textstyle = 24, RULE_center = 25, RULE_container = 26, RULE_container_child = 27, 
		RULE_decoration = 28, RULE_image_asset = 29, RULE_cliprrect = 30, RULE_padding_cull = 31, 
		RULE_padding_child = 32, RULE_padd = 33, RULE_constructer = 34, RULE_atrbute = 35, 
		RULE_scafold_fun = 36, RULE_body = 37, RULE_appbar = 38, RULE_title = 39, 
		RULE_color = 40, RULE_decler_class = 41, RULE_main_class = 42, RULE_main_dart = 43, 
		RULE_header_main = 44, RULE_class = 45, RULE_list = 46, RULE_create_function = 47, 
		RULE_var_param = 48, RULE_class_body = 49, RULE_decler_fun = 50, RULE_returN = 51, 
		RULE_body_element = 52, RULE_print = 53, RULE_array = 54, RULE_vareble = 55, 
		RULE_after_var = 56, RULE_var_equal = 57, RULE_oper = 58, RULE_others = 59, 
		RULE_decler_var = 60, RULE_key = 61, RULE_parameter = 62, RULE_argument = 63, 
		RULE_name = 64, RULE_cunstructer = 65, RULE_encaps = 66, RULE_cull_function = 67, 
		RULE_condetion = 68, RULE_loop = 69, RULE_iF = 70, RULE_if_condetion = 71, 
		RULE_iF_Else = 72, RULE_elsE = 73, RULE_for_loop = 74, RULE_while_loop = 75, 
		RULE_for_each = 76, RULE_side = 77, RULE_operation = 78, RULE_operationd = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_program", "flutter_class", "widget", "element", "build", "build_inst", 
			"inwell", "inkwell_child", "ontap", "child", "navigator", "textbutton", 
			"onpressed", "width", "icon", "column", "textFromField", "decorationn", 
			"labeltext", "sizebox", "circleAvatar", "backgroundcolor", "text", "style", 
			"textstyle", "center", "container", "container_child", "decoration", 
			"image_asset", "cliprrect", "padding_cull", "padding_child", "padd", 
			"constructer", "atrbute", "scafold_fun", "body", "appbar", "title", "color", 
			"decler_class", "main_class", "main_dart", "header_main", "class", "list", 
			"create_function", "var_param", "class_body", "decler_fun", "returN", 
			"body_element", "print", "array", "vareble", "after_var", "var_equal", 
			"oper", "others", "decler_var", "key", "parameter", "argument", "name", 
			"cunstructer", "encaps", "cull_function", "condetion", "loop", "iF", 
			"if_condetion", "iF_Else", "elsE", "for_loop", "while_loop", "for_each", 
			"side", "operation", "operationd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "TYPE", "CLASS", "STATIC", "RETURN", "EXTENDS", "OVERRIDE", 
			"PRINT", "BIG", "SMALL", "BODY", "CIRCLEAVATAR", "COLUMN", "CHILDREN", 
			"BACKGROUNDCOLOR", "ICON", "SIZE", "RADIUS", "APPBARR", "TITLE", "IF", 
			"FOR", "TRUE", "FALSE", "IN", "ELSE", "WHILE", "NOT", "OR", "TEXT", "STYLE", 
			"TEXTSTYLE", "WIDGET", "BUILD", "FIT", "BUILDCONTEXT", "CONTEXT", "INKWEL", 
			"ONTAP", "ONPRESSED", "CHILD", "PADD", "TEXTFIELD", "DECORATION", "INPUT", 
			"PADDING", "CONTAINER", "HEIGHT", "SIZEBOX", "LABELTEXT", "BOXDECORATION", 
			"WIDTH", "TEXTBUTTON", "BORDER", "ALIGMENT", "CLIPRRECT", "STATELESSWIDGET", 
			"REQUIRED", "THIS", "SCAFOLD", "APPBAR", "COLOR", "CENTER", "BACKCOLOR", 
			"PRODUCT", "NAVIGATOR", "FINAL", "CONST", "SEMI", "DOT", "COLOMN", "COMA", 
			"CURLYOPEN", "CURLYCLOSE", "BRACOPEN", "BRACCLOSE", "SEQOPEN", "SEQCLOSE", 
			"STRING", "CHAR", "URL", "OPER", "SIGNAL", "SIGNALS", "EQUAL", "COMPARISON", 
			"TAG_WHITESPACE", "NAME", "NUMBER", "LATE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PARSER(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_programContext extends ParserRuleContext {
		public Main_classContext main_class() {
			return getRuleContext(Main_classContext.class,0);
		}
		public List<Flutter_classContext> flutter_class() {
			return getRuleContexts(Flutter_classContext.class);
		}
		public Flutter_classContext flutter_class(int i) {
			return getRuleContext(Flutter_classContext.class,i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public Start_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterStart_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitStart_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitStart_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_programContext start_program() throws RecognitionException {
		Start_programContext _localctx = new Start_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(160);
					flutter_class();
					}
					break;
				case 2:
					{
					setState(161);
					class_();
					}
					break;
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			main_class();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(168);
					flutter_class();
					}
					break;
				case 2:
					{
					setState(169);
					class_();
					}
					break;
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Flutter_classContext extends ParserRuleContext {
		public Decler_classContext decler_class() {
			return getRuleContext(Decler_classContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(PARSER.EXTENDS, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Flutter_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flutter_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterFlutter_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitFlutter_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitFlutter_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flutter_classContext flutter_class() throws RecognitionException {
		Flutter_classContext _localctx = new Flutter_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_flutter_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			decler_class();
			setState(176);
			match(EXTENDS);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STATELESSWIDGET:
				{
				setState(177);
				widget();
				}
				break;
			case NAME:
				{
				setState(178);
				list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetContext extends ParserRuleContext {
		public TerminalNode STATELESSWIDGET() { return getToken(PARSER.STATELESSWIDGET, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_widget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(STATELESSWIDGET);
			setState(182);
			match(CURLYOPEN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711876L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(183);
				element();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public VarebleContext vareble() {
			return getRuleContext(VarebleContext.class,0);
		}
		public ConstructerContext constructer() {
			return getRuleContext(ConstructerContext.class,0);
		}
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				vareble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				constructer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				build();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuildContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(PARSER.OVERRIDE, 0); }
		public TerminalNode WIDGET() { return getToken(PARSER.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(PARSER.BUILD, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BUILDCONTEXT() { return getToken(PARSER.BUILDCONTEXT, 0); }
		public TerminalNode CONTEXT() { return getToken(PARSER.CONTEXT, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Build_instContext> build_inst() {
			return getRuleContexts(Build_instContext.class);
		}
		public Build_instContext build_inst(int i) {
			return getRuleContext(Build_instContext.class,i);
		}
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_build);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(OVERRIDE);
			setState(197);
			match(WIDGET);
			setState(198);
			match(BUILD);
			setState(199);
			match(BRACOPEN);
			setState(200);
			match(BUILDCONTEXT);
			setState(201);
			match(CONTEXT);
			setState(202);
			match(BRACCLOSE);
			setState(203);
			match(CURLYOPEN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN) {
				{
				{
				setState(204);
				build_inst();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Build_instContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PARSER.RETURN, 0); }
		public InwellContext inwell() {
			return getRuleContext(InwellContext.class,0);
		}
		public List<Scafold_funContext> scafold_fun() {
			return getRuleContexts(Scafold_funContext.class);
		}
		public Scafold_funContext scafold_fun(int i) {
			return getRuleContext(Scafold_funContext.class,i);
		}
		public Build_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterBuild_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitBuild_inst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitBuild_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_instContext build_inst() throws RecognitionException {
		Build_instContext _localctx = new Build_instContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_build_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(RETURN);
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INKWEL:
				{
				setState(213);
				inwell();
				}
				break;
			case RETURN:
			case SCAFOLD:
			case CURLYCLOSE:
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCAFOLD) {
					{
					{
					setState(214);
					scafold_fun();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InwellContext extends ParserRuleContext {
		public TerminalNode INKWEL() { return getToken(PARSER.INKWEL, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public Inkwell_childContext inkwell_child() {
			return getRuleContext(Inkwell_childContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public InwellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inwell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterInwell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitInwell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitInwell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InwellContext inwell() throws RecognitionException {
		InwellContext _localctx = new InwellContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inwell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(INKWEL);
			setState(223);
			match(BRACOPEN);
			setState(224);
			inkwell_child();
			setState(225);
			match(BRACCLOSE);
			setState(226);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inkwell_childContext extends ParserRuleContext {
		public OntapContext ontap() {
			return getRuleContext(OntapContext.class,0);
		}
		public List<ChildContext> child() {
			return getRuleContexts(ChildContext.class);
		}
		public ChildContext child(int i) {
			return getRuleContext(ChildContext.class,i);
		}
		public Inkwell_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inkwell_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterInkwell_child(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitInkwell_child(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitInkwell_child(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inkwell_childContext inkwell_child() throws RecognitionException {
		Inkwell_childContext _localctx = new Inkwell_childContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inkwell_child);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			ontap();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD) {
				{
				{
				setState(229);
				child();
				}
				}
				setState(234);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OntapContext extends ParserRuleContext {
		public TerminalNode ONTAP() { return getToken(PARSER.ONTAP, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode ONPRESSED() { return getToken(PARSER.ONPRESSED, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public OntapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterOntap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitOntap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitOntap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntapContext ontap() throws RecognitionException {
		OntapContext _localctx = new OntapContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ontap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ONTAP);
			setState(236);
			match(COLOMN);
			setState(237);
			match(ONPRESSED);
			setState(238);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(PARSER.CHILD, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public Padding_cullContext padding_cull() {
			return getRuleContext(Padding_cullContext.class,0);
		}
		public CliprrectContext cliprrect() {
			return getRuleContext(CliprrectContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public Image_assetContext image_asset() {
			return getRuleContext(Image_assetContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public TextbuttonContext textbutton() {
			return getRuleContext(TextbuttonContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CHILD);
			setState(241);
			match(COLOMN);
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDING:
				{
				setState(242);
				padding_cull();
				}
				break;
			case CLIPRRECT:
				{
				setState(243);
				cliprrect();
				}
				break;
			case CONTAINER:
				{
				setState(244);
				container();
				}
				break;
			case CENTER:
				{
				setState(245);
				center();
				}
				break;
			case TEXT:
				{
				setState(246);
				text();
				}
				break;
			case NAME:
				{
				setState(247);
				image_asset();
				}
				break;
			case COLUMN:
				{
				setState(248);
				column();
				}
				break;
			case ICON:
				{
				setState(249);
				icon();
				}
				break;
			case TEXTBUTTON:
				{
				setState(250);
				textbutton();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavigatorContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR() { return getToken(PARSER.NAVIGATOR, 0); }
		public List<TerminalNode> DOT() { return getTokens(PARSER.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PARSER.DOT, i);
		}
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public List<TerminalNode> BRACOPEN() { return getTokens(PARSER.BRACOPEN); }
		public TerminalNode BRACOPEN(int i) {
			return getToken(PARSER.BRACOPEN, i);
		}
		public TerminalNode CONTEXT() { return getToken(PARSER.CONTEXT, 0); }
		public List<TerminalNode> BRACCLOSE() { return getTokens(PARSER.BRACCLOSE); }
		public TerminalNode BRACCLOSE(int i) {
			return getToken(PARSER.BRACCLOSE, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public NavigatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterNavigator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitNavigator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitNavigator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorContext navigator() throws RecognitionException {
		NavigatorContext _localctx = new NavigatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_navigator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(NAVIGATOR);
			setState(254);
			match(DOT);
			setState(255);
			match(NAME);
			setState(256);
			match(BRACOPEN);
			setState(257);
			match(CONTEXT);
			setState(258);
			match(BRACCLOSE);
			setState(259);
			match(DOT);
			setState(260);
			name();
			setState(261);
			match(BRACOPEN);
			setState(262);
			name();
			setState(263);
			match(DOT);
			setState(264);
			name();
			setState(265);
			match(BRACCLOSE);
			setState(266);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextbuttonContext extends ParserRuleContext {
		public TerminalNode TEXTBUTTON() { return getToken(PARSER.TEXTBUTTON, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public OnpressedContext onpressed() {
			return getRuleContext(OnpressedContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public TextbuttonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textbutton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextbutton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextbutton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextbutton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextbuttonContext textbutton() throws RecognitionException {
		TextbuttonContext _localctx = new TextbuttonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_textbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(TEXTBUTTON);
			setState(269);
			match(BRACOPEN);
			setState(270);
			onpressed();
			setState(271);
			child();
			setState(272);
			match(BRACCLOSE);
			setState(273);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnpressedContext extends ParserRuleContext {
		public TerminalNode ONPRESSED() { return getToken(PARSER.ONPRESSED, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public NavigatorContext navigator() {
			return getRuleContext(NavigatorContext.class,0);
		}
		public OnpressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onpressed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterOnpressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitOnpressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitOnpressed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnpressedContext onpressed() throws RecognitionException {
		OnpressedContext _localctx = new OnpressedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_onpressed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ONPRESSED);
			setState(276);
			match(COLOMN);
			setState(277);
			match(BRACOPEN);
			setState(278);
			match(BRACCLOSE);
			setState(279);
			match(CURLYOPEN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAVIGATOR) {
				{
				setState(280);
				navigator();
				}
			}

			setState(283);
			match(CURLYCLOSE);
			setState(284);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(PARSER.WIDTH, 0); }
		public List<TerminalNode> COLOMN() { return getTokens(PARSER.COLOMN); }
		public TerminalNode COLOMN(int i) {
			return getToken(PARSER.COLOMN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PARSER.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PARSER.NUMBER, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode HEIGHT() { return getToken(PARSER.HEIGHT, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(WIDTH);
			setState(287);
			match(COLOMN);
			setState(288);
			match(NUMBER);
			setState(289);
			match(COMA);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(290);
				match(HEIGHT);
				setState(291);
				match(COLOMN);
				setState(292);
				match(NUMBER);
				setState(293);
				match(COMA);
				setState(294);
				child();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IconContext extends ParserRuleContext {
		public TerminalNode ICON() { return getToken(PARSER.ICON, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode SIZE() { return getToken(PARSER.SIZE, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public IconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterIcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitIcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitIcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconContext icon() throws RecognitionException {
		IconContext _localctx = new IconContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_icon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ICON);
			setState(298);
			match(BRACOPEN);
			setState(299);
			match(NAME);
			setState(300);
			match(DOT);
			setState(301);
			name();
			setState(302);
			match(COMA);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIZE) {
				{
				setState(303);
				match(SIZE);
				setState(304);
				match(COLOMN);
				setState(305);
				match(NUMBER);
				}
			}

			setState(308);
			match(BRACCLOSE);
			setState(309);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(PARSER.COLUMN, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public List<TerminalNode> COLOMN() { return getTokens(PARSER.COLOMN); }
		public TerminalNode COLOMN(int i) {
			return getToken(PARSER.COLOMN, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode CHILDREN() { return getToken(PARSER.CHILDREN, 0); }
		public TerminalNode SEQOPEN() { return getToken(PARSER.SEQOPEN, 0); }
		public TerminalNode SEQCLOSE() { return getToken(PARSER.SEQCLOSE, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public Padding_cullContext padding_cull() {
			return getRuleContext(Padding_cullContext.class,0);
		}
		public TerminalNode BIG() { return getToken(PARSER.BIG, 0); }
		public TerminalNode WIDGET() { return getToken(PARSER.WIDGET, 0); }
		public TerminalNode SMALL() { return getToken(PARSER.SMALL, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public List<TextFromFieldContext> textFromField() {
			return getRuleContexts(TextFromFieldContext.class);
		}
		public TextFromFieldContext textFromField(int i) {
			return getRuleContext(TextFromFieldContext.class,i);
		}
		public CircleAvatarContext circleAvatar() {
			return getRuleContext(CircleAvatarContext.class,0);
		}
		public List<SizeboxContext> sizebox() {
			return getRuleContexts(SizeboxContext.class);
		}
		public SizeboxContext sizebox(int i) {
			return getRuleContext(SizeboxContext.class,i);
		}
		public List<ContainerContext> container() {
			return getRuleContexts(ContainerContext.class);
		}
		public ContainerContext container(int i) {
			return getRuleContext(ContainerContext.class,i);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public OnpressedContext onpressed() {
			return getRuleContext(OnpressedContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(COLUMN);
			setState(312);
			match(BRACOPEN);
			setState(313);
			match(NAME);
			setState(314);
			match(COLOMN);
			setState(315);
			name();
			setState(316);
			match(DOT);
			setState(317);
			name();
			setState(318);
			match(COMA);
			setState(319);
			match(CHILDREN);
			setState(320);
			match(COLOMN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIG) {
				{
				setState(321);
				match(BIG);
				setState(322);
				match(WIDGET);
				setState(323);
				match(SMALL);
				}
			}

			setState(326);
			match(SEQOPEN);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDING:
				{
				setState(327);
				padding_cull();
				}
				break;
			case CIRCLEAVATAR:
			case TEXT:
			case CONTAINER:
			case SIZEBOX:
			case SEQCLOSE:
				{
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CIRCLEAVATAR) {
						{
						setState(328);
						circleAvatar();
						}
					}

					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SIZEBOX) {
						{
						{
						setState(331);
						sizebox();
						setState(332);
						match(COMA);
						setState(333);
						container();
						setState(334);
						match(COMA);
						}
						}
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEXT) {
						{
						setState(341);
						text();
						}
					}

					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CONTAINER) {
						{
						{
						setState(344);
						container();
						setState(345);
						match(COMA);
						setState(349);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SIZEBOX) {
							{
							setState(346);
							sizebox();
							setState(347);
							match(COMA);
							}
						}

						}
						}
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case TEXTFIELD:
				{
				{
				{
				setState(358);
				textFromField();
				setState(359);
				textFromField();
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONPRESSED) {
					{
					setState(361);
					onpressed();
					}
				}

				setState(364);
				child();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			match(SEQCLOSE);
			setState(369);
			match(COMA);
			setState(370);
			match(BRACCLOSE);
			setState(371);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextFromFieldContext extends ParserRuleContext {
		public TerminalNode TEXTFIELD() { return getToken(PARSER.TEXTFIELD, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public TextFromFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFromField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextFromField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextFromField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextFromField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFromFieldContext textFromField() throws RecognitionException {
		TextFromFieldContext _localctx = new TextFromFieldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textFromField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(TEXTFIELD);
			setState(374);
			match(BRACOPEN);
			setState(375);
			decoration();
			setState(376);
			match(BRACCLOSE);
			setState(377);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecorationnContext extends ParserRuleContext {
		public TerminalNode DECORATION() { return getToken(PARSER.DECORATION, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode INPUT() { return getToken(PARSER.INPUT, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public LabeltextContext labeltext() {
			return getRuleContext(LabeltextContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public DecorationnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorationn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterDecorationn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitDecorationn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitDecorationn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationnContext decorationn() throws RecognitionException {
		DecorationnContext _localctx = new DecorationnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decorationn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DECORATION);
			setState(380);
			match(COLOMN);
			setState(381);
			match(INPUT);
			setState(382);
			match(BRACOPEN);
			setState(383);
			labeltext();
			setState(384);
			match(BRACCLOSE);
			setState(385);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabeltextContext extends ParserRuleContext {
		public TerminalNode LABELTEXT() { return getToken(PARSER.LABELTEXT, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode CHAR() { return getToken(PARSER.CHAR, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public LabeltextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeltext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterLabeltext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitLabeltext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitLabeltext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeltextContext labeltext() throws RecognitionException {
		LabeltextContext _localctx = new LabeltextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_labeltext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LABELTEXT);
			setState(388);
			match(COLOMN);
			setState(389);
			match(CHAR);
			setState(390);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SizeboxContext extends ParserRuleContext {
		public TerminalNode SIZEBOX() { return getToken(PARSER.SIZEBOX, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode HEIGHT() { return getToken(PARSER.HEIGHT, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public SizeboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterSizebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitSizebox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitSizebox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeboxContext sizebox() throws RecognitionException {
		SizeboxContext _localctx = new SizeboxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sizebox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(SIZEBOX);
			setState(393);
			match(BRACOPEN);
			setState(394);
			match(HEIGHT);
			setState(395);
			match(COLOMN);
			setState(396);
			match(NUMBER);
			setState(397);
			match(COMA);
			setState(398);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CircleAvatarContext extends ParserRuleContext {
		public TerminalNode CIRCLEAVATAR() { return getToken(PARSER.CIRCLEAVATAR, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public BackgroundcolorContext backgroundcolor() {
			return getRuleContext(BackgroundcolorContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode RADIUS() { return getToken(PARSER.RADIUS, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public CircleAvatarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circleAvatar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCircleAvatar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCircleAvatar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCircleAvatar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleAvatarContext circleAvatar() throws RecognitionException {
		CircleAvatarContext _localctx = new CircleAvatarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_circleAvatar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(CIRCLEAVATAR);
			setState(401);
			match(BRACOPEN);
			setState(402);
			backgroundcolor();
			setState(403);
			child();
			setState(404);
			match(RADIUS);
			setState(405);
			match(COLOMN);
			setState(406);
			match(NUMBER);
			setState(407);
			match(COMA);
			setState(408);
			match(BRACCLOSE);
			setState(409);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundcolorContext extends ParserRuleContext {
		public TerminalNode BACKGROUNDCOLOR() { return getToken(PARSER.BACKGROUNDCOLOR, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public BackgroundcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterBackgroundcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitBackgroundcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitBackgroundcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundcolorContext backgroundcolor() throws RecognitionException {
		BackgroundcolorContext _localctx = new BackgroundcolorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_backgroundcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(BACKGROUNDCOLOR);
			setState(412);
			match(COLOMN);
			setState(413);
			name();
			setState(414);
			match(DOT);
			setState(415);
			match(NAME);
			setState(416);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PARSER.TEXT, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode CHAR() { return getToken(PARSER.CHAR, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(TEXT);
			setState(419);
			match(BRACOPEN);
			setState(420);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(421);
			match(COMA);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLE) {
				{
				setState(422);
				style();
				}
			}

			setState(425);
			match(BRACCLOSE);
			setState(426);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(PARSER.STYLE, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TextstyleContext textstyle() {
			return getRuleContext(TextstyleContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(STYLE);
			setState(429);
			match(COLOMN);
			setState(430);
			textstyle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextstyleContext extends ParserRuleContext {
		public TerminalNode TEXTSTYLE() { return getToken(PARSER.TEXTSTYLE, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public TextstyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextstyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextstyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextstyleContext textstyle() throws RecognitionException {
		TextstyleContext _localctx = new TextstyleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_textstyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(TEXTSTYLE);
			setState(433);
			match(BRACOPEN);
			setState(434);
			color();
			setState(435);
			match(BRACCLOSE);
			setState(436);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CenterContext extends ParserRuleContext {
		public TerminalNode CENTER() { return getToken(PARSER.CENTER, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(CENTER);
			setState(439);
			match(BRACOPEN);
			setState(440);
			child();
			setState(441);
			match(BRACCLOSE);
			setState(442);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(PARSER.CONTAINER, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public List<Container_childContext> container_child() {
			return getRuleContexts(Container_childContext.class);
		}
		public Container_childContext container_child(int i) {
			return getRuleContext(Container_childContext.class,i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(CONTAINER);
			setState(445);
			match(BRACOPEN);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4652518581748105216L) != 0) {
				{
				{
				setState(446);
				container_child();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Container_childContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(PARSER.HEIGHT, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode ALIGMENT() { return getToken(PARSER.ALIGMENT, 0); }
		public List<TerminalNode> NAME() { return getTokens(PARSER.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PARSER.NAME, i);
		}
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public OnpressedContext onpressed() {
			return getRuleContext(OnpressedContext.class,0);
		}
		public Container_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterContainer_child(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitContainer_child(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitContainer_child(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_childContext container_child() throws RecognitionException {
		Container_childContext _localctx = new Container_childContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_container_child);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEIGHT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(454);
				match(HEIGHT);
				setState(455);
				match(COLOMN);
				setState(456);
				match(NUMBER);
				setState(457);
				match(COMA);
				}
				}
				break;
			case ALIGMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				{
				setState(458);
				match(ALIGMENT);
				setState(459);
				match(COLOMN);
				setState(460);
				match(NAME);
				setState(461);
				match(DOT);
				setState(462);
				match(NAME);
				setState(463);
				match(COMA);
				setState(464);
				child();
				}
				setState(466);
				match(COMA);
				}
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(468);
				width();
				}
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(469);
				color();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHILD) {
					{
					setState(470);
					child();
					}
				}

				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(473);
					width();
					}
					break;
				}
				}
				}
				break;
			case DECORATION:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(476);
				decoration();
				}
				}
				break;
			case ONPRESSED:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				onpressed();
				setState(478);
				child();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecorationContext extends ParserRuleContext {
		public DecorationnContext decorationn() {
			return getRuleContext(DecorationnContext.class,0);
		}
		public TerminalNode DECORATION() { return getToken(PARSER.DECORATION, 0); }
		public List<TerminalNode> COLOMN() { return getTokens(PARSER.COLOMN); }
		public TerminalNode COLOMN(int i) {
			return getToken(PARSER.COLOMN, i);
		}
		public TerminalNode BOXDECORATION() { return getToken(PARSER.BOXDECORATION, 0); }
		public List<TerminalNode> BRACOPEN() { return getTokens(PARSER.BRACOPEN); }
		public TerminalNode BRACOPEN(int i) {
			return getToken(PARSER.BRACOPEN, i);
		}
		public TerminalNode BORDER() { return getToken(PARSER.BORDER, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<TerminalNode> BRACCLOSE() { return getTokens(PARSER.BRACCLOSE); }
		public TerminalNode BRACCLOSE(int i) {
			return getToken(PARSER.BRACCLOSE, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode WIDTH() { return getToken(PARSER.WIDTH, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PARSER.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PARSER.NUMBER, i);
		}
		public TerminalNode HEIGHT() { return getToken(PARSER.HEIGHT, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public DecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitDecoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationContext decoration() throws RecognitionException {
		DecorationContext _localctx = new DecorationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_decoration);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(482);
				decorationn();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(483);
				match(DECORATION);
				setState(484);
				match(COLOMN);
				setState(485);
				match(BOXDECORATION);
				setState(486);
				match(BRACOPEN);
				setState(487);
				match(BORDER);
				setState(488);
				match(COLOMN);
				setState(489);
				match(NAME);
				setState(490);
				match(DOT);
				setState(491);
				name();
				setState(492);
				match(BRACOPEN);
				setState(493);
				color();
				setState(494);
				match(BRACCLOSE);
				setState(495);
				match(BRACCLOSE);
				setState(496);
				match(COMA);
				setState(497);
				match(WIDTH);
				setState(498);
				match(COLOMN);
				setState(499);
				match(NUMBER);
				setState(500);
				match(COMA);
				setState(501);
				match(HEIGHT);
				setState(502);
				match(COLOMN);
				setState(503);
				match(NUMBER);
				setState(504);
				match(COMA);
				setState(505);
				child();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Image_assetContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PARSER.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PARSER.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PARSER.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PARSER.DOT, i);
		}
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode URL() { return getToken(PARSER.URL, 0); }
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode FIT() { return getToken(PARSER.FIT, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public Image_assetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_asset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterImage_asset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitImage_asset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitImage_asset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_assetContext image_asset() throws RecognitionException {
		Image_assetContext _localctx = new Image_assetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_image_asset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(NAME);
			setState(510);
			match(DOT);
			setState(511);
			match(NAME);
			setState(512);
			match(BRACOPEN);
			setState(513);
			match(URL);
			setState(514);
			match(COMA);
			setState(515);
			match(FIT);
			setState(516);
			match(COLOMN);
			setState(517);
			match(NAME);
			setState(518);
			match(DOT);
			setState(519);
			match(NAME);
			setState(520);
			match(COMA);
			setState(521);
			match(BRACCLOSE);
			setState(522);
			match(COMA);
			setState(523);
			child();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CliprrectContext extends ParserRuleContext {
		public TerminalNode CLIPRRECT() { return getToken(PARSER.CLIPRRECT, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public CliprrectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cliprrect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCliprrect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCliprrect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCliprrect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CliprrectContext cliprrect() throws RecognitionException {
		CliprrectContext _localctx = new CliprrectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cliprrect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(CLIPRRECT);
			setState(526);
			match(BRACOPEN);
			setState(527);
			child();
			setState(528);
			match(COMA);
			setState(529);
			match(BRACCLOSE);
			setState(530);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Padding_cullContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(PARSER.PADDING, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public Padding_childContext padding_child() {
			return getRuleContext(Padding_childContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public Padding_cullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding_cull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterPadding_cull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitPadding_cull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPadding_cull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding_cullContext padding_cull() throws RecognitionException {
		Padding_cullContext _localctx = new Padding_cullContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_padding_cull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(532);
			match(PADDING);
			setState(533);
			match(BRACOPEN);
			setState(534);
			padding_child();
			setState(535);
			match(BRACCLOSE);
			setState(536);
			match(COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Padding_childContext extends ParserRuleContext {
		public PaddContext padd() {
			return getRuleContext(PaddContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public Padding_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterPadding_child(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitPadding_child(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPadding_child(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding_childContext padding_child() throws RecognitionException {
		Padding_childContext _localctx = new Padding_childContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_padding_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			padd();
			setState(539);
			child();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PaddContext extends ParserRuleContext {
		public TerminalNode PADD() { return getToken(PARSER.PADD, 0); }
		public List<TerminalNode> COLOMN() { return getTokens(PARSER.COLOMN); }
		public TerminalNode COLOMN(int i) {
			return getToken(PARSER.COLOMN, i);
		}
		public List<TerminalNode> NAME() { return getTokens(PARSER.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PARSER.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PARSER.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PARSER.DOT, i);
		}
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PARSER.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PARSER.NUMBER, i);
		}
		public TerminalNode CONST() { return getToken(PARSER.CONST, 0); }
		public PaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterPadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitPadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddContext padd() throws RecognitionException {
		PaddContext _localctx = new PaddContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_padd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(PADD);
			setState(542);
			match(COLOMN);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(543);
				match(CONST);
				}
			}

			setState(546);
			match(NAME);
			setState(547);
			match(DOT);
			setState(548);
			match(NAME);
			setState(549);
			match(BRACOPEN);
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(550);
				match(NUMBER);
				}
				break;
			case NAME:
				{
				setState(551);
				match(NAME);
				setState(552);
				match(COLOMN);
				setState(553);
				match(NUMBER);
				setState(554);
				match(DOT);
				setState(555);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(558);
			match(BRACCLOSE);
			setState(559);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructerContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PARSER.CONST, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public AtrbuteContext atrbute() {
			return getRuleContext(AtrbuteContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public ConstructerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterConstructer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitConstructer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitConstructer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructerContext constructer() throws RecognitionException {
		ConstructerContext _localctx = new ConstructerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constructer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(CONST);
			setState(562);
			match(NAME);
			setState(563);
			match(BRACOPEN);
			setState(564);
			match(CURLYOPEN);
			setState(565);
			atrbute();
			setState(566);
			match(CURLYCLOSE);
			setState(567);
			match(BRACCLOSE);
			setState(568);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtrbuteContext extends ParserRuleContext {
		public List<Decler_varContext> decler_var() {
			return getRuleContexts(Decler_varContext.class);
		}
		public Decler_varContext decler_var(int i) {
			return getRuleContext(Decler_varContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public AtrbuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrbute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterAtrbute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitAtrbute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitAtrbute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrbuteContext atrbute() throws RecognitionException {
		AtrbuteContext _localctx = new AtrbuteContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_atrbute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			decler_var();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(571);
				match(COMA);
				setState(572);
				decler_var();
				}
				}
				setState(577);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scafold_funContext extends ParserRuleContext {
		public TerminalNode SCAFOLD() { return getToken(PARSER.SCAFOLD, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public AppbarContext appbar() {
			return getRuleContext(AppbarContext.class,0);
		}
		public Scafold_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scafold_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterScafold_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitScafold_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitScafold_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scafold_funContext scafold_fun() throws RecognitionException {
		Scafold_funContext _localctx = new Scafold_funContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scafold_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(SCAFOLD);
			setState(579);
			match(BRACOPEN);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPBARR) {
				{
				setState(580);
				appbar();
				}
			}

			setState(583);
			body();
			}
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(585);
				match(COMA);
				}
			}

			setState(588);
			match(BRACCLOSE);
			setState(589);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(PARSER.BODY, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public Padding_cullContext padding_cull() {
			return getRuleContext(Padding_cullContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(BODY);
			setState(592);
			match(COLOMN);
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CENTER:
				{
				setState(593);
				center();
				}
				break;
			case PADDING:
				{
				setState(594);
				padding_cull();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppbarContext extends ParserRuleContext {
		public TerminalNode APPBARR() { return getToken(PARSER.APPBARR, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode APPBAR() { return getToken(PARSER.APPBAR, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AppbarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appbar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterAppbar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitAppbar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitAppbar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppbarContext appbar() throws RecognitionException {
		AppbarContext _localctx = new AppbarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_appbar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(APPBARR);
			setState(598);
			match(COLOMN);
			setState(599);
			match(APPBAR);
			setState(600);
			match(BRACOPEN);
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				{
				setState(601);
				title();
				}
				break;
			case TEXT:
				{
				setState(602);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(605);
			match(BRACCLOSE);
			setState(606);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(PARSER.TITLE, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(TITLE);
			setState(609);
			match(COLOMN);
			setState(610);
			text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(PARSER.COLOR, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public List<TerminalNode> NAME() { return getTokens(PARSER.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PARSER.NAME, i);
		}
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(COLOR);
			setState(613);
			match(COLOMN);
			setState(614);
			match(NAME);
			setState(615);
			match(DOT);
			setState(616);
			match(NAME);
			setState(617);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decler_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PARSER.CLASS, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public Decler_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decler_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterDecler_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitDecler_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitDecler_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decler_classContext decler_class() throws RecognitionException {
		Decler_classContext _localctx = new Decler_classContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_decler_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(CLASS);
			{
			setState(620);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_classContext extends ParserRuleContext {
		public Main_dartContext main_dart() {
			return getRuleContext(Main_dartContext.class,0);
		}
		public Main_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterMain_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitMain_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitMain_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_classContext main_class() throws RecognitionException {
		Main_classContext _localctx = new Main_classContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_main_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			main_dart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_dartContext extends ParserRuleContext {
		public Header_mainContext header_main() {
			return getRuleContext(Header_mainContext.class,0);
		}
		public Main_dartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_dart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterMain_dart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitMain_dart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitMain_dart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_dartContext main_dart() throws RecognitionException {
		Main_dartContext _localctx = new Main_dartContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_main_dart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			header_main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Header_mainContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(PARSER.VOID, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public Header_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeader_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeader_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeader_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_mainContext header_main() throws RecognitionException {
		Header_mainContext _localctx = new Header_mainContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_header_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(VOID);
			setState(627);
			match(BRACOPEN);
			setState(628);
			match(BRACCLOSE);
			setState(629);
			match(CURLYOPEN);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(630);
				body_element();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public Decler_classContext decler_class() {
			return getRuleContext(Decler_classContext.class,0);
		}
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public TerminalNode EXTENDS() { return getToken(PARSER.EXTENDS, 0); }
		public List<Class_bodyContext> class_body() {
			return getRuleContexts(Class_bodyContext.class);
		}
		public Class_bodyContext class_body(int i) {
			return getRuleContext(Class_bodyContext.class,i);
		}
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			decler_class();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(639);
				match(EXTENDS);
				{
				{
				setState(640);
				match(NAME);
				}
				}
				}
			}

			setState(643);
			match(CURLYOPEN);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711878L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(644);
				class_body();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode BIG() { return getToken(PARSER.BIG, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SMALL() { return getToken(PARSER.SMALL, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(NAME);
			setState(653);
			match(BIG);
			setState(654);
			name();
			setState(655);
			match(SMALL);
			setState(656);
			match(CURLYOPEN);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711876L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(657);
				element();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_functionContext extends ParserRuleContext {
		public Decler_funContext decler_fun() {
			return getRuleContext(Decler_funContext.class,0);
		}
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public TerminalNode OVERRIDE() { return getToken(PARSER.OVERRIDE, 0); }
		public Var_paramContext var_param() {
			return getRuleContext(Var_paramContext.class,0);
		}
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public ReturNContext returN() {
			return getRuleContext(ReturNContext.class,0);
		}
		public Create_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCreate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCreate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCreate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_functionContext create_function() throws RecognitionException {
		Create_functionContext _localctx = new Create_functionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(665);
				match(OVERRIDE);
				}
			}

			setState(668);
			decler_fun();
			setState(669);
			match(BRACOPEN);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==REQUIRED || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				setState(670);
				var_param();
				}
			}

			setState(673);
			match(BRACCLOSE);
			setState(674);
			match(CURLYOPEN);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(675);
				body_element();
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(681);
				returN();
				}
			}

			setState(684);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_paramContext extends ParserRuleContext {
		public List<Decler_varContext> decler_var() {
			return getRuleContexts(Decler_varContext.class);
		}
		public Decler_varContext decler_var(int i) {
			return getRuleContext(Decler_varContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public Var_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterVar_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitVar_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitVar_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_paramContext var_param() throws RecognitionException {
		Var_paramContext _localctx = new Var_paramContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_var_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			decler_var();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(687);
				match(COMA);
				setState(688);
				decler_var();
				}
				}
				setState(693);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public VarebleContext vareble() {
			return getRuleContext(VarebleContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Create_functionContext create_function() {
			return getRuleContext(Create_functionContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_class_body);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				vareble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				create_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decler_funContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode VOID() { return getToken(PARSER.VOID, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Decler_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decler_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterDecler_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitDecler_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitDecler_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decler_funContext decler_fun() throws RecognitionException {
		Decler_funContext _localctx = new Decler_funContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_decler_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(699);
				match(VOID);
				}
				break;
			case NAME:
				{
				setState(700);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(703);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturNContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PARSER.RETURN, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public Cull_functionContext cull_function() {
			return getRuleContext(Cull_functionContext.class,0);
		}
		public ReturNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterReturN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitReturN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitReturN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturNContext returN() throws RecognitionException {
		ReturNContext _localctx = new ReturNContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_returN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(RETURN);
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(706);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(707);
				cull_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Body_elementContext extends ParserRuleContext {
		public VarebleContext vareble() {
			return getRuleContext(VarebleContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Cull_functionContext cull_function() {
			return getRuleContext(Cull_functionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CondetionContext condetion() {
			return getRuleContext(CondetionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public EncapsContext encaps() {
			return getRuleContext(EncapsContext.class,0);
		}
		public Body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterBody_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitBody_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitBody_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_elementContext body_element() throws RecognitionException {
		Body_elementContext _localctx = new Body_elementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_body_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(710);
				vareble();
				}
				break;
			case 2:
				{
				setState(711);
				array();
				}
				break;
			case 3:
				{
				setState(712);
				cull_function();
				}
				break;
			case 4:
				{
				setState(713);
				loop();
				}
				break;
			case 5:
				{
				setState(714);
				condetion();
				}
				break;
			case 6:
				{
				setState(715);
				print();
				}
				break;
			case 7:
				{
				setState(716);
				encaps();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PARSER.PRINT, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public TerminalNode STRING() { return getToken(PARSER.STRING, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode CHAR() { return getToken(PARSER.CHAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(PRINT);
			setState(720);
			match(BRACOPEN);
			setState(721);
			_la = _input.LA(1);
			if ( !((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 515L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(722);
			match(BRACCLOSE);
			setState(723);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public Decler_varContext decler_var() {
			return getRuleContext(Decler_varContext.class,0);
		}
		public TerminalNode SEQOPEN() { return getToken(PARSER.SEQOPEN, 0); }
		public TerminalNode SEQCLOSE() { return getToken(PARSER.SEQCLOSE, 0); }
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			decler_var();
			setState(726);
			match(SEQOPEN);
			setState(727);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(728);
			match(SEQCLOSE);
			setState(729);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarebleContext extends ParserRuleContext {
		public Decler_varContext decler_var() {
			return getRuleContext(Decler_varContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public VarebleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vareble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterVareble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitVareble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitVareble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarebleContext vareble() throws RecognitionException {
		VarebleContext _localctx = new VarebleContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_vareble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			decler_var();
			setState(732);
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

	@SuppressWarnings("CheckReturnValue")
	public static class After_varContext extends ParserRuleContext {
		public Var_equalContext var_equal() {
			return getRuleContext(Var_equalContext.class,0);
		}
		public TerminalNode SIGNALS() { return getToken(PARSER.SIGNALS, 0); }
		public After_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_after_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterAfter_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitAfter_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitAfter_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final After_varContext after_var() throws RecognitionException {
		After_varContext _localctx = new After_varContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_after_var);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				var_equal();
				}
				break;
			case SIGNALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(SIGNALS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_equalContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PARSER.EQUAL, 0); }
		public OthersContext others() {
			return getRuleContext(OthersContext.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public Var_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterVar_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitVar_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitVar_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_equalContext var_equal() throws RecognitionException {
		Var_equalContext _localctx = new Var_equalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_var_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(EQUAL);
			setState(739);
			others();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPER) {
				{
				setState(740);
				oper();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperContext extends ParserRuleContext {
		public TerminalNode OPER() { return getToken(PARSER.OPER, 0); }
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_oper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(OPER);
			setState(744);
			side();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OthersContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(PARSER.CHAR, 0); }
		public TerminalNode STRING() { return getToken(PARSER.STRING, 0); }
		public OthersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_others; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterOthers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitOthers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitOthers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OthersContext others() throws RecognitionException {
		OthersContext _localctx = new OthersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_others);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 1539L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decler_varContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PARSER.TYPE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode REQUIRED() { return getToken(PARSER.REQUIRED, 0); }
		public TerminalNode THIS() { return getToken(PARSER.THIS, 0); }
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public Decler_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decler_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterDecler_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitDecler_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitDecler_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decler_varContext decler_var() throws RecognitionException {
		Decler_varContext _localctx = new Decler_varContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_decler_var);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case FINAL:
			case CONST:
			case NAME:
			case LATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 8388611L) != 0) {
					{
					setState(748);
					key();
					}
				}

				{
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(751);
					match(TYPE);
					}
					break;
				case 2:
					{
					setState(752);
					name();
					}
					break;
				}
				setState(755);
				match(NAME);
				}
				}
				break;
			case REQUIRED:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(756);
				match(REQUIRED);
				setState(757);
				match(THIS);
				setState(758);
				match(DOT);
				setState(759);
				match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PARSER.CONST, 0); }
		public TerminalNode FINAL() { return getToken(PARSER.FINAL, 0); }
		public TerminalNode LATE() { return getToken(PARSER.LATE, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 8388611L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode STRING() { return getToken(PARSER.STRING, 0); }
		public TerminalNode CHAR() { return getToken(PARSER.CHAR, 0); }
		public TerminalNode URL() { return getToken(PARSER.URL, 0); }
		public CunstructerContext cunstructer() {
			return getRuleContext(CunstructerContext.class,0);
		}
		public Cull_functionContext cull_function() {
			return getRuleContext(Cull_functionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameter);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				match(URL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				cunstructer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(769);
				cull_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PARSER.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PARSER.COMA, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			parameter();
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(773);
					match(COMA);
					setState(774);
					parameter();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CunstructerContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public Cull_functionContext cull_function() {
			return getRuleContext(Cull_functionContext.class,0);
		}
		public EncapsContext encaps() {
			return getRuleContext(EncapsContext.class,0);
		}
		public CunstructerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cunstructer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCunstructer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCunstructer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCunstructer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CunstructerContext cunstructer() throws RecognitionException {
		CunstructerContext _localctx = new CunstructerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cunstructer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(NAME);
			setState(783);
			match(COLOMN);
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				{
				setState(784);
				cull_function();
				}
				}
				break;
			case 2:
				{
				{
				setState(785);
				encaps();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EncapsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode DOT() { return getToken(PARSER.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Cull_functionContext cull_function() {
			return getRuleContext(Cull_functionContext.class,0);
		}
		public EncapsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encaps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterEncaps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitEncaps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitEncaps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncapsContext encaps() throws RecognitionException {
		EncapsContext _localctx = new EncapsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_encaps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(NAME);
			setState(789);
			match(DOT);
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(790);
				name();
				}
				break;
			case 2:
				{
				setState(791);
				cull_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cull_functionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public Cull_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cull_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCull_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCull_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCull_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cull_functionContext cull_function() throws RecognitionException {
		Cull_functionContext _localctx = new Cull_functionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cull_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(794);
				match(NAME);
				}
				break;
			}
			setState(797);
			name();
			setState(798);
			match(BRACOPEN);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 519L) != 0) {
				{
				setState(799);
				argument();
				}
			}

			setState(802);
			match(BRACCLOSE);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(803);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondetionContext extends ParserRuleContext {
		public IFContext iF() {
			return getRuleContext(IFContext.class,0);
		}
		public IF_ElseContext iF_Else() {
			return getRuleContext(IF_ElseContext.class,0);
		}
		public CondetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condetion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterCondetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitCondetion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCondetion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondetionContext condetion() throws RecognitionException {
		CondetionContext _localctx = new CondetionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_condetion);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				iF();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				iF_Else();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_loop);
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(812);
				for_each();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IFContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PARSER.IF, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<If_condetionContext> if_condetion() {
			return getRuleContexts(If_condetionContext.class);
		}
		public If_condetionContext if_condetion(int i) {
			return getRuleContext(If_condetionContext.class,i);
		}
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PARSER.OR); }
		public TerminalNode OR(int i) {
			return getToken(PARSER.OR, i);
		}
		public IFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IFContext iF() throws RecognitionException {
		IFContext _localctx = new IFContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_iF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(IF);
			setState(816);
			match(BRACOPEN);
			{
			setState(817);
			if_condetion();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				{
				setState(818);
				match(OR);
				}
				setState(819);
				if_condetion();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(825);
			match(BRACCLOSE);
			setState(826);
			match(CURLYOPEN);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(827);
				body_element();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_condetionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PARSER.NOT, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode TRUE() { return getToken(PARSER.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PARSER.FALSE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public If_condetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condetion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterIf_condetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitIf_condetion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitIf_condetion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condetionContext if_condetion() throws RecognitionException {
		If_condetionContext _localctx = new If_condetionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_if_condetion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(835);
				match(NOT);
				setState(836);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(837);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(838);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(839);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(840);
				operation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IF_ElseContext extends ParserRuleContext {
		public IFContext iF() {
			return getRuleContext(IFContext.class,0);
		}
		public ElsEContext elsE() {
			return getRuleContext(ElsEContext.class,0);
		}
		public IF_ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iF_Else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterIF_Else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitIF_Else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitIF_Else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IF_ElseContext iF_Else() throws RecognitionException {
		IF_ElseContext _localctx = new IF_ElseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_iF_Else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			iF();
			setState(844);
			elsE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElsEContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PARSER.ELSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public ElsEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterElsE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitElsE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitElsE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsEContext elsE() throws RecognitionException {
		ElsEContext _localctx = new ElsEContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elsE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(ELSE);
			setState(847);
			match(CURLYOPEN);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(848);
				body_element();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PARSER.FOR, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public VarebleContext vareble() {
			return getRuleContext(VarebleContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PARSER.SEMI, 0); }
		public OperationdContext operationd() {
			return getRuleContext(OperationdContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(FOR);
			setState(857);
			match(BRACOPEN);
			setState(858);
			vareble();
			setState(859);
			operation();
			setState(860);
			match(SEMI);
			setState(861);
			operationd();
			setState(862);
			match(BRACCLOSE);
			setState(863);
			match(CURLYOPEN);
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(864);
				body_element();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PARSER.WHILE, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(WHILE);
			setState(873);
			match(BRACOPEN);
			setState(874);
			operation();
			setState(875);
			match(BRACCLOSE);
			setState(876);
			match(CURLYOPEN);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(877);
				body_element();
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PARSER.FOR, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public Decler_varContext decler_var() {
			return getRuleContext(Decler_varContext.class,0);
		}
		public TerminalNode IN() { return getToken(PARSER.IN, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_for_each);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(FOR);
			setState(886);
			match(BRACOPEN);
			setState(887);
			decler_var();
			setState(888);
			match(IN);
			setState(889);
			match(NAME);
			setState(890);
			match(BRACCLOSE);
			setState(891);
			match(CURLYOPEN);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376292221188L) != 0 || (((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 10485763L) != 0) {
				{
				{
				setState(892);
				body_element();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SideContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_side);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public TerminalNode COMPARISON() { return getToken(PARSER.COMPARISON, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			side();
			setState(903);
			match(COMPARISON);
			setState(904);
			side();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationdContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public TerminalNode SIGNAL() { return getToken(PARSER.SIGNAL, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode SIGNALS() { return getToken(PARSER.SIGNALS, 0); }
		public OperationdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterOperationd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitOperationd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitOperationd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationdContext operationd() throws RecognitionException {
		OperationdContext _localctx = new OperationdContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_operationd);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(906);
				side();
				setState(907);
				match(SIGNAL);
				setState(908);
				side();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(910);
				match(NAME);
				setState(911);
				match(SIGNALS);
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

	public static final String _serializedATN =
		"\u0004\u0001Z\u0393\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u00a3\b\u0000\n\u0000\f\u0000\u00a6\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ab\b\u0000\n\u0000"+
		"\f\u0000\u00ae\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00b4\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u00b9\b\u0002\n\u0002\f\u0002\u00bc\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c3\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00ce\b\u0004\n\u0004\f\u0004\u00d1\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00d8\b\u0005\n\u0005\f\u0005\u00db\t\u0005\u0003\u0005\u00dd\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00e7\b\u0007\n\u0007\f\u0007\u00ea"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00fc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011a\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0128\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0133\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0145\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u014a\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0151\b\u000f\n\u000f\f\u000f\u0154\t\u000f\u0001\u000f\u0003"+
		"\u000f\u0157\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u015e\b\u000f\u0005\u000f\u0160\b\u000f\n\u000f\f\u000f"+
		"\u0163\t\u000f\u0003\u000f\u0165\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u016b\b\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u016f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a8\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01c0\b\u001a\n\u001a\f\u001a"+
		"\u01c3\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01d8\b\u001b\u0001\u001b\u0003\u001b"+
		"\u01db\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01e1\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01fc\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0003!\u0221\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u022d\b!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0005#\u023e\b#\n#\f#\u0241\t#\u0001$\u0001$\u0001$\u0003$\u0246"+
		"\b$\u0001$\u0001$\u0001$\u0003$\u024b\b$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0254\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u025c\b&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0278\b,\n,\f,\u027b\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u0282"+
		"\b-\u0001-\u0001-\u0005-\u0286\b-\n-\f-\u0289\t-\u0001-\u0001-\u0001."+
		"\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u0293\b.\n.\f.\u0296\t.\u0001"+
		".\u0001.\u0001/\u0003/\u029b\b/\u0001/\u0001/\u0001/\u0003/\u02a0\b/\u0001"+
		"/\u0001/\u0001/\u0005/\u02a5\b/\n/\f/\u02a8\t/\u0001/\u0003/\u02ab\b/"+
		"\u0001/\u0001/\u00010\u00010\u00010\u00050\u02b2\b0\n0\f0\u02b5\t0\u0001"+
		"1\u00011\u00011\u00031\u02ba\b1\u00012\u00012\u00032\u02be\b2\u00012\u0001"+
		"2\u00013\u00013\u00013\u00033\u02c5\b3\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u02ce\b4\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u0001"+
		"8\u00018\u00038\u02e1\b8\u00019\u00019\u00019\u00039\u02e6\b9\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001<\u0003<\u02ee\b<\u0001<\u0001<\u0003<\u02f2"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u02f9\b<\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0303\b>\u0001?\u0001?\u0001"+
		"?\u0005?\u0308\b?\n?\f?\u030b\t?\u0001@\u0001@\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0313\bA\u0001B\u0001B\u0001B\u0001B\u0003B\u0319\bB\u0001C\u0003"+
		"C\u031c\bC\u0001C\u0001C\u0001C\u0003C\u0321\bC\u0001C\u0001C\u0003C\u0325"+
		"\bC\u0001D\u0001D\u0003D\u0329\bD\u0001E\u0001E\u0001E\u0003E\u032e\b"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u0335\bF\nF\fF\u0338\tF\u0001"+
		"F\u0001F\u0001F\u0005F\u033d\bF\nF\fF\u0340\tF\u0001F\u0001F\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0003G\u034a\bG\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0005I\u0352\bI\nI\fI\u0355\tI\u0001I\u0001I\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0005J\u0362\bJ\nJ"+
		"\fJ\u0365\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005"+
		"K\u036f\bK\nK\fK\u0372\tK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0005L\u037e\bL\nL\fL\u0381\tL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0003O\u0391\bO\u0001O\u0001\u0309\u0000P\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u0000"+
		"\u0005\u0002\u0000PPXX\u0002\u0000OPXX\u0001\u0000XY\u0002\u0000OPXY\u0002"+
		"\u0000CDZZ\u03a6\u0000\u00a4\u0001\u0000\u0000\u0000\u0002\u00af\u0001"+
		"\u0000\u0000\u0000\u0004\u00b5\u0001\u0000\u0000\u0000\u0006\u00c2\u0001"+
		"\u0000\u0000\u0000\b\u00c4\u0001\u0000\u0000\u0000\n\u00d4\u0001\u0000"+
		"\u0000\u0000\f\u00de\u0001\u0000\u0000\u0000\u000e\u00e4\u0001\u0000\u0000"+
		"\u0000\u0010\u00eb\u0001\u0000\u0000\u0000\u0012\u00f0\u0001\u0000\u0000"+
		"\u0000\u0014\u00fd\u0001\u0000\u0000\u0000\u0016\u010c\u0001\u0000\u0000"+
		"\u0000\u0018\u0113\u0001\u0000\u0000\u0000\u001a\u011e\u0001\u0000\u0000"+
		"\u0000\u001c\u0129\u0001\u0000\u0000\u0000\u001e\u0137\u0001\u0000\u0000"+
		"\u0000 \u0175\u0001\u0000\u0000\u0000\"\u017b\u0001\u0000\u0000\u0000"+
		"$\u0183\u0001\u0000\u0000\u0000&\u0188\u0001\u0000\u0000\u0000(\u0190"+
		"\u0001\u0000\u0000\u0000*\u019b\u0001\u0000\u0000\u0000,\u01a2\u0001\u0000"+
		"\u0000\u0000.\u01ac\u0001\u0000\u0000\u00000\u01b0\u0001\u0000\u0000\u0000"+
		"2\u01b6\u0001\u0000\u0000\u00004\u01bc\u0001\u0000\u0000\u00006\u01e0"+
		"\u0001\u0000\u0000\u00008\u01fb\u0001\u0000\u0000\u0000:\u01fd\u0001\u0000"+
		"\u0000\u0000<\u020d\u0001\u0000\u0000\u0000>\u0214\u0001\u0000\u0000\u0000"+
		"@\u021a\u0001\u0000\u0000\u0000B\u021d\u0001\u0000\u0000\u0000D\u0231"+
		"\u0001\u0000\u0000\u0000F\u023a\u0001\u0000\u0000\u0000H\u0242\u0001\u0000"+
		"\u0000\u0000J\u024f\u0001\u0000\u0000\u0000L\u0255\u0001\u0000\u0000\u0000"+
		"N\u0260\u0001\u0000\u0000\u0000P\u0264\u0001\u0000\u0000\u0000R\u026b"+
		"\u0001\u0000\u0000\u0000T\u026e\u0001\u0000\u0000\u0000V\u0270\u0001\u0000"+
		"\u0000\u0000X\u0272\u0001\u0000\u0000\u0000Z\u027e\u0001\u0000\u0000\u0000"+
		"\\\u028c\u0001\u0000\u0000\u0000^\u029a\u0001\u0000\u0000\u0000`\u02ae"+
		"\u0001\u0000\u0000\u0000b\u02b9\u0001\u0000\u0000\u0000d\u02bd\u0001\u0000"+
		"\u0000\u0000f\u02c1\u0001\u0000\u0000\u0000h\u02cd\u0001\u0000\u0000\u0000"+
		"j\u02cf\u0001\u0000\u0000\u0000l\u02d5\u0001\u0000\u0000\u0000n\u02db"+
		"\u0001\u0000\u0000\u0000p\u02e0\u0001\u0000\u0000\u0000r\u02e2\u0001\u0000"+
		"\u0000\u0000t\u02e7\u0001\u0000\u0000\u0000v\u02ea\u0001\u0000\u0000\u0000"+
		"x\u02f8\u0001\u0000\u0000\u0000z\u02fa\u0001\u0000\u0000\u0000|\u0302"+
		"\u0001\u0000\u0000\u0000~\u0304\u0001\u0000\u0000\u0000\u0080\u030c\u0001"+
		"\u0000\u0000\u0000\u0082\u030e\u0001\u0000\u0000\u0000\u0084\u0314\u0001"+
		"\u0000\u0000\u0000\u0086\u031b\u0001\u0000\u0000\u0000\u0088\u0328\u0001"+
		"\u0000\u0000\u0000\u008a\u032d\u0001\u0000\u0000\u0000\u008c\u032f\u0001"+
		"\u0000\u0000\u0000\u008e\u0349\u0001\u0000\u0000\u0000\u0090\u034b\u0001"+
		"\u0000\u0000\u0000\u0092\u034e\u0001\u0000\u0000\u0000\u0094\u0358\u0001"+
		"\u0000\u0000\u0000\u0096\u0368\u0001\u0000\u0000\u0000\u0098\u0375\u0001"+
		"\u0000\u0000\u0000\u009a\u0384\u0001\u0000\u0000\u0000\u009c\u0386\u0001"+
		"\u0000\u0000\u0000\u009e\u0390\u0001\u0000\u0000\u0000\u00a0\u00a3\u0003"+
		"\u0002\u0001\u0000\u00a1\u00a3\u0003Z-\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00ac\u0003T*\u0000\u00a8\u00ab\u0003\u0002\u0001\u0000\u00a9"+
		"\u00ab\u0003Z-\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0001\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0003"+
		"R)\u0000\u00b0\u00b3\u0005\u0006\u0000\u0000\u00b1\u00b4\u0003\u0004\u0002"+
		"\u0000\u00b2\u00b4\u0003\\.\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0003\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u00059\u0000\u0000\u00b6\u00ba\u0005I\u0000\u0000\u00b7\u00b9"+
		"\u0003\u0006\u0003\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005J\u0000\u0000\u00be\u0005\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c3\u0003n7\u0000\u00c0\u00c3\u0003D\"\u0000"+
		"\u00c1\u00c3\u0003\b\u0004\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u0007\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0007\u0000\u0000\u00c5"+
		"\u00c6\u0005!\u0000\u0000\u00c6\u00c7\u0005\"\u0000\u0000\u00c7\u00c8"+
		"\u0005K\u0000\u0000\u00c8\u00c9\u0005$\u0000\u0000\u00c9\u00ca\u0005%"+
		"\u0000\u0000\u00ca\u00cb\u0005L\u0000\u0000\u00cb\u00cf\u0005I\u0000\u0000"+
		"\u00cc\u00ce\u0003\n\u0005\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005J\u0000\u0000\u00d3\t"+
		"\u0001\u0000\u0000\u0000\u00d4\u00dc\u0005\u0005\u0000\u0000\u00d5\u00dd"+
		"\u0003\f\u0006\u0000\u00d6\u00d8\u0003H$\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00d5\u0001\u0000"+
		"\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd\u000b\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005&\u0000\u0000\u00df\u00e0\u0005K\u0000\u0000"+
		"\u00e0\u00e1\u0003\u000e\u0007\u0000\u00e1\u00e2\u0005L\u0000\u0000\u00e2"+
		"\u00e3\u0005E\u0000\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4\u00e8"+
		"\u0003\u0010\b\u0000\u00e5\u00e7\u0003\u0012\t\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u000f\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\'\u0000\u0000\u00ec\u00ed\u0005G\u0000\u0000\u00ed\u00ee\u0005(\u0000"+
		"\u0000\u00ee\u00ef\u0005H\u0000\u0000\u00ef\u0011\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005)\u0000\u0000\u00f1\u00fb\u0005G\u0000\u0000\u00f2\u00fc"+
		"\u0003>\u001f\u0000\u00f3\u00fc\u0003<\u001e\u0000\u00f4\u00fc\u00034"+
		"\u001a\u0000\u00f5\u00fc\u00032\u0019\u0000\u00f6\u00fc\u0003,\u0016\u0000"+
		"\u00f7\u00fc\u0003:\u001d\u0000\u00f8\u00fc\u0003\u001e\u000f\u0000\u00f9"+
		"\u00fc\u0003\u001c\u000e\u0000\u00fa\u00fc\u0003\u0016\u000b\u0000\u00fb"+
		"\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f4\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u0013\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005B\u0000\u0000\u00fe\u00ff\u0005F\u0000\u0000\u00ff\u0100\u0005"+
		"X\u0000\u0000\u0100\u0101\u0005K\u0000\u0000\u0101\u0102\u0005%\u0000"+
		"\u0000\u0102\u0103\u0005L\u0000\u0000\u0103\u0104\u0005F\u0000\u0000\u0104"+
		"\u0105\u0003\u0080@\u0000\u0105\u0106\u0005K\u0000\u0000\u0106\u0107\u0003"+
		"\u0080@\u0000\u0107\u0108\u0005F\u0000\u0000\u0108\u0109\u0003\u0080@"+
		"\u0000\u0109\u010a\u0005L\u0000\u0000\u010a\u010b\u0005E\u0000\u0000\u010b"+
		"\u0015\u0001\u0000\u0000\u0000\u010c\u010d\u00055\u0000\u0000\u010d\u010e"+
		"\u0005K\u0000\u0000\u010e\u010f\u0003\u0018\f\u0000\u010f\u0110\u0003"+
		"\u0012\t\u0000\u0110\u0111\u0005L\u0000\u0000\u0111\u0112\u0005H\u0000"+
		"\u0000\u0112\u0017\u0001\u0000\u0000\u0000\u0113\u0114\u0005(\u0000\u0000"+
		"\u0114\u0115\u0005G\u0000\u0000\u0115\u0116\u0005K\u0000\u0000\u0116\u0117"+
		"\u0005L\u0000\u0000\u0117\u0119\u0005I\u0000\u0000\u0118\u011a\u0003\u0014"+
		"\n\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005J\u0000\u0000"+
		"\u011c\u011d\u0005H\u0000\u0000\u011d\u0019\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u00054\u0000\u0000\u011f\u0120\u0005G\u0000\u0000\u0120\u0121\u0005"+
		"Y\u0000\u0000\u0121\u0127\u0005H\u0000\u0000\u0122\u0123\u00050\u0000"+
		"\u0000\u0123\u0124\u0005G\u0000\u0000\u0124\u0125\u0005Y\u0000\u0000\u0125"+
		"\u0126\u0005H\u0000\u0000\u0126\u0128\u0003\u0012\t\u0000\u0127\u0122"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u001b"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0010\u0000\u0000\u012a\u012b"+
		"\u0005K\u0000\u0000\u012b\u012c\u0005X\u0000\u0000\u012c\u012d\u0005F"+
		"\u0000\u0000\u012d\u012e\u0003\u0080@\u0000\u012e\u0132\u0005H\u0000\u0000"+
		"\u012f\u0130\u0005\u0011\u0000\u0000\u0130\u0131\u0005G\u0000\u0000\u0131"+
		"\u0133\u0005Y\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005L\u0000\u0000\u0135\u0136\u0005H\u0000\u0000\u0136\u001d\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005\r\u0000\u0000\u0138\u0139\u0005K\u0000"+
		"\u0000\u0139\u013a\u0005X\u0000\u0000\u013a\u013b\u0005G\u0000\u0000\u013b"+
		"\u013c\u0003\u0080@\u0000\u013c\u013d\u0005F\u0000\u0000\u013d\u013e\u0003"+
		"\u0080@\u0000\u013e\u013f\u0005H\u0000\u0000\u013f\u0140\u0005\u000e\u0000"+
		"\u0000\u0140\u0144\u0005G\u0000\u0000\u0141\u0142\u0005\t\u0000\u0000"+
		"\u0142\u0143\u0005!\u0000\u0000\u0143\u0145\u0005\n\u0000\u0000\u0144"+
		"\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u016e\u0005M\u0000\u0000\u0147\u016f"+
		"\u0003>\u001f\u0000\u0148\u014a\u0003(\u0014\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0152\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0003&\u0013\u0000\u014c\u014d\u0005H\u0000\u0000"+
		"\u014d\u014e\u00034\u001a\u0000\u014e\u014f\u0005H\u0000\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0151\u0154"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0165\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0003,\u0016\u0000\u0156\u0155\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0161\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u00034\u001a\u0000\u0159\u015d\u0005H\u0000"+
		"\u0000\u015a\u015b\u0003&\u0013\u0000\u015b\u015c\u0005H\u0000\u0000\u015c"+
		"\u015e\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f"+
		"\u0158\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164"+
		"\u0149\u0001\u0000\u0000\u0000\u0164\u0156\u0001\u0000\u0000\u0000\u0165"+
		"\u016f\u0001\u0000\u0000\u0000\u0166\u0167\u0003 \u0010\u0000\u0167\u0168"+
		"\u0003 \u0010\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u016b\u0003"+
		"\u0018\f\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0003\u0012"+
		"\t\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0147\u0001\u0000\u0000"+
		"\u0000\u016e\u0164\u0001\u0000\u0000\u0000\u016e\u0166\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0005N\u0000\u0000"+
		"\u0171\u0172\u0005H\u0000\u0000\u0172\u0173\u0005L\u0000\u0000\u0173\u0174"+
		"\u0005H\u0000\u0000\u0174\u001f\u0001\u0000\u0000\u0000\u0175\u0176\u0005"+
		"+\u0000\u0000\u0176\u0177\u0005K\u0000\u0000\u0177\u0178\u00038\u001c"+
		"\u0000\u0178\u0179\u0005L\u0000\u0000\u0179\u017a\u0005H\u0000\u0000\u017a"+
		"!\u0001\u0000\u0000\u0000\u017b\u017c\u0005,\u0000\u0000\u017c\u017d\u0005"+
		"G\u0000\u0000\u017d\u017e\u0005-\u0000\u0000\u017e\u017f\u0005K\u0000"+
		"\u0000\u017f\u0180\u0003$\u0012\u0000\u0180\u0181\u0005L\u0000\u0000\u0181"+
		"\u0182\u0005H\u0000\u0000\u0182#\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		"2\u0000\u0000\u0184\u0185\u0005G\u0000\u0000\u0185\u0186\u0005P\u0000"+
		"\u0000\u0186\u0187\u0005H\u0000\u0000\u0187%\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u00051\u0000\u0000\u0189\u018a\u0005K\u0000\u0000\u018a\u018b\u0005"+
		"0\u0000\u0000\u018b\u018c\u0005G\u0000\u0000\u018c\u018d\u0005Y\u0000"+
		"\u0000\u018d\u018e\u0005H\u0000\u0000\u018e\u018f\u0005L\u0000\u0000\u018f"+
		"\'\u0001\u0000\u0000\u0000\u0190\u0191\u0005\f\u0000\u0000\u0191\u0192"+
		"\u0005K\u0000\u0000\u0192\u0193\u0003*\u0015\u0000\u0193\u0194\u0003\u0012"+
		"\t\u0000\u0194\u0195\u0005\u0012\u0000\u0000\u0195\u0196\u0005G\u0000"+
		"\u0000\u0196\u0197\u0005Y\u0000\u0000\u0197\u0198\u0005H\u0000\u0000\u0198"+
		"\u0199\u0005L\u0000\u0000\u0199\u019a\u0005H\u0000\u0000\u019a)\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0005\u000f\u0000\u0000\u019c\u019d\u0005"+
		"G\u0000\u0000\u019d\u019e\u0003\u0080@\u0000\u019e\u019f\u0005F\u0000"+
		"\u0000\u019f\u01a0\u0005X\u0000\u0000\u01a0\u01a1\u0005H\u0000\u0000\u01a1"+
		"+\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u001e\u0000\u0000\u01a3\u01a4"+
		"\u0005K\u0000\u0000\u01a4\u01a5\u0007\u0000\u0000\u0000\u01a5\u01a7\u0005"+
		"H\u0000\u0000\u01a6\u01a8\u0003.\u0017\u0000\u01a7\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005L\u0000\u0000\u01aa\u01ab\u0005H\u0000\u0000\u01ab"+
		"-\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u001f\u0000\u0000\u01ad\u01ae"+
		"\u0005G\u0000\u0000\u01ae\u01af\u00030\u0018\u0000\u01af/\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005 \u0000\u0000\u01b1\u01b2\u0005K\u0000\u0000"+
		"\u01b2\u01b3\u0003P(\u0000\u01b3\u01b4\u0005L\u0000\u0000\u01b4\u01b5"+
		"\u0005H\u0000\u0000\u01b51\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005?"+
		"\u0000\u0000\u01b7\u01b8\u0005K\u0000\u0000\u01b8\u01b9\u0003\u0012\t"+
		"\u0000\u01b9\u01ba\u0005L\u0000\u0000\u01ba\u01bb\u0005H\u0000\u0000\u01bb"+
		"3\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005/\u0000\u0000\u01bd\u01c1\u0005"+
		"K\u0000\u0000\u01be\u01c0\u00036\u001b\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005L\u0000\u0000"+
		"\u01c55\u0001\u0000\u0000\u0000\u01c6\u01c7\u00050\u0000\u0000\u01c7\u01c8"+
		"\u0005G\u0000\u0000\u01c8\u01c9\u0005Y\u0000\u0000\u01c9\u01e1\u0005H"+
		"\u0000\u0000\u01ca\u01cb\u00057\u0000\u0000\u01cb\u01cc\u0005G\u0000\u0000"+
		"\u01cc\u01cd\u0005X\u0000\u0000\u01cd\u01ce\u0005F\u0000\u0000\u01ce\u01cf"+
		"\u0005X\u0000\u0000\u01cf\u01d0\u0005H\u0000\u0000\u01d0\u01d1\u0003\u0012"+
		"\t\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005H\u0000"+
		"\u0000\u01d3\u01e1\u0001\u0000\u0000\u0000\u01d4\u01e1\u0003\u001a\r\u0000"+
		"\u01d5\u01d7\u0003P(\u0000\u01d6\u01d8\u0003\u0012\t\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0003\u001a\r\u0000\u01da\u01d9\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01e1\u0001"+
		"\u0000\u0000\u0000\u01dc\u01e1\u00038\u001c\u0000\u01dd\u01de\u0003\u0018"+
		"\f\u0000\u01de\u01df\u0003\u0012\t\u0000\u01df\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e0\u01c6\u0001\u0000\u0000\u0000\u01e0\u01ca\u0001\u0000\u0000"+
		"\u0000\u01e0\u01d4\u0001\u0000\u0000\u0000\u01e0\u01d5\u0001\u0000\u0000"+
		"\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e17\u0001\u0000\u0000\u0000\u01e2\u01fc\u0003\"\u0011\u0000"+
		"\u01e3\u01e4\u0005,\u0000\u0000\u01e4\u01e5\u0005G\u0000\u0000\u01e5\u01e6"+
		"\u00053\u0000\u0000\u01e6\u01e7\u0005K\u0000\u0000\u01e7\u01e8\u00056"+
		"\u0000\u0000\u01e8\u01e9\u0005G\u0000\u0000\u01e9\u01ea\u0005X\u0000\u0000"+
		"\u01ea\u01eb\u0005F\u0000\u0000\u01eb\u01ec\u0003\u0080@\u0000\u01ec\u01ed"+
		"\u0005K\u0000\u0000\u01ed\u01ee\u0003P(\u0000\u01ee\u01ef\u0005L\u0000"+
		"\u0000\u01ef\u01f0\u0005L\u0000\u0000\u01f0\u01f1\u0005H\u0000\u0000\u01f1"+
		"\u01f2\u00054\u0000\u0000\u01f2\u01f3\u0005G\u0000\u0000\u01f3\u01f4\u0005"+
		"Y\u0000\u0000\u01f4\u01f5\u0005H\u0000\u0000\u01f5\u01f6\u00050\u0000"+
		"\u0000\u01f6\u01f7\u0005G\u0000\u0000\u01f7\u01f8\u0005Y\u0000\u0000\u01f8"+
		"\u01f9\u0005H\u0000\u0000\u01f9\u01fa\u0003\u0012\t\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01e2\u0001\u0000\u0000\u0000\u01fb\u01e3"+
		"\u0001\u0000\u0000\u0000\u01fc9\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005"+
		"X\u0000\u0000\u01fe\u01ff\u0005F\u0000\u0000\u01ff\u0200\u0005X\u0000"+
		"\u0000\u0200\u0201\u0005K\u0000\u0000\u0201\u0202\u0005Q\u0000\u0000\u0202"+
		"\u0203\u0005H\u0000\u0000\u0203\u0204\u0005#\u0000\u0000\u0204\u0205\u0005"+
		"G\u0000\u0000\u0205\u0206\u0005X\u0000\u0000\u0206\u0207\u0005F\u0000"+
		"\u0000\u0207\u0208\u0005X\u0000\u0000\u0208\u0209\u0005H\u0000\u0000\u0209"+
		"\u020a\u0005L\u0000\u0000\u020a\u020b\u0005H\u0000\u0000\u020b\u020c\u0003"+
		"\u0012\t\u0000\u020c;\u0001\u0000\u0000\u0000\u020d\u020e\u00058\u0000"+
		"\u0000\u020e\u020f\u0005K\u0000\u0000\u020f\u0210\u0003\u0012\t\u0000"+
		"\u0210\u0211\u0005H\u0000\u0000\u0211\u0212\u0005L\u0000\u0000\u0212\u0213"+
		"\u0005H\u0000\u0000\u0213=\u0001\u0000\u0000\u0000\u0214\u0215\u0005."+
		"\u0000\u0000\u0215\u0216\u0005K\u0000\u0000\u0216\u0217\u0003@ \u0000"+
		"\u0217\u0218\u0005L\u0000\u0000\u0218\u0219\u0005H\u0000\u0000\u0219?"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0003B!\u0000\u021b\u021c\u0003\u0012"+
		"\t\u0000\u021cA\u0001\u0000\u0000\u0000\u021d\u021e\u0005*\u0000\u0000"+
		"\u021e\u0220\u0005G\u0000\u0000\u021f\u0221\u0005D\u0000\u0000\u0220\u021f"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0005X\u0000\u0000\u0223\u0224\u0005"+
		"F\u0000\u0000\u0224\u0225\u0005X\u0000\u0000\u0225\u022c\u0005K\u0000"+
		"\u0000\u0226\u022d\u0005Y\u0000\u0000\u0227\u0228\u0005X\u0000\u0000\u0228"+
		"\u0229\u0005G\u0000\u0000\u0229\u022a\u0005Y\u0000\u0000\u022a\u022b\u0005"+
		"F\u0000\u0000\u022b\u022d\u0005Y\u0000\u0000\u022c\u0226\u0001\u0000\u0000"+
		"\u0000\u022c\u0227\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0005L\u0000\u0000\u022f\u0230\u0005H\u0000\u0000\u0230"+
		"C\u0001\u0000\u0000\u0000\u0231\u0232\u0005D\u0000\u0000\u0232\u0233\u0005"+
		"X\u0000\u0000\u0233\u0234\u0005K\u0000\u0000\u0234\u0235\u0005I\u0000"+
		"\u0000\u0235\u0236\u0003F#\u0000\u0236\u0237\u0005J\u0000\u0000\u0237"+
		"\u0238\u0005L\u0000\u0000\u0238\u0239\u0005E\u0000\u0000\u0239E\u0001"+
		"\u0000\u0000\u0000\u023a\u023f\u0003x<\u0000\u023b\u023c\u0005H\u0000"+
		"\u0000\u023c\u023e\u0003x<\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e"+
		"\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f"+
		"\u0240\u0001\u0000\u0000\u0000\u0240G\u0001\u0000\u0000\u0000\u0241\u023f"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0005<\u0000\u0000\u0243\u0245\u0005"+
		"K\u0000\u0000\u0244\u0246\u0003L&\u0000\u0245\u0244\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0003J%\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249"+
		"\u024b\u0005H\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b"+
		"\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024d"+
		"\u0005L\u0000\u0000\u024d\u024e\u0005E\u0000\u0000\u024eI\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0005\u000b\u0000\u0000\u0250\u0253\u0005G\u0000"+
		"\u0000\u0251\u0254\u00032\u0019\u0000\u0252\u0254\u0003>\u001f\u0000\u0253"+
		"\u0251\u0001\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254"+
		"K\u0001\u0000\u0000\u0000\u0255\u0256\u0005\u0013\u0000\u0000\u0256\u0257"+
		"\u0005G\u0000\u0000\u0257\u0258\u0005=\u0000\u0000\u0258\u025b\u0005K"+
		"\u0000\u0000\u0259\u025c\u0003N\'\u0000\u025a\u025c\u0003,\u0016\u0000"+
		"\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0005L\u0000\u0000\u025e"+
		"\u025f\u0005H\u0000\u0000\u025fM\u0001\u0000\u0000\u0000\u0260\u0261\u0005"+
		"\u0014\u0000\u0000\u0261\u0262\u0005G\u0000\u0000\u0262\u0263\u0003,\u0016"+
		"\u0000\u0263O\u0001\u0000\u0000\u0000\u0264\u0265\u0005>\u0000\u0000\u0265"+
		"\u0266\u0005G\u0000\u0000\u0266\u0267\u0005X\u0000\u0000\u0267\u0268\u0005"+
		"F\u0000\u0000\u0268\u0269\u0005X\u0000\u0000\u0269\u026a\u0005H\u0000"+
		"\u0000\u026aQ\u0001\u0000\u0000\u0000\u026b\u026c\u0005\u0003\u0000\u0000"+
		"\u026c\u026d\u0005X\u0000\u0000\u026dS\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0003V+\u0000\u026fU\u0001\u0000\u0000\u0000\u0270\u0271\u0003X,\u0000"+
		"\u0271W\u0001\u0000\u0000\u0000\u0272\u0273\u0005\u0001\u0000\u0000\u0273"+
		"\u0274\u0005K\u0000\u0000\u0274\u0275\u0005L\u0000\u0000\u0275\u0279\u0005"+
		"I\u0000\u0000\u0276\u0278\u0003h4\u0000\u0277\u0276\u0001\u0000\u0000"+
		"\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027c\u0001\u0000\u0000"+
		"\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u027d\u0005J\u0000\u0000"+
		"\u027dY\u0001\u0000\u0000\u0000\u027e\u0281\u0003R)\u0000\u027f\u0280"+
		"\u0005\u0006\u0000\u0000\u0280\u0282\u0005X\u0000\u0000\u0281\u027f\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001"+
		"\u0000\u0000\u0000\u0283\u0287\u0005I\u0000\u0000\u0284\u0286\u0003b1"+
		"\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000"+
		"\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0005J\u0000\u0000\u028b[\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0005X\u0000\u0000\u028d\u028e\u0005\t\u0000\u0000\u028e\u028f"+
		"\u0003\u0080@\u0000\u028f\u0290\u0005\n\u0000\u0000\u0290\u0294\u0005"+
		"I\u0000\u0000\u0291\u0293\u0003\u0006\u0003\u0000\u0292\u0291\u0001\u0000"+
		"\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0297\u0001\u0000"+
		"\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u0298\u0005J\u0000"+
		"\u0000\u0298]\u0001\u0000\u0000\u0000\u0299\u029b\u0005\u0007\u0000\u0000"+
		"\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
		"\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0003d2\u0000\u029d\u029f"+
		"\u0005K\u0000\u0000\u029e\u02a0\u0003`0\u0000\u029f\u029e\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0005L\u0000\u0000\u02a2\u02a6\u0005I\u0000\u0000"+
		"\u02a3\u02a5\u0003h4\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003f3\u0000\u02aa\u02a9\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0005J\u0000\u0000\u02ad_\u0001\u0000\u0000\u0000"+
		"\u02ae\u02b3\u0003x<\u0000\u02af\u02b0\u0005H\u0000\u0000\u02b0\u02b2"+
		"\u0003x<\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b4a\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b6\u02ba\u0003n7\u0000\u02b7\u02ba\u0003l6\u0000\u02b8\u02ba"+
		"\u0003^/\u0000\u02b9\u02b6\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02bac\u0001\u0000\u0000"+
		"\u0000\u02bb\u02be\u0005\u0001\u0000\u0000\u02bc\u02be\u0003\u0080@\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005X\u0000\u0000\u02c0"+
		"e\u0001\u0000\u0000\u0000\u02c1\u02c4\u0005\u0005\u0000\u0000\u02c2\u02c5"+
		"\u0005X\u0000\u0000\u02c3\u02c5\u0003\u0086C\u0000\u02c4\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c5g\u0001\u0000\u0000"+
		"\u0000\u02c6\u02ce\u0003n7\u0000\u02c7\u02ce\u0003l6\u0000\u02c8\u02ce"+
		"\u0003\u0086C\u0000\u02c9\u02ce\u0003\u008aE\u0000\u02ca\u02ce\u0003\u0088"+
		"D\u0000\u02cb\u02ce\u0003j5\u0000\u02cc\u02ce\u0003\u0084B\u0000\u02cd"+
		"\u02c6\u0001\u0000\u0000\u0000\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd"+
		"\u02c8\u0001\u0000\u0000\u0000\u02cd\u02c9\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ca\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cei\u0001\u0000\u0000\u0000\u02cf\u02d0"+
		"\u0005\b\u0000\u0000\u02d0\u02d1\u0005K\u0000\u0000\u02d1\u02d2\u0007"+
		"\u0001\u0000\u0000\u02d2\u02d3\u0005L\u0000\u0000\u02d3\u02d4\u0005E\u0000"+
		"\u0000\u02d4k\u0001\u0000\u0000\u0000\u02d5\u02d6\u0003x<\u0000\u02d6"+
		"\u02d7\u0005M\u0000\u0000\u02d7\u02d8\u0007\u0002\u0000\u0000\u02d8\u02d9"+
		"\u0005N\u0000\u0000\u02d9\u02da\u0005E\u0000\u0000\u02dam\u0001\u0000"+
		"\u0000\u0000\u02db\u02dc\u0003x<\u0000\u02dc\u02dd\u0005E\u0000\u0000"+
		"\u02ddo\u0001\u0000\u0000\u0000\u02de\u02e1\u0003r9\u0000\u02df\u02e1"+
		"\u0005T\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02df\u0001"+
		"\u0000\u0000\u0000\u02e1q\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005U\u0000"+
		"\u0000\u02e3\u02e5\u0003v;\u0000\u02e4\u02e6\u0003t:\u0000\u02e5\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6s\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0005R\u0000\u0000\u02e8\u02e9\u0003\u009a"+
		"M\u0000\u02e9u\u0001\u0000\u0000\u0000\u02ea\u02eb\u0007\u0003\u0000\u0000"+
		"\u02ebw\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003z=\u0000\u02ed\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f1"+
		"\u0001\u0000\u0000\u0000\u02ef\u02f2\u0005\u0002\u0000\u0000\u02f0\u02f2"+
		"\u0003\u0080@\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f9\u0005X\u0000\u0000\u02f4\u02f5\u0005:\u0000"+
		"\u0000\u02f5\u02f6\u0005;\u0000\u0000\u02f6\u02f7\u0005F\u0000\u0000\u02f7"+
		"\u02f9\u0005X\u0000\u0000\u02f8\u02ed\u0001\u0000\u0000\u0000\u02f8\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f9y\u0001\u0000\u0000\u0000\u02fa\u02fb\u0007"+
		"\u0004\u0000\u0000\u02fb{\u0001\u0000\u0000\u0000\u02fc\u0303\u0005X\u0000"+
		"\u0000\u02fd\u0303\u0005O\u0000\u0000\u02fe\u0303\u0005P\u0000\u0000\u02ff"+
		"\u0303\u0005Q\u0000\u0000\u0300\u0303\u0003\u0082A\u0000\u0301\u0303\u0003"+
		"\u0086C\u0000\u0302\u02fc\u0001\u0000\u0000\u0000\u0302\u02fd\u0001\u0000"+
		"\u0000\u0000\u0302\u02fe\u0001\u0000\u0000\u0000\u0302\u02ff\u0001\u0000"+
		"\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0301\u0001\u0000"+
		"\u0000\u0000\u0303}\u0001\u0000\u0000\u0000\u0304\u0309\u0003|>\u0000"+
		"\u0305\u0306\u0005H\u0000\u0000\u0306\u0308\u0003|>\u0000\u0307\u0305"+
		"\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u030a\u007f"+
		"\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0005X\u0000\u0000\u030d\u0081\u0001\u0000\u0000\u0000\u030e\u030f\u0005"+
		"X\u0000\u0000\u030f\u0312\u0005G\u0000\u0000\u0310\u0313\u0003\u0086C"+
		"\u0000\u0311\u0313\u0003\u0084B\u0000\u0312\u0310\u0001\u0000\u0000\u0000"+
		"\u0312\u0311\u0001\u0000\u0000\u0000\u0313\u0083\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0005X\u0000\u0000\u0315\u0318\u0005F\u0000\u0000\u0316\u0319"+
		"\u0003\u0080@\u0000\u0317\u0319\u0003\u0086C\u0000\u0318\u0316\u0001\u0000"+
		"\u0000\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0319\u0085\u0001\u0000"+
		"\u0000\u0000\u031a\u031c\u0005X\u0000\u0000\u031b\u031a\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0003\u0080@\u0000\u031e\u0320\u0005K\u0000\u0000\u031f"+
		"\u0321\u0003~?\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320\u0321\u0001"+
		"\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0324\u0005"+
		"L\u0000\u0000\u0323\u0325\u0005E\u0000\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0087\u0001\u0000\u0000"+
		"\u0000\u0326\u0329\u0003\u008cF\u0000\u0327\u0329\u0003\u0090H\u0000\u0328"+
		"\u0326\u0001\u0000\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0329"+
		"\u0089\u0001\u0000\u0000\u0000\u032a\u032e\u0003\u0094J\u0000\u032b\u032e"+
		"\u0003\u0096K\u0000\u032c\u032e\u0003\u0098L\u0000\u032d\u032a\u0001\u0000"+
		"\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d\u032c\u0001\u0000"+
		"\u0000\u0000\u032e\u008b\u0001\u0000\u0000\u0000\u032f\u0330\u0005\u0015"+
		"\u0000\u0000\u0330\u0331\u0005K\u0000\u0000\u0331\u0336\u0003\u008eG\u0000"+
		"\u0332\u0333\u0005\u001d\u0000\u0000\u0333\u0335\u0003\u008eG\u0000\u0334"+
		"\u0332\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336"+
		"\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337"+
		"\u0339\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0005L\u0000\u0000\u033a\u033e\u0005I\u0000\u0000\u033b\u033d\u0003"+
		"h4\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033d\u0340\u0001\u0000\u0000"+
		"\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000"+
		"\u0000\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000"+
		"\u0000\u0341\u0342\u0005J\u0000\u0000\u0342\u008d\u0001\u0000\u0000\u0000"+
		"\u0343\u0344\u0005\u001c\u0000\u0000\u0344\u034a\u0005X\u0000\u0000\u0345"+
		"\u034a\u0005X\u0000\u0000\u0346\u034a\u0005\u0017\u0000\u0000\u0347\u034a"+
		"\u0005\u0018\u0000\u0000\u0348\u034a\u0003\u009cN\u0000\u0349\u0343\u0001"+
		"\u0000\u0000\u0000\u0349\u0345\u0001\u0000\u0000\u0000\u0349\u0346\u0001"+
		"\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u0348\u0001"+
		"\u0000\u0000\u0000\u034a\u008f\u0001\u0000\u0000\u0000\u034b\u034c\u0003"+
		"\u008cF\u0000\u034c\u034d\u0003\u0092I\u0000\u034d\u0091\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0005\u001a\u0000\u0000\u034f\u0353\u0005I\u0000\u0000"+
		"\u0350\u0352\u0003h4\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0352\u0355"+
		"\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0354"+
		"\u0001\u0000\u0000\u0000\u0354\u0356\u0001\u0000\u0000\u0000\u0355\u0353"+
		"\u0001\u0000\u0000\u0000\u0356\u0357\u0005J\u0000\u0000\u0357\u0093\u0001"+
		"\u0000\u0000\u0000\u0358\u0359\u0005\u0016\u0000\u0000\u0359\u035a\u0005"+
		"K\u0000\u0000\u035a\u035b\u0003n7\u0000\u035b\u035c\u0003\u009cN\u0000"+
		"\u035c\u035d\u0005E\u0000\u0000\u035d\u035e\u0003\u009eO\u0000\u035e\u035f"+
		"\u0005L\u0000\u0000\u035f\u0363\u0005I\u0000\u0000\u0360\u0362\u0003h"+
		"4\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000"+
		"\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000"+
		"\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u0005J\u0000\u0000\u0367\u0095\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0005\u001b\u0000\u0000\u0369\u036a\u0005K\u0000\u0000\u036a"+
		"\u036b\u0003\u009cN\u0000\u036b\u036c\u0005L\u0000\u0000\u036c\u0370\u0005"+
		"I\u0000\u0000\u036d\u036f\u0003h4\u0000\u036e\u036d\u0001\u0000\u0000"+
		"\u0000\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0373\u0001\u0000\u0000"+
		"\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0374\u0005J\u0000\u0000"+
		"\u0374\u0097\u0001\u0000\u0000\u0000\u0375\u0376\u0005\u0016\u0000\u0000"+
		"\u0376\u0377\u0005K\u0000\u0000\u0377\u0378\u0003x<\u0000\u0378\u0379"+
		"\u0005\u0019\u0000\u0000\u0379\u037a\u0005X\u0000\u0000\u037a\u037b\u0005"+
		"L\u0000\u0000\u037b\u037f\u0005I\u0000\u0000\u037c\u037e\u0003h4\u0000"+
		"\u037d\u037c\u0001\u0000\u0000\u0000\u037e\u0381\u0001\u0000\u0000\u0000"+
		"\u037f\u037d\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000"+
		"\u0380\u0382\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000"+
		"\u0382\u0383\u0005J\u0000\u0000\u0383\u0099\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0007\u0002\u0000\u0000\u0385\u009b\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0003\u009aM\u0000\u0387\u0388\u0005V\u0000\u0000\u0388\u0389\u0003"+
		"\u009aM\u0000\u0389\u009d\u0001\u0000\u0000\u0000\u038a\u038b\u0003\u009a"+
		"M\u0000\u038b\u038c\u0005S\u0000\u0000\u038c\u038d\u0003\u009aM\u0000"+
		"\u038d\u0391\u0001\u0000\u0000\u0000\u038e\u038f\u0005X\u0000\u0000\u038f"+
		"\u0391\u0005T\u0000\u0000\u0390\u038a\u0001\u0000\u0000\u0000\u0390\u038e"+
		"\u0001\u0000\u0000\u0000\u0391\u009f\u0001\u0000\u0000\u0000H\u00a2\u00a4"+
		"\u00aa\u00ac\u00b3\u00ba\u00c2\u00cf\u00d9\u00dc\u00e8\u00fb\u0119\u0127"+
		"\u0132\u0144\u0149\u0152\u0156\u015d\u0161\u0164\u016a\u016e\u01a7\u01c1"+
		"\u01d7\u01da\u01e0\u01fb\u0220\u022c\u023f\u0245\u024a\u0253\u025b\u0279"+
		"\u0281\u0287\u0294\u029a\u029f\u02a6\u02aa\u02b3\u02b9\u02bd\u02c4\u02cd"+
		"\u02e0\u02e5\u02ed\u02f1\u02f8\u0302\u0309\u0312\u0318\u031b\u0320\u0324"+
		"\u0328\u032d\u0336\u033e\u0349\u0353\u0363\u0370\u037f\u0390";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}