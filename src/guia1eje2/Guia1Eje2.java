
package guia1eje2;

import java.util.Scanner;


public class Guia1Eje2 {

   
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int tamaño;
        int arreglo[];
        String operacion;
        
        System.out.println("ingrese el tamaño del arreglo");
        tamaño=sc.nextInt();
        
        arreglo=new int[tamaño];
        
        ArrayStack a=new ArrayStack(tamaño);
        
        for(int i=0;i<tamaño;i++)
        {
            System.out.println("ingrese el elemento en la posicion "+i);
            arreglo[i]=sc.nextInt();
            a.push(arreglo[i]);
            
        }
        
        for(int j=0;j<tamaño-1;j++)
        {
            System.out.println("ingrese la operacion que desea realizar");
            operacion=sc.next();
            
            Operar(operacion,a);
        }    
           
    }
    
     public static void Operar(String operacion, ArrayStack a) throws Exception
    {
        int suma;
        int resta;
        int multiplicacion = 0;
        int division;
        
        
            if(operacion.equals("+"))
            {
                suma=a.pop()+a.pop();
                a.push(suma);
                System.out.println("suma  :"+suma);
            }
            if(operacion.equals("-"))
            {
                resta=a.pop()-a.pop();
                a.push(resta);    
                System.out.println("resta: "+resta);
            }
            if(operacion.equals("*"))
            {
                multiplicacion=a.pop()*a.pop();
                a.push(multiplicacion);
                System.out.println("multiplicacion: "+multiplicacion);
                
            }
            
            if(operacion.equals("/"))
            {
                division=a.pop()/a.pop();
                a.push(division);
                System.out.println("division: "+division);
                
            }
            
   
    }
    
}
