package AST_Classes;

import java.util.ArrayList;

public class List extends BaseNode {
    public void Print_Ast() {
        System.out.println("...........header main node..........");
        System.out.println("****Children Count: " + getChildCounts() + "*******");
        if (Name != null) {
            System.out.println(Name);
        }

        if (element != null) {
            for (int i = 0; i < element.size(); i++)
                element.get(i).Print_Ast();
        }
    }


    String Name;


    ArrayList<Element> element = new ArrayList<>();

    public ArrayList<Element> getElement() {
        return element;
    }

    public void setElement(ArrayList<Element> element) {
        this.element = element;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


}
