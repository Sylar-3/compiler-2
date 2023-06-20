package AST_Classes;

import java.util.ArrayList;

public class Padd extends  BaseNode{
    String padd;
    ArrayList<String> strings=new ArrayList<>();
    ArrayList<String> number=new ArrayList<>();
public void Print_Ast(){
    System.out.println("............padding node.............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(padd!=null)
    {
        System.out.println(padd);
    }
    if(strings!=null)
    {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
    if(number!=null)
    {
        for (int i=0;i<number.size();i++)
        System.out.println(number.get(i));
    }
}
    public String getPadd() {
        return padd;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<String> number) {
        this.number = number;
    }

    public void setPadd(String padd) {
        this.padd = padd;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }
}
