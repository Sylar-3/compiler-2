package AST_Classes;

public class Encaps extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........encaps node...............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (namee!=null)
        {
            namee.Print_Ast();
        }
        if (name!=null)
        {
            System.out.println(name);
        }
    }

    String name;
    Name namee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Name getNamee() {
        return namee;
    }

    public void setNamee(Name namee) {
        this.namee = namee;
    }

    public Cull_function getCullFunction() {
        return cullFunction;
    }

    public void setCullFunction(Cull_function cullFunction) {
        this.cullFunction = cullFunction;
    }

    Cull_function cullFunction;
}
