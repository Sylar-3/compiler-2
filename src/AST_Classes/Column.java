package AST_Classes;

import java.util.ArrayList;

public class Column {
String column;
String name;
Text text;
ArrayList<TextFromField> textFromFields=new ArrayList<>();

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public ArrayList<TextFromField> getTextFromFields() {
        return textFromFields;
    }

    public void setTextFromFields(ArrayList<TextFromField> textFromFields) {
        this.textFromFields = textFromFields;
    }

    public ArrayList<Name> getNamee() {
        return namee;
    }

    public void setNamee(ArrayList<Name> namee) {
        this.namee = namee;
    }

    ArrayList<Name> namee=new ArrayList<>();
String children;
PaddingCull paddingCull;
CircleAvatar circleAvatar;
Onpressed onpressed;

    public Onpressed getOnpressed() {
        return onpressed;
    }

    public void setOnpressed(Onpressed onpressed) {
        this.onpressed = onpressed;
    }

    ArrayList<Sizebox> sizeboxes=new ArrayList<>();
ArrayList<Container> containers=new ArrayList<>();
public void Print_Ast(){
    if (column!=null)
    {
        System.out.println(column);
    }
    if(name!=null)
    {
        System.out.println(name);
    }
    if (namee!=null)
    {
        for (int i = 0; i < namee.size(); i++) {
            namee.get(i).Print_Ast();
        }
    }
    if(children!=null)
    {
        System.out.println(children);
    }
}
Child child;

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public PaddingCull getPaddingCull() {
        return paddingCull;
    }

    public void setPaddingCull(PaddingCull paddingCull) {
        this.paddingCull = paddingCull;
    }

    public CircleAvatar getCircleAvatar() {
        return circleAvatar;
    }

    public void setCircleAvatar(CircleAvatar circleAvatar) {
        this.circleAvatar = circleAvatar;
    }

    public ArrayList<Sizebox> getSizeboxes() {
        return sizeboxes;
    }

    public void setSizeboxes(ArrayList<Sizebox> sizeboxes) {
        this.sizeboxes = sizeboxes;
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    public void setContainers(ArrayList<Container> containers) {
        this.containers = containers;
    }
}
