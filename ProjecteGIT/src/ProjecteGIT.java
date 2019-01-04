
import java.util.Scanner;

public class ProjecteGIT {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Disme un numero: ");    
        int a = entrada.nextInt();
        System.out.print("Disme un altre numero: "); 
        int b = entrada.nextInt();
        
        if(a>b){

        	System.out.println("El numero " + a + " es major que el numero " + b);
        }
        if (a == b) {
        	System.out.println("El numero " + a + " es igual que el numero " + b );
        
        }
        
        if(b>a){
        	System.out.println("El numero " + b + " es major que el numero " + a);
        }
    
        System.out.println("El numero " + a + " mes el numero " + b + " es igual a " + (a+b));
        
        System.out.println("El numero " + a + " menos el numero " + b + " es igual a " + (a-b));
        

    }

}

