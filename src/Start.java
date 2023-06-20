import AST_Classes.Start_program;
import ErrorHandling.SemanticError;
import ErrorHandling.SyntaxError;
import Visitor.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import gen.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Start {
    public static void main(String[] args) {
        try {
            System.out.println("\n");
            ArrayList<String> examples = new ArrayList<>(Arrays.asList("samples//exampleTwo.txt"));
            SyntaxError syntaxError = new SyntaxError();
            for (int i = 0; i < examples.size(); i++) {
                CharStream cs = fromFileName(examples.get(i));

                //LEXER
                LEXER lexer = new LEXER(cs);
                lexer.removeErrorListeners();
                lexer.addErrorListener(syntaxError);
                CommonTokenStream token = new CommonTokenStream(lexer);

                //PARSER
                PARSER parser = new PARSER(token);
                parser.removeErrorListeners();
                parser.addErrorListener(syntaxError.INSTANCE);
                ParseTree tree = parser.start_program();

                //VISITOR
                Visitor visitor = new Visitor();
                Start_program startProgram = (Start_program) visitor.visit(tree);
                startProgram.Print_Ast();

                //PRINT AST
                System.out.println("Set State: Stateful widget");
                System.out.println(visitor.symbolTable.toString());
                SemanticError sError = new SemanticError(visitor.symbolTable);
                sError.checkErrors();
                visitor.codeGenerate.ConvertToHTML(i);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
