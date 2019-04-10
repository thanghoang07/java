package tuan3_mang_mot_chieu;

public class Soft { 

    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
       int mang[]= {1,7,3,4,2,6,7,8,9,3}; 
       System.out.println("Mang ban dau la:"); 
       In(mang); 
       System.out.println("Mang sau khi dao:"); 
       Daomang(mang); 
       System.out.println("Mang sau khi sap xep:"); 
       Sapxep(mang); 
       In(mang); 
    } 
    public static void In(int mang[]){ 
            int i; 
           for(i=0;i<10;i++) 
               System.out.println(mang[i]); 
       } 
    public static void Sapxep(int mang[]){ 
        int tam,i,j; 
        for(i=0;i<10;i++){ 
            for(j=i+1;j<=9;j++) 
                if(mang[i]>mang[j]){ 
                tam=mang[i]; 
                mang[i]=mang[j]; 
                mang[j]=tam; 
                } 
        } 
         } 
        public static void Daomang(int mang[])
        { 
            int j; 
            for(j=9;j>=0;j--) 
                System.out.println(mang[j]); 
        }
}