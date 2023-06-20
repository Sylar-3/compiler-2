package AST_Classes;

public class Element extends  BaseNode {
    Vareble vareble;
    Constructer constructer;

    public void Print_Ast()
    {
        System.out.println("............element node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(vareble!=null)
        {
            vareble.Print_Ast();
        }
        else if(constructer!=null)
        {
            constructer.Print_Ast();
        } else if (build!=null) {
            build.Print_Ast();
        }
    }
    public Vareble getVareble() {
        return vareble;
    }

    public void setVareble(Vareble vareble) {
        this.vareble = vareble;
    }

    public Constructer getConstructer() {
        return constructer;
    }

    public void setConstructer(Constructer constructer) {
        this.constructer = constructer;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    Build build;
}
