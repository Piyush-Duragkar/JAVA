import java.util.*;

public class TicTacToeGame{
    
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
            
        char[][] board={{' ',' ',' '},
                        {' ',' ',' '},
                        {' ',' ',' '}};
                        
        printBoard(board);
                      
        while(1 == 1)
        {
            playersTurn(board,input);
            if(gameOver(board))
            {
                printBoard(board);
                break;
            }
            printBoard(board);
            
            computersTurn(board);
            if(gameOver(board))
            {
                printBoard(board);
                break;
            }
            printBoard(board);
        }
            System.out.println("Thanks for palying, have a good one!");
        
        input.close();
    }
    

    
    private static boolean gameOver(char[][] board)
    {
        
        
        if(results(board,'X'))
            {
                System.out.println("\nCongratulations !!!  You have won, defeating the computer!!!");
                return true;
            }
        
        
        if(results(board,'O'))
            {
                System.out.println("\nThe computer has defeated you, better luck next time !!!");
                return true;
            }
        
        
        for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(board[i][j]==' ')
                        return false;
                }
            }
            printBoard(board);
        System.out.println("\nIt's a tie!!! Both played well !!!");
            return true;
    }
    
    private static boolean results(char[][] board, char symbol)
    { 
        
        for(int i=0;i<3;i++)                                 // vvertically
        {
        if(board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        
        
        for(int j=0;j<3;j++)                                 // horizontally
        {
        if(board[j][0] == symbol && board[j][1] == symbol && board[j][2] == symbol) return true;
        }
        
        if(board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if(board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;
        
        return false;
    }
    


    private static void computersTurn(char[][] board)
    {
        
        Random auto=new Random();
        int computersMove;
        while(1==1)
        {
        computersMove = auto.nextInt(9)+1;
        if(validityCheck(board,Integer.toString(computersMove))) break;
        }
        System.out.println("The computer has played the move on position " + computersMove);
        placeMove(board, Integer.toString(computersMove), 'O');
    }
    
    private static boolean validityCheck(char[][] board, String inputMove)
    {
        switch(inputMove){
        case "1":
             return (board[0][0]==' ');
        case "2":
             return (board[0][1]==' ');
        case "3":
             return (board[0][2]==' ');
        case "4":
             return (board[1][0]==' ');
        case "5":
             return (board[1][1]==' ');
        case "6":
             return (board[1][2]==' ');
        case "7":
             return (board[2][0]==' ');
        case "8":
             return (board[2][1]==' ');
        case "9":
             return (board[2][2]==' ');
        default:
             return false;
        }
    }
    
    private static void playersTurn(char[][] board,Scanner input)
    {
        String playersMove;
        while(1==1)
        {
            System.out.print("Where would you like to place your move? Be smart!!! ");
            playersMove=input.nextLine();
            if(validityCheck(board,playersMove))
                break;
            else 
                System.out.println("That's an inavalid move, let's try again!\n");
        }
        placeMove(board,playersMove,'X');
    }
    
    private static void placeMove(char[][] board, String inputMove, char symbol)
    {
     switch(inputMove){
        case "1":
             board[0][0]=symbol;
             break;
        case "2":
             board[0][1]=symbol;
             break;
        case "3":
             board[0][2]=symbol;
             break;
        case "4":
             board[1][0]=symbol;
             break;
        case "5":
             board[1][1]=symbol;
             break;     
        case "6":
             board[1][2]=symbol;
             break;
        case "7":
             board[2][0]=symbol;
             break;
        case "8":
             board[2][1]=symbol;
             break;
        case "9":
             board[2][2]=symbol;
             break;
        default:
        System.out.println("Something went wrong");
     }
    }
    

    
    private static void printBoard(char[][] board)
    {

                System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
                System.out.println("-+-+-");
                System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
                System.out.println("-+-+-");
                System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
                System.out.println();
                
    }
}
