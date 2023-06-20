package AST_Classes;

import java.util.ArrayList;

public class Color extends  BaseNode {
    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public void Print_Ast() {
        System.out.println("..............color node.............");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if (COLOR != null) {
            System.out.println(COLOR);
        }
        if(strings!=null)
        {
            for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
            }
        }
    }

ArrayList<String> strings=new ArrayList<>();

    String COLOR;

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    }
