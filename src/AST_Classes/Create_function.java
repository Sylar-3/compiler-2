package AST_Classes;

import java.util.ArrayList;

public class Create_function extends  BaseNode {
    public void Print_Ast() {
        System.out.println("...........create class node ................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (OVERRIDE != null) {
            System.out.println(OVERRIDE);
        }
        if (decler_fun != null) {
            decler_fun.Print_Ast();
        }
        if (var_param != null) {
            var_param.Print_Ast();
        }
        if (returN != null) {
            returN.Print_Ast();
        }
        if ( body_element != null) {
            for (int i = 0; i < body_element.size(); i++)
                body_element.get(i).Print_Ast();
        }
    }





    String OVERRIDE;
    Decler_fun decler_fun ;
    Var_param var_param;
    ArrayList<Body_element> body_element=new ArrayList<>();
    ReturN  returN;

    public Decler_fun getDecler_fun() {
        return decler_fun;
    }

    public void setDecler_fun(Decler_fun decler_fun) {
        this.decler_fun = decler_fun;
    }

    public Var_param getVar_param() {
        return var_param;
    }

    public void setVar_param(Var_param var_param) {
        this.var_param = var_param;
    }

    public ArrayList<Body_element> getBody_element() {
        return body_element;
    }

    public void setBody_element(ArrayList<Body_element> body_element) {
        this.body_element = body_element;
    }

    public ReturN getReturN() {
        return returN;
    }

    public void setReturN(ReturN returN) {
        this.returN = returN;
    }

    public String getOVERRIDE() {
        return OVERRIDE;
    }

    public void setOVERRIDE(String OVERRIDE) {
        this.OVERRIDE = OVERRIDE;
    }


}
