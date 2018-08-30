

package guia1eje1;

public class Guia1Eje1 {

   
    public static void main(String[] args) 
    {
       
        Queue q=new Queue(3);
        
        System.out.println(q.esLlena());
        System.out.println(q.esVacia());
        
        try
        {
            q.encolar(1);
            q.encolar(2);
            q.encolar(3);
            
            System.out.println(q.desencolar());
            q.encolar(4);
            System.out.println(q.desencolar());
            System.out.println(q.desencolar());
            System.out.println(q.desencolar());
            System.out.println(q.esVacia());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            
            
       
    }
    
   
          
            
            
    
}
