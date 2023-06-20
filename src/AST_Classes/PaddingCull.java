package AST_Classes;

public class PaddingCull extends  BaseNode{
String padding;

public void Print_Ast()
{
    System.out.println("..............padding cull node...........");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(padding!=null)
    {
        System.out.println(padding);
    }
    if(paddingChild!=null)
    {
        paddingChild.Print_Ast();
    }
}
    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public PaddingChild getPaddingChild() {
        return paddingChild;
    }

    public void setPaddingChild(PaddingChild paddingChild) {
        this.paddingChild = paddingChild;
    }

    PaddingChild paddingChild;
}
