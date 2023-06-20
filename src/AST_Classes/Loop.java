package AST_Classes;

public class Loop extends  BaseNode{
    public void Print_Ast() {
        System.out.println("..........loop node...............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (for_loop!=null)
        {
            for_loop.Print_Ast();
        }
        if (while_loop!=null)
        {
            while_loop.Print_Ast();
        }
        if (for_each!=null)
        {
            for_each.Print_Ast();
        }
    }
    For_loop for_loop;
     While_loop while_loop;
     For_each for_each;

    public For_loop getFor_loop() {
        return for_loop;
    }

    public void setFor_loop(For_loop for_loop) {
        this.for_loop = for_loop;
    }

    public While_loop getWhile_loop() {
        return while_loop;
    }

    public void setWhile_loop(While_loop while_loop) {
        this.while_loop = while_loop;
    }

    public For_each getFor_each() {
        return for_each;
    }

    public void setFor_each(For_each for_each) {
        this.for_each = for_each;
    }
}
