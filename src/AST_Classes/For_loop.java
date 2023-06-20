package AST_Classes;

import java.util.ArrayList;

public class For_loop extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...................for loop node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(FOR!=null) {
            System.out.println(FOR);
        }
        if (vareble !=null)
        {
            vareble.Print_Ast();
        }
        if (operationd !=null)
        {
            operationd.Print_Ast();
        }
        if (operation !=null)
        {
            operation.Print_Ast();
        }

        if(body_element!=null)
        {
            for (int i=0;i<body_element.size();i++)
                body_element.get(i).Print_Ast();
        }
    }
    String FOR ;
    Vareble vareble;
    Operation operation;
    String SEMI;
    Operationd operationd ;
    ArrayList<Body_element> body_element=new ArrayList<>();

    public String getFOR() {
        return FOR;
    }

    public void setFOR(String FOR) {
        this.FOR = FOR;
    }

    public Vareble getVareble() {
        return vareble;
    }

    public void setVareble(Vareble vareble) {
        this.vareble = vareble;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getSEMI() {
        return SEMI;
    }

    public void setSEMI(String SEMI) {
        this.SEMI = SEMI;
    }

    public Operationd getOperationd() {
        return operationd;
    }

    public void setOperationd(Operationd operationd) {
        this.operationd = operationd;
    }

    public ArrayList<Body_element> getBody_element() {
        return body_element;
    }

    public void setBody_element(ArrayList<Body_element> body_element) {
        this.body_element = body_element;
    }
}
