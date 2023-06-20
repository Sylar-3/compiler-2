package Visitor;

import java.util.ArrayList;

public class SymbolTable {
    public ArrayList<Symbol> symbolsList = new ArrayList<>();

    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;

    private static SymbolTable single_instance = null;

    public static SymbolTable getInstance() {
        if (single_instance == null)
            single_instance = new SymbolTable();
        return single_instance;
    }

    @Override
    public String toString() {
        return "Symbols List: { " +
                symbolsList +
                " }";
    }
}
