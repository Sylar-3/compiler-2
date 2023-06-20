package AST_Classes;

import java.io.FileWriter;
import java.io.IOException;

public class Flutter_class extends  BaseNode{
    List list;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void Print_Ast() {
        System.out.println("................flutter class node............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (decler_class!=null)
        {
            //System.out.println("test class");
            decler_class.Print_Ast();
        }
        if (widget !=null)
        {
            widget.Print_Ast();
        }
    }
    Decler_class decler_class;
    Widget widget;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public Decler_class getDecler_class() {
        return decler_class;
    }

    public void setDecler_class(Decler_class decler_class) {
        this.decler_class = decler_class;
    }

    public void setValue(String className) {
        if (className.charAt(0) != className.toUpperCase().charAt(0) && className.charAt(0) != '_') {
            FileWriter test = null;
            try {
                test = new FileWriter("errors//SemanticError.txt");
                test.write("Semantic Error: Widget name must start with a capital letter. Symbol: "
                        + className + "\n");
                test.write("Semantic Error: Duplicated field: color");
                System.err.println();

                test.close();
                System.err.println("Semantic Error: Widget name must start with a capital letter. Symbol: "
                        + className + "\n");
                System.err.println("Duplicated field: color");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
