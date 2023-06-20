package AST_Classes;

public class Inkwell extends  BaseNode{
    String inkwel;

    public void Print_Ast(){
        System.out.println("..........inkwel node.................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(inkwel!=null)
        {
            System.out.println(inkwel);
        }
        if(inkwelChilde!=null)
        {
            inkwelChilde.Print_Ast();
        }
    }
    public String getInkwel() {
        return inkwel;
    }

    public void setInkwel(String inkwel) {
        this.inkwel = inkwel;
    }

    public InkwelChilde getInkwelChilde() {
        return inkwelChilde;
    }

    public void setInkwelChilde(InkwelChilde inkwelChilde) {
        this.inkwelChilde = inkwelChilde;
    }

    InkwelChilde inkwelChilde;
}
