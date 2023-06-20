package AST_Classes;


import java.util.ArrayList;

public class Navigator extends  BaseNode {
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: " + getChildCounts() + "*******");
        if (NAME != null) {
            System.out.println(NAME);
        }

        if ( NAVIGATOR != null) {
            System.out.println( NAVIGATOR);
        }

        if ( CONTEXT!= null) {
            System.out.println( CONTEXT);
        }

        if (name!= null) {
            for (int i = 0; i < name.size(); i++) {

                name.get(i).Print_Ast();
            }
        }
    }


   ArrayList< Name> name=new ArrayList<>();
    String NAVIGATOR;
     String NAME;
    String CONTEXT;

    public String getNavigator() {
        return  NAVIGATOR;
    }

    public void setNavigator(String  NAVIGATOR) {
        this. NAVIGATOR=  NAVIGATOR;
    }
    public String getCONTEXT() {
        return  CONTEXT;
    }

    public void setCONTEXT(String CONTEXT) {
        this. CONTEXT=  CONTEXT;
    }

    public String getNAME() {
        return  NAME;
    }

    public void setNAME(String  NAME) {
        this. NAME =  NAME;
    }

    public ArrayList<Name> getName() {
        return name;
    }

    public void setName(ArrayList<Name> name) {
        this.name = name;
    }

    public String getNAVIGATOR() {
        return NAVIGATOR;
    }

    public void setNAVIGATOR(String NAVIGATOR) {
        this.NAVIGATOR = NAVIGATOR;
    }
}
