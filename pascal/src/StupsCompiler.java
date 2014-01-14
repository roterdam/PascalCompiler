/**
 * Created by maximilian on 11.12.13.
 */


package pascal.src;

import pascal.parser.*;
import pascal.lexer.*;
import pascal.node.*;
import java.io.*;

public class StupsCompiler {


    public static void main (String [] args)throws LexerException, IOException, ParserException{

        //check for arguments
        if(args.length < 2){
            System.out.println("Error: not enough arguments.\n Use: java StupsCompiler -argument <Filename>\n ");
            System.exit(1);
        }



        //lets go
        String filename = args[1];
        try
	   {
           if (args[0].equals("-compile")){


               filename = args[1];
               File file = new File(filename);
               PushbackReader reader = new PushbackReader(new FileReader(file));
               Lexer lexer = new Lexer(reader);
               Parser parser = new Parser(lexer);
               Start tree = parser.parse();
               ASTPrinter printer = new ASTPrinter();
               tree.apply(printer);


           }
           else System.out.println(" Error: Wrong usage of StupsCompiler.\n Usage:  java StupsCompiler -compile <Filename>");
		  
		  
	  }
	catch(Exception e){
		System.out.println(e.getMessage());
	} 



    }



}
