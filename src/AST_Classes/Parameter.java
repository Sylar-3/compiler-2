package AST_Classes;

public class Parameter extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........prameter node...........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(STRING!=null) {
            System.out.println(STRING);
        }
        if(URL!=null) {
            System.out.println(URL);
        }
        if(NAME!=null) {
            System.out.println(NAME);
        }
        if(CHAR!=null) {
            System.out.println(CHAR);
        }
        if (cunstructer!=null)
        {
            cunstructer.Print_Ast();
        }
    }
    String NAME;
     String STRING;
    String CHAR;
    String URL;
    Cunstructer cunstructer;

    public Cunstructer getCunstructer() {
        return cunstructer;
    }

    public void setCunstructer(Cunstructer cunstructer) {
        this.cunstructer = cunstructer;
    }

    public Cull_function getCull_function() {
        return cull_function;
    }

    public void setCull_function(Cull_function cull_function) {
        this.cull_function = cull_function;
    }

    Cull_function cull_function;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getCHAR() {
        return CHAR;
    }

    public void setCHAR(String CHAR) {
        this.CHAR = CHAR;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
