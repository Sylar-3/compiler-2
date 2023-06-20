package AST_Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Classs extends  BaseNode{



    public void Print_Ast() {
        System.out.println(".............class............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(decler_class!=null)
        {
           // System.out.println("test decler");
            decler_class.Print_Ast();
        }
        if (extend!=null)
        {
            extend.Print_Ast();
        }
        if(class_body!=null)
        {
            for (int i=0;i<class_body.size();i++)
                class_body.get(i).Print_Ast();
        }

    }
    Decler_class decler_class ;
    Extend extend;
    ArrayList<Class_body> class_body=new ArrayList<>();

    public Decler_class getDecler_class() {
        return decler_class;
    }

    public void setDecler_class(Decler_class decler_class) {
        this.decler_class = decler_class;
    }

    public Extend getExtend() {
        return extend;
    }

    public void setExtend(Extend extend) {
        this.extend = extend;
    }

    public ArrayList<Class_body> getClass_body() {
        return class_body;
    }

    public void setClass_body(ArrayList<Class_body> class_body) {
        this.class_body = class_body;
    }

    public void setValue(String className) {
        if (className.charAt(0) != className.toUpperCase().charAt(0) && className.charAt(0) != '_') {
            FileWriter test = null;
            try {
                test = new FileWriter("errors//SemanticError.txt");
                test.write("Semantic Error: Widget name must start with a capital letter. Symbol: "
                        + className + "\n");
                test.close();
                System.err.println("Semantic Error: Widget name must start with a capital letter. Symbol: "
                        + className + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
