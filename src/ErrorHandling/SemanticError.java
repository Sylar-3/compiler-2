package ErrorHandling;

import Visitor.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SemanticError {
    SymbolTable symbolTable;

    public ArrayList<String> errorsList = new ArrayList<>();

    public SemanticError(SymbolTable symbols) {
        this.symbolTable = symbols;
    }

    public void checkWidget() throws IOException {
        for (int i = 0; i < symbolTable.symbolsList.size(); i++) {
            if (symbolTable.symbolsList.get(i).getSymbol() == "Widget") {
                String symbolName = symbolTable.symbolsList.get(i).getSymbol();
                if (symbolName.charAt(0) != symbolName.toUpperCase().charAt(0)) {
                    FileWriter test = new FileWriter("errors//SemanticError.txt");
                    test.write("Semantic Error: Widget name must start with a capital letter. Symbol: "
                            + symbolName + "\n");
                    test.close();
                }
            }
        }
    }

    public void checkErrors() throws IOException {
        System.err.println("Errors detected");
        if (!symbolTable.hasSyntaxError) {
            this.checkWidget();
        }
        if (!errorsList.isEmpty()) {
            symbolTable.hasSemanticError = true;
        }
        for (int i = 0; i < errorsList.size(); i++) {
            FileWriter test = new FileWriter("errors//SemanticError.txt");
            test.write(errorsList.get(i));
            test.close();
        }
    }
}
