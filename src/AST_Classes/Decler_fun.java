package AST_Classes;

public class Decler_fun  extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...............decler function.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(VOID!=null) {
            System.out.println(VOID);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if (name !=null)
        {
            name.Print_Ast();
        }
    }
     String VOID;
     String NAME;
     Name  name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getVOID() {
        return VOID;
    }

    public void setVOID(String VOID) {
        this.VOID = VOID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
