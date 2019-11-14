/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;
import java.util.Scanner;

/**
 *
 * @author Cynthia
 */
public class MainGame {
    public static void main(String args[]){
        int imenu = 100;
        TheGame game = new TheGame();
        GameMenu menu = new GameMenu();
        game.play();
        while (imenu != 3){
           while (imenu > 3){
                menu.play();
                System.out.print("Pilih No Menu : ");
                Scanner inp = new Scanner(System.in);
                imenu = inp.nextInt();
            }
           if (imenu == 1){
                SumGame sgame = new SumGame(game.getName());
                sgame.play();
                menu.play();
                System.out.print("Pilih No Menu : ");
                Scanner inp = new Scanner(System.in);
                imenu = inp.nextInt();
           }
           else if (imenu == 2){
               SubGame subgame = new SubGame(game.getName());
                subgame.play();
                menu.play();
                System.out.print("Pilih No Menu : ");
                Scanner inp = new Scanner(System.in);
                imenu = inp.nextInt();
           }
        }
    }
}
