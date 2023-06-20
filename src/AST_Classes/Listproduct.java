package AST_Classes;

import java.util.ArrayList;

public class Listproduct {
    public void Print_Ast() {
        if(product!=null)
        {
            for (int i=0;i<product.size();i++)
                product.get(i).Print_Ast();
        }
    }
    ArrayList<Product> product=new ArrayList<>();

    String COMA;

    public String getCOMA() {
        return COMA;
    }

    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
}
