/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.util.Scanner;
import utils.*;

/**
 *
 * @author Fandi
 */
public class SubGame extends TheGame{
    public void banner(){ //overriding
        System.out.println("*********************************");
        System.out.println("Game Math - Pengurangan");
        System.out.println("*********************************");
    }
    private int generateSoal(int level){
        random rand = new random();
        if (level == 1){
            return rand.create(10);
        }
        else if (level == 2){
            return rand.create(-10,-1);
        }
        else {
            return rand.create(-10,10);
        }
    }
    public SubGame(String name){ // overriding
        super(name);
    }
    public void play(){ //overriding
        NumberFormat fmt = new NumberFormat();
        Scanner sc = new Scanner(System.in);
        int ulives = getLives();
        int uscore = getScore();
        while (uscore < 300){
            while (ulives > 0){
               uscore = getScore();
               int ulevel = getLevel();
               int num1 = generateSoal(ulevel);
               int num2 = generateSoal(ulevel);
               int jawab;
               System.out.println(String.format("Berapakah hasil dari %s - %s ?", fmt.Do(num1), fmt.Do(num2)));
               System.out.print("Jawab : ");
               jawab = sc.nextInt();
               if (jawab == num1-num2){
                   setScore(uscore+4);
                   setLevel(uscore+4);
                   uscore = getScore();
                   ulevel = getLevel();
                   System.out.println(String.format("[Selamat %s, Anda benar][Skor : %d][Lives : %d][Level : %d]", getName(), uscore, ulives, ulevel));
               }
               else {
                   setScore(uscore-1);
                   setLives(ulives-1);
                   setLevel(uscore-1);
                   uscore = getScore();
                   ulives = getLives();
                   ulevel = getLevel();
                   System.out.println(String.format("[Wah, salah deh][Skor : %d][Lives : %d][Level : %d]", uscore, ulives, ulevel));
               }
               System.out.println("-----------------------------------------------");
            }
            System.out.println(String.format("[Hai %s, Jangan menyerah ya untuk mencoba lagi.", getName()));
        }
        System.out.println(String.format("[Selamat %s, Anda telah menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal penjumlahan jika belum]", getName()));
    }
}
