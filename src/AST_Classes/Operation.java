package AST_Classes;

import java.util.ArrayList;

public class Operation extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............operation node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (side!=null)
        {
            for (int i = 0; i < side.size(); i++) {

            side.get(i).Print_Ast();
            }
        }
        if(COMPARISON!=null) {
            System.out.println(COMPARISON);
        }
    }


   ArrayList<Side> side=new ArrayList<>();
   String COMPARISON;

    public ArrayList<Side> getSide() {
        return side;
    }

    public void setSide(ArrayList<Side> side) {
        this.side = side;
    }

    public String getCOMPARISON() {
        return COMPARISON;
    }

    public void setCOMPARISON(String COMPARISON) {
        this.COMPARISON = COMPARISON;
    }
}
