package gen;
// Generated from java-escape by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PARSER}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PARSERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PARSER#start_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_program(PARSER.Start_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#flutter_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutter_class(PARSER.Flutter_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(PARSER.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PARSER.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(PARSER.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#build_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_inst(PARSER.Build_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#inwell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInwell(PARSER.InwellContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#inkwell_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkwell_child(PARSER.Inkwell_childContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#ontap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntap(PARSER.OntapContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(PARSER.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigator(PARSER.NavigatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textbutton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextbutton(PARSER.TextbuttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#onpressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnpressed(PARSER.OnpressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(PARSER.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#icon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcon(PARSER.IconContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(PARSER.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textFromField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFromField(PARSER.TextFromFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#decorationn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorationn(PARSER.DecorationnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#labeltext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeltext(PARSER.LabeltextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#sizebox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizebox(PARSER.SizeboxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#circleAvatar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleAvatar(PARSER.CircleAvatarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#backgroundcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundcolor(PARSER.BackgroundcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(PARSER.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(PARSER.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textstyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextstyle(PARSER.TextstyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(PARSER.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(PARSER.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#container_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_child(PARSER.Container_childContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(PARSER.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#image_asset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_asset(PARSER.Image_assetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#cliprrect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliprrect(PARSER.CliprrectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#padding_cull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_cull(PARSER.Padding_cullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#padding_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_child(PARSER.Padding_childContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#padd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadd(PARSER.PaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#constructer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructer(PARSER.ConstructerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#atrbute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrbute(PARSER.AtrbuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#scafold_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScafold_fun(PARSER.Scafold_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PARSER.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#appbar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppbar(PARSER.AppbarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(PARSER.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(PARSER.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#decler_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecler_class(PARSER.Decler_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#main_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class(PARSER.Main_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#main_dart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_dart(PARSER.Main_dartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#header_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_main(PARSER.Header_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(PARSER.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PARSER.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#create_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function(PARSER.Create_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#var_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_param(PARSER.Var_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(PARSER.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#decler_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecler_fun(PARSER.Decler_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#returN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturN(PARSER.ReturNContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#body_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_element(PARSER.Body_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PARSER.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PARSER.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#vareble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVareble(PARSER.VarebleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#after_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfter_var(PARSER.After_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#var_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_equal(PARSER.Var_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(PARSER.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#others}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOthers(PARSER.OthersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#decler_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecler_var(PARSER.Decler_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(PARSER.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PARSER.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PARSER.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PARSER.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#cunstructer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCunstructer(PARSER.CunstructerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#encaps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncaps(PARSER.EncapsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#cull_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCull_function(PARSER.Cull_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#condetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondetion(PARSER.CondetionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(PARSER.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#iF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(PARSER.IFContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#if_condetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condetion(PARSER.If_condetionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#iF_Else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_Else(PARSER.IF_ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#elsE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsE(PARSER.ElsEContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(PARSER.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(PARSER.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(PARSER.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSide(PARSER.SideContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(PARSER.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#operationd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationd(PARSER.OperationdContext ctx);
}