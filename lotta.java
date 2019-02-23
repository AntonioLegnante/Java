//uso degli oggetti in modo creativo

import java.util.*;
public class lotta 
{
    public static void main (String[] args)
    {
        int colpo;
   
        scontro giocatore1 = new scontro();

        scontro giocatore2 = new scontro();
        
        Scanner stampante = new Scanner(System.in);
        while(true) {
        
        colpo = stampante.nextInt();
        switch (colpo) {
        case 1:
            giocatore1.colpito();
        break;
        case 2:
            giocatore2.colpito1();
        break;
        default:
            System.out.println("hai perso");
        break;
        }
        }
        }
        }
class scontro {
     int energia1 = 1000;
     int energia2 = 1000;
     int vita1 = 800;
     int vita2 = 800;
    void colpito() 
    {
        energia1 -= 200;
        vita2 -= 100;
        System.out.print("stamina rimanente" + vita2);
    }
    
    void colpito1()
    {
        energia2 -= 200;
        vita1 -= 100;
        System.out.print("stamina rimanente" + vita1);
    }
}
    
            