
package guia1eje1;


public class Queue 
{
    private int entrada;
    private int salida;
    private int []arreglo;
    private int tamaño;
    private int cantidad;
    
    public Queue(int t)
    {
        entrada=0;
        salida=0;
        arreglo= new int[10];
        tamaño=t;
        cantidad=0;
    }
    
    public void encolar(int dato) throws Exception
    {
        if(esLlena()==true)
            throw new Exception("cola llena: "+dato);
        
        cantidad++;
        
        arreglo[entrada]=dato;
        
        entrada=incrementar(entrada);
        
    }
    
    public int desencolar() throws Exception
    {
       if(esVacia()==true)
          throw new Exception("cola vacia"); 
       
       
       cantidad --; 
       int d=arreglo[salida];
       salida=incrementar(salida);
       
       return d;
    }
        
    public boolean esVacia()
    {
       return entrada==salida&& cantidad==0;    
    }
    
    public boolean esLlena()
    {
        return entrada==salida&&cantidad>0;
    }
    
    public int mostrarSalida()
    {
        return arreglo[incrementar(salida)];
    }
    
    public int incrementar(int x)
    {
       
        return (x+1)%arreglo.length;
        
    }
           
}
