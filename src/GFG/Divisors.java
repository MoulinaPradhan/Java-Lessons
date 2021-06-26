class GFG{
     
    // Function to print the divisors
    public static void printDivisors(int n)
    {
        for(int i = 1; i * i < n; i++)
        {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        for(int i = (int)Math.sqrt(n);
                i >= 1; i--)
        {
            if (n % i == 0)
                System.out.print(n / i + " ");
        }
    }
     
    // Driver code
    public static void main(String[] args)
    {
        System.out.println("The divisors of 100 are: ");
         
        printDivisors(100);
    }
    }