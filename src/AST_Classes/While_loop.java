package AST_Classes;

import java.util.ArrayList;

public class While_loop extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............while node.................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (operation!=null)
        {
            operation.Print_Ast();
        }
        if (WHILE!=null)
        {
            System.out.println(WHILE);;
        }

        if( body_element!=null)
        {
            for (int i=0;i< body_element.size();i++)
                body_element.get(i).Print_Ast();
        }
    }
    String WHILE;
    Operation operation;
    ArrayList<Body_element> body_element=new ArrayList<>();

    public String getWHILE() {
        return WHILE;
    }

    public void setWHILE(String WHILE) {
        this.WHILE = WHILE;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

}
