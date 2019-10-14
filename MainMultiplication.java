import java.util.Scanner;


public class MainMultiplication {
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("How many initial prime numbers you want?");
         
        int n = sc.nextInt();
         
        int counter = 1;
         
        int inputNumber = 2;
        Integer[] primeArray=new Integer[n];
        int index=0,c;
        System.out.println("Initial "+n+" Prime Numbers :");
         
        while (counter <= n)
        {   
            if (PrimeNumber.checkForPrime(inputNumber))
            {
                primeArray[index]=inputNumber;
                index++;
                counter++;
                 
                inputNumber++;
            }
            else
            {
                inputNumber++;
            }
        }
         for (c = 1; c <= 10; c++){
             System.out.println(primeArray[c-1] + "*" + c + " = " + (primeArray[c-1]*c));
         }
        sc.close();
    }
}


