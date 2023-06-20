package AST_Classes;

public class Cunstructer  extends  BaseNode{
    public void Print_Ast() {
        System.out.println("..............cunstructer node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (NAME != null) {
            System.out.println(NAME);
        }
        if (COLOMN != null) {
            System.out.println(COLOMN);
        }
        if (cull_function != null) {
            cull_function.Print_Ast();
        }
    }



   String  NAME;
   String COLOMN;
    Cull_function cull_function;
    Encaps encaps;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCOLOMN() {
        return COLOMN;
    }

    public void setCOLOMN(String COLOMN) {
        this.COLOMN = COLOMN;
    }

    public Cull_function getCull_function() {
        return cull_function;
    }

    public void setCull_function(Cull_function cull_function) {
        this.cull_function = cull_function;
    }

    public Encaps getEncaps() {
        return encaps;
    }

    public void setEncaps(Encaps encaps) {
        this.encaps = encaps;
    }
}
