package AST_Classes;


public class CircleAvatar extends  BaseNode{
    String CIRCLEAVATAR;
    String RADIUS;
    String COLOMN;

    String NUMBER;
    Backgroundcolor backgroundcolor;
    Child child;

    public Backgroundcolor getBackgroundcolor() {
        return backgroundcolor;
    }

    public void Print_Ast() {
        System.out.println("...............text style node..............");
        System.out.println("****Children Count: " + getChildCounts() + "*******");
        if (CIRCLEAVATAR != null) {
            System.out.println(CIRCLEAVATAR);
        }
        if (RADIUS != null) {
            System.out.println(RADIUS);
        }
        if (NUMBER != null) {
            System.out.println(NUMBER);
        }


        if (backgroundcolor != null) {
            backgroundcolor.Print_Ast();
        }

        if (child != null) {
            child.Print_Ast();

        }
    }

        public String getCircleavatar() {return CIRCLEAVATAR;
        }

        public void setCircleavatar(String CIRCLEAVATAR) {
            this.CIRCLEAVATAR = CIRCLEAVATAR;
        }

    public String getRadius() {return RADIUS;
    }

    public void setRadius(String RADIUS) {
        this.RADIUS = RADIUS;
    }

    public String getCOLOMN() {return COLOMN;
    }

    public void setCOLOMN(String COLOMN) {
        this.COLOMN = COLOMN;
    }

    public String getNUMBER() {return NUMBER;
    }
    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }


    public void setBackgroundcolor(Backgroundcolor backgroundcolor) {
        this.backgroundcolor = backgroundcolor;
    }

    public void setChild(Child child) {
        this.child = child;
    }
    }
