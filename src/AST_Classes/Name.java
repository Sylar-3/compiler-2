package AST_Classes;

public class Name extends  BaseNode{
    public void Print_Ast() {
        System.out.println("..........name node............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(NAME!=null) {
            System.out.println(NAME);
        }
        }
    String NAME;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
