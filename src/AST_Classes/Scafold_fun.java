package AST_Classes;

public class Scafold_fun extends  BaseNode{
    Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void Print_Ast() {
        System.out.println("...............scaffold node..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(returnn!=null) {
            System.out.println(returnn);
        }
        if(SCAFOLD!=null) {
            System.out.println(SCAFOLD);
        }
        if (appbar!=null)
        {
            appbar.Print_Ast();
        }
        if (listproduct!=null)
        {
            listproduct.Print_Ast();
        }
    }
    String returnn;
    Appbar appbar;
    Listproduct listproduct ;
    String SCAFOLD;
    String   COMA;

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public String getSCAFOLD() {
        return SCAFOLD;
    }

    public void setSCAFOLD(String SCAFOLD) {
        this.SCAFOLD = SCAFOLD;
    }

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public Listproduct getListproduct() {
        return listproduct;
    }

    public void setListproduct(Listproduct listproduct) {
        this.listproduct = listproduct;
    }

    public Appbar getAppbar() {
        return appbar;
    }

    public void setAppbar(Appbar appbar) {
        this.appbar = appbar;
    }


}
