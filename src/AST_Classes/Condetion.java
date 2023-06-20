package AST_Classes;

public class Condetion extends  BaseNode {
    public void Print_Ast() {
        System.out.println("..............condetion............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (iF_Else != null) {
            iF_Else.Print_Ast();
        }
        if (iF != null) {
            iF.Print_Ast();
        }
    }


   IF iF;
   IF_Else iF_Else;

    public IF getiF() {
        return iF;
    }

    public void setiF(IF iF) {
        this.iF = iF;
    }

    public IF_Else getiF_Else() {
        return iF_Else;
    }

    public void setiF_Else(IF_Else iF_Else) {
        this.iF_Else = iF_Else;
    }
}
