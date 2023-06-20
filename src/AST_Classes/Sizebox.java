package AST_Classes;

public class Sizebox extends  BaseNode {
    public void Print_Ast() {
        System.out.println("............text node...........");
        System.out.println("****Children Count: " + getChildCounts() + "*******");
        if (SIZEBOX != null) {
            System.out.println(SIZEBOX);
        }
        if (COLOMN != null) {
            System.out.println(COLOMN);
        }
        if (NUMBER != null) {
            System.out.println(NUMBER);
        }
        if (HEIGHT != null) {
            System.out.println(HEIGHT);
        }
    }

    String SIZEBOX;
    String COLOMN;
    String COMA;
    String NUMBER;
    String HEIGHT;

    public String getSIZEBOX() {
        return SIZEBOX;
    }
    public void setSIZEBOX(String SIZEBOX) {
        this.SIZEBOX = SIZEBOX;
    }

    public String getCOLOMN() {
        return COLOMN;
    }
    public void setCOLOMN(String COLOMN) {
        this.COLOMN= COLOMN;
    }

    public String getCOMA() {
        return COMA;
    }
    public void setCOMA(String COMA) {
        this.COMA = COMA;
    }

    public String getNUMBER() {
        return NUMBER;
    }
    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String getHEIGHT() {
        return HEIGHT;
    }
    public void setHEIGHT(String HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
}
