package AST_Classes;

public class Class_body extends  BaseNode {
    public void Print_Ast() {
        System.out.println("..............class body node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (vareble != null) {
            vareble.Print_Ast();
        }
        if (array != null) {
            array.Print_Ast();
        }
        if (create_function!= null) {
            create_function.Print_Ast();
        }
    }



    Vareble vareble;
    Array array;
    Create_function create_function;

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Create_function getCreate_function() {
        return create_function;
    }

    public void setCreate_function(Create_function create_function) {
        this.create_function = create_function;
    }

    public Vareble getVareble() {
        return vareble;
    }

    public void setVareble(Vareble vareble) {
        this.vareble = vareble;
    }
}
