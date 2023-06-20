package AST_Classes;

public class If_condetion extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........if codetion................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if (operation !=null)
        {
            operation.Print_Ast();
        }
        }
    String NAME;
    Operation operation;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
