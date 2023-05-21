/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/


package lang.parser;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import lang.ast.*;
import lang.visitors.LangVisitors;

public class LangAdapter implements ParseAdaptor {
	public SuperNode parseFile(String path) {
        try  {
			CharStream stream = CharStreams.fromFileName(path);
			langLexer lexer = new langLexer(stream);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer) ;
			langParser parser = new langParser(tokenStream);
			ParseTree result = parser.program();	
			if( parser.getNumberOfSyntaxErrors() == 0 ) {
				LangVisitors v = new LangVisitors();
				return result.accept(v);
			}
		}	
        catch(IOException e) { 
			e.printStackTrace();
		}     
		return null;  
    }
}
