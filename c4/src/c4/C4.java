/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author theCoderSchool SF
 */
public class C4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ghost = new Scanner(System.in);
         String [][] board = new String [6][7];
         for(int i = 0; i<board.length;i++){
             for (int a = 0;a<board[i].length;a++){
                 board[i][a]="_";
            
             }
             
         }
         System.out.println("Welcome to connect foure");
         int count =0;
         String p1="jkhjkm";
         String p2="gvhbjnm";
         while( p1.length()!=1 && p2.length() !=1 ){
             p1 = ghost.nextLine();
             p2 = ghost.nextLine();
         }
             
         while(count<43){
             
         bord(board);
    }
    }
    public static  void bord(String[][]bard){
        System.out.println(" 1 2 3 4 5 6 7");
        for(int i =0;i<bard.length;i++){
                System.out.println("|"+String.join("|",bard[i])+"|");
                
            
        }
    }
   
}
