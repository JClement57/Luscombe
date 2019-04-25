// Generated from /Users/bromlu/Documents/Projects/Luscombe/Luscombe.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link LuscombeListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class LuscombeTranslator extends LuscombeBaseListener {
	private int currentLocationIndex = 0;
	private HashMap locationMap = new HashMap();
	private List<String> variables = new ArrayList<String>();
	private Stack<String> previousActions = new Stack<>();
	private Stack<String> previousFunctions = new Stack<>();
	private String programTop = "";
	private String program = "";
	private String location = "";
	private String inventory = "";
	private String actions = "";
	private String locations = "";
	private String currentFunction = "";

	public String getProgram() {
		return program;
	}

	private void pushActions() {
		previousActions.push(actions);
		actions = "";
	}

	private void popActions() {
		if (!previousActions.empty()) {
			actions = previousActions.pop();
		} else {
			actions = "";
		}
	}

	private void pushFunctions() {
		previousFunctions.push(currentFunction);
		currentFunction = "";
	}

	private void popFunctions() {
		if (!previousFunctions.empty()) {
			currentFunction = previousFunctions.pop();
		} else {
			currentFunction = "";
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(LuscombeParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(LuscombeParser.ProgramContext ctx) {
		program = programTop + inventory + "var locations = [" + locations + "];\n";
		ST programTemplate = new ST(program);
		for (Object key : locationMap.keySet()) {
			programTemplate.add(key.toString(), locationMap.get(key).toString());
		}
		program = programTemplate.render();
		String finishedProgram = programTop + program;
		System.out.println(finishedProgram);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInventory(LuscombeParser.InventoryContext ctx) {
		inventory += "var inventory = {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInventory(LuscombeParser.InventoryContext ctx) {
		inventory += actions + "};";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterItem(LuscombeParser.ItemContext ctx) {
		pushFunctions();
		actions += ctx.start.getText().toLowerCase() + " : {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitItem(LuscombeParser.ItemContext ctx) {
		actions += "},\n";
		popFunctions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLocation(LuscombeParser.LocationContext ctx) {
		location += "{\n name: '" + ctx.start.getText() + "',\n";
		locationMap.put(ctx.start.getText().toLowerCase(), currentLocationIndex++);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLocation(LuscombeParser.LocationContext ctx) {
		location += "},\n";
		locations += location;
		location = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProperties(LuscombeParser.PropertiesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProperties(LuscombeParser.PropertiesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarations(LuscombeParser.DeclarationsContext ctx) {
		String operator = ctx.OPERATOR().getText();
		String variableName = ctx.getChild(LuscombeParser.NameContext.class, 0).getText().toLowerCase();
		String rightSide = "";
		if(ctx.NUMBER() == null) {
			rightSide = ctx.getChild(LuscombeParser.NameContext.class, 1).getText().toLowerCase();
			if(!variables.contains(rightSide)) {
				variables.add(rightSide);
				programTop += "var " + rightSide + " = 0;\n";
			}
		} else {
			rightSide = ctx.NUMBER().getText();
		}
		if(!operator.contains("=")) {
			operator += "=";
		}
		currentFunction += variableName + " " + operator + " " + rightSide + ";\n";
		if(!variables.contains(variableName)) {
			variables.add(variableName);
			programTop += "var " + variableName + " = 0;\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarations(LuscombeParser.DeclarationsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCommand(LuscombeParser.CommandContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCommand(LuscombeParser.CommandContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdd(LuscombeParser.AddContext ctx) {
		pushActions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdd(LuscombeParser.AddContext ctx) {
		int index = actions.indexOf(":");
		String key = actions.substring(0,index-1).trim();
		actions = actions.substring(index + 1).trim();
		currentFunction += "add('" + key.toLowerCase() + "'," + actions + ");\n";
		popActions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDrop(LuscombeParser.DropContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDrop(LuscombeParser.DropContext ctx) {
		currentFunction += "drop('" + ctx.getChild(LuscombeParser.NameContext.class, 0).getText().toLowerCase() + "');\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGotolocation(LuscombeParser.GotolocationContext ctx) {
		currentFunction += "goto(<" + ctx.getChild(LuscombeParser.NameContext.class, 0).getText().toLowerCase() + ">);\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGotolocation(LuscombeParser.GotolocationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditional(LuscombeParser.ConditionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditional(LuscombeParser.ConditionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfblock(LuscombeParser.IfblockContext ctx) {
		currentFunction += "if(";
		if(ctx.getChild(LuscombeParser.NameContext.class, 0) != null) {
			currentFunction += "isInInventory('" + ctx.getChild(LuscombeParser.NameContext.class, 0).getText().toLowerCase() + "')) {\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfblock(LuscombeParser.IfblockContext ctx) {
		currentFunction += "}\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElseIfBlock(LuscombeParser.ElseIfBlockContext ctx) {
		currentFunction += "else if(";
		if(ctx.getChild(LuscombeParser.NameContext.class, 0) != null) {
			currentFunction += "isInInventory('" + ctx.getChild(LuscombeParser.NameContext.class, 0).getText().toLowerCase() + "')) {\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElseIfBlock(LuscombeParser.ElseIfBlockContext ctx) { currentFunction += "}\n"; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElseblock(LuscombeParser.ElseblockContext ctx) {
		currentFunction += "else {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElseblock(LuscombeParser.ElseblockContext ctx) {
		currentFunction += "}\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComparison(LuscombeParser.ComparisonContext ctx) {
		String operator = ctx.COMPAREOP().getText();
		String leftSide = ctx.children.get(0).getText();
		String rightSide = ctx.children.get(2).getText();

		for(int i = 0; i <= 2; i +=2) {
			if (ctx.children.get(i).getClass() == LuscombeParser.NameContext.class) {
				if (!variables.contains(ctx.children.get(i).getText())) {
					variables.add(ctx.children.get(i).getText());
					programTop += "var " + ctx.children.get(i).getText() + " = 0;\n";
				}
			}
		}

		currentFunction += leftSide + " " + operator + " " + rightSide;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComparison(LuscombeParser.ComparisonContext ctx) {
		currentFunction += ") {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntro(LuscombeParser.IntroContext ctx) {
		pushFunctions();
		currentFunction += "intro: () => {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIntro(LuscombeParser.IntroContext ctx) {
		currentFunction += "},\n";
		location += currentFunction;
		popFunctions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActions(LuscombeParser.ActionsContext ctx) {
		pushActions();
		location += "actions: {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActions(LuscombeParser.ActionsContext ctx) {
		location += actions + "},\n";
		popActions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAction(LuscombeParser.ActionContext ctx) {
		pushFunctions();
		currentFunction += ": () => {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAction(LuscombeParser.ActionContext ctx) {
		currentFunction += "},\n";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if(ctx.getChild(i).getClass() == LuscombeParser.NameContext.class) {
				actions += ctx.getChild(i).getText().toLowerCase() + currentFunction;
			}
		}
		popFunctions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterObjects(LuscombeParser.ObjectsContext ctx) {
		pushActions();
		pushFunctions();
		location += "objects: {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitObjects(LuscombeParser.ObjectsContext ctx) {
		location += actions + "},\n";
		popActions();
		popFunctions();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterName(LuscombeParser.NameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitName(LuscombeParser.NameContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) {
		if(node.getText().contains("PRINT")) {
			int start = node.getText().indexOf('{');
			int end = node.getText().indexOf('}');
			String message = node.getText().substring(start + 1, end).trim();
			message = message.replaceAll("'", "\\\\'");
			message = message.replaceAll("\n", " ");
			currentFunction += "print('" + message + "');\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}