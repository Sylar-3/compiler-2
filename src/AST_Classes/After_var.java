package AST_Classes;

public class After_var extends  BaseNode {
    public void Print_Ast() {
        System.out.println("...............after var.....................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (SIGNALS != null) {
            System.out.println(SIGNALS);
        }
        if (var_equal != null) {
            var_equal.Print_Ast();
        }
    }






    String SIGNALS;
    Var_equal var_equal;

    public Var_equal getVar_equal() {
        return var_equal;
    }

    public void setVar_equal(Var_equal var_equal) {
        this.var_equal = var_equal;
    }

    public String getSIGNALS() {
        return SIGNALS;
    }

    public void setSIGNALS(String SIGNALS) {
        this.SIGNALS = SIGNALS;
    }
}
