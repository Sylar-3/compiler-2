package AST_Classes;

import java.util.ArrayList;

public class Product extends  BaseNode{
    public void Print_Ast() {

        if(PRODUCT!=null) {
            System.out.println(PRODUCT);
        }
        if (text!=null)
        {
            for (int i = 0; i < text.size(); i++) {
                text.get(i).Print_Ast();
            }
        }
        if (image!=null)
        {
            image.Print_Ast();
        }
        }


    Image image ;
     ArrayList<Text> text=new ArrayList<>();
     String  PRODUCT;
    String COMA;

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public String getPRODUCT() {
        return PRODUCT;
    }

    public void setPRODUCT(String PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ArrayList<Text> getText() {
        return text;
    }

    public void setText(ArrayList<Text> text) {
        this.text = text;
    }
}
