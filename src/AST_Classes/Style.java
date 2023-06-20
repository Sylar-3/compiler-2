package AST_Classes;

public class Style extends  BaseNode{
    String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    TextStyle textStyle;
    public void Print_Ast() {
        System.out.println("..............style node.................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (style!=null)
        {
            System.out.println(style);
        }
        if(textStyle!=null)
        {
            textStyle.Print_Ast();
        }
    }}
