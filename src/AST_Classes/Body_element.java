package AST_Classes;

public class Body_element extends  BaseNode {
    public void Print_Ast(){
        System.out.println("...............body element..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (vareble!=null)
        {
            vareble.Print_Ast();
        }
        if (array!=null)
        {
            array.Print_Ast();
        }
        if (cull_function!=null)
        {
            cull_function.Print_Ast();
        }
        if (loop!=null)
        {
            loop.Print_Ast();
        }
        if ( condetion!=null)
        {
            condetion.Print_Ast();
        }
        if ( print!=null)
        {
            print.Print_Ast();
        }
        if ( encaps!=null)
        {
            encaps.Print_Ast();
        }
    }

    Vareble vareble;
    Array array;
    Cull_function cull_function;
    Loop loop;
    Condetion condetion;
    Print print;
    Encaps encaps;

    public Vareble getVareble() {
        return vareble;
    }

    public void setVareble(Vareble vareble) {
        this.vareble = vareble;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Cull_function getCull_function() {
        return cull_function;
    }

    public void setCull_function(Cull_function cull_function) {
        this.cull_function = cull_function;
    }

    public Loop getLoop() {
        return loop;
    }

    public void setLoop(Loop loop) {
        this.loop = loop;
    }

    public Condetion getCondetion() {
        return condetion;
    }

    public void setCondetion(Condetion condetion) {
        this.condetion = condetion;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public Encaps getEncaps() {
        return encaps;
    }

    public void setEncaps(Encaps encaps) {
        this.encaps = encaps;
    }
}
