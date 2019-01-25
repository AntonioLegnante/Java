import java.util.Scanner;

public class casa1
{
    public static void main (String[] args)
    {
        int [] vettore = new int [10];
        int somma, n;
        Scanner stampante = new Scanner(System.in);
        
        System.out.println("inserisci n");
        n = stampante.nextInt();
   
        System.out.println("inserisci gli elementi del vettore");
       
        for (int i = 0; i < n; i++)
            vettore[i] = stampante.nextInt();
       
      
        somma = garage([] vettore, n);

        System.out.println("la somma diventa" + somma);

     }
}

private static int garage(int [] a, int n) 
{
  int somma = 0;
  for (int i = 0; i < n; i++) 
        {
            somma += vettore[i];
            if (vettore[i] > 10) 
                somma--;
            else 
                somma++;
        }

  return (somma);
}