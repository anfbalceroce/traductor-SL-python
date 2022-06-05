import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            SLLexer lexer;
            if (args.length>0)
                lexer = new SLLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new SLLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            SLParser parser = new SLParser(tokens);
            ParseTree tree = parser.start(); // Iniciar el analisis sintáctico en la regla inicial: start
            ParseTreeWalker walker = new ParseTreeWalker();
            SLToPython3 tl = new SLToPython3();
            walker.walk(tl, tree);
            System.out.println("=============reordered=================");
            System.out.print(tl.header); //
            System.out.print(tl.functions); //
            System.out.print(tl.body); //
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
