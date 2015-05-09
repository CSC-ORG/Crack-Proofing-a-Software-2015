/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavneet Kaur
 * 
 **/
public class TicTacToe {

    
    public static boolean playerTurn = true;
    public static boolean player1Won = false;
    public static boolean player2Won = false;
    public static Board board =new Board();
    public static void main(String[] args) throws IOException, Exception {
        Path p= Paths.get("C:\\Program Files\\Common Files\\test.txt");
        Path p2= Paths.get("C:\\Program Files (x86)\\Common Files\\test.txt");
        if((board.isVisible() == false) && (Files.exists(p)== true)){
           MAC_Addr mac = new MAC_Addr();
           RSA rsaobj = new RSA();
            board.setVisible(true);
        }
        else if ((board.isVisible() == false) && (Files.exists(p2)== true)){
           MAC_Addr mac = new MAC_Addr();
           RSA rsaobj = new RSA();
            board.setVisible(true);
        }
        else
        {
             JOptionPane.showMessageDialog(null, " license file missing ");
        }
 // TODO code application logic here
    }
    
    public static void check(){
        try{
        if((board.button1.getText().equals("X")) && (board.button4.getText().equals("X")) && (board.button7.getText().equals("X")))
        {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
        }
         if((board.button1.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button9.getText().equals("X")))
         {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
         }
          if((board.button1.getText().equals("X")) && (board.button2.getText().equals("X")) && (board.button3.getText().equals("X")))
          {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
           }
           if((board.button3.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button7.getText().equals("X")))
           {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
            }
            if((board.button3.getText().equals("X")) && (board.button6.getText().equals("X")) && (board.button9.getText().equals("X")))
            {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
            }
             if((board.button7.getText().equals("X")) && (board.button8.getText().equals("X")) && (board.button9.getText().equals("X")))
             {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
              }
              if((board.button4.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button6.getText().equals("X")))
              {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
               }
               if((board.button2.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button8.getText().equals("X")))
               {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
                }
      
              
        if((board.button1.getText().equals("O")) && (board.button4.getText().equals("O")) && (board.button7.getText().equals("O")))
        {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
         }
         if((board.button1.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button9.getText().equals("O")))
         {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
          }
          if((board.button1.getText().equals("O")) && (board.button2.getText().equals("O")) && (board.button3.getText().equals("O")))
          {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
           }
           if((board.button3.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button7.getText().equals("O")))
           {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
            }
            if((board.button3.getText().equals("O")) && (board.button6.getText().equals("O")) && (board.button9.getText().equals("O")))
            {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
             }
             if((board.button7.getText().equals("O")) && (board.button8.getText().equals("O")) && (board.button9.getText().equals("O")))
             {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
              }
              if((board.button4.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button6.getText().equals("O")))
              {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");sleep(2000);
                 board.setVisible(false);
               }
               if((board.button2.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button8.getText().equals("O")))
               {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
                }
         if(board.count == 0)
         {
             if((board.button1.getText().equals("X")) && (board.button4.getText().equals("X")) && (board.button7.getText().equals("X")))
        {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
        }
             else if((board.button1.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button9.getText().equals("X")))
         {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
         }
         else if((board.button1.getText().equals("X")) && (board.button2.getText().equals("X")) && (board.button3.getText().equals("X")))
          {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
           }
          else if((board.button3.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button7.getText().equals("X")))
           {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
            }
           else if((board.button3.getText().equals("X")) && (board.button6.getText().equals("X")) && (board.button9.getText().equals("X")))
            {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
            }
            else if((board.button7.getText().equals("X")) && (board.button8.getText().equals("X")) && (board.button9.getText().equals("X")))
             {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
              }
             else if((board.button4.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button6.getText().equals("X")))
              {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
               }
              else if((board.button2.getText().equals("X")) && (board.button5.getText().equals("X")) && (board.button8.getText().equals("X")))
               {
                 player1Won =true;
                 player2Won=false;
                 board.setTitle("Player 1 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
                }
      
              
               else if((board.button1.getText().equals("O")) && (board.button4.getText().equals("O")) && (board.button7.getText().equals("O")))
        {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
         }
        else if((board.button1.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button9.getText().equals("O")))
         {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
          }
         else if((board.button1.getText().equals("O")) && (board.button2.getText().equals("O")) && (board.button3.getText().equals("O")))
          {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
           }
          else if((board.button3.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button7.getText().equals("O")))
           {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
            }
           else if((board.button3.getText().equals("O")) && (board.button6.getText().equals("O")) && (board.button9.getText().equals("O")))
            {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
             }
            else if((board.button7.getText().equals("O")) && (board.button8.getText().equals("O")) && (board.button9.getText().equals("O")))
             {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
              }
             else if((board.button4.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button6.getText().equals("O")))
              {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100);
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
               }
              else if((board.button2.getText().equals("O")) && (board.button5.getText().equals("O")) && (board.button8.getText().equals("O")))
               {
                 player1Won =false;
                 player2Won =true;
                 board.setTitle("Player 2 Won");
                 sleep(100); 
                 sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                 board.setVisible(false);
                }
               else 
               {
                   board.setTitle("Draw");
                   sleep(2000);
                   board.setTitle("Bye!");
                   sleep(2000);
                   board.setVisible(false);
               }
         }     
    }catch(Exception e)
    {
                
    } 
        
    }
}