package AST_Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Widget extends BaseNode {
    public void Print_Ast() {
        System.out.println("..............widget node................");
        System.out.println("****Children Count: " + getChildCounts() + "*******");
        if (CREATE_WIDGET != null) {
            System.out.println(CREATE_WIDGET);
        }

        if (elements != null) {
            for (int i = 0; i < elements.size(); i++) {
                elements.get(i).Print_Ast();
            }
        }

    }

    Scafold_fun scafold_fun;


    String CREATE_WIDGET;
    ArrayList<Element> elements = new ArrayList<>();

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    String SEMI;

    public Scafold_fun getScafold_fun() {
        return scafold_fun;
    }

    public String getCREATE_WIDGET() {
        return CREATE_WIDGET;
    }

    public void setCREATE_WIDGET(String CREATE_WIDGET) {
        this.CREATE_WIDGET = CREATE_WIDGET;
    }

    public String getSEMI() {
        return SEMI;
    }

    public void setSEMI(String SEMI) {
        this.SEMI = SEMI;
    }

    public void setScafold_fun(Scafold_fun scafold_fun) {
        this.scafold_fun = scafold_fun;
    }

    public void setValue(String className) {
        if (className.charAt(0) != className.toUpperCase().charAt(0)) {
            FileWriter test = null;
            try {
                test = new FileWriter("errors//SemanticError.txt");
                test.write("Semantic Error: Widget name must start with a capital letter. Symbol: "
                        + className + "\n");
                test.close();
                System.err.println("Semantic Error: Widget name must start with a capital letter. Symbol: "
                        + className + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
