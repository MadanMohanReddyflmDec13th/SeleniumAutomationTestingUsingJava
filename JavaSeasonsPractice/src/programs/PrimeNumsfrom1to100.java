package programs;

public class PrimeNumsfrom1to100 {

	public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) 
        
        {
            int count = 0;
            
            for (int j = 1; j <= i; j++)      // checking divisors of i 
            {
                if (i % j == 0) 
                {
                    count++;                  // If we divisors > 2 ,it is not a Prime number
                }
            }

            if (count == 2)
            {
                System.out.print(i + " ");
            }
        }
	}

}
