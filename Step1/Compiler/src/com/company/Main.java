package com.company;

import org.antlr.v4.runtime.*;
import java.io.*;

import static org.antlr.v4.runtime.CharStreams.*;

public class Main {

    private static Object EOFException;

    public static void main(String[] args) throws Exception {
	    String inputFile = null;

	    String[] files =
        {
                "./src/com/company/inputs/fibonacci.micro",
                "./src/com/company/inputs/loop.micro",
                "./src/com/company/inputs/nested.micro",
                "./src/com/company/inputs/sqrt.micro"
        };

	    for(int i = 0; i < files.length; i++){
            inputFile = files[i];
            InputStream is = System.in;
            if (inputFile != null ) is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            microGrammarLexer lexer = new microGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            String[] splitFile = inputFile.split("/");
            String newFilename = splitFile[splitFile.length-1];

            FileWriter fileWriter = new FileWriter(newFilename + ".out");
            PrintWriter writer = new PrintWriter(fileWriter);


            tokens.consume();
            while(true)
            {
                Token t = tokens.get(tokens.index()-1);
                if(t.getType() != Token.EOF)
                {
                    writer.println("Token Type: " + lexer.getVocabulary().getSymbolicName(t.getType()));
                    writer.println("Value: " + t.getText());

                }
                if(tokens.get(tokens.index()).getType() != Token.EOF) {
                    tokens.consume();
                }
                else {
                    break;
                }
            }

            writer.close();
        }


    }


}
