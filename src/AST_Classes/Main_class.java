package AST_Classes;

public class Main_class extends  BaseNode{
    public void Print_Ast() {
        System.out.println(".............main node..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (main_dart!=null)
        {
            main_dart.Print_Ast();
        }

        }
    Main_dart main_dart;

    public Main_dart getMain_dart() {
        return main_dart;
    }

    public void setMain_dart(Main_dart main_dart) {
        this.main_dart = main_dart;
    }
}
