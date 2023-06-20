package AST_Classes;


public class Decoration extends  BaseNode{
    String DECORATION;
    Name name;
    Color color;
    Child child;
Decorationn decorationn;

    public String getDECORATION() {
        return DECORATION;
    }

    public void setDECORATION(String DECORATION) {
        this.DECORATION = DECORATION;
    }

    public Decorationn getDecorationn() {
        return decorationn;
    }

    public void setDecorationn(Decorationn decorationn) {
        this.decorationn = decorationn;
    }

    public void Print_Ast(){
        System.out.println("..............cliprrect node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(DECORATION!=null)
        {
            System.out.println(DECORATION);
        }
        if(name!=null)
        {
            name.Print_Ast();
        }
        if(color!=null)
        {
            color.Print_Ast();
        }
        if(child!=null)
        {
            child.Print_Ast();
        }
    }
    public String getDecoration() {
        return DECORATION;
    }

    public void setDecoration(String DECORATION) {
        this.DECORATION= DECORATION;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
