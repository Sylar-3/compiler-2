package AST_Classes;

public class PaddingChild extends  BaseNode{
Padd padd;
Child child;
public void Print_Ast(){
    System.out.println("....................padding childe node................");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
if(padd!=null)
{
    padd.Print_Ast();
}
if(child!=null)
{
    child.Print_Ast();
}
}
    public Padd getPadd() {
        return padd;
    }

    public void setPadd(Padd padd) {
        this.padd = padd;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
