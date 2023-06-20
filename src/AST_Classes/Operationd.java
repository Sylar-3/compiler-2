package AST_Classes;

import java.util.ArrayList;

public class Operationd extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...............operation node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (side!=null)
        {
            for (int i = 0; i < side.size(); i++) {

                side.get(i).Print_Ast();
            }
        }
        if(SIGNAL!=null) {
            System.out.println(SIGNAL);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if(SIGNALS!=null) {
            System.out.println(SIGNALS);
        }
    }
    ArrayList<Side> side=new ArrayList<>();
    String SIGNAL;
    String NAME ;
    String SIGNALS;

    public ArrayList<Side> getSide() {
        return side;
    }

    public void setSide(ArrayList<Side> side) {
        this.side = side;
    }
    public String getSIGNAL() {
        return SIGNAL;
    }

    public void setSIGNAL(String SIGNAL) {
        this.SIGNAL = SIGNAL;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSIGNALS() {
        return SIGNALS;
    }

    public void setSIGNALS(String SIGNALS) {
        this.SIGNALS = SIGNALS;
    }
}
