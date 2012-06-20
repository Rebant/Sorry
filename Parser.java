import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Parser {

 Scanner scanner;
 String currentLine;
 int onLine = 0;
 
 static final String trueInt = "1"; static final String falseInt = "0";
 
 Game game; //Game to add cards to
 Card cardToAdd; //Card to add to game
 
 /**
  * Parses a file and then adds the cards in the game file to 'game'.
  * @param filename Location of the game file.
  * @param game Game to add cards to.
  * @throws NullGameException
  */
 public Parser(String filename, Game game) throws NullGameException {
  this.game = game;

  try {
   scanner = new Scanner(new File(filename));
   currentLine = scanner.nextLine();
   if (!currentLine.equals("Sorry - Made by Rebant Srivastava")) { throw new NullGameException(onLine); }
  }
  catch (NumberFormatException nfe) { throw new NullGameException(onLine); }
  catch (IOException ioe) { throw new NullGameException("File not found."); }
  catch (NullGameException nge) { throw nge; }
  catch (Exception e) { throw new NullGameException("There is some sort of exception I did not account for..."); }

  //Start reading each line, adding each card
  while (scanner.hasNextLine()) {
   currentLine = scanner.nextLine(); onLine++;
   String[] cardDescription = currentLine.split(";");
   if (cardDescription.length != 8) { System.out.println(currentLine); throw new NullGameException(onLine); }
   try { Integer.parseInt(cardDescription[0]); } catch (NumberFormatException nfe) { throw new NullGameException(onLine); }
   for (int i = 1; i < 7; i = i + 1) {
    if (cardDescription[i].equals(trueInt)) { cardDescription[i] = "true"; }
    else if (cardDescription[i].equals(falseInt)) { cardDescription[i] = "false"; }
    else { System.out.println(currentLine); throw new NullGameException(onLine); }
   }
   cardToAdd = new Card(cardDescription);
   game.addCard(cardToAdd);
  }
  
 }
 
}
