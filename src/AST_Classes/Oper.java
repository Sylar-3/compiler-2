package AST_Classes;

public class Oper extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............oper node................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if( OPER!=null) {
            System.out.println(OPER);
        }
        if (side!=null)
            {
                side.Print_Ast();
        }
    }
    String OPER;
    Side side;

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getOPER() {
        return OPER;
    }

    public void setOPER(String OPER) {
        this.OPER = OPER;
    }
}
