package AST_Classes;

public class Image extends  BaseNode{
    public void Print_Ast() {
        System.out.println("...........image node...........");
        if (URL != null) {
            System.out.println(URL);
        }
    }
    String URL;
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }


}
