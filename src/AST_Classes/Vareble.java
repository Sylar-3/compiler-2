package AST_Classes;

public class Vareble extends  BaseNode{
    public void Print_Ast() {

        System.out.println("...............vareble node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (decler_var!=null)
        {
            decler_var.Print_Ast();
        }
        if (after_var!=null)
        {
            after_var.Print_Ast();
        }
    }
    String SEMI;
   Decler_var  decler_var;
   After_var after_var;

    public Decler_var getDecler_var() {
        return decler_var;
    }

    public void setDecler_var(Decler_var decler_var) {
        this.decler_var = decler_var;
    }

    public After_var getAfter_var() {
        return after_var;
    }

    public void setAfter_var(After_var after_var) {
        this.after_var = after_var;
    }

    public String getSEMI() {
        return SEMI;
    }

    public void setSEMI(String SEMI) {
        this.SEMI = SEMI;
    }
}
