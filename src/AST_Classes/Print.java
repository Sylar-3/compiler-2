package AST_Classes;

public class Print extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........print node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (PRINT != null) {
            System.out.println(PRINT);
        }
        if (STRING != null) {
            System.out.println(STRING);
        }
        if (NAME != null) {
            System.out.println(NAME);
        }
        if (CHAR != null) {
            System.out.println(CHAR);
        }
    }
    String PRINT;
    String  STRING;
    String NAME;
    String CHAR ;
    String SEMI;

    public String getPRINT() {
        return PRINT;
    }

    public void setPRINT(String PRINT) {
        this.PRINT = PRINT;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCHAR() {
        return CHAR;
    }

    public void setCHAR(String CHAR) {
        this.CHAR = CHAR;
    }

    public String getSEMI() {
        return SEMI;
    }

    public void setSEMI(String SEMI) {
        this.SEMI = SEMI;
    }
}
