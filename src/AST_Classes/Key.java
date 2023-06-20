package AST_Classes;

public class Key extends  BaseNode{
    String constt;
    String finall;
    String late;
public void Print_Ast()
{
    System.out.println(".........key node.........");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(constt!=null)
    {
        System.out.println(constt);
    } else if (finall!=null) {
        System.out.println(finall);
    } else if (late!=null) {
        System.out.println(late);
    }
}
    public String getConstt() {
        return constt;
    }

    public void setConstt(String constt) {
        this.constt = constt;
    }

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }
}
