package AST_Classes;

import java.util.ArrayList;



public class Argument extends  BaseNode{

    public void Print_Ast() {
        System.out.println("............argument node .....................");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (parameter != null) {
            for (int i = 0; i < parameter.size(); i++)
                parameter.get(i).Print_Ast();
        }
    }


    String COMA;
    ArrayList<Parameter> parameter=new ArrayList<>();

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public ArrayList<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(ArrayList<Parameter> parameter) {
        this.parameter = parameter;
    }
}
