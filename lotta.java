//uso degli oggetti in modo creativo

import java.util.*;
public class lotta 
{
    public static void main (String[] args)
    {
        int energia1 = 1000, energia2 = 1000, vita1 = 800, vita2 = 800;
        char colpo;
   
        scontro giocatore1 = new scontro(energia1, vita1);

        scontro giocatore2 = new scontro(energia2, vita2);

        System.out.println("pronti a combattere?");

        Scanner stampante = new Scanner(System.in);
        while(giocatore1.vita > 0 && giocatore2.vita > 0) {
        
        colpo = stampante.nextLine();

        switch (colpo) {
        case 'w':
            giocatore2.pugno();
            giocatore1.energiapugno();
            System.out.println(giocatore2.vita);
        break;
        case '8':
            giocatore1.pugno();
            giocatore2.energiapugno();
            System.out.println(giocatore1.vita);
        break;
        case 'z':
            giocatore1.ricarica();
            System.out.println(giocatore1.energia);
        break;
        case '3':
            giocatore2.ricarica();
            System.out.println(giocatore2.energia);
        break;
        case 'd':
            giocatore2.calcio();
            giocatore1.energiacalcio();
            System.out.println(giocatore2.vita);
        break;
        case '6':
            giocatore1.calcio();
            giocatore2.energiacalcio();
            System.out.println(giocatore1.vita);
        break;
        default:
            System.out.println("hai perso");
        break;
        }
        }
        }
        }
class scontro {

    public int vita, energia;

    public scontro(int a, int b)
    {
        vita = b;
        energia = a;
    }
  
    void pugno() 
    {
        vita-= 100;
    }

    void energiapugno()
    {
        energia -= 150;
    }

    void ricarica()
    {
        energia += 100;
    }

    void calcio()
    {
        vita -= 250;
    }

    void energiacalcio()
    {
        energia -= 300;
    }
    
    /*void colpito1()
    {
        vita-= 200;
        energia-= 100;

    }*/
}
    
            