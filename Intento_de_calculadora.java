import java.util.InputMismatchException;
import java.util.Scanner;

public class Intento_de_calculadora {
  
public static void main(String[] args) {
        float x;
        float y;
        int operacion;
        double result = 0; 
        double residuo = 0;
        Scanner datos = new Scanner(System.in);
        boolean runin = true;

        System.out.println("Bienvenido, Soy CalcuBot(™) y estoy aqui para realizar operaciones");
        System.out.println();

        while (runin){
                try {
                
        System.out.println("Seleccione 1 para sumar");
        System.out.println("Seleccione 2 para restar");
        System.out.println("Seleccione 3 para multiplicar");
        System.out.println("Seleccione 4 para dividir");
        System.out.println("Seleccione 5 para salir");
        System.out.println();

        operacion = datos.nextInt();

        if (operacion > 5){
                System.out.println("Nel");
                System.out.println();
        }       

        if (operacion == 5){
                runin = false;
        }

        if (operacion < 5){
                System.out.println("Introduzca primer numero");
                x = datos.nextInt();
        
                System.out.println("Introduzca segundo numero");
                y = datos.nextInt();

        switch (operacion)
                {  
                        case 1:
                        result = x + y;
                        break;
	
                        case 2:
                        result = x - y;
                        break;
                        
                        case 3:
                        result = x * y;
                        break;
                        
                        case 4:
                        result = x / y;
                        residuo = x % y;
                        break;

                }      

                System.out.println("Resultado: " + result);
                if (residuo > 0 ) {
                        System.out.println("Residuo: "+ residuo);
                }
                System.out.println();

                }
                        
        } catch (InputMismatchException e) {
                datos.next();
                System.out.println("Whopsis");
                }
        }
        datos.close();

        }
}