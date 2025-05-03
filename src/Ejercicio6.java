public class Ejercicio6
{
    public static void main(String[] args)
    {
        contador(4);
    }
    public static void contador(int num1)
    {
        if (num1 == 0)
        {
            return;
        }
        contador(num1 - 1);
        System.out.print(num1 + " ");
    }

}
