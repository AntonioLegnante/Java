import java.util.Scanner;

public class vett
{
    public static void main (String[] args)
    {
    
    int [] vett = new int [10];
    int [] vett2 = new int [10];
    int [] vett3 = new int [10];
    int i, z, j, n;
    System.out.println("inserisci n");
    Scanner stampante = new Scanner (System.in);
    n = stampante.nextInt();
    
    for (i = 0; i < n; i++)
        vett[i] = stampante.nextInt();
    
    for (i = 0; i < n; i++) 
        vett2[i] = stampante.nextInt();
    
    z = 0;
    
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (vett[i] == vett2[j])
            {
                vett3[z] = vett[i];
                z++;
            }
        }
    }

    for (i = 0; i < z; i++)
        System.out.println(vett3[i]);
    }
} 
       
             
      
    
