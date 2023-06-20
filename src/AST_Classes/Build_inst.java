package AST_Classes;

import java.util.ArrayList;

public class Build_inst extends  BaseNode {
    String returnn;
    Inkwell inkwell;
    ArrayList<Scafold_fun> scafoldFun=new ArrayList<>();
public void Print_Ast()
{
    System.out.println(" ...............build instens.............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(returnn!=null)
    {
        System.out.println(returnn);
    }
    if (inkwell!=null)
    {
        inkwell.Print_Ast();

    }
}
    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public Inkwell getInkwell() {
        return inkwell;
    }

    public void setInkwell(Inkwell inkwell) {
        this.inkwell = inkwell;
    }

    public ArrayList<Scafold_fun> getScafoldFun() {
        return scafoldFun;
    }

    public void setScafoldFun(ArrayList<Scafold_fun> scafoldFun) {
        this.scafoldFun = scafoldFun;
    }
}
