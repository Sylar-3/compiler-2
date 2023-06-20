package Visitor;

import AST_Classes.*;
import CodeGenerate.CodeGenerate;
import gen.*;

public class Visitor extends PARSERBaseVisitor<Object> {

    @Override
    public TextButton visitTextbutton(PARSER.TextbuttonContext ctx) {
        TextButton textbutton = new TextButton();
        if (ctx.TEXTBUTTON() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.TEXTBUTTON().getText(), ctx.
                    TEXTBUTTON().getSymbol().getLine(), ctx.TEXTBUTTON().getSymbol().getCharPositionInLine()));
            textbutton.setTextbutton(ctx.TEXTBUTTON().getText());
        }
        if (ctx.onpressed() != null) {
            textbutton.setOnpressed(visitOnpressed(ctx.onpressed()));
        }
        if (ctx.child() != null) {

            textbutton.setChild(visitChild(ctx.child()));
        }

        return textbutton;
    }

    @Override
    public Onpressed visitOnpressed(PARSER.OnpressedContext ctx) {

        Onpressed onpressed = new Onpressed();
        if (ctx.ONPRESSED() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.ONPRESSED().getText(), ctx.
                    ONPRESSED().getSymbol().getLine(), ctx.ONPRESSED().getSymbol().getCharPositionInLine()));
            onpressed.setONPRESSED(ctx.ONPRESSED().getText());
        }
        if (ctx.navigator() != null) {
            onpressed.setNavigator(visitNavigator(ctx.navigator()));
        }

        return onpressed;
    }

    @Override
    public Width visitWidth(PARSER.WidthContext ctx) {

        Width width = new Width();
        if (ctx.WIDTH() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.WIDTH().getText(), ctx.
                    WIDTH().getSymbol().getLine(), ctx.WIDTH().getSymbol().getCharPositionInLine()));
            width.setWIDTH(ctx.WIDTH().getText());
        }
        if (ctx.NUMBER() != null) {
            for (int i = 0; i < ctx.NUMBER().size(); i++) {

                symbolTable.symbolsList.add(new Symbol(ctx.NUMBER(i).getText(), ctx.
                        NUMBER(i).getSymbol().getLine(), ctx.NUMBER(i).getSymbol().getCharPositionInLine()));

                width.getNumbers().add(ctx.NUMBER(i).getText());
            }
        }
        if (ctx.HEIGHT() != null) {

            width.setHEIGHT(ctx.HEIGHT().getText());
        }
        if (ctx.child() != null) {
            width.setChild(visitChild(ctx.child()));
        }

        return width;

    }

    @Override
    public Icon visitIcon(PARSER.IconContext ctx) {

        Icon icon = new Icon();
        if (ctx.ICON() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.ICON().getText(), ctx.
                    ICON().getSymbol().getLine(), ctx.ICON().getSymbol().getCharPositionInLine()));
            icon.setIcon(ctx.ICON().getText());
        }
        if (ctx.NAME() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.
                    NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));
            icon.setNAME(ctx.NAME().getText());
        }
        if (ctx.name() != null) {
            icon.setName(visitName(ctx.name()));
        }
        if (ctx.NUMBER() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.NUMBER().getText(), ctx.
                    NUMBER().getSymbol().getLine(), ctx.NUMBER().getSymbol().getCharPositionInLine()));
            icon.setNUMBER(ctx.NUMBER().getText());
        }
        return icon;
    }

    @Override
    public TextFromField visitTextFromField(PARSER.TextFromFieldContext ctx) {
        TextFromField textFromField = new TextFromField();
        if (ctx.TEXTFIELD() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.TEXTFIELD().getText(), ctx.
                    TEXTFIELD().getSymbol().getLine(), ctx.TEXTFIELD().getSymbol().getCharPositionInLine()));

            textFromField.setTextfield(ctx.TEXTFIELD().getText());
        }
        if (ctx.decoration() != null) {
            textFromField.setDecoration(visitDecoration(ctx.decoration()));
        }
        return textFromField;
    }

    @Override
    public Decorationn visitDecorationn(PARSER.DecorationnContext ctx) {
        Decorationn decorationn = new Decorationn();
        if (ctx.DECORATION() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.DECORATION().getText(), ctx.
                    DECORATION().getSymbol().getLine(), ctx.DECORATION().getSymbol().getCharPositionInLine()));

            decorationn.setDecoration(ctx.DECORATION().getText());
        }
        if (ctx.labeltext() != null) {
            decorationn.setLableText(visitLabeltext(ctx.labeltext()));
        }
        return decorationn;
    }

    @Override
    public LableText visitLabeltext(PARSER.LabeltextContext ctx) {
        LableText lableText = new LableText();
        if (ctx.LABELTEXT() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.LABELTEXT().getText(), ctx.
                    LABELTEXT().getSymbol().getLine(), ctx.LABELTEXT().getSymbol().getCharPositionInLine()));

            lableText.setLabletext(ctx.LABELTEXT().getText());
        }
        if (ctx.CHAR() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.CHAR().getText().replaceAll("\'", ""), ctx.
                    CHAR().getSymbol().getLine(), ctx.CHAR().getSymbol().getCharPositionInLine()));

            lableText.setCharr(ctx.CHAR().getText());
        }
        return lableText;
    }

    @Override
    public Column visitColumn(PARSER.ColumnContext ctx) {

        Column column = new Column();
        if (ctx.COLUMN() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.COLUMN().getText(), ctx.
                    COLUMN().getSymbol().getLine(), ctx.COLUMN().getSymbol().getCharPositionInLine()));
            column.setColumn(ctx.COLUMN().getText());
        }
        if (ctx.NAME() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.
                    NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));
            column.setName(ctx.NAME().getText());
        }
        if (ctx.name() != null) {
            for (int i = 0; i < ctx.name().size(); i++) {
                column.getNamee().add(visitName(ctx.name(i)));
            }
        }
        if (ctx.CHILDREN() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.CHILDREN().getText(), ctx.
                    CHILDREN().getSymbol().getLine(), ctx.CHILDREN().getSymbol().getCharPositionInLine()));
            column.setChildren(ctx.CHILDREN().getText());
        }
        if (ctx.padding_cull() != null) {
            column.setPaddingCull(visitPadding_cull(ctx.padding_cull()));
        }
        if (ctx.circleAvatar() != null) {
            column.setCircleAvatar(visitCircleAvatar(ctx.circleAvatar()));
        }
        if (ctx.sizebox() != null) {
            for (int i = 0; i < ctx.sizebox().size(); i++) {
                column.getSizeboxes().add(visitSizebox(ctx.sizebox(i)));
            }
        }
        if (ctx.container() != null) {
            for (int i = 0; i < ctx.container().size(); i++) {
                column.getContainers().add(visitContainer(ctx.container(i)));

            }
        }
        if (ctx.text() != null) {
            column.setText(visitText(ctx.text()));
        }
        if (ctx.textFromField() != null) {
            for (int i = 0; i < ctx.textFromField().size(); i++) {
                column.getTextFromFields().add(visitTextFromField(ctx.textFromField(i)));
            }
        }
        if (ctx.onpressed() != null) {
            column.setOnpressed(visitOnpressed(ctx.onpressed()));
        }
        if (ctx.child() != null) {
            column.setChild(visitChild(ctx.child()));
        }
        return column;
    }

    @Override
    public Sizebox visitSizebox(PARSER.SizeboxContext ctx) {

        Sizebox sizebox = new Sizebox();
        if (ctx.SIZEBOX() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.SIZEBOX().getText(), ctx.
                    SIZEBOX().getSymbol().getLine(), ctx.SIZEBOX().getSymbol().getCharPositionInLine()));
            sizebox.setSIZEBOX(ctx.SIZEBOX().getText());
        }
        if (ctx.HEIGHT() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.HEIGHT().getText(), ctx.
                    HEIGHT().getSymbol().getLine(), ctx.HEIGHT().getSymbol().getCharPositionInLine()));
            sizebox.setHEIGHT(ctx.HEIGHT().getText());
        }
        if (ctx.NUMBER() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.NUMBER().getText(), ctx.
                    NUMBER().getSymbol().getLine(), ctx.NUMBER().getSymbol().getCharPositionInLine()));
            sizebox.setNUMBER(ctx.NUMBER().getText());
        }

        return sizebox;
    }

    @Override
    public CircleAvatar visitCircleAvatar(PARSER.CircleAvatarContext ctx) {

        CircleAvatar circleAvatar = new CircleAvatar();
        if (ctx.CIRCLEAVATAR() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.CIRCLEAVATAR().getText(), ctx.
                    CIRCLEAVATAR().getSymbol().getLine(), ctx.CIRCLEAVATAR().getSymbol().getCharPositionInLine()));
            circleAvatar.setCircleavatar(ctx.CIRCLEAVATAR().getText());
        }
        if (ctx.backgroundcolor() != null) {
            circleAvatar.setBackgroundcolor(visitBackgroundcolor(ctx.backgroundcolor()));
        }
        if (ctx.child() != null) {

            circleAvatar.setChild(visitChild(ctx.child()));
        }

        return circleAvatar;
    }

    @Override
    public Backgroundcolor visitBackgroundcolor(PARSER.BackgroundcolorContext ctx) {

        Backgroundcolor backgroundcolor = new Backgroundcolor();
        if (ctx.BACKGROUNDCOLOR() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.BACKGROUNDCOLOR().getText(), ctx.
                    BACKGROUNDCOLOR().getSymbol().getLine(), ctx.BACKGROUNDCOLOR().getSymbol().getCharPositionInLine()));
            backgroundcolor.setBackgroundcolor(ctx.BACKGROUNDCOLOR().getText());
        }
        if (ctx.name() != null) {
            backgroundcolor.setName(visitName(ctx.name()));
        }

        return backgroundcolor;
    }

    @Override
    public Decoration visitDecoration(PARSER.DecorationContext ctx) {
        Decoration decoration = new Decoration();
        if (ctx.decorationn() != null) {
            decoration.setDecorationn(visitDecorationn(ctx.decorationn()));
        }
        if (ctx.DECORATION() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.DECORATION().getText(), ctx.
                    DECORATION().getSymbol().getLine(), ctx.DECORATION().getSymbol().getCharPositionInLine()));
            decoration.setDecoration(ctx.DECORATION().getText());
        }
        if (ctx.name() != null) {
            decoration.setName(visitName(ctx.name()));
        }
        if (ctx.child() != null) {

            decoration.setChild(visitChild(ctx.child()));
        }
        if (ctx.color() != null) {

            decoration.setColor(visitColor(ctx.color()));
        }

        return decoration;
    }

    @Override
    public Body visitBody(PARSER.BodyContext ctx) {
        Body body = new Body();
        if (ctx.BODY() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.BODY().getText(), ctx.
                    BODY().getSymbol().getLine(), ctx.BODY().getSymbol().getCharPositionInLine()));
            body.setBODY(ctx.BODY().getText());
        }

        if (ctx.center() != null) {
            body.setCenter(visitCenter(ctx.center()));
        }
        if (ctx.padding_cull() != null) {
            body.setPaddingCull(visitPadding_cull(ctx.padding_cull()));
        }
        return body;
    }


    @Override
    public List visitList(PARSER.ListContext ctx) {

        List list = new List();

        if (ctx.NAME() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.
                    NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));
            list.setName(ctx.NAME().getText());
        }
        if (ctx.element() != null) {
            for (int i = 0; i < ctx.element().size(); i++) {
                list.getElement().add(visitElement(ctx.element(i)));
            }
        }
        return list;
    }

    @Override
    public Start_program visitStart_program(PARSER.Start_programContext ctx) {
        Start_program startProgram = new Start_program();
        startProgram.setChildCounts(ctx.getChildCount());
        if (ctx.class_() != null) {
            for (int i = 0; i < ctx.class_().size(); i++) {
                startProgram.getClasses().add(visitClass(ctx.class_(i)));
            }
        }
        if (ctx.flutter_class() != null) {
            for (int i = 0; i < ctx.flutter_class().size(); i++) {
                startProgram.getFlutterClass().add(visitFlutter_class(ctx.flutter_class(i)));
            }
        }
        if (ctx.main_class() != null) {
            startProgram.setMain_class(visitMain_class(ctx.main_class()));
        }
        return startProgram;
    }


    @Override
    public Flutter_class visitFlutter_class(PARSER.Flutter_classContext ctx) {
        Flutter_class flutter_class = new Flutter_class();
        flutter_class.setChildCounts(ctx.getChildCount());
        if (ctx.decler_class() != null) {
            flutter_class.setDecler_class(visitDecler_class(ctx.decler_class()));
        }

        flutter_class.setValue(ctx.decler_class().getText());

        if (ctx.widget() != null) {
            flutter_class.setWidget(visitWidget(ctx.widget()));
        }
        if (ctx.list() != null) {
            flutter_class.setList(visitList(ctx.list()));
        }
        return flutter_class;
    }

    @Override
    public Widget visitWidget(PARSER.WidgetContext ctx) {
        Widget widget = new Widget();
        widget.setChildCounts(ctx.getChildCount());

        widget.setValue(ctx.STATELESSWIDGET().getText());
        if (ctx.STATELESSWIDGET() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.STATELESSWIDGET().getText(), ctx.STATELESSWIDGET().getSymbol().getLine(), ctx.STATELESSWIDGET().getSymbol().getCharPositionInLine()));
            widget.setValue(ctx.STATELESSWIDGET().getText());
            widget.setCREATE_WIDGET(ctx.STATELESSWIDGET().getText());
        }
        if (ctx.element() != null) {
            for (int i = 0; i < ctx.element().size(); i++) {

                widget.getElements().add(visitElement(ctx.element(i)));
            }
        }
        return widget;
    }

    @Override
    public Element visitElement(PARSER.ElementContext ctx) {
        Element element = new Element();
        element.setChildCounts(ctx.getChildCount());

        if (ctx.vareble() != null) {
            element.setVareble(visitVareble(ctx.vareble()));
        }
        if (ctx.constructer() != null) {
            element.setConstructer(visitConstructer(ctx.constructer()));
        }
        if (ctx.build() != null) {
            element.setBuild(visitBuild(ctx.build()));
        }
        return element;
    }

    @Override
    public Build visitBuild(PARSER.BuildContext ctx) {
        Build build = new Build();
        build.setChildCounts(ctx.getChildCount());
        if (ctx.WIDGET() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.WIDGET().getText(), ctx.
                    WIDGET().getSymbol().getLine(), ctx.WIDGET().getSymbol().getCharPositionInLine()));

            build.setWidget(ctx.WIDGET().getText());
        }
        if (ctx.build_inst() != null) {
            for (int i = 0; i < ctx.build_inst().size(); i++) {
                build.getBuildInsts().add(visitBuild_inst(ctx.build_inst(i)));
            }
        }
        return build;
    }

    @Override
    public Build_inst visitBuild_inst(PARSER.Build_instContext ctx) {
        Build_inst build_inst = new Build_inst();
        build_inst.setChildCounts(ctx.getChildCount());
        if (ctx.RETURN() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.RETURN().getText(), ctx.
                    RETURN().getSymbol().getLine(), ctx.RETURN().getSymbol().getCharPositionInLine()));

            build_inst.setReturnn(ctx.RETURN().getText());
        }
        if (ctx.inwell() != null) {
            build_inst.setInkwell(visitInwell(ctx.inwell()));
        }
        if (ctx.scafold_fun() != null) {
            for (int i = 0; i < ctx.scafold_fun().size(); i++) {

                build_inst.getScafoldFun().add(visitScafold_fun(ctx.scafold_fun(i)));
            }
        }
        return build_inst;
    }

    @Override
    public Inkwell visitInwell(PARSER.InwellContext ctx) {
        Inkwell inkwell = new Inkwell();
        inkwell.setChildCounts(ctx.getChildCount());
        if (ctx.INKWEL() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.INKWEL().getText(), ctx.
                    INKWEL().getSymbol().getLine(), ctx.INKWEL().getSymbol().getCharPositionInLine()));

            inkwell.setInkwel(ctx.INKWEL().getText());
        }
        if (ctx.inkwell_child() != null) {
            inkwell.setInkwelChilde(visitInkwell_child(ctx.inkwell_child()));
        }
        return inkwell;
    }

    @Override
    public InkwelChilde visitInkwell_child(PARSER.Inkwell_childContext ctx) {
        InkwelChilde inkwelChilde = new InkwelChilde();
        inkwelChilde.setChildCounts(ctx.getChildCount());
        if (ctx.ontap() != null) {
            inkwelChilde.setOnTap(visitOntap(ctx.ontap()));
        }
        if (ctx.child() != null) {
            for (int i = 0; i < ctx.child().size(); i++) {
                inkwelChilde.getChildren().add(visitChild(ctx.child(i)));

            }
        }
        return inkwelChilde;
    }

    @Override
    public OnTap visitOntap(PARSER.OntapContext ctx) {
        OnTap onTap = new OnTap();
        onTap.setChildCounts(ctx.getChildCount());
        if (ctx.ONTAP() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.ONTAP().getText(), ctx.
                    ONTAP().getSymbol().getLine(), ctx.ONTAP().getSymbol().getCharPositionInLine()));

            onTap.setOntap(ctx.ONTAP().getText());
        }
        if (ctx.ONPRESSED() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.ONPRESSED().getText(), ctx.
                    ONPRESSED().getSymbol().getLine(), ctx.ONPRESSED().getSymbol().getCharPositionInLine()));

            onTap.setOnpressed(ctx.ONPRESSED().getText());
        }
        return onTap;
    }

    @Override
    public Child visitChild(PARSER.ChildContext ctx) {
        Child child = new Child();
        child.setChildCounts(ctx.getChildCount());
        if (ctx.CHILD() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.CHILD().getText(), ctx.
                    CHILD().getSymbol().getLine(), ctx.CHILD().getSymbol().getCharPositionInLine()));

            child.setChild(ctx.CHILD().getText());
        }
        if (ctx.text() != null) {

            child.setText(visitText(ctx.text()));
        }
        if (ctx.image_asset() != null) {
            child.setImageAsset(visitImage_asset(ctx.image_asset()));
        }
        if (ctx.center() != null) {
            child.setCenter(visitCenter(ctx.center()));
        }
        if (ctx.cliprrect() != null) {
            child.setCliprrect(visitCliprrect(ctx.cliprrect()));
        }
        if (ctx.padding_cull() != null) {
            child.setPaddingCull(visitPadding_cull(ctx.padding_cull()));
        }
        if (ctx.container() != null) {
            child.setContainer(visitContainer(ctx.container()));
        }
        if (ctx.column() != null) {
            child.setColumn(visitColumn(ctx.column()));
        }
        if (ctx.icon() != null) {
            child.setIcon(visitIcon(ctx.icon()));
        }
        if (ctx.textbutton() != null) {
            child.setTextbutton(visitTextbutton(ctx.textbutton()));
        }
        return child;
    }

    @Override
    public TextStyle visitTextstyle(PARSER.TextstyleContext ctx) {
        TextStyle textStyle = new TextStyle();
        textStyle.setChildCounts(ctx.getChildCount());
        if (ctx.TEXTSTYLE() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.TEXTSTYLE().getText(), ctx.
                    TEXTSTYLE().getSymbol().getLine(), ctx.TEXTSTYLE().getSymbol().getCharPositionInLine()));

            textStyle.setTextstyle(ctx.TEXTSTYLE().getText());
        }
        if (ctx.color() != null) {
            textStyle.setColor(visitColor(ctx.color()));
        }
        return textStyle;
    }

    @Override
    public Center visitCenter(PARSER.CenterContext ctx) {
        Center center = new Center();
        center.setChildCounts(ctx.getChildCount());
        if (ctx.CENTER() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.CENTER().getText(), ctx.
                    CENTER().getSymbol().getLine(), ctx.CENTER().getSymbol().getCharPositionInLine()));

            center.setCenter(ctx.CENTER().getText());
        }
        if (ctx.child() != null) {
            center.setChild(visitChild(ctx.child()));
        }
        return center;
    }

    @Override
    public Container visitContainer(PARSER.ContainerContext ctx) {
        Container container = new Container();
        container.setChildCounts(ctx.getChildCount());
        if (ctx.CONTAINER() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.CONTAINER().getText(), ctx.
                    CONTAINER().getSymbol().getLine(), ctx.CONTAINER().getSymbol().getCharPositionInLine()));

            container.setContainer(ctx.CONTAINER().getText());
        }
        if (ctx.container_child() != null) {
            for (int i = 0; i < ctx.container_child().size(); i++) {
                container.getContainerChildren().add(visitContainer_child(ctx.container_child(i)));
            }
        }
        return container;
    }

    @Override
    public ContainerChild visitContainer_child(PARSER.Container_childContext ctx) {
        ContainerChild containerChild = new ContainerChild();
        containerChild.setChildCounts(ctx.getChildCount());
        if (ctx.HEIGHT() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.HEIGHT().getText(), ctx.
                    HEIGHT().getSymbol().getLine(), ctx.HEIGHT().getSymbol().getCharPositionInLine()));

            containerChild.setHeight(ctx.HEIGHT().getText());
        }
        if (ctx.NUMBER() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.NUMBER().getText(), ctx.
                    NUMBER().getSymbol().getLine(), ctx.NUMBER().getSymbol().getCharPositionInLine()));

            containerChild.setNumber(ctx.NUMBER().getText());
        }
        if (ctx.ALIGMENT() != null) {
            containerChild.setAlligment(ctx.ALIGMENT().getText());
            if (ctx.NAME() != null) {
                for (int i = 0; i < ctx.NAME().size(); i++) {

                    symbolTable.symbolsList.add(new Symbol(ctx.NAME(i).getText(), ctx.
                            NAME(i).getSymbol().getLine(), ctx.NAME(i).getSymbol().getCharPositionInLine()));

                    containerChild.getStrings().add(ctx.NAME(i).getText());
                }
            }
            if (ctx.child() != null) {
                containerChild.setChild(visitChild(ctx.child()));
            }
        }
        if (ctx.color() != null) {
            containerChild.setColor(visitColor(ctx.color()));
            if (ctx.child() != null) {
                containerChild.setChild(visitChild(ctx.child()));
            }

        }
        if (ctx.width() != null) {
            containerChild.setWidth(visitWidth(ctx.width()));
        }
        if (ctx.decoration() != null) {
            containerChild.setDecoration(visitDecoration(ctx.decoration()));
        }
        if (ctx.onpressed() != null) {
            containerChild.setOnpressed(visitOnpressed(ctx.onpressed()));
            if (ctx.child() != null) {
                containerChild.setChild(visitChild(ctx.child()));
            }
        }
        return containerChild;
    }

    @Override
    public ImageAsset visitImage_asset(PARSER.Image_assetContext ctx) {
        ImageAsset imageAsset = new ImageAsset();
        imageAsset.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            for (int i = 0; i < ctx.NAME().size(); i++) {

                symbolTable.symbolsList.add(new Symbol(ctx.NAME(i).getText(), ctx.
                        NAME(i).getSymbol().getLine(), ctx.NAME(i).getSymbol().getCharPositionInLine()));

                imageAsset.getStrings().add(ctx.NAME(i).getText());
            }
        }
        if (ctx.FIT() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.FIT().getText(), ctx.
                    FIT().getSymbol().getLine(), ctx.FIT().getSymbol().getCharPositionInLine()));

            imageAsset.setFit(ctx.FIT().getText());
        }
        if (ctx.child() != null) {
            imageAsset.setChild(visitChild(ctx.child()));
        }
        return imageAsset;
    }

    @Override
    public Cliprrect visitCliprrect(PARSER.CliprrectContext ctx) {
        Cliprrect cliprrect = new Cliprrect();
        cliprrect.setChildCounts(ctx.getChildCount());
        if (ctx.CLIPRRECT() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.CLIPRRECT().getText(), ctx.
                    CLIPRRECT().getSymbol().getLine(), ctx.CLIPRRECT().getSymbol().getCharPositionInLine()));

            cliprrect.setCliprrect(ctx.CLIPRRECT().getText());
        }
        if (ctx.child() != null) {
            cliprrect.setChild(visitChild(ctx.child()));
        }
        return cliprrect;
    }

    @Override
    public PaddingCull visitPadding_cull(PARSER.Padding_cullContext ctx) {
        PaddingCull paddingCull = new PaddingCull();
        paddingCull.setChildCounts(ctx.getChildCount());
        if (ctx.PADDING() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.PADDING().getText(), ctx.
                    PADDING().getSymbol().getLine(), ctx.PADDING().getSymbol().getCharPositionInLine()));

            paddingCull.setPadding(ctx.PADDING().getText());
        }
        if (ctx.padding_child() != null) {
            paddingCull.setPaddingChild(visitPadding_child(ctx.padding_child()));
        }
        return paddingCull;
    }

    @Override
    public PaddingChild visitPadding_child(PARSER.Padding_childContext ctx) {
        PaddingChild paddingChild = new PaddingChild();
        paddingChild.setChildCounts(ctx.getChildCount());
        if (ctx.padd() != null) {

            paddingChild.setPadd(visitPadd(ctx.padd()));
        }
        if (ctx.child() != null) {
            paddingChild.setChild(visitChild(ctx.child()));
        }
        return paddingChild;
    }

    @Override
    public Padd visitPadd(PARSER.PaddContext ctx) {
        Padd padd = new Padd();
        padd.setChildCounts(ctx.getChildCount());
        if (ctx.PADD() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.PADD().getText(), ctx.
                    PADD().getSymbol().getLine(), ctx.PADD().getSymbol().getCharPositionInLine()));

            padd.setPadd(ctx.PADD().getText());
        }
        if (ctx.NAME() != null) {
            for (int i = 0; i < ctx.NAME().size(); i++) {

                symbolTable.symbolsList.add(new Symbol(ctx.NAME(i).getText(), ctx.
                        NAME(i).getSymbol().getLine(), ctx.NAME(i).getSymbol().getCharPositionInLine()));

                padd.getStrings().add(ctx.NAME(i).getText());
            }
        }
        if (ctx.NUMBER() != null) {
            for (int i = 0; i < ctx.NUMBER().size(); i++) {

                symbolTable.symbolsList.add(new Symbol(ctx.NUMBER(i).getText(), ctx.
                        NUMBER(i).getSymbol().getLine(), ctx.NUMBER(i).getSymbol().getCharPositionInLine()));

                padd.getNumber().add(ctx.NUMBER(i).getText());
            }
        }
        return padd;
    }

    @Override
    public Constructer visitConstructer(PARSER.ConstructerContext ctx) {
        Constructer constructer = new Constructer();
        constructer.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.
                    NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

            constructer.setName(ctx.NAME().getText());
        }
        if (ctx.atrbute() != null) {
            constructer.setAtrbute(visitAtrbute(ctx.atrbute()));
        }
        return constructer;
    }

    @Override
    public Atrbute visitAtrbute(PARSER.AtrbuteContext ctx) {
        Atrbute atrbute = new Atrbute();
        atrbute.setChildCounts(ctx.getChildCount());
        if (ctx.decler_var() != null) {
            for (int i = 0; i < ctx.decler_var().size(); i++) {
                atrbute.getDeclerVars().add(visitDecler_var(ctx.decler_var(i)));
            }
        }
        return atrbute;
    }

    @Override
    public Key visitKey(PARSER.KeyContext ctx) {
        Key key = new Key();
        key.setChildCounts(ctx.getChildCount());
        if (ctx.CONST() != null) {
            key.setConstt(ctx.CONST().getText());
        }
        if (ctx.FINAL() != null) {
            key.setFinall(ctx.FINAL().getText());
        }
        if (ctx.LATE() != null) {
            key.setLate(ctx.LATE().getText());
        }
        return key;
    }

    @Override
    public Scafold_fun visitScafold_fun(PARSER.Scafold_funContext ctx) {

        Scafold_fun scafold_fun = new Scafold_fun();
        scafold_fun.setChildCounts(ctx.getChildCount());
        if (ctx.SCAFOLD() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.SCAFOLD().getText(), ctx.SCAFOLD().getSymbol().getLine(), ctx.SCAFOLD().getSymbol().getCharPositionInLine()));

            scafold_fun.setSCAFOLD(ctx.SCAFOLD().getText());
        }

        if (ctx.appbar() != null) {
            scafold_fun.setAppbar(visitAppbar(ctx.appbar()));
        }
        if (ctx.body() != null) {
            scafold_fun.setBody(visitBody(ctx.body()));
        }

        return scafold_fun;
    }

    @Override
    public Title visitTitle(PARSER.TitleContext ctx) {
        Title title = new Title();
        if (ctx.TITLE() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.TITLE().getText(), ctx.TITLE().getSymbol().getLine(), ctx.TITLE().getSymbol().getCharPositionInLine()));

            title.setTitle(ctx.TITLE().getText());
        }
        if (ctx.text() != null) {
            title.setText(visitText(ctx.text()));
        }
        return title;
    }

    @Override
    public Appbar visitAppbar(PARSER.AppbarContext ctx) {
        Appbar appbar = new Appbar();
        appbar.setChildCounts(ctx.getChildCount());
        if (ctx.APPBAR() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.APPBAR().getText(), ctx.APPBAR().getSymbol().getLine(), ctx.APPBAR().getSymbol().getCharPositionInLine()));
            appbar.setAPPBAR(ctx.APPBAR().getText());
        }
        if (ctx.title() != null) {
            appbar.setTitle(visitTitle(ctx.title()));
        }
        if (ctx.text() != null) {
            appbar.setText(visitText(ctx.text()));
        }
        return appbar;

    }


    @Override
    public Text visitText(PARSER.TextContext ctx) {
        Text text = new Text();
        text.setChildCounts(ctx.getChildCount());
        if (ctx.TEXT() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.TEXT().getText(), ctx.TEXT().getSymbol().getLine(), ctx.TEXT().getSymbol().getCharPositionInLine()));

            text.setTEXT(ctx.TEXT().getText());
        }
        if (ctx.NAME() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

            text.setSTRING(ctx.NAME().getText());
        }
        if (ctx.CHAR() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.CHAR().getText(), ctx.CHAR().getSymbol().getLine(), ctx.CHAR().getSymbol().getCharPositionInLine()));

            text.setChar(ctx.CHAR().getText());
        }
        if (ctx.style() != null) {
            text.setStyle(visitStyle(ctx.style()));
        }

        return text;
    }

    @Override
    public Navigator visitNavigator(PARSER.NavigatorContext ctx) {
        Navigator navigator = new Navigator();
        if (ctx.NAVIGATOR() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.NAVIGATOR().getText(), ctx.NAVIGATOR().getSymbol().getLine(), ctx.NAVIGATOR().getSymbol().getCharPositionInLine()));

            navigator.setNavigator(ctx.NAVIGATOR().getText());
        }
        if (ctx.NAME() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.NAVIGATOR().getText(), ctx.NAVIGATOR().getSymbol().getLine(), ctx.NAVIGATOR().getSymbol().getCharPositionInLine()));

            navigator.setNAME(ctx.NAME().getText());
        }
        if (ctx.name() != null) {
            for (int i = 0; i < ctx.name().size(); i++) {
                navigator.getName().add(visitName(ctx.name(i)));
            }
        }
        return navigator;
    }

    @Override
    public Style visitStyle(PARSER.StyleContext ctx) {
        Style style = new Style();
        style.setChildCounts(ctx.getChildCount());
        if (ctx.STYLE() != null) {

            symbolTable.symbolsList.add(new Symbol(ctx.STYLE().getText(), ctx.STYLE().getSymbol().getLine(), ctx.STYLE().getSymbol().getCharPositionInLine()));

            style.setStyle(ctx.STYLE().getText());
        }
        if (ctx.textstyle() != null) {
            style.setTextStyle(visitTextstyle(ctx.textstyle()));
        }
        return style;
    }

    @Override
    public Color visitColor(PARSER.ColorContext ctx) {
        Color color = new Color();
        color.setChildCounts(ctx.getChildCount());
        if (ctx.COLOR() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.COLOR().getText(), ctx.COLOR().getSymbol().getLine(), ctx.COLOR().getSymbol().getCharPositionInLine()));

            color.setCOLOR(ctx.COLOR().getText());
        }
        if (ctx.NAME() != null) {
            for (int i = 0; i < ctx.NAME().size(); i++) {

                symbolTable.symbolsList.add(new Symbol(ctx.NAME(i).getText(), ctx.NAME(i).getSymbol().getLine(), ctx.NAME(i).getSymbol().getCharPositionInLine()));

                color.getStrings().add(ctx.NAME(i).getText());
            }
        }
        return color;
    }

    public Decler_class visitDecler_class(PARSER.Decler_classContext ctx) {
        Decler_class decler_class = new Decler_class();
        decler_class.setChildCounts(ctx.getChildCount());
        if (ctx.CLASS() != null) {
            symbolTable.symbolsList.add(new Symbol(ctx.CLASS().getText(), ctx.CLASS().getSymbol().getLine(), ctx.CLASS().getSymbol().getCharPositionInLine()));

            decler_class.setCLASS(ctx.CLASS().getText());
        }
        if (ctx.NAME() != null) {
            decler_class.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));
        }
        return decler_class;
    }


    public SymbolTable symbolTable = new SymbolTable();

    @Override
    public Main_class visitMain_class(PARSER.Main_classContext ctx) {
        Main_class main_class = new Main_class();
        main_class.setChildCounts(ctx.getChildCount());
        if (ctx.main_dart() != null) {

            main_class.setMain_dart(visitMain_dart(ctx.main_dart()));
        }

        return main_class;
    }

    @Override
    public Main_dart visitMain_dart(PARSER.Main_dartContext ctx) {
        Main_dart main_dart = new Main_dart();
        main_dart.setChildCounts(ctx.getChildCount());
        if (ctx.header_main() != null) {

            main_dart.setHeader_main(visitHeader_main(ctx.header_main()));
        }

        return main_dart;
    }

    @Override
    public Header_main visitHeader_main(PARSER.Header_mainContext ctx) {
        Header_main headerMain = new Header_main();
        headerMain.setChildCounts(ctx.getChildCount());
        if (ctx.VOID() != null) {
            headerMain.setVOID(ctx.VOID().getText());
        }

        if (ctx.body_element() != null) {
            for (int i = 0; i < ctx.body_element().size(); i++) {
                headerMain.getBodyElements().add(visitBody_element(ctx.body_element(i)));
            }
        }
        return headerMain;
    }

    @Override
    public Classs visitClass(PARSER.ClassContext ctx) {
        Classs classs = new Classs();
        classs.setChildCounts(ctx.getChildCount());

        System.err.println(ctx.decler_class().getText());
       classs.setValue(ctx.decler_class().getText());

        if (ctx.decler_class() != null) {

            classs.setDecler_class(visitDecler_class(ctx.decler_class()));

        }
        if (ctx.class_body() != null) {
            for (int i = 0; i < ctx.class_body().size(); i++) {
                classs.getClass_body().add(visitClass_body(ctx.class_body(i)));
            }
        }
        return classs;
    }

    @Override
    public Class_body visitClass_body(PARSER.Class_bodyContext ctx) {
        Class_body classBody = new Class_body();
        classBody.setChildCounts(ctx.getChildCount());
        if (ctx.vareble() != null) {

            classBody.setVareble(visitVareble(ctx.vareble()));

        }
        if (ctx.array() != null) {
            classBody.setArray(visitArray(ctx.array()));
        }
        if (ctx.create_function() != null) {
            classBody.setCreate_function(visitCreate_function(ctx.create_function()));
        }
        return classBody;
    }

    @Override
    public Create_function visitCreate_function(PARSER.Create_functionContext ctx) {
        Create_function createFunction = new Create_function();
        createFunction.setChildCounts(ctx.getChildCount());
        if (ctx.OVERRIDE() != null) {
            createFunction.setOVERRIDE(ctx.OVERRIDE().getText());
        }
        if (ctx.decler_fun() != null) {
            createFunction.setDecler_fun(visitDecler_fun(ctx.decler_fun()));
        }
        if (ctx.var_param() != null) {
            createFunction.setVar_param(visitVar_param(ctx.var_param()));
        }
        if (ctx.body_element() != null) {
            for (int i = 0; i < ctx.body_element().size(); i++) {
                createFunction.getBody_element().add(visitBody_element(ctx.body_element(i)));
            }
        }
        if (ctx.returN() != null) {

            createFunction.setReturN(visitReturN(ctx.returN()));

        }
        return createFunction;
    }

    @Override
    public Var_param visitVar_param(PARSER.Var_paramContext ctx) {
        Var_param varParam = new Var_param();
        varParam.setChildCounts(ctx.getChildCount());
        if (ctx.decler_var() != null) {
            for (int i = 0; i < ctx.decler_var().size(); i++) {
                varParam.getDecler_var().add(visitDecler_var(ctx.decler_var(i)));
            }


        }
        return varParam;
    }

    @Override
    public Decler_fun visitDecler_fun(PARSER.Decler_funContext ctx) {
        Decler_fun decler_fun = new Decler_fun();
        decler_fun.setChildCounts(ctx.getChildCount());
        if (ctx.VOID() != null) {
            decler_fun.setVOID(ctx.VOID().getText());
        } else if (ctx.NAME() != null) {
            decler_fun.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        if (ctx.name() != null) {

            decler_fun.setName(visitName(ctx.name()));
        }

        return decler_fun;
    }

    @Override
    public ReturN visitReturN(PARSER.ReturNContext ctx) {
        ReturN returN = new ReturN();
        returN.setChildCounts(ctx.getChildCount());
        if (ctx.RETURN() != null) {
            returN.setRETURN(ctx.RETURN().getText());
        }
        if (ctx.NAME() != null) {
            returN.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        } else if (ctx.cull_function() != null) {
            returN.setCull_function(visitCull_function(ctx.cull_function()));
        }
        return returN;
    }

    @Override
    public Body_element visitBody_element(PARSER.Body_elementContext ctx) {
        Body_element bodyElement = new Body_element();
        bodyElement.setChildCounts(ctx.getChildCount());
        if (ctx.vareble() != null) {
            bodyElement.setVareble(visitVareble(ctx.vareble()));
        } else if (ctx.array() != null) {
            bodyElement.setArray(visitArray(ctx.array()));
        } else if (ctx.cull_function() != null) {
            bodyElement.setCull_function(visitCull_function(ctx.cull_function()));
        } else if (ctx.loop() != null) {
            bodyElement.setLoop(visitLoop(ctx.loop()));
        } else if (ctx.condetion() != null) {
            bodyElement.setCondetion(visitCondetion(ctx.condetion()));
        } else if (ctx.print() != null) {
            bodyElement.setPrint(visitPrint(ctx.print()));
        } else if (ctx.encaps() != null) {
            bodyElement.setEncaps(visitEncaps(ctx.encaps()));
        }


        return bodyElement;
    }

    @Override
    public Print visitPrint(PARSER.PrintContext ctx) {
        Print print = new Print();
        print.setChildCounts(ctx.getChildCount());
        if (ctx.PRINT() != null) {
            print.setPRINT(ctx.PRINT().getText());
        }
        if (ctx.STRING() != null) {
            print.setSTRING(ctx.STRING().getText());
        } else if (ctx.NAME() != null) {
            print.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        } else if (ctx.CHAR() != null) {
            print.setCHAR(ctx.CHAR().getText());
        }

        return print;
    }

    @Override
    public Array visitArray(PARSER.ArrayContext ctx) {
        Array array = new Array();
        array.setChildCounts(ctx.getChildCount());
        if (ctx.decler_var() != null) {
            array.setDecler_var(visitDecler_var(ctx.decler_var()));
        }
        if (ctx.NAME() != null) {
            array.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        } else if (ctx.NUMBER() != null) {
            array.setNUMBER(ctx.NUMBER().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NUMBER().getText(), ctx.NUMBER().getSymbol().getLine(), ctx.NUMBER().getSymbol().getCharPositionInLine()));

        }
        return array;
    }

    @Override
    public Vareble visitVareble(PARSER.VarebleContext ctx) {
        Vareble vareble = new Vareble();
        vareble.setChildCounts(ctx.getChildCount());
        if (ctx.decler_var() != null) {
            vareble.setDecler_var(visitDecler_var(ctx.decler_var()));
        }
        return vareble;
    }

    @Override
    public After_var visitAfter_var(PARSER.After_varContext ctx) {
        After_var afterVar = new After_var();
        afterVar.setChildCounts(ctx.getChildCount());
        if (ctx.var_equal() != null) {
            afterVar.setVar_equal(visitVar_equal(ctx.var_equal()));
        } else if (ctx.SIGNALS() != null) {
            afterVar.setSIGNALS(ctx.SIGNALS().getText());
        }
        return afterVar;
    }

    @Override
    public Var_equal visitVar_equal(PARSER.Var_equalContext ctx) {
        Var_equal var_equal = new Var_equal();
        var_equal.setChildCounts(ctx.getChildCount());
        if (ctx.EQUAL() != null) {
            var_equal.setEQUAL(ctx.EQUAL().getText());
        }
        if (ctx.others() != null) {
            var_equal.setOthers(visitOthers(ctx.others()));

        }

        if (ctx.oper() != null) {
            var_equal.setOper(visitOper(ctx.oper()));

        }
        return var_equal;
    }

    @Override
    public Oper visitOper(PARSER.OperContext ctx) {
        Oper oper = new Oper();
        oper.setChildCounts(ctx.getChildCount());
        if (ctx.OPER() != null) {
            oper.setOPER(ctx.OPER().getText());
        }
        if (ctx.side() != null) {
            oper.setSide(visitSide(ctx.side()));

        }
        return oper;
    }

    @Override
    public Others visitOthers(PARSER.OthersContext ctx) {
        Others others = new Others();
        others.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            others.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        if (ctx.NUMBER() != null) {
            others.setNUMBER(ctx.NUMBER().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NUMBER().getText(), ctx.NUMBER().getSymbol().getLine(), ctx.NUMBER().getSymbol().getCharPositionInLine()));

        }
        if (ctx.CHAR() != null) {
            others.setCHAR(ctx.CHAR().getText());
        }
        if (ctx.STRING() != null) {
            others.setSTRING(ctx.STRING().getText());
        }
        return others;
    }

    @Override
    public Decler_var visitDecler_var(PARSER.Decler_varContext ctx) {
        Decler_var declerVar = new Decler_var();
        declerVar.setChildCounts(ctx.getChildCount());
        if (ctx.TYPE() != null) {
            declerVar.setTYPE(ctx.TYPE().getText());
        } else if (ctx.name() != null) {
            declerVar.setName(visitName(ctx.name()));

        }
        if (ctx.NAME() != null) {
            declerVar.setNAME(ctx.NAME().getText());
        }
        return declerVar;
    }

    @Override
    public Parameter visitParameter(PARSER.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            parameter.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine()
                    , ctx.NAME().getSymbol().getCharPositionInLine()));

        } else if (ctx.STRING() != null) {
            parameter.setSTRING(ctx.STRING().getText());
        } else if (ctx.CHAR() != null) {
            parameter.setCHAR(ctx.CHAR().getText());
        } else if (ctx.URL() != null) {
            parameter.setURL(ctx.URL().getText());
        } else if (ctx.cunstructer() != null) {
            parameter.setCunstructer(visitCunstructer(ctx.cunstructer()));


        } else if (ctx.cull_function() != null) {
            parameter.setCull_function((visitCull_function(ctx.cull_function())));

        }
        return parameter;
    }

    @Override
    public Argument visitArgument(PARSER.ArgumentContext ctx) {
        Argument argument = new Argument();
        argument.setChildCounts(ctx.getChildCount());
        if (ctx.parameter() != null) {
            for (int i = 0; i < ctx.parameter().size(); i++) {
                argument.getParameter().add(visitParameter(ctx.parameter(i)));
            }


        }

        return argument;
    }

    @Override
    public Name visitName(PARSER.NameContext ctx) {
        Name name = new Name();
        name.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            name.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        return name;
    }

    @Override
    public Cunstructer visitCunstructer(PARSER.CunstructerContext ctx) {
        Cunstructer cunstructer = new Cunstructer();
        cunstructer.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            cunstructer.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        if (ctx.COLOMN() != null) {
            cunstructer.setCOLOMN(ctx.COLOMN().getText());
        }
        if (ctx.cull_function() != null) {
            cunstructer.setCull_function(visitCull_function(ctx.cull_function()));
        } else if (ctx.encaps() != null) {
            cunstructer.setEncaps(visitEncaps(ctx.encaps()));

        }
        return cunstructer;
    }

    @Override
    public Encaps visitEncaps(PARSER.EncapsContext ctx) {
        Encaps encaps = new Encaps();
        encaps.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            encaps.setName(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        if (ctx.name() != null) {
            encaps.setNamee(visitName(ctx.name()));

        } else if (ctx.cull_function() != null) {
            encaps.setCullFunction(visitCull_function(ctx.cull_function()));

        }
        return encaps;
    }

    @Override
    public Cull_function visitCull_function(PARSER.Cull_functionContext ctx) {
        Cull_function cullFunction = new Cull_function();
        cullFunction.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            cullFunction.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        if (ctx.name() != null) {
            cullFunction.setName(visitName(ctx.name()));

        }
        if (ctx.argument() != null) {
            cullFunction.setArgument(visitArgument(ctx.argument()));

        }

        return cullFunction;
    }

    @Override
    public Condetion visitCondetion(PARSER.CondetionContext ctx) {
        Condetion condetion = new Condetion();
        condetion.setChildCounts(ctx.getChildCount());
        if (ctx.iF() != null) {
            condetion.setiF(visitIF(ctx.iF()));

        }
        if (ctx.iF_Else() != null) {
            condetion.setiF_Else(visitIF_Else(ctx.iF_Else()));

        }
        return condetion;
    }

    @Override
    public Loop visitLoop(PARSER.LoopContext ctx) {
        Loop loop = new Loop();
        loop.setChildCounts(ctx.getChildCount());
        if (ctx.for_loop() != null) {
            loop.setFor_loop(visitFor_loop(ctx.for_loop()));

        } else if (ctx.while_loop() != null) {
            loop.setWhile_loop(visitWhile_loop(ctx.while_loop()));

        } else if (ctx.for_each() != null) {
            loop.setFor_each(visitFor_each(ctx.for_each()));

        }
        return loop;
    }

    //**************************************

    @Override
    public IF visitIF(PARSER.IFContext ctx) {
        IF iff = new IF();
        iff.setChildCounts(ctx.getChildCount());
        if (ctx.IF() != null) {
            iff.setIF(ctx.IF().getText());
        }
        if (ctx.if_condetion() != null) {
            for (int i = 0; i < ctx.if_condetion().size(); i++) {
                iff.getIf_condetion().add(visitIf_condetion(ctx.if_condetion(i)));
            }
        }
        if (ctx.body_element() != null) {
            for (int i = 0; i < ctx.body_element().size(); i++) {
                iff.getBody_element().add(visitBody_element(ctx.body_element(i)));
            }
        }
        return iff;
    }

    @Override
    public If_condetion visitIf_condetion(PARSER.If_condetionContext ctx) {
        If_condetion if_condetion = new If_condetion();
        if_condetion.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            if_condetion.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));


        } else if (ctx.operation() != null) {
            if_condetion.setOperation(visitOperation(ctx.operation()));

        }

        return if_condetion;
    }

    @Override
    public IF_Else visitIF_Else(PARSER.IF_ElseContext ctx) {
        IF_Else if_else = new IF_Else();
        if_else.setChildCounts(ctx.getChildCount());
        if (ctx.iF() != null) {
            if_else.setiF(visitIF(ctx.iF()));
        } else if (ctx.elsE() != null) {
            if_else.setElsE(visitElsE(ctx.elsE()));
        }
        return if_else;
    }

    @Override
    public ElsE visitElsE(PARSER.ElsEContext ctx) {
        ElsE elsE = new ElsE();
        elsE.setChildCounts(ctx.getChildCount());
        if (ctx.ELSE() != null) {
            elsE.setELSE(ctx.ELSE().getText());
        }
        if (ctx.body_element() != null) {
            for (int i = 0; i < ctx.body_element().size(); i++) {
                elsE.getBody_element().add(visitBody_element(ctx.body_element(i)));
            }
        }
        return elsE;
    }

    @Override
    public For_loop visitFor_loop(PARSER.For_loopContext ctx) {
        For_loop for_loop = new For_loop();
        for_loop.setChildCounts(ctx.getChildCount());
        if (ctx.FOR() != null) {
            for_loop.setFOR(ctx.FOR().getText());
        }

        if (ctx.vareble() != null) {
            for_loop.setVareble(visitVareble(ctx.vareble()));
        }
        if (ctx.operation() != null) {
            for_loop.setOperation(visitOperation(ctx.operation()));
        }

        if (ctx.body_element() != null) {
            for (int i = 0; i < ctx.body_element().size(); i++) {
                for_loop.getBody_element().add(visitBody_element(ctx.body_element(i)));
            }
        }
        return for_loop;
    }

    @Override
    public While_loop visitWhile_loop(PARSER.While_loopContext ctx) {
        While_loop while_loop = new While_loop();
        while_loop.setChildCounts(ctx.getChildCount());
        if (ctx.WHILE() != null) {
            while_loop.setWHILE(ctx.WHILE().getText());
            ;
        }
        if (ctx.operation() != null) {
            while_loop.setOperation(visitOperation(ctx.operation()));
        }
        return while_loop;
    }

    @Override
    public For_each visitFor_each(PARSER.For_eachContext ctx) {
        For_each for_each = new For_each();
        for_each.setChildCounts(ctx.getChildCount());
        if (ctx.FOR() != null) {
            for_each.setFOR(ctx.FOR().getText());
        }
        if (ctx.decler_var() != null) {
            for_each.setDecler_var(visitDecler_var(ctx.decler_var()));
        }
        if (ctx.NAME() != null) {
            for_each.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        }
        if (ctx.body_element() != null) {
            for (int i = 0; i < ctx.body_element().size(); i++) {
                for_each.getBody_element().add(visitBody_element(ctx.body_element(i)));
            }

        }

        return for_each;
    }

    @Override
    public Side visitSide(PARSER.SideContext ctx) {
        Side side = new Side();
        side.setChildCounts(ctx.getChildCount());
        if (ctx.NAME() != null) {
            side.setNAME(ctx.NAME().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

        } else if (ctx.NUMBER() != null) {
            side.setNUMBER(ctx.NUMBER().getText());
            symbolTable.symbolsList.add(new Symbol(ctx.NUMBER().getText(), ctx.NUMBER().getSymbol().getLine(), ctx.NUMBER().getSymbol().getCharPositionInLine()));

        }
        return side;
    }

    public CodeGenerate codeGenerate = new CodeGenerate(symbolTable);

    @Override
    public Operation visitOperation(PARSER.OperationContext ctx) {
        Operation operation = new Operation();
        operation.setChildCounts(ctx.getChildCount());
        if (ctx.side() != null) {
            for (int i = 0; i < ctx.side().size(); i++) {
                operation.getSide().add(visitSide(ctx.side(i)));

            }
        }
        if (ctx.COMPARISON() != null) {
            operation.setCOMPARISON(ctx.COMPARISON().getText());
        }
        return operation;
    }

    @Override
    public Operationd visitOperationd(PARSER.OperationdContext ctx) {
        Operationd operationd = new Operationd();
        operationd.setChildCounts(ctx.getChildCount());
        if (ctx.side() != null) {
            for (int i = 0; i < ctx.side().size(); i++) {
                operationd.getSide().add(visitSide(ctx.side(i)));

            }
        }
        if (ctx.SIGNAL() != null) {
            operationd.setSIGNAL(ctx.SIGNAL().getText());
        } else {
            if (ctx.NAME() != null) {
                operationd.setNAME(ctx.NAME().getText());
                symbolTable.symbolsList.add(new Symbol(ctx.NAME().getText(), ctx.NAME().getSymbol().getLine(), ctx.NAME().getSymbol().getCharPositionInLine()));

            }
            if (ctx.SIGNALS() != null) {
                operationd.setSIGNALS(ctx.SIGNALS().getText());
            }
        }

        return operationd;
    }
}
