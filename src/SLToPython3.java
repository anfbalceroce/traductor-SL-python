import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SLToPython3 extends SLBaseListener {
    public int indents = 0;
    public String header = "";
    public String functions = "";
    public String body = "";
    public String function_body = "";
    public String current_body = "";

    public String add_indents(String code){
        for (int i = 0; i < this.indents; i++){
            code +='\t';
            System.out.print('\t');
        }
        return code;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterHeader(SLParser.HeaderContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitHeader(SLParser.HeaderContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVar(SLParser.VarContext ctx) {
        this.header += ctx.ID(0).getText()+" = ";
        System.out.print(ctx.ID(0).getText()+" = ");
        for (int i = 1; i < ctx.ID().size(); i++) {
            this.header += ctx.ID(i).getText()+" = ";
            System.out.print(ctx.ID(i).getText()+" = ");
        }
        String type = "";
        switch(ctx.tipo().getText()) {
            case "numerico":
                type = "0";
                break;
            case "logico":
                type = "FALSE";
                break;
            case "cadena":
                type = "\"\"";
                break;
            default:
                type = "None";
        }
        this.header += type + '\n';
        System.out.print(type+'\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVar(SLParser.VarContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConst(SLParser.ConstContext ctx) {
        System.out.print(ctx.ID().getText()+" = "+ctx.expresion().getText()+'\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConst(SLParser.ConstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMain(SLParser.MainContext ctx) {
        System.out.print("\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMain(SLParser.MainContext ctx) {
        this.body = this.current_body;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSentencia(SLParser.SentenciaContext ctx) {
        this.current_body = add_indents(this.current_body);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSentencia(SLParser.SentenciaContext ctx) {
        String semicolon = "";
        if (ctx.SEP() != null) {
            semicolon = ctx.SEP().getText();
        }
        this.current_body += semicolon+'\n';
        System.out.print(semicolon+'\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCall(SLParser.CallContext ctx) { // aca seria la traduccion de primitivas de SL a python
        this.current_body += ctx.ID().getText()+'('+ctx.params().getText()+')';
        System.out.print(ctx.ID().getText()+'('+ctx.params().getText()+')');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCall(SLParser.CallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssingment(SLParser.AssingmentContext ctx) {
        if (ctx.expresion() != null) { // assingment
            this.current_body += ctx.ID().getText()+ctx.id_extend().getText()+" = "+ctx.expresion().getText();
            System.out.print(ctx.ID().getText()+ctx.id_extend().getText()+" = "+ctx.expresion().getText());
        } else if (ctx.m_expresion() != null) { // matrix assingment
            this.current_body += ctx.ID().getText()+ctx.id_extend().getText()+" = "+'['+ctx.m_expresion().getText()+']';
            System.out.print(ctx.ID().getText()+ctx.id_extend().getText()+" = "+'['+ctx.m_expresion().getText()+']');
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssingment(SLParser.AssingmentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIf(SLParser.IfContext ctx) {
        this.current_body += "if ("+ctx.expresion().getText()+"):\n";
        System.out.print("if ("+ctx.expresion().getText()+"):\n");
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIf(SLParser.IfContext ctx) {
        this.indents --;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSinosi(SLParser.SinosiContext ctx) {
        this.indents --;
        this.current_body = add_indents(this.current_body);
        this.current_body += "elif ("+ctx.expresion().getText()+"):\n";
        System.out.print("elif ("+ctx.expresion().getText()+"):\n");
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSinosi(SLParser.SinosiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile(SLParser.WhileContext ctx) {
        if(ctx.expresion()!=null){
            this.current_body += "while "+ctx.expresion().getText()+":"+'\n';
            System.out.print("while "+ctx.expresion().getText()+":"+'\n');
            this.indents ++;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile(SLParser.WhileContext ctx) {
        try {
            this.current_body = this.current_body.substring(0, this.current_body.length() - 1);

        }
        catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
        this.indents --;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDo_while(SLParser.Do_whileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDo_while(SLParser.Do_whileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSwitch(SLParser.SwitchContext ctx) { // eval
        this.current_body += "if ("+ctx.expresion().getText()+"):\n";
        System.out.print("if ("+ctx.expresion().getText()+"):\n");
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSwitch(SLParser.SwitchContext ctx) {
        this.indents --;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCase(SLParser.CaseContext ctx) {
        this.indents --;
        this.current_body = add_indents(this.current_body);
        this.current_body += "elif ("+ctx.expresion().getText()+"):\n";
        System.out.print("elif ("+ctx.expresion().getText()+"):\n");
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCase(SLParser.CaseContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSino(SLParser.SinoContext ctx) {
        this.indents --;
        this.current_body = add_indents(this.current_body);
        this.current_body += "else:\n";
        System.out.print("else:\n");
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSino(SLParser.SinoContext ctx) {
        try {
            this.current_body = this.current_body.substring(0, this.current_body.length() - 1);
        }
        catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFor(SLParser.ForContext ctx) {
        String desde = ctx.num_expresion(0).getText();
        String hasta = ctx.num_expresion(1).getText();
        if (ctx.num_expresion(2) == null) { // sin paso
            this.current_body += "for "+ctx.ID().getText()+" in range("+desde+", "+hasta+"):"+'\n';
            System.out.print("for "+ctx.ID().getText()+" in range("+desde+", "+hasta+"):"+'\n');
        }else { // con paso
            String paso = ctx.num_expresion(2).getText();
            this.current_body += "for "+ctx.ID().getText()+" in range("+desde+", "+hasta+", "+paso+"):"+'\n';
            System.out.print("for "+ctx.ID().getText()+" in range("+desde+", "+hasta+", "+paso+"):"+'\n');
        }
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFor(SLParser.ForContext ctx) {
        try {
            this.current_body = this.current_body.substring(0, this.current_body.length() - 1);
        }
        catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
        this.indents --;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion(SLParser.ExpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion(SLParser.ExpresionContext ctx) { }
}
