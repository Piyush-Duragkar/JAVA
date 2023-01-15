import java.util.*;
public class RockPaperScissors {
    public static void main(String args[]) {
      Scanner input=new Scanner(System.in);
      Random random=new Random();
      String playersMove;
      System.out.println("Welcome to Rock Paper Scissors game !!!\n");
      
      
      while(true)
          {
          System.out.println("Plan your move, and use \"r\" or \"p\" or \"s\" ");
          
          
          playersMove = input.nextLine();
          playersMove=playersChoice(playersMove);
          
          
          if(playersMove.equals("none")) continue;
          int comp = random.nextInt(3);
          
          
          String computersMove = convert(comp);
         
          if(! tie(playersMove, computersMove))
              {
                 if(! result(computersMove,playersMove))
                     System.out.println("Commputer have won!!!\n\n");
              }
                else 
                     System.out.println("It's a tie, you predicted the computer's move, let's try again!!!");
          
          System.out.print("\nWant to retry? ( y / n ) ");
          String repeat=input.nextLine();
          if(repeat.equals("n"))
          break;
          System.out.println("\n");
          
          }
          
        //   input.close();

    }
    private static String playersChoice(String playersChoice)
        {
            if(playersChoice.equals("r")) return "rock";
            if(playersChoice.equals("p")) return "paper";
            if(playersChoice.equals("s")) return "scissors";
            System.out.println("Invalid Input");
            return "none";
        }
    
    
    private static boolean tie(String playersMove, String computersMove)
        {
            if(playersMove.equals("rock") && computersMove.equals("rock")) return true;
            if(playersMove.equals("scissors") && computersMove.equals("scissors")) return true;
            if(playersMove.equals("paper") && computersMove.equals("paper")) return true;
            return false;
        }
    
    
    private static boolean result(String computersMove, String playersMove)
        {
            if(playersMove.equals("paper") && computersMove.equals("scissors")) return false;
            if(playersMove.equals("rock") && computersMove.equals("paper")) return false;
            if(playersMove.equals("scissors") && computersMove.equals("rock")) return false;
            System.out.println("Congratulations you have won!!!\n");
            return true;
        }
    
    
    private static String convert(int x)
        {
            if(x == 0) 
            { 
                System.out.println("Computer has choosen Rock\n");
                return "rock";
            }
            if(x == 1) 
            { 
                System.out.println("Computer has choosen Paper\n");
                return "paper";
            }
            if(x == 2) 
            { 
                System.out.println("Computer has choosen Scissors\n");
                return "scissors";
            }
            return null;
    
        }
    
    
}
