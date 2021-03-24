public class Primers {

    public static void main(String[] args) {

        System.out.println("2 -" + " простое");
        for(int n=3; n < 100; n++)
        {
            if (isPrime(n)==true)
            {
                System.out.println(n + " - простое");
            }
        }
    }
    public static Boolean isPrime(int n)
    {
        for (int i=2; i<n; i=i+1)
        {
            if (n%i==0 )
            {
                return false;
            }
        }
        return true;
    }
}
