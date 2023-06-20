package AST_Classes;

public class IF_Else extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........if else node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (iF != null) {
            iF.Print_Ast();
        }
        if (elsE != null) {
            elsE.Print_Ast();
        }
    }

    IF iF ;
    ElsE elsE;

    public IF getiF() {
        return iF;
    }

    public void setiF(IF iF) {
        this.iF = iF;
    }

    public ElsE getElsE() {
        return elsE;
    }

    public void setElsE(ElsE elsE) {
        this.elsE = elsE;
    }
}