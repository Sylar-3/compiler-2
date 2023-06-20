package AST_Classes;

import java.util.ArrayList;

public class Build extends  BaseNode {
    String widget;
    ArrayList<Build_inst> buildInsts=new ArrayList<>();
public void Print_Ast()
{
    System.out.println(".............build............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(widget!=null)
    {
        System.out.println(widget);
    }
    if(buildInsts!=null)
    {
        for (int i = 0; i < buildInsts.size(); i++) {
            buildInsts.get(i).Print_Ast();
        }
    }
}

    public String getWidget() {
        return widget;
    }

    public void setWidget(String widget) {
        this.widget = widget;
    }

    public ArrayList<Build_inst> getBuildInsts() {
        return buildInsts;
    }

    public void setBuildInsts(ArrayList<Build_inst> buildInsts) {
        this.buildInsts = buildInsts;
    }
}
