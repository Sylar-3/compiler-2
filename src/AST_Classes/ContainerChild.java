package AST_Classes;

import java.util.ArrayList;

public class ContainerChild  extends  BaseNode{
String height;
String number;
Width width;
Decoration decoration;
Onpressed onpressed;

    public Onpressed getOnpressed() {
        return onpressed;
    }

    public void setOnpressed(Onpressed onpressed) {
        this.onpressed = onpressed;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    public Decoration getDecoration() {
        return decoration;
    }

    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    String alligment;
ArrayList <String>strings=new ArrayList<>();
Child child;
Color color;
public void Print_Ast()
{
    System.out.println(".............container child node ................");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(height!=null)
    {
        System.out.println(height);
    }
    if(number!=null){
        System.out.println(number);

    }
    if(alligment!=null)
    {
        System.out.println(alligment);
        if(strings!=null)
        {
            for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
            }
        }
        if(child!=null)
        {
            child.Print_Ast();
        }
    } if (color!=null) {
        color.Print_Ast();
        if(child!=null)
        {
            child.Print_Ast();
        }
    }
}
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAlligment() {
        return alligment;
    }

    public void setAlligment(String alligment) {
        this.alligment = alligment;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
