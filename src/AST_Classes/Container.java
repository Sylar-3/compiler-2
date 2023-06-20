package AST_Classes;

import java.util.ArrayList;

public class Container extends  BaseNode {
    String container;
public  void Print_Ast(){
    System.out.println("...............container.............");
    System.out.println("****Children Count: "+ getChildCounts()+"*******");
    if(container!=null)
    {
        System.out.println(container);
    }
    if(containerChildren!=null)
    {
        for (int i = 0; i < containerChildren.size(); i++) {
            containerChildren.get(i).Print_Ast();
        }
    }
}
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public ArrayList<ContainerChild> getContainerChildren() {
        return containerChildren;
    }

    public void setContainerChildren(ArrayList<ContainerChild> containerChildren) {
        this.containerChildren = containerChildren;
    }

    ArrayList<ContainerChild> containerChildren=new ArrayList<>();
}
