import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.nio.file.*;
import org.stringtemplate.v4.*;
import java.util.*;

public class Luscombe {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("exampleInput.txt");
        LuscombeLexer lexer = new LuscombeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LuscombeParser parser = new LuscombeParser(tokens);
        LuscombeParser.ProgramContext prog = parser.program();// parse the input stream!

//        ST hello = new ST("Hello, <name>");
//        hello.add("name", "World");
//        System.out.println(hello.render());

//        List<String> template = Files.readAllLines(Paths.get("template.html"));
//        String templateString = "";
//        for (String str: template) {
//            str = str.replaceAll("\\s+","");
//            templateString += str;
//        }
//
//        ST hello = new ST(templateString);
//        System.out.println(templateString);

        Path copied = Paths.get("output.html");
        Path originalPath = Paths.get("template.html");
        Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);

        ParseTreeWalker walker = new ParseTreeWalker();
        LuscombeListener listener = new LuscombeBaseListener();
        walker.walk(listener, prog);
    };
}