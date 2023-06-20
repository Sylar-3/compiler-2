package AST_Classes;

public class Var_equal extends  BaseNode{
    public void Print_Ast() {
        System.out.println("..............var equal node............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(EQUAL!=null) {
            System.out.println(EQUAL);
        }

        if (others!=null)
        {
            others.Print_Ast();
        }
        if (oper!=null)
        {
            oper.Print_Ast();
        }
    }
    String EQUAL;
     Others others ;
     Oper oper;

    public Others getOthers() {
        return others;
    }

    public void setOthers(Others others) {
        this.others = others;
    }

    public Oper getOper() {
        return oper;
    }

    public void setOper(Oper oper) {
        this.oper = oper;
    }

    public String getEQUAL() {
        return EQUAL;
    }

    public void setEQUAL(String EQUAL) {
        this.EQUAL = EQUAL;
    }
}
