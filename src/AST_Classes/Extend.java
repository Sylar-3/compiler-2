package AST_Classes;

public class Extend extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............extend node............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(EXTENDS!=null) {
            System.out.println(EXTENDS);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
    }
    String EXTENDS ;
    String NAME;

    public String getEXTENDS() {
        return EXTENDS;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
