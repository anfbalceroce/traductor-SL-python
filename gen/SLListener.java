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
	 * Enter a parse tree produced by {@link SLParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(SLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(SLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sinosi}.
	 * @param ctx the parse tree
	 */
	void enterSinosi(SLParser.SinosiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sinosi}.
	 * @param ctx the parse tree
	 */
	void exitSinosi(SLParser.SinosiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SLParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SLParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(SLParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(SLParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(SLParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(SLParser.SwitchContext ctx);
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
	 * Enter a parse tree produced by {@link SLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(SLParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(SLParser.ForContext ctx);
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
	 * Enter a parse tree produced by {@link SLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SLParser.BoolContext ctx);
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
	 * Enter a parse tree produced by {@link SLParser#submain}.
	 * @param ctx the parse tree
	 */
	void enterSubmain(SLParser.SubmainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#submain}.
	 * @param ctx the parse tree
	 */
	void exitSubmain(SLParser.SubmainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#submainr}.
	 * @param ctx the parse tree
	 */
	void enterSubmainr(SLParser.SubmainrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#submainr}.
	 * @param ctx the parse tree
	 */
	void exitSubmainr(SLParser.SubmainrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#calls}.
	 * @param ctx the parse tree
	 */
	void enterCalls(SLParser.CallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#calls}.
	 * @param ctx the parse tree
	 */
	void exitCalls(SLParser.CallsContext ctx);
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