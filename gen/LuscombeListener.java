// Generated from /Users/bromlu/Documents/Projects/Luscombe/Luscombe.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuscombeParser}.
 */
public interface LuscombeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LuscombeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LuscombeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#inventory}.
	 * @param ctx the parse tree
	 */
	void enterInventory(LuscombeParser.InventoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#inventory}.
	 * @param ctx the parse tree
	 */
	void exitInventory(LuscombeParser.InventoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(LuscombeParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(LuscombeParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(LuscombeParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(LuscombeParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(LuscombeParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(LuscombeParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(LuscombeParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(LuscombeParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LuscombeParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LuscombeParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LuscombeParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LuscombeParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(LuscombeParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(LuscombeParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#gotolocation}.
	 * @param ctx the parse tree
	 */
	void enterGotolocation(LuscombeParser.GotolocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#gotolocation}.
	 * @param ctx the parse tree
	 */
	void exitGotolocation(LuscombeParser.GotolocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(LuscombeParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(LuscombeParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(LuscombeParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(LuscombeParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(LuscombeParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(LuscombeParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseblock(LuscombeParser.ElseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseblock(LuscombeParser.ElseblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LuscombeParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LuscombeParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#intro}.
	 * @param ctx the parse tree
	 */
	void enterIntro(LuscombeParser.IntroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#intro}.
	 * @param ctx the parse tree
	 */
	void exitIntro(LuscombeParser.IntroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(LuscombeParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(LuscombeParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(LuscombeParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(LuscombeParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#objects}.
	 * @param ctx the parse tree
	 */
	void enterObjects(LuscombeParser.ObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#objects}.
	 * @param ctx the parse tree
	 */
	void exitObjects(LuscombeParser.ObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuscombeParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(LuscombeParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuscombeParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(LuscombeParser.NameContext ctx);
}