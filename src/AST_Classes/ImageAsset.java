package AST_Classes;

import java.util.ArrayList;

public class ImageAsset extends  BaseNode{
    ArrayList<String> strings=new ArrayList<>();
    String fit;
    Child child;

    public void Print_Ast(){
        System.out.println("............image asset node...............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(strings!=null)
        {
            for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
            }
        }
        if(fit!=null)
        {
            System.out.println(fit);
        }
        if(child!=null)
        {
            child.Print_Ast();
        }
    }
    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
