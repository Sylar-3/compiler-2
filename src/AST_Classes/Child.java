package AST_Classes;

import java.awt.*;

public class Child extends  BaseNode {
    String child;
Column column;
Icon icon;
TextButton textbutton;
    public void Print_Ast(){
        System.out.println("..........child..........");
        System.out.println("****Children Count: "+ getChildCounts()+"*******");
        if(child!=null)
        {
            System.out.println(child);
        } if (paddingCull!=null) {
            paddingCull.Print_Ast();
        } if (cliprrect!=null) {
            cliprrect.Print_Ast();
        } if (container!=null) {
            container.Print_Ast();
        } if (center!=null) {
            center.Print_Ast();
        } if (text!=null) {
            text.Print_Ast();
        } if (imageAsset!=null) {
            imageAsset.Print_Ast();
        }
    }
    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public PaddingCull getPaddingCull() {
        return paddingCull;
    }

    public void setPaddingCull(PaddingCull paddingCull) {
        this.paddingCull = paddingCull;
    }

    public Cliprrect getCliprrect() {
        return cliprrect;
    }

    public void setCliprrect(Cliprrect cliprrect) {
        this.cliprrect = cliprrect;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public ImageAsset getImageAsset() {
        return imageAsset;
    }

    public void setImageAsset(ImageAsset imageAsset) {
        this.imageAsset = imageAsset;
    }

    PaddingCull paddingCull;
    Cliprrect cliprrect;
        Container container;
    Center center;
        Text text;

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public TextButton getTextbutton() {
        return textbutton;
    }

    public void setTextbutton(TextButton textbutton) {
        this.textbutton = textbutton;
    }

    ImageAsset imageAsset;
}
