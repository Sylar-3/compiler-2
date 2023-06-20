package AST_Classes;

import java.util.ArrayList;

public class Width extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");

if (WIDTH!=null){
    System.out.println(WIDTH);
}
        if(  COMA!=null) {
            System.out.println(  COMA);
        }
        if(  HEIGHT!=null) {
            System.out.println(  HEIGHT);
        }

        if (child!=null)
        {
            child.Print_Ast();
        }
    }
    Child child;
    String HEIGHT;
    String COMA;

    public ArrayList<String> getNumbers() {
        return Numbers;
    }

    public void setNumbers(ArrayList<String> numbers) {
        Numbers = numbers;
    }

    ArrayList<String> Numbers=new ArrayList<>();
    String WIDTH;

    public String getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(String HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public String getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(String WIDTH) {
        this.WIDTH = WIDTH;
    }

    public String getHeight() {
        return  HEIGHT;
    }

    public void setHeight(String  HEIGHT) {
        this. HEIGHT =  HEIGHT;
    }

    public String getCOMA() {
        return COMA;
    }
    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }



    public  Child getChild() {
        return child;
    }

    public void setChild( Child child) {
        this.child = child;
    }
}
