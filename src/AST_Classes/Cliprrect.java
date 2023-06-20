package AST_Classes;

public class Cliprrect extends  BaseNode{
    String cliprrect;
    Child child;
public void Print_Ast(){
    System.out.println("..............cliprrect node...........");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(cliprrect!=null)
    {
        System.out.println(cliprrect);
    }
    if(child!=null)
    {
        child.Print_Ast();
    }
}
    public String getCliprrect() {
        return cliprrect;
    }

    public void setCliprrect(String cliprrect) {
        this.cliprrect = cliprrect;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
