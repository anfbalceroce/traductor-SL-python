// Generated from C:/Users/Platez/Documents/UN/Sistemas/2022-1/lenguajes/traductor/grammar\SL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SLParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SLParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(SLParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(SLParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_id(SLParser.Next_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_var(SLParser.Next_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#const_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_list(SLParser.Const_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(SLParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_const(SLParser.Next_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipos_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_list(SLParser.Tipos_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_p(SLParser.Tipo_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_tipo_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_tipo_p(SLParser.Next_tipo_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sep_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep_opt(SLParser.Sep_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sent_sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_sep(SLParser.Sent_sepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(SLParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_sentencia(SLParser.Next_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#assng_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssng_call(SLParser.Assng_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#for_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_start(SLParser.For_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#for_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_end(SLParser.For_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#for_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_step(SLParser.For_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(SLParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sino_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino_p(SLParser.Sino_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sino_pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino_pp(SLParser.Sino_ppContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sent_sep_sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_sep_sino(SLParser.Sent_sep_sinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentenciasnoif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciasnoif(SLParser.SentenciasnoifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentencianoif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencianoif(SLParser.SentencianoifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentenciasif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciasif(SLParser.SentenciasifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(SLParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sw_sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSw_sino(SLParser.Sw_sinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#assingment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment(SLParser.AssingmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#assingment_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment_p(SLParser.Assingment_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#m_expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_expresion(SLParser.M_expresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#m_expresion_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_expresion_p(SLParser.M_expresion_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#m_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_term(SLParser.M_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#m_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_factor(SLParser.M_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(SLParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#logic_expresion_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expresion_p(SLParser.Logic_expresion_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#logic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_term(SLParser.Logic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#logic_term_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_term_p(SLParser.Logic_term_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#logic_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_factor(SLParser.Logic_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#logic_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_element(SLParser.Logic_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#relation_expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expresion(SLParser.Relation_expresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#relation_expresion_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expresion_p(SLParser.Relation_expresion_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#relation_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_term(SLParser.Relation_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expresion(SLParser.Num_expresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_expresion_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expresion_p(SLParser.Num_expresion_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_term(SLParser.Num_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_term_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_term_p(SLParser.Num_term_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor(SLParser.Num_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_factor_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor_p(SLParser.Num_factor_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#num_factor_pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor_pp(SLParser.Num_factor_ppContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#base_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_element(SLParser.Base_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(SLParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SLParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_arg(SLParser.Next_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(SLParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(SLParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubheader(SLParser.SubheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubbody(SLParser.SubbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subheaderr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubheaderr(SLParser.SubheaderrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subbodyr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubbodyr(SLParser.SubbodyrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subsentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsentencias(SLParser.SubsentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SLParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(SLParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#type_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_vector(SLParser.Type_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#v_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_len(SLParser.V_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#type_matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_matrix(SLParser.Type_matrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dimention_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimention_list(SLParser.Dimention_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_dimention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_dimention(SLParser.Next_dimentionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_dimention_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_dimention_p(SLParser.Next_dimention_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dimention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimention(SLParser.DimentionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(SLParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#id_extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_extend(SLParser.Id_extendContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#ids_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds_options(SLParser.Ids_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SLParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#call_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_opt(SLParser.Call_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#next_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_param(SLParser.Next_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(SLParser.MatrixContext ctx);
}