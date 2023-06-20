package AST_Classes;

public class Others extends  BaseNode{
    public void Print_Ast() {
        System.out.println(".............others node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(STRING!=null) {
            System.out.println(STRING);
        }
        if(NUMBER!=null) {
            System.out.println(NUMBER);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if(CHAR!=null) {
            System.out.println(CHAR);
        }
    }
    String  NAME;

    String NUMBER;
    String CHAR;
    String STRING;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String getCHAR() {
        return CHAR;
    }

    public void setCHAR(String CHAR) {
        this.CHAR = CHAR;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }
}
