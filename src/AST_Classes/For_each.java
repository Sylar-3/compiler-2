package AST_Classes;

import java.util.ArrayList;

public class For_each extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............for each node............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(FOR!=null) {
            System.out.println(FOR);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if (decler_var !=null)
        {
            decler_var.Print_Ast();
        }
        if(body_element!=null)
        {
            for (int i=0;i<body_element.size();i++)
                body_element.get(i).Print_Ast();
        }
        }
    String FOR ;
    Decler_var decler_var;
    String  NAME;
    ArrayList<Body_element> body_element=new ArrayList<>();

    public String getFOR() {
        return FOR;
    }

    public void setFOR(String FOR) {
        this.FOR = FOR;
    }

    public Decler_var getDecler_var() {
        return decler_var;
    }

    public void setDecler_var(Decler_var decler_var) {
        this.decler_var = decler_var;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public ArrayList<Body_element> getBody_element() {
        return body_element;
    }

    public void setBody_element(ArrayList<Body_element> body_element) {
        this.body_element = body_element;
    }
}
