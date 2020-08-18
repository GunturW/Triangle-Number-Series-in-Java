/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Guntur Wicaksono
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //kiri atas ke kanan bawah increment segitiga bawah
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*
        Output:
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5
        */
        
        System.out.print("\n");
        //kiri atas ke kanan bawah decrement segitiga bawah
        for(int i = 5; i >= 1; i--){
            for(int j = 5; j >= i; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*
        Output:
        5 
        5 4 
        5 4 3 
        5 4 3 2 
        5 4 3 2 1 
        */
           
        System.out.print("\n");
        //kanan atas ke kiri bawah incremant segitiga atas
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*
        Output:
        1 2 3 4 5 
        1 2 3 4 
        1 2 3 
        1 2 
        1
        */
        
        System.out.print("\n");
        //Kanan atas ke kiri bawah decrement segitiga atas
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*
        Output:
        5 4 3 2 1 
        5 4 3 2 
        5 4 3 
        5 4 
        5
        */
        
        System.out.print("\n");
        //kanan atas ke kiri bawah increment segigita bawah
        
        for(int i = 1; i <= 5; i++){
            for(int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
        /*
        Output:
             1
            21
           321
          4321
         54321
        */
        
        System.out.print("\n");
        //kanan atas ke kiri bawah decrement segigita bawah
        
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = i; k <= 5; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        /*
        Output:
             5
            45
           345
          2345
         12345
        */
        
        System.out.print("\n");
        //persegi increment
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*
        Output:
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        */
        
        System.out.print("\n");
        //persegi increment
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= 1; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*
        Output:
        5 4 3 2 1 
        5 4 3 2 1 
        5 4 3 2 1 
        5 4 3 2 1 
        5 4 3 2 1 
        */
        
        for(int i = 5; i >= 1; i--){
          for(int j = 1; j <= i; j++){
              System.out.print(" ");
          }
          for(int k = i; k <= 5; k++){
              System.out.print(k);
          }
          System.out.println();
        }
        /*Output:
             5
            45
           345
          2345
         12345
        */
    }
    
}
