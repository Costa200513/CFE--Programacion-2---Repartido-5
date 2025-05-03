public class Ejercicio4
{
    public static void main(String [] args)
    {
        impares(15);
    }
    public static void impares(int num1)
    {
        for(int i=0;i<=num1;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
