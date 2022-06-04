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
            ParseTree tree = parser.start(); // Iniciar el analisis sintáctico en la regla inicial: r
            //System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
            System.out.println("El analisis sintactico ha finalizado exitosamente.");
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
