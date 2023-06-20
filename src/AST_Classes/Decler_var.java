package AST_Classes;

public class Decler_var extends  BaseNode {
    public void Print_Ast() {
        System.out.println("...........decler var node..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(TYPE!=null) {
            System.out.println(TYPE);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if (name !=null)
        {
            name.Print_Ast();
        }
    }
     String TYPE;
     String NAME;
     Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
