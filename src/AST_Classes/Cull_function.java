package AST_Classes;

public class Cull_function  extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............cull function..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if (name!=null)
        {
            name .Print_Ast();
        }
        if (argument!=null)
        {
            argument .Print_Ast();
        }
        }
    String NAME;
    Name name;
    Argument argument;
     String SEMI;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Argument getArgument() {
        return argument;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }

    public String getSEMI() {
        return SEMI;
    }

    public void setSEMI(String SEMI) {
        this.SEMI = SEMI;
    }
}
