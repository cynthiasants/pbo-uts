/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.util.Random;
/**
 *
 * @author Cynthia
 */
public class random {
    public int create(int max){
        int min = 0;
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    public int create(int min, int max){ // overloading
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
