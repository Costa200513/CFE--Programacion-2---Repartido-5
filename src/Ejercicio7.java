public class Ejercicio7
{
    public static void main(String[] args)
    {
        System.out.println("Suma de 1 a 5: "+sumando(5));
    }
    public static int sumando(int num1)
    {
        if (num1 == 0)
        {
            return 0;
        }
        return num1+sumando(num1-1);
    }

}
