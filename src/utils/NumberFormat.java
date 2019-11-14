/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Cynthia
 */
public class NumberFormat {
    public String Do(int n){
        String num = String.valueOf(n);
        if (n < 0){
            return "(" + num + ")";
        }
        return num;
    }
}
