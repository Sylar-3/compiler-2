package AST_Classes;

import java.util.ArrayList;

public class InkwelChilde extends  BaseNode{
    OnTap onTap;

    public void Print_Ast(){
        System.out.println("................inkwel child..................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(onTap!=null)
        {
            onTap.Print_Ast();
        }
        if(children!=null)
        {
            for (int i = 0; i < children.size(); i++) {
                children.get(i).Print_Ast();
            }
        }
    }
    public OnTap getOnTap() {
        return onTap;
    }

    public void setOnTap(OnTap onTap) {
        this.onTap = onTap;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    ArrayList<Child> children=new ArrayList<>();
}
