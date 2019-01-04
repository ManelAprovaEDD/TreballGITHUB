
import java.util.Scanner;

public class ProjecteGIT {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Disme un numero");    
        int a = entrada.nextInt();
        System.out.println("Disme un altre numero"); 
        int b = entrada.nextInt();
        
        if(a>b){
        	System.out.println("El numero" + a + "es major que el numero" + b);
        }
        
        System.out.println("El numero " + a + " mas el numero " + b + " es igual a " + (a+b));
        
        System.out.println("El numero " + a + " menos el numero " + b + " es igual a " + (a-b));
        
    }

}

