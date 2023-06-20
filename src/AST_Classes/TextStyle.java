package AST_Classes;

public class TextStyle extends  BaseNode{
    String textstyle;
    Color color;
public void Print_Ast(){
    System.out.println("...............text style node..............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(textstyle!=null)
    {
        System.out.println(textstyle);
    }
    if(color!=null)
    {
        color.Print_Ast();
    }

}

    public String getTextstyle() {
        return textstyle;
    }

    public void setTextstyle(String textstyle) {
        this.textstyle = textstyle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
