package AST_Classes;

public class Text extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(TEXT!=null) {
            System.out.println(TEXT);
        }
        if( STRING!=null) {
            System.out.println( STRING);
        }
        if (style!=null)
        {
            style.Print_Ast();
        }
    }
    Style style;
    String TEXT;
    String STRING;
    String Char;

    public String getChar() {
        return Char;
    }

    public void setChar(String aChar) {
        Char = aChar;
    }

    String COMA;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
