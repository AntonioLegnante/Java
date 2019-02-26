import java.util.*;
public class macchinetta2
{
    public static void main (String[] args)
    {
        int scelta, nome = 1, continuare, saldo, denaro;
        Scanner stampante = new Scanner (System.in);
        contocorrente macchina = new contocorrente();

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
                    macchina.visualizza();
                break;

                case 4:
                    System.out.println("visualizzato il numero del saldo"); 
                    macchina.nome(nome);
                break;

                default:
                    System.out.println("azione non consentita!!! come hai potuto!?");
                break;
            }
                
                System.out.println("inserisci uno '0' per eseguire una nuova operazione altrimenti inserisci '3' per visualizzare il conto");
                continuare = stampante.nextInt();
                if (continuare == 3)
                    macchina.visualizza();
                }while (continuare == 0);

    }
}

class contocorrente 
{
    private double saldo = 9000;
    
    public void versa (double somma)
    {
        saldo += somma;
    }

    public void preleva (double somma) 
    {
        saldo -= somma;
    }

    public void visualizza ()
    {
        System.out.println("saldo attuale" + saldo);
    }

    public void nome (int nome)
    {
        System.out.println("il numero di conto e' " + nome);
    }

}
   
        