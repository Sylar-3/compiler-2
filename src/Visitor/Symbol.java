package Visitor;

public class Symbol {
    public String symbol;

    int line;
    int char_position_in_line;

    @Override
    public String toString() {
        return
                "Symbol: '" + symbol + " " + line + " " + char_position_in_line +
                        "\n" ;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public Symbol(String symbol, int line, int char_position_in_line) {
        this.symbol = symbol;
        this.line = line;
        this.char_position_in_line = char_position_in_line;
    }
}

