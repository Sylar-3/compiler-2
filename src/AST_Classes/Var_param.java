package AST_Classes;

import java.util.ArrayList;

public class Var_param extends  BaseNode{
    public void Print_Ast() {

        System.out.println("..............var parm node.................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if( decler_var!=null)
        {
            for (int i=0;i< decler_var.size();i++)
                decler_var.get(i).Print_Ast();
        }

    }
  ArrayList< Decler_var> decler_var=new ArrayList<>();
    String COMA;

    public ArrayList<Decler_var> getDecler_var() {
        return decler_var;
    }

    public void setDecler_var(ArrayList<Decler_var> decler_var) {
        this.decler_var = decler_var;
    }

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }
}
