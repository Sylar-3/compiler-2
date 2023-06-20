package AST_Classes;

public class OnTap extends  BaseNode{
    String ontap;
    String onpressed;
public void Print_Ast(){
    System.out.println("..........on tap node............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(ontap!=null)
    {
        System.out.println(ontap);
    }
    if(onpressed!=null)
    {
        System.out.println(onpressed);
    }
}
    public String getOntap() {
        return ontap;
    }

    public void setOntap(String ontap) {
        this.ontap = ontap;
    }

    public String getOnpressed() {
        return onpressed;
    }

    public void setOnpressed(String onpressed) {
        this.onpressed = onpressed;
    }
}
