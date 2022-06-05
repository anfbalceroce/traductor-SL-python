import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.HashSet;

public class SLToPython3 extends SLBaseListener {
    public int indents = 0;
    public String header = "";
    public String functions = "";
    public String body = "";
    public String current_body = "";
    public HashMap<String, String> prebuilts = new HashMap<>(36);

    public String add_indents(String code){
        for (int i = 0; i < this.indents; i++){
            code +='\t';
            System.out.print('\t');
        }
        return code;
    }
    public String expresionMngr(String raw){
        // formats and translate expresions, receives raw string of concat tokens (no whitespaces)
        // returns string of concatenated tokens, spaced and translated if necessary
        SLLexer miniLex = new SLLexer(CharStreams.fromString(raw)); // mini lexer to identify tokens
        String out = "";
        Vocabulary vocab = miniLex.getVocabulary(); // get names of Token types, ej ID, NUM, etc
        for (Token tok : miniLex.getAllTokens()){ // iterates over all tokens from input
            String tokType = vocab.getSymbolicName(tok.getType()); // get token type
            if (tokType != null && tokType.equals("ID") && this.prebuilts.containsKey(tok.getText())){
                // if token is ID ant it's a prebuilt (HashMap check) concatenates the translation
                out += ' '+this.prebuilts.get(tok.getText())+' ';
            } else if (tok.getText().equals("TRUE") || tok.getText().equals("SI")) {
                // if token is TRUE or SI > True
                out += " True ";
            }else if (tok.getText().equals("FALSE") || tok.getText().equals("NO")) {
                // if token is FALSE or No > True
                out += " False ";
            }else if(tok.getText().equals("^")){
                // if token is ^ change to ** for python Exponentiation
                out += "**";
            }else {
                out += ' '+tok.getText()+' ';
            }

        }
        return out;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStart(SLParser.StartContext ctx) {
        // esto es solo para inicializar un HashMap con la traduccion de las funciones predefinidas de SL
        this.prebuilts.put("dim","dim_tl");
        this.prebuilts.put("imprimir","print");
        this.prebuilts.put("cls","cls_tl");
        this.prebuilts.put("leer","leer_tl");
        this.prebuilts.put("set_ifs","set_ifs_tl");
        this.prebuilts.put("abs","abs");
        this.prebuilts.put("arctan","arctan_tl");
        this.prebuilts.put("ascii","ascii_tl");
        this.prebuilts.put("cos","cos");
        this.prebuilts.put("dec","dec_tl");
        this.prebuilts.put("eof","eof_tl");
        this.prebuilts.put("exp","exp_tl");
        this.prebuilts.put("get_ifs","get_ifs_tl");
        this.prebuilts.put("inc","inc_tl");
        this.prebuilts.put("int","int_tl");
        this.prebuilts.put("log","log_tl");
        this.prebuilts.put("lower","lower_tl");
        this.prebuilts.put("mem","mem_tl");
        this.prebuilts.put("ord","ord_tl");
        this.prebuilts.put("paramval","paramval_tl");
        this.prebuilts.put("pcount", "pcount_tl");
        this.prebuilts.put("pos", "pos_tl");
        this.prebuilts.put("random", "random_tl");
        this.prebuilts.put("sec", "sec_tl");
        this.prebuilts.put("set_stdin", "set_stdin_tl");
        this.prebuilts.put("set_stdout", "set_stdout_tl");
        this.prebuilts.put("sin", "sin");
        this.prebuilts.put("sqrt", "sqrt_tl");
        this.prebuilts.put("str", "str_tl");
        this.prebuilts.put("strdup", "strdup_tl");
        this.prebuilts.put("strlen", "strlen_tl");
        this.prebuilts.put("substr", "substr_tl");
        this.prebuilts.put("tan", "tan_tl");
        this.prebuilts.put("upper", "upper_tl");
        this.prebuilts.put("val", "val_tl");
        this.prebuilts.put("alen", "alen_tl");

        this.header = "";
        this.body = "";
        this.functions = "";
        this.current_body = "";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterHeader(SLParser.HeaderContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitHeader(SLParser.HeaderContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVar(SLParser.VarContext ctx) {
        this.current_body = add_indents(this.current_body);
        this.current_body += ctx.ID(0).getText()+" = ";
        System.out.print(ctx.ID(0).getText()+" = ");
        for (int i = 1; i < ctx.ID().size(); i++) {
            this.current_body += ctx.ID(i).getText()+" = ";
            System.out.print(ctx.ID(i).getText()+" = ");
        }
        String type = "";
        switch(ctx.tipo().getText()) {
            case "numerico":
                type = "0";
                break;
            case "logico":
                type = "False";
                break;
            case "cadena":
                type = "\"\"";
                break;
            default:
                type = "None";
        }
        this.current_body += type + '\n';
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
        this.current_body = add_indents(this.current_body);
        this.current_body += ctx.ID().getText()+" = "+expresionMngr(ctx.expresion().getText())+'\n';
        System.out.print(ctx.ID().getText()+" = "+expresionMngr(ctx.expresion().getText())+'\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConst(SLParser.ConstContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMain(SLParser.MainContext ctx) {
        this.header += this.current_body+'\n';
        System.out.print("\n");
        this.current_body = "";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMain(SLParser.MainContext ctx) {
        this.body += this.current_body;
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
        String tledID = ctx.ID().getText();
        if (this.prebuilts.containsKey(ctx.ID().getText())) {
            tledID = this.prebuilts.get(ctx.ID().getText());
        }
        this.current_body += tledID+'('+expresionMngr(ctx.params().getText())+')';
        System.out.print(tledID+'('+expresionMngr(ctx.params().getText())+')');
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
            this.current_body += ctx.ID().getText()+ctx.id_extend().getText()+" = "+expresionMngr(ctx.expresion().getText());
            System.out.print(ctx.ID().getText()+ctx.id_extend().getText()+" = "+expresionMngr(ctx.expresion().getText()));
        } else if (ctx.m_expresion() != null) { // matrix assingment
            this.current_body += ctx.ID().getText()+ctx.id_extend().getText()+" = "+expresionMngr(ctx.m_expresion().getText());
            System.out.print(ctx.ID().getText()+ctx.id_extend().getText()+" = "+expresionMngr(ctx.m_expresion().getText()));
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
        this.current_body += "if ("+expresionMngr(ctx.expresion().getText())+"):\n";
        System.out.print("if ("+expresionMngr(ctx.expresion().getText())+"):\n");
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
        this.current_body += "elif ("+expresionMngr(ctx.expresion().getText())+"):\n";
        System.out.print("elif ("+expresionMngr(ctx.expresion().getText())+"):\n");
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
            this.current_body += "while "+expresionMngr(ctx.expresion().getText())+":"+'\n';
            System.out.print("while "+expresionMngr(ctx.expresion().getText())+":"+'\n');
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
    @Override public void enterDo_while(SLParser.Do_whileContext ctx) {
        if(ctx.expresion()!=null){

            this.current_body+="while "+"True"+":"+'\n';
            System.out.print("while "+"True"+":"+'\n');
            this.indents++;

            //this.current_body+=ctx.sentencia();

        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDo_while(SLParser.Do_whileContext ctx) {
        //this.indents++;
        this.current_body = add_indents(this.current_body);
        this.current_body+="if("+expresionMngr(ctx.expresion().getText())+"):"+'\n';
        System.out.print("if("+expresionMngr(ctx.expresion().getText())+"):"+'\n');

        this.indents++;
        this.current_body = add_indents(this.current_body);

        this.current_body+="break";
        System.out.print("break");

        this.indents--;
        this.indents--;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSwitch(SLParser.SwitchContext ctx) { // eval
        this.current_body += "if ("+expresionMngr(ctx.expresion().getText())+"):\n";
        System.out.print("if ("+expresionMngr(ctx.expresion().getText())+"):\n");
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
        this.current_body += "elif ("+expresionMngr(ctx.expresion().getText())+"):\n";
        System.out.print("elif ("+expresionMngr(ctx.expresion().getText())+"):\n");
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
        String desde = expresionMngr(ctx.num_expresion(0).getText());
        String hasta = expresionMngr(ctx.num_expresion(1).getText());
        if (ctx.num_expresion(2) == null) { // sin paso
            this.current_body += "for "+ctx.ID().getText()+" in range("+desde+", "+hasta+"):"+'\n';
            System.out.print("for "+ctx.ID().getText()+" in range("+desde+", "+hasta+"):"+'\n');
        }else { // con paso
            String paso = expresionMngr(ctx.num_expresion(2).getText());
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
    @Override public void enterSub(SLParser.SubContext ctx) {
        this.current_body = "";
        String temp = "def "+ctx.ID().getText()+" (";
        if(!ctx.args().isEmpty()){
            for(int i = 0; i < ctx.args().ID().size(); i++){
                if(i == ctx.args().ID().size()-1){
                    temp += ctx.args().ID().get(i).getText();
                }else{
                    temp += ctx.args().ID().get(i).getText()+", ";
                }
            }
        }
        temp += "):\n";
        this.current_body += temp;
        System.out.print(temp);
        this.indents ++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSub(SLParser.SubContext ctx) {
        this.functions += this.current_body+'\n';
        System.out.print('\n');
        this.indents --;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSubmainr(SLParser.SubmainrContext ctx) {
        this.current_body = add_indents(this.current_body);
        this.current_body += "return ("+expresionMngr(ctx.expresion().getText())+")";
        System.out.print("return ("+expresionMngr(ctx.expresion().getText())+")");
    }
}
