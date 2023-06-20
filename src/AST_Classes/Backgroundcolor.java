package AST_Classes;

public class Backgroundcolor extends  BaseNode{
    String BACKGROUNDCOLOR;
    String NAME;
    String COLOMN;

   Name name;
    public void Print_Ast(){
        System.out.println("...............text style node..............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(BACKGROUNDCOLOR!=null)
        {
            System.out.println(BACKGROUNDCOLOR);
        }
        if( NAME!=null)
        {
            System.out.println( NAME);
        }

        if(name!=null)
        {
           name.Print_Ast();
        }

    }

    public String getBackgroundcolor() {return BACKGROUNDCOLOR;
    }

    public void setBackgroundcolor(String BACKGROUNDCOLOR) {
        this.BACKGROUNDCOLOR = BACKGROUNDCOLOR;
    }


    public String getNAME() {return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCOLOMN() {return COLOMN;
    }

    public void setCOLOMN(String COLOMN) {
        this.COLOMN = COLOMN;
    }

    public  Name getName() {
        return  name;
    }

    public void setName( Name name) {
        this. name =  name;
    }
}
