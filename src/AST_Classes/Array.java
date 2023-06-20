package AST_Classes;

public class Array extends  BaseNode{

    public void Print_Ast() {
        System.out.println("...........array node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (NAME!= null) {
            System.out.println(NAME);
        }
        if (NUMBER != null) {
            System.out.println(NUMBER);
        }

        if (decler_var != null) {
            decler_var.Print_Ast();
        }
    }
    String NAME;
    String NUMBER;
    String SEMI;
    Decler_var decler_var;

    public Decler_var getDecler_var() {
        return decler_var;
    }

    public void setDecler_var(Decler_var decler_var) {
        this.decler_var = decler_var;
    }

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

    public String getSEMI() {
        return SEMI;
    }

    public void setSEMI(String SEMI) {
        this.SEMI = SEMI;
    }
}
