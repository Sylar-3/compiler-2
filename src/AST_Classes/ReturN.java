package AST_Classes;

public class ReturN extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...............return node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if(RETURN!=null) {
            System.out.println(RETURN);
        }
        if (cull_function!=null)
        {
            cull_function.Print_Ast();
        }
    }
    String RETURN;
    String NAME;
    Cull_function cull_function;

    public Cull_function getCull_function() {
        return cull_function;
    }

    public void setCull_function(Cull_function cull_function) {
        this.cull_function = cull_function;
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
