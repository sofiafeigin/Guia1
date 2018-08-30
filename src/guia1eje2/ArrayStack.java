
package guia1eje2;


public class ArrayStack 
{
    private int cima;
    private int []arreglo;
    private int t;
    
    public ArrayStack(int t)
    {
        cima=-1;
        arreglo=new int[t];
    }
    
    public void push(int dato) throws Exception
    {
        if(cima+1>=arreglo.length)
            throw new Exception("pila llena");
        
        cima++;
        
        arreglo[cima]=dato;
    }
    
    public int pop() throws Exception
    {
        
        if(cima<0)
            throw new Exception("pila vacia");
        
        
        return arreglo[cima--];
        
    }
    
    
   
    
    
    
}
