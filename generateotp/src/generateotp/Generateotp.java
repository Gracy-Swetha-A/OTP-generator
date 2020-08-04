/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generateotp;

import java.util.Random;

public class Generateotp {
   
  
   private static char[] OTP(int length) {
      String n = "1234567890";
      Random r = new Random();
      char[] otp = new char[length];

      for(int i = 0; i< length ; i++) {
         otp[i] = n.charAt(r.nextInt(n.length()));
      }
      return otp;
   }
    public static void main(String[] args) {
       int length=6;

      System.out.println(OTP(length));
   }
}


   