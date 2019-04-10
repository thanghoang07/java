package javaBasic_0;

 public class Adc {
     public static void main(String[] args) {
         
         //Declared a new Long object.
         //Khởi một đối tượng Long mới.
         Long lObj = new Long("1233243449");
         
         //To convert Long to String use toString method of Long class.
         //Để chuyển đổi Long thành String sử dụng phương thức toString của lớp Long.
         String strLValue = lObj.toString();
         
         System.out.println("Long converted to String: " + strLValue);
         
     }
 }