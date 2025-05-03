public class Ejercicio5
{
    public static void main(String[] args)
    {
        System.out.println("Factorial de 5: " + factorial(5));
    }
    public static int factorial(int num1)
    {
        if(num1==0)
        {
            return 1;
        }
        return num1*factorial(num1-1);

    }
}
