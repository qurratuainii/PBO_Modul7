/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP Folio 1040
 */
public class Latihan2 {
    public static void main(String[] args) throws IOException{
        BufferedReader In = new BufferedReader(
                new InputStreamReader(System.in));
        
        int[] nilai = new int[10];
        int max=0;
        
        for(int i=0; i<nilai.length; i++){
            System.out.print("Nilai "+(i+1)+" = ");
            nilai[i] = Integer.parseInt(In.readLine());
        }
       
        System.out.println("Nilai array maximum");
        for(int i=0; i<nilai.length; i++){
            if(nilai[i]>max){
                max = nilai[i];
            }
        }
        System.out.println(+max);
    }
}
