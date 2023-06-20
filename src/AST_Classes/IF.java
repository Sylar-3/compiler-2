package AST_Classes;

import java.util.ArrayList;

public class IF extends  BaseNode{
    public void Print_Ast() {
        System.out.println(".........if node............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(IF!=null) {
            System.out.println(IF);
        }

            if( if_condetion!=null)
            {
                for (int i=0;i< if_condetion.size();i++)
                    if_condetion.get(i).Print_Ast();
            }
        if(body_element!=null)
        {
            for (int i=0;i<body_element.size();i++)
                body_element.get(i).Print_Ast();
        }
    }
    String IF;
   ArrayList<If_condetion> if_condetion=new ArrayList<>();
ArrayList       < Body_element> body_element=new ArrayList<>();

    public ArrayList<If_condetion> getIf_condetion() {
        return if_condetion;
    }

    public void setIf_condetion(ArrayList<If_condetion> if_condetion) {
        this.if_condetion = if_condetion;
    }

    public ArrayList<Body_element> getBody_element() {
        return body_element;
    }

    public void setBody_element(ArrayList<Body_element> body_element) {
        this.body_element = body_element;
    }

    public ArrayList<If_condetion> getIfCondetion() {
        return ifCondetion;
    }

    public void setIfCondetion(ArrayList<If_condetion> ifCondetion) {
        this.ifCondetion = ifCondetion;
    }

    ArrayList<If_condetion>ifCondetion=new ArrayList<>() ;

    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }
}
