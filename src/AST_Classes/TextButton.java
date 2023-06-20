package AST_Classes;

public class TextButton extends  BaseNode {
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: " + getChildCounts() + "*******");
        if (TEXTBUTTON != null) {
            System.out.println(TEXTBUTTON);
        }

        if (COMA != null) {
            System.out.println(COMA);
        }
        if (onpressed != null) {
            onpressed.Print_Ast();
        }
        if (child != null) {
            child.Print_Ast();
        }
    }

    Onpressed onpressed;
    Child child;
    String TEXTBUTTON;

    String COMA;

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public String getTextbutton() {
        return  TEXTBUTTON;
    }

    public void setTextbutton(String  TEXTBUTTON) {
        this. TEXTBUTTON =  TEXTBUTTON;
    }

    public  Child getChild() {
        return child;
    }

    public void setChild( Child child) {
        this.child = child;
    }
    public Onpressed getOnpressed() {
        return onpressed;
    }

    public void setOnpressed( Onpressed onpressed) {
        this.onpressed = onpressed;
    }

}