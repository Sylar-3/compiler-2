package AST_Classes;

import java.util.ArrayList;

public class ElsE  extends  BaseNode{
    public void Print_Ast() {
        System.out.println("................else node...............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(ELSE!=null) {
            System.out.println(ELSE);
        }
        if (body_element!=null)
        {
            for (int i = 0; i < body_element.size(); i++) {

            body_element.get(i).Print_Ast();
            }

        }
    }
    String ELSE;
    ArrayList< Body_element> body_element=new ArrayList<>();


    public String getELSE() {
        return ELSE;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
    }

    public ArrayList<Body_element> getBody_element() {
        return body_element;
    }

    public void setBody_element(ArrayList<Body_element> body_element) {
        this.body_element = body_element;
    }
}
