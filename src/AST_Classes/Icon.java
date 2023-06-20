package AST_Classes;

public class Icon extends  BaseNode{
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if (icon!=null)
        System.out.println(icon);
    if (NAME!=null)
        System.out.println(NAME);
        if (name!=null)
        {
            name.Print_Ast();
        }
        if(  NUMBER!=null) {
            System.out.println(  NUMBER);
        }
    }

    public Name getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    Name name;
    String NAME;
    String icon;
    String NUMBER;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }


    public void setName(Name name) {
        this.name = name;
    }
}
