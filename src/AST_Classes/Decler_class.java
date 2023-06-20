package AST_Classes;

public class Decler_class extends  BaseNode {
    public void Print_Ast() {
        System.out.println(".........decler class node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(CLASS!=null) {
            System.out.println(CLASS);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
    }
    String CLASS ;
    String NAME;

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
