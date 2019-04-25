// Generated from /Users/bromlu/Documents/Projects/Luscombe/Luscombe.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.stringtemplate.v4.*;
/**
 * This class provides an empty implementation of {@link LuscombeListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class LuscombeBaseListener implements LuscombeListener {
	int currentLocationIndex = 0;
	HashMap locationMap = new HashMap();
	List<String> variables = new ArrayList<String>();
	public String programTop = "";
	public String program = "";
	public String location = "";
	public String currentFunction = "";
	public String locationStringTemplate = "locations = [\n" +
			"{\n" +
			"    <location>\n" +
			"},\n" +
			"];";
//
//	public String actionsTemplate =
//			"<object>: [, 1],\n" +
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
	@Override public void enterInventory(LuscombeParser.InventoryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInventory(LuscombeParser.InventoryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterItem(LuscombeParser.ItemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitItem(LuscombeParser.ItemContext ctx) {
		currentFunction = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUse(LuscombeParser.UseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUse(LuscombeParser.UseContext ctx) {
		currentFunction = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLocation(LuscombeParser.LocationContext ctx) {
		location += "name: '" + ctx.start.getText() + "',\n";
		locationMap.put(ctx.start.getText().toLowerCase(), currentLocationIndex++);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLocation(LuscombeParser.LocationContext ctx) {
		program += location;
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
	@Override public void enterCounters(LuscombeParser.CountersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCounters(LuscombeParser.CountersContext ctx) { }
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
	@Override public void enterAdd(LuscombeParser.AddContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdd(LuscombeParser.AddContext ctx) { }
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
	@Override public void exitDrop(LuscombeParser.DropContext ctx) { }
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
	@Override public void enterComparision(LuscombeParser.ComparisionContext ctx) {
		String operator = ctx.COMPAREOP().getText();
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
		currentFunction += variableName + " " + operator + " " + rightSide;
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
	@Override public void exitComparision(LuscombeParser.ComparisionContext ctx) {
		currentFunction += ") {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntro(LuscombeParser.IntroContext ctx) {
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
		currentFunction = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActions(LuscombeParser.ActionsContext ctx) {
		location += "actions: {\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActions(LuscombeParser.ActionsContext ctx) {
		location += "},\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAction(LuscombeParser.ActionContext ctx) {
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
				location += ctx.getChild(i).getText() + currentFunction;
			}
		}
		currentFunction = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterObjects(LuscombeParser.ObjectsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitObjects(LuscombeParser.ObjectsContext ctx) {
		currentFunction = "";
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
			currentFunction += "print('" + node.getText().substring(start + 1, end).trim() + "');\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}