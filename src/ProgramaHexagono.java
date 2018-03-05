package programahexagono;

import java.util.Scanner;

public class ProgramaHexagono {

    static double Area(double Lado){
     
        double S=0;
        double L=Lado;
        double ap= L/(1.15);
        S=3*L*ap;
                    
        return S;
        
    }
       
    public static void main(String[] args) {
        
        
       double L;
            
       Scanner Teclado= new Scanner (System.in);
        
       System.out.println("Introduzca la dimension del lado del hexágono: ");
       L = Teclado.nextFloat();
       
       double A= Area(L);
       
       System.out.println("Area del Hexágono: " +A);
       
    }    
}
