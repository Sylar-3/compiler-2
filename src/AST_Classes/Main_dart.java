package AST_Classes;

public class Main_dart extends  BaseNode{
    public void Print_Ast() {
        System.out.println(".........main dart node........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (header_main!=null)
        {
            header_main.Print_Ast();
        }
    }
    Header_main header_main;

    public Header_main getHeader_main() {
        return header_main;
    }

    public void setHeader_main(Header_main header_main) {
        this.header_main = header_main;
    }
}
