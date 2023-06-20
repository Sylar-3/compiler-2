package AST_Classes;

public class Onpressed extends  BaseNode {
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: " + getChildCounts() + "*******");


        if (ONPRESSED != null) {
            System.out.println(ONPRESSED);
        }
        if (COMA != null) {
            System.out.println(COMA);
        }
        if (navigator != null) {
            navigator.Print_Ast();
        }
    }

    Navigator navigator;
    String ONPRESSED;
    String COMA;

    public String getONPRESSED() {
        return ONPRESSED;
    }

    public void setONPRESSED(String ONPRESSED) {
        this.ONPRESSED = ONPRESSED;
    }

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

        public Navigator getNavigator() {
            return navigator;
        }
    public Navigator setNavigator(Navigator navigator) {
        return this.navigator;
    }

    public void setChild( Navigator navigator) {
        this.navigator = navigator;
    }

}


