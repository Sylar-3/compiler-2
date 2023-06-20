package AST_Classes;

public class Appbar extends  BaseNode {
Text text;
Title title;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void Print_Ast() {
        System.out.println("...............app bar node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (APPBAR != null) {
            System.out.println(APPBAR);
        }
        if(text!=null)
        {
            text.Print_Ast();
        }
       }


   String COMA;
     String APPBAR;

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public String getAPPBAR() {
        return APPBAR;
    }

    public void setAPPBAR(String APPBAR) {
        this.APPBAR = APPBAR;
    }

    }
