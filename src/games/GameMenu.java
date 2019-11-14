/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

/**
 *
 * @author Rizky
 */
public class GameMenu extends TheGame { //inheritance
    public void play(){ //overriding TheGame.play method
        clear();
        banner();
        System.out.println("Menu : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
    }
}
