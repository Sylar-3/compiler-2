package AST_Classes;

import java.util.ArrayList;

public class Start_program extends  BaseNode{
    public void Print_Ast() {
        System.out.println(".............start program node...........");
        System.out.println("****Children Count: "+ getChildCounts()+" *******");
        if(classes!=null)
        {

            for (int i=0;i<classes.size();i++)
                classes.get(i).Print_Ast();
        }
        if( flutterClass!=null)
        {
            //System.out.println("test class");
            for (int i=0;i< flutterClass.size();i++)
                flutterClass.get(i).Print_Ast();
        }
        if (main_class!=null)
        {
            main_class.Print_Ast();
        }
    }


  ArrayList <Flutter_class>  flutterClass=new ArrayList<>();

    public ArrayList<Flutter_class> getFlutterClass() {
        return flutterClass;
    }

    public void setFlutterClass(ArrayList<Flutter_class> flutterClass) {
        this.flutterClass = flutterClass;
    }

    Main_class main_class;

    public Main_class getMain_class() {
        return main_class;
    }

    public void setMain_class(Main_class main_class) {
        this.main_class = main_class;
    }
ArrayList<Classs> classes=new ArrayList<>();

    public ArrayList<Classs> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classs> classes) {
        this.classes = classes;
    }
}
