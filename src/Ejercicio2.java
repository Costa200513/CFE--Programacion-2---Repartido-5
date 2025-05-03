public class Ejercicio2
{
    public static void main (String[] args)
    {
        int array [] = {1, 5, 77, 32, 2};
        numMayor(array);
    }

    public static void numMayor(int array[])
    {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > mayor)
            {
                mayor = array[i];
            }
        }
        System.out.println("el mayor es: " + mayor);
    }
}
