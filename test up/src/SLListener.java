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