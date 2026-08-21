public class full_pyramid {
    public static void main (String[]args){
        int n = 5 ;

        for (int i =1; i<=n; i++){                  //for rows

            for (int j =1 ; j<=n-i ; j++) {    // for spaces
                
                System.out.print(" ");
            }  
        for (int j =1 ; j<=2*i-1; j++){   //for printing stars
            System.out.print("*");
        }
        System.out.println();    //for print next row
        
        }

    }
    
}
