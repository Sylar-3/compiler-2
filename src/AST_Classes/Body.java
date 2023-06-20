package AST_Classes;

public class Body extends  BaseNode{
PaddingCull paddingCull;

    public PaddingCull getPaddingCull() {
        return paddingCull;
    }

    public void setPaddingCull(PaddingCull paddingCull) {
        this.paddingCull = paddingCull;
    }

    public String getCOLOMN() {
        return COLOMN;
    }

    public void setCOLOMN(String COLOMN) {
        this.COLOMN = COLOMN;
    }

    public void Print_Ast() {
        System.out.println("...........array node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (BODY!= null) {
            System.out.println(BODY);
        }


        if ( center != null) {
            center.Print_Ast();
        }
    }
    String BODY;
    String COLOMN;

    Center center;

    public   Center getCenter() {
        return   center;
    }

    public void setCenter(Center center) {
        this. center =  center;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }



}
