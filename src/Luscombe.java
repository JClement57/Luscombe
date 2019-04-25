import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.PrintWriter;
import java.nio.file.*;
import org.stringtemplate.v4.*;
import java.util.*;

public class Luscombe {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("pirates.txt");
        LuscombeLexer lexer = new LuscombeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LuscombeParser parser = new LuscombeParser(tokens);
        LuscombeParser.ProgramContext prog = parser.program();// parse the input stream!
        ParseTreeWalker walker = new ParseTreeWalker();
        LuscombeListener listener = new LuscombeTranslator();
        walker.walk(listener, prog);

        List<String> template = Files.readAllLines(Paths.get("template.html"));
        String templateString = "";
        for (String str: template) {
//            str = str.replaceAll("\\s+","");
            templateString += str;
        }
        templateString += ((LuscombeTranslator) listener).getProgram() + "locations[currentLocation].intro();\n" +
                "update()\n </script>";
        PrintWriter out = new PrintWriter("output.html");
        out.print(templateString);
        out.close();
    };
}