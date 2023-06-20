package AST_Classes;

public class Constructer extends  BaseNode {
String name;
Atrbute atrbute;
public void Print_Ast(){
    System.out.println("...............construct............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(name!=null)
    {
        System.out.println(name);
    }
    if(atrbute!=null)
    {
        atrbute.Print_Ast();
    }
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Atrbute getAtrbute() {
        return atrbute;
    }

    public void setAtrbute(Atrbute atrbute) {
        this.atrbute = atrbute;
    }
}
