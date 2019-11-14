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
public class TheGame {
    private String name;
    private int level, score, lives, menu;
    
    public void banner(){
        System.out.println("*********************************");
        System.out.println("Game Math");
        System.out.println("*********************************");
    }
    public TheGame(){
        level = 1;
        score = 0;
        lives = 3;
    }
    public TheGame(String n){
        name = n;
        level = 1;
        score = 0;
        lives = 3;
    }
    public final static void clear(){
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            }
            else {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e) {
            
        }
    }
    public int getLives(){ //encapsulation
        return lives;
    }
    public int getScore(){
        return score;
    }
    public int getLevel(){
        return level;
    }
    public String getName(){
        return name;
    }
    public void setLives(int live){ //encapsulation
        lives = live;
    }
    public void setScore(int sc){
        score = sc;
    }
    public void setLevel(int sc){
        if (sc <= 100){
            level = 1;
        }
        else if (sc <= 200){
            level = 2;
        }
        else {
            level = 3;
        }
    }
    public void setName(String n){
        name = n;
    }
    public void play(){
        String name;
        clear();
        banner();
        System.out.print("Masukkan Nama Anda : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        setName(name);
    }
}
