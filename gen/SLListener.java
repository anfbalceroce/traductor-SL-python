// Generated from C:/Users/Platez/Documents/UN/Sistemas/2022-1/lenguajes/traductor/grammar\SL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLParser}.
 */
public interface SLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SLParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SLParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(SLParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(SLParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(SLParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(SLParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_id}.
	 * @param ctx the parse tree
	 */
	void enterNext_id(SLParser.Next_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_id}.
	 * @param ctx the parse tree
	 */
	void exitNext_id(SLParser.Next_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_var}.
	 * @param ctx the parse tree
	 */
	void enterNext_var(SLParser.Next_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_var}.
	 * @param ctx the parse tree
	 */
	void exitNext_var(SLParser.Next_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#const_list}.
	 * @param ctx the parse tree
	 */
	void enterConst_list(SLParser.Const_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#const_list}.
	 * @param ctx the parse tree
	 */
	void exitConst_list(SLParser.Const_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(SLParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(SLParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_const}.
	 * @param ctx the parse tree
	 */
	void enterNext_const(SLParser.Next_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_const}.
	 * @param ctx the parse tree
	 */
	void exitNext_const(SLParser.Next_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipos_list}.
	 * @param ctx the parse tree
	 */
	void enterTipos_list(SLParser.Tipos_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipos_list}.
	 * @param ctx the parse tree
	 */
	void exitTipos_list(SLParser.Tipos_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_p}.
	 * @param ctx the parse tree
	 */
	void enterTipo_p(SLParser.Tipo_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_p}.
	 * @param ctx the parse tree
	 */
	void exitTipo_p(SLParser.Tipo_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_tipo_p}.
	 * @param ctx the parse tree
	 */
	void enterNext_tipo_p(SLParser.Next_tipo_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_tipo_p}.
	 * @param ctx the parse tree
	 */
	void exitNext_tipo_p(SLParser.Next_tipo_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sep_opt}.
	 * @param ctx the parse tree
	 */
	void enterSep_opt(SLParser.Sep_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sep_opt}.
	 * @param ctx the parse tree
	 */
	void exitSep_opt(SLParser.Sep_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sent_sep}.
	 * @param ctx the parse tree
	 */
	void enterSent_sep(SLParser.Sent_sepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sent_sep}.
	 * @param ctx the parse tree
	 */
	void exitSent_sep(SLParser.Sent_sepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(SLParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(SLParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterNext_sentencia(SLParser.Next_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitNext_sentencia(SLParser.Next_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#assng_call}.
	 * @param ctx the parse tree
	 */
	void enterAssng_call(SLParser.Assng_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#assng_call}.
	 * @param ctx the parse tree
	 */
	void exitAssng_call(SLParser.Assng_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#for_start}.
	 * @param ctx the parse tree
	 */
	void enterFor_start(SLParser.For_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#for_start}.
	 * @param ctx the parse tree
	 */
	void exitFor_start(SLParser.For_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#for_end}.
	 * @param ctx the parse tree
	 */
	void enterFor_end(SLParser.For_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#for_end}.
	 * @param ctx the parse tree
	 */
	void exitFor_end(SLParser.For_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#for_step}.
	 * @param ctx the parse tree
	 */
	void enterFor_step(SLParser.For_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#for_step}.
	 * @param ctx the parse tree
	 */
	void exitFor_step(SLParser.For_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(SLParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(SLParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sino_p}.
	 * @param ctx the parse tree
	 */
	void enterSino_p(SLParser.Sino_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sino_p}.
	 * @param ctx the parse tree
	 */
	void exitSino_p(SLParser.Sino_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sino_pp}.
	 * @param ctx the parse tree
	 */
	void enterSino_pp(SLParser.Sino_ppContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sino_pp}.
	 * @param ctx the parse tree
	 */
	void exitSino_pp(SLParser.Sino_ppContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sent_sep_sino}.
	 * @param ctx the parse tree
	 */
	void enterSent_sep_sino(SLParser.Sent_sep_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sent_sep_sino}.
	 * @param ctx the parse tree
	 */
	void exitSent_sep_sino(SLParser.Sent_sep_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentenciasnoif}.
	 * @param ctx the parse tree
	 */
	void enterSentenciasnoif(SLParser.SentenciasnoifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentenciasnoif}.
	 * @param ctx the parse tree
	 */
	void exitSentenciasnoif(SLParser.SentenciasnoifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencianoif}.
	 * @param ctx the parse tree
	 */
	void enterSentencianoif(SLParser.SentencianoifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencianoif}.
	 * @param ctx the parse tree
	 */
	void exitSentencianoif(SLParser.SentencianoifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentenciasif}.
	 * @param ctx the parse tree
	 */
	void enterSentenciasif(SLParser.SentenciasifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentenciasif}.
	 * @param ctx the parse tree
	 */
	void exitSentenciasif(SLParser.SentenciasifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(SLParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(SLParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sw_sino}.
	 * @param ctx the parse tree
	 */
	void enterSw_sino(SLParser.Sw_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sw_sino}.
	 * @param ctx the parse tree
	 */
	void exitSw_sino(SLParser.Sw_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#assingment}.
	 * @param ctx the parse tree
	 */
	void enterAssingment(SLParser.AssingmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#assingment}.
	 * @param ctx the parse tree
	 */
	void exitAssingment(SLParser.AssingmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#assingment_p}.
	 * @param ctx the parse tree
	 */
	void enterAssingment_p(SLParser.Assingment_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#assingment_p}.
	 * @param ctx the parse tree
	 */
	void exitAssingment_p(SLParser.Assingment_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#m_expresion}.
	 * @param ctx the parse tree
	 */
	void enterM_expresion(SLParser.M_expresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#m_expresion}.
	 * @param ctx the parse tree
	 */
	void exitM_expresion(SLParser.M_expresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#m_expresion_p}.
	 * @param ctx the parse tree
	 */
	void enterM_expresion_p(SLParser.M_expresion_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#m_expresion_p}.
	 * @param ctx the parse tree
	 */
	void exitM_expresion_p(SLParser.M_expresion_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#m_term}.
	 * @param ctx the parse tree
	 */
	void enterM_term(SLParser.M_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#m_term}.
	 * @param ctx the parse tree
	 */
	void exitM_term(SLParser.M_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#m_factor}.
	 * @param ctx the parse tree
	 */
	void enterM_factor(SLParser.M_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#m_factor}.
	 * @param ctx the parse tree
	 */
	void exitM_factor(SLParser.M_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(SLParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(SLParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#logic_expresion_p}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expresion_p(SLParser.Logic_expresion_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#logic_expresion_p}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expresion_p(SLParser.Logic_expresion_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#logic_term}.
	 * @param ctx the parse tree
	 */
	void enterLogic_term(SLParser.Logic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#logic_term}.
	 * @param ctx the parse tree
	 */
	void exitLogic_term(SLParser.Logic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#logic_term_p}.
	 * @param ctx the parse tree
	 */
	void enterLogic_term_p(SLParser.Logic_term_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#logic_term_p}.
	 * @param ctx the parse tree
	 */
	void exitLogic_term_p(SLParser.Logic_term_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#logic_factor}.
	 * @param ctx the parse tree
	 */
	void enterLogic_factor(SLParser.Logic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#logic_factor}.
	 * @param ctx the parse tree
	 */
	void exitLogic_factor(SLParser.Logic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#logic_element}.
	 * @param ctx the parse tree
	 */
	void enterLogic_element(SLParser.Logic_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#logic_element}.
	 * @param ctx the parse tree
	 */
	void exitLogic_element(SLParser.Logic_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#relation_expresion}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expresion(SLParser.Relation_expresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#relation_expresion}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expresion(SLParser.Relation_expresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#relation_expresion_p}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expresion_p(SLParser.Relation_expresion_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#relation_expresion_p}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expresion_p(SLParser.Relation_expresion_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#relation_term}.
	 * @param ctx the parse tree
	 */
	void enterRelation_term(SLParser.Relation_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#relation_term}.
	 * @param ctx the parse tree
	 */
	void exitRelation_term(SLParser.Relation_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_expresion}.
	 * @param ctx the parse tree
	 */
	void enterNum_expresion(SLParser.Num_expresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_expresion}.
	 * @param ctx the parse tree
	 */
	void exitNum_expresion(SLParser.Num_expresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_expresion_p}.
	 * @param ctx the parse tree
	 */
	void enterNum_expresion_p(SLParser.Num_expresion_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_expresion_p}.
	 * @param ctx the parse tree
	 */
	void exitNum_expresion_p(SLParser.Num_expresion_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_term}.
	 * @param ctx the parse tree
	 */
	void enterNum_term(SLParser.Num_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_term}.
	 * @param ctx the parse tree
	 */
	void exitNum_term(SLParser.Num_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_term_p}.
	 * @param ctx the parse tree
	 */
	void enterNum_term_p(SLParser.Num_term_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_term_p}.
	 * @param ctx the parse tree
	 */
	void exitNum_term_p(SLParser.Num_term_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(SLParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(SLParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_factor_p}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor_p(SLParser.Num_factor_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_factor_p}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor_p(SLParser.Num_factor_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#num_factor_pp}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor_pp(SLParser.Num_factor_ppContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#num_factor_pp}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor_pp(SLParser.Num_factor_ppContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#base_element}.
	 * @param ctx the parse tree
	 */
	void enterBase_element(SLParser.Base_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#base_element}.
	 * @param ctx the parse tree
	 */
	void exitBase_element(SLParser.Base_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(SLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(SLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(SLParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(SLParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_arg}.
	 * @param ctx the parse tree
	 */
	void enterNext_arg(SLParser.Next_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_arg}.
	 * @param ctx the parse tree
	 */
	void exitNext_arg(SLParser.Next_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(SLParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(SLParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SLParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SLParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subheader}.
	 * @param ctx the parse tree
	 */
	void enterSubheader(SLParser.SubheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subheader}.
	 * @param ctx the parse tree
	 */
	void exitSubheader(SLParser.SubheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subbody}.
	 * @param ctx the parse tree
	 */
	void enterSubbody(SLParser.SubbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subbody}.
	 * @param ctx the parse tree
	 */
	void exitSubbody(SLParser.SubbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subheaderr}.
	 * @param ctx the parse tree
	 */
	void enterSubheaderr(SLParser.SubheaderrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subheaderr}.
	 * @param ctx the parse tree
	 */
	void exitSubheaderr(SLParser.SubheaderrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subbodyr}.
	 * @param ctx the parse tree
	 */
	void enterSubbodyr(SLParser.SubbodyrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subbodyr}.
	 * @param ctx the parse tree
	 */
	void exitSubbodyr(SLParser.SubbodyrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subsentencias}.
	 * @param ctx the parse tree
	 */
	void enterSubsentencias(SLParser.SubsentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subsentencias}.
	 * @param ctx the parse tree
	 */
	void exitSubsentencias(SLParser.SubsentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SLParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SLParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(SLParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(SLParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#type_vector}.
	 * @param ctx the parse tree
	 */
	void enterType_vector(SLParser.Type_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#type_vector}.
	 * @param ctx the parse tree
	 */
	void exitType_vector(SLParser.Type_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#v_len}.
	 * @param ctx the parse tree
	 */
	void enterV_len(SLParser.V_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#v_len}.
	 * @param ctx the parse tree
	 */
	void exitV_len(SLParser.V_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#type_matrix}.
	 * @param ctx the parse tree
	 */
	void enterType_matrix(SLParser.Type_matrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#type_matrix}.
	 * @param ctx the parse tree
	 */
	void exitType_matrix(SLParser.Type_matrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dimention_list}.
	 * @param ctx the parse tree
	 */
	void enterDimention_list(SLParser.Dimention_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dimention_list}.
	 * @param ctx the parse tree
	 */
	void exitDimention_list(SLParser.Dimention_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_dimention}.
	 * @param ctx the parse tree
	 */
	void enterNext_dimention(SLParser.Next_dimentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_dimention}.
	 * @param ctx the parse tree
	 */
	void exitNext_dimention(SLParser.Next_dimentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_dimention_p}.
	 * @param ctx the parse tree
	 */
	void enterNext_dimention_p(SLParser.Next_dimention_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_dimention_p}.
	 * @param ctx the parse tree
	 */
	void exitNext_dimention_p(SLParser.Next_dimention_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dimention}.
	 * @param ctx the parse tree
	 */
	void enterDimention(SLParser.DimentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dimention}.
	 * @param ctx the parse tree
	 */
	void exitDimention(SLParser.DimentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(SLParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(SLParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#id_extend}.
	 * @param ctx the parse tree
	 */
	void enterId_extend(SLParser.Id_extendContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#id_extend}.
	 * @param ctx the parse tree
	 */
	void exitId_extend(SLParser.Id_extendContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ids_options}.
	 * @param ctx the parse tree
	 */
	void enterIds_options(SLParser.Ids_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ids_options}.
	 * @param ctx the parse tree
	 */
	void exitIds_options(SLParser.Ids_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SLParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SLParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#call_opt}.
	 * @param ctx the parse tree
	 */
	void enterCall_opt(SLParser.Call_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#call_opt}.
	 * @param ctx the parse tree
	 */
	void exitCall_opt(SLParser.Call_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#next_param}.
	 * @param ctx the parse tree
	 */
	void enterNext_param(SLParser.Next_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#next_param}.
	 * @param ctx the parse tree
	 */
	void exitNext_param(SLParser.Next_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(SLParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(SLParser.MatrixContext ctx);
}