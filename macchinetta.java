import java.util.*;
public class macchinetta
{
    public static void main (String[] args)
    {
        int scelta, nome = 1, continuare, saldo, denaro;
        Scanner stampante = new Scanner (System.in);
        System.out.println("inserisci il saldo attuale"); 
        saldo = stampante.nextInt();
        contocorrente macchina = new contocorrente(saldo);
        do 
        {
            System.out.println("inserisci '1' se vuoi versare, '2' se vuoi prelevare, '3' se vuoi visuallizare il saldo, '4' se vuoi visuallizare il nome del conto");
            scelta = stampante.nextInt();
            switch (scelta) 
            {
                case 1:
                    System.out.println("quanto vuoi versare?");
                    denaro = stampante.nextInt();
                    macchina.versa(denaro);
                break;
               
                case 2:
                    System.out.println("quanto vuoi prelevare?");
                    denaro = stampante.nextInt();
                    macchina.preleva(denaro);
                break;

                case 3:
                    System.out.println("hai visualizzato il saldo");
                    macchina.visualizza(saldo);
                break;

                case 4:
                    System.out.println("visualizzato il numero del saldo"); 
                    macchina.nome(nome);
                break;

                default:
                    System.out.println("azione non consentita!!! come hai potuto!?");
                break;
            }
                
                System.out.println("inserisci uno 0 per eseguire unua nuova operazione altrimenti inserisci un numero qualsiasi");
                continuare = stampante.nextInt();
                }while (continuare == 0);
 
                System.out.println("saldo dopo l'operazione :" + macchina.saldo);

    }
}

class contocorrente 
{
    public double saldo;
    public contocorrente (double saldoiniziale) 
    {
        saldo = saldoiniziale;
    }

    public void versa (double somma)
    {
        saldo += somma;
    }

    public void preleva (double somma) 
    {
        saldo -= somma;
    }

    public void visualizza (double somma)
    {
        saldo = somma;
        System.out.println("saldo attuale" + saldo);
    }

    public void nome (int nome)
    {
        System.out.println("il numero di conto e' " + nome);
    }
}
   
        