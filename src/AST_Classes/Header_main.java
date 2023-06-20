package AST_Classes;

import java.util.ArrayList;

public class Header_main extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........header main node..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(VOID!=null) {
            System.out.println(VOID);
        }
        if(MAIN!=null) {
            System.out.println(MAIN);
            if(bodyElements!=null)
            {
                for (int i=0;i<bodyElements.size();i++)
                    bodyElements.get(i).Print_Ast();
            }
        }
    }
     String VOID ;
     String MAIN;
ArrayList<Body_element> bodyElements=new ArrayList<>();

    public ArrayList<Body_element> getBodyElements() {
        return bodyElements;
    }

    public void setBodyElements(ArrayList<Body_element> bodyElements) {
        this.bodyElements = bodyElements;
    }

    public String getVOID() {
        return VOID;
    }

    public void setVOID(String VOID) {
        this.VOID = VOID;
    }

    public String getMAIN() {
        return MAIN;
    }

    public void setMAIN(String MAIN) {
        this.MAIN = MAIN;
    }
}
