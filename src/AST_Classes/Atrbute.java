package AST_Classes;

import java.util.ArrayList;

public class Atrbute extends  BaseNode {
    ArrayList<Decler_var>declerVars=new ArrayList<>();

    public void Print_Ast(){
        System.out.println(".................atrbute node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(declerVars!=null)
        {
            for (int i = 0; i < declerVars.size(); i++) {
                declerVars.get(i).Print_Ast();
            }
        }
    }
    public ArrayList<Decler_var> getDeclerVars() {
        return declerVars;
    }

    public void setDeclerVars(ArrayList<Decler_var> declerVars) {
        this.declerVars = declerVars;
    }
}
