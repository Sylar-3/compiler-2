package AST_Classes;

public class Center extends  BaseNode {
    String center;
    Child child;
public void Print_Ast(){
    System.out.println("...............center node...............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(center!=null)
    {
        System.out.println(center);
    }
    if(child!=null)
    {
        child.Print_Ast();
    }
}
    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
