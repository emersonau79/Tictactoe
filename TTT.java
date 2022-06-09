/*
Game class - Tic tac toe  

In this game, two people will alternate turns in trying to get three in a row, in which there will be a board of 3 x 3 and players will fill in X and O to mark their spot in which trying to get three in a row. 

Author - Emerson Au and Aaron Chhor 

Change history:
5/15: Created

Classes:
public class TTT{
private String[][] board;

public TTT{
board = new String[3][3];
}
}
Methods:
public static void main(String[] args)
^gonna be our board that we create gonna be a 3 x 3 

public static void printGameBoard(char[][] gameboard )
this is where we print the game 

public static boolean win(char[][] board)
*Checks if a player won

public static boolean boardIsFull(char[][] board)
*Checks if the board is full and continues on playing until it is.

public static void drawBoard(char[][] board)
*Prints out the board







*/
/*public class TTT 
  {
  public static void main(string[] args)
    int[][] taken = new int[][];
    int[][] a = scan.nextLine();
    if (a>0 || a<10)
  //static String [] board;
  //static String turn;

  static String win()
    {
    for (int n)
      
    }

    
  }
*/

public class TTT {
  private String[][] board;

  public TTT(String[][] arr){
  arr = new String[3][3];
    board = arr;
}
  public static void drawBoard(char[][] board){
    for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);

  }
  //System.out.println();
      }
    }
  public static boolean win(char[][] board){
		
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_') {
				return true;//board[i][0];
			}
		}
    for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return true;//board[0][j];
			}
		}
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return true;//board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
			return true;//board[2][0];
		}
    return false;
    }
  
    public static boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}


    












/*
import java.util.HashMap;

public class Game {
  // Private instance variables to store the facts and score
  private HashMap<String, String> facts;
  private int score;

  // Constructor, to initialize the instance variable
  public Game () {
    facts = new HashMap<String, String>();
  }

  // Method to let a user create/modify/delete facts
  public void play () {
    System.out.println ("Welcome to FactsGame, where you first record a list of facts, then someone else tries to guess them");
    
    System.out.println ("\nLet's record some facts");
    inputFacts();

    System.out.println ("\nNow let's see if someone can guess them");
    guessFacts();
  }

  public void inputFacts() {
    System.out.println ("You can a-view all facts, s-set a fact, d-delete a fact, q-quit recording facts, anything else-a fact you want to view");
    while (true) {
      String command = Utils.inputStr("What do you want to do? ");
      switch (command) {
          
        case "a":   // View all facts
          if (facts.size() == 0) {
            System.out.println ("No facts have been set yet.");
          }
          for (String factKey : facts.keySet())
            System.out.println (factKey + ": " + facts.get(factKey));
          break;
          
        case "s":    // Set a fact
          System.out.println ("Facts have two parts; the 'thing' (e.g, age) and the 'value' (e.g., 17)");
          String thing = Utils.inputStr ("What is the thing? ");
          String value = Utils.inputStr ("What is the value? ");
          facts.put (thing, value);
          break;
          
        case "d":    // Delete a fact
          thing = Utils.inputStr ("What fact do you want to delete? ");
          facts.remove (thing);
          break;
          
        case "q":    // Quit
          System.out.println ("Done recording facts");
          return;
          
        default:     // Look up a specific fact (the "command")
          System.out.print ("Fact " + command + ": ");
          System.out.println (facts.get(command));
      }
    }
  }

  public void guessFacts() {
    score = 0;
    for (String factKey : facts.keySet()) {
      String answer = Utils.inputStr ("What's the value of '" + factKey + "''? ");
      if (answer.equalsIgnoreCase(facts.get(factKey))) {
        System.out.println ("Correct!");
        score++;
      }
      else {
        System.out.println ("Nope - the answer is: " + facts.get(factKey));
      }
    }
    System.out.println ("Thanks for playing, you scored " + score);
  }
} */ 