package AST_Classes;

public class Side extends  BaseNode{
    public void Print_Ast() {
        System.out.println(".........side node.........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (NAME != null) {
            System.out.println(NAME);
        }
        if (NUMBER != null) {
            System.out.println(NUMBER);
        }
    }
    String NAME;
    String NUMBER;

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
}
