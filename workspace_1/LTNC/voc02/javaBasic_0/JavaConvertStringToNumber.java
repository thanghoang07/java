package javaBasic_0;
/**
  * @(#)JavaConvertStringToNumber.java
  *
  * JavaConvertStringToNumber application
  *
  * @author developer.bnson@gmail.com
  * @version 1.00 2014/3/16
  */

 public class JavaConvertStringToNumber {
     
     public static void main(String[] args) {
         

         String str1 = "100";
         // int primitive
         int i1 = Integer.parseInt(str1);
         // Integer Object
         Integer i2 = Integer.valueOf(str1);
         
         String str2 = "3.14";
         // float primitive
         float f1 = Float.parseFloat(str2);;
         // Float Object
         Float f2 = Float.valueOf(str2);
         
         String str3 = "123456789";
         // double primitive
         double d1 = Double.parseDouble(str3);
         // Double Object
         Double d2 = Double.valueOf(str3);
         
         System.out.println("i1 :" + i1);
         System.out.println("i2 :" + i1);
         System.out.println("f1 :" + f1);
         System.out.println("f2 :" + f2);
         System.out.println("d1 :" + d1);
         System.out.println("d2 :" + d2);
         
         System.out.println(" \n \t -- VNLIVES.NET -- ");
     }
 }
