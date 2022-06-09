import java.util.Scanner;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, String> facts = new HashMap<String, String>();
    
    char[][] board = new char[3][3];
    for (int i = 0;i<3;i++)
      for (int j = 0; j<3; j++)
        board[i][j] = '_';

    Scanner scan = new Scanner(System.in);
    boolean p1 = true; 
    int p1score = 0;
    int p2score = 0;
    //System.out.println("\n\ta-Check Score\n\tp-Play Game");
    
while(true){
  
    String command = Utils.inputStr("\nWhat do you want to do?\n\ta-Check Score\n\tp-Play Game");
        switch (command) {
        case "a":
          //if (facts.size()==0)
            if (p1score == p2score){
              if(p1score == 0)
            System.out.println("No games have been played yet.");
              }
            else{
            System.out.println("Player 1 score: " + p1score);
            System.out.println("Player 2 score: " + p2score);
              }
    for (String thing : facts.keySet()){
      String value = facts.get(thing);

      System.out.println(thing + ": " + value);
      }
         break;   
    
  case "p":
  System.out.println("\tTIC TAC TOE GAME!!");
  System.out.println("Player 1 name:");
  String player1 = scan.nextLine();
  System.out.println("Player 2 name:");
  String player2 = scan.nextLine();

    
    
  drawBoard(board);


      while (!Full(board)){
      // while (row>=0 || row <3){
      int row = Utils.inputNum("Choose a row: ");
      while (row >= 3) {
        row = Utils.inputNum("Row must be between 0 and 2: ");
      }
      int column = Utils.inputNum("Choose a column: ");
      while (column >= 3) {
        column = Utils.inputNum("Column must be between 0 and 2: ");
      }
        
        if (board[row][column] != '_'){
        System.out.println("That space is already taken!");
        //drawBoard(board);
          
          }
    else if (p1)
      

        board[row][column] = 'X';
    else board[row][column] = 'O';
        
      p1 = !p1;

      if (win(board) == 'X'){
        System.out.println("Player 1 wins!");
        p1score +=1;
        resetBoard(board);
        break;
        }
      
      else if (win(board) == 'O'){
        System.out.println("Player 2 wins!");
        p2score +=1;
        resetBoard(board);
          break;
        }
        else if (Full(board)==true){
        System.out.println("It's a tie!");
          resetBoard(board);
        //  break;
          }
        
    drawBoard(board);
    }
    }
  }
    }
    
    public static void resetBoard(char[][] board){
      for (int i = 0;i<3;i++)
      for (int j = 0; j<3; j++)
        board[i][j] = '_';
    }

  public static void taken(char[][] board){
   
  }
  
  public static void drawBoard(char[][] board){
    for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
        }
      System.out.println();
}
    }
  
  public static char win(char[][] board){
		
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_') {
				return board[i][0];
			}
		}
    for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
			return board[2][0];
		}
    return ' ';
    }
  
    public static boolean Full(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '_') {
					return false;
				}
			}
		}
		return true;
      }
    } 
/*public static void main (String[] args) { 
  for(int a = 0; a < 8; a++){
string line = null; 
switch(a)
case 0: 
    line = board[0] + board[1]+board[2];
    break; 
case 1:
    line = board[3] + board[4] + board[5];
    break; 
case 2: 
    line = board[6] + board[7] + board[8];
    break;
case 3: 
    line = board[0] + board[3] + board[6];
    break;
case 4:
    line = board[1] + board[4] + board[7];
    break;
case 5:
    line = board[2] + board[5] + board[8];
    break; 
case 6: 
    line = board[0] + board[4] + board[8];
    break; 
case 7: 
    line = board[2] + board[4] + board[6];
    break; 
}
if(line.equals("XXX")){
  return "X";
} else if (line.equals("OOO")){
    return "O";
      }
        }
  for (int a = 0; a<9; a++){
    if (array.asList(board).contains(String.valuesOf(a+1))){
break; 
    }
else if (a==8) return "draw";
  }
  */
  



