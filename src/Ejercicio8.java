public class Ejercicio8
{
    public static void main(String[] args)
    {
        System.out.println(validarPassword(""));
    }
    public static boolean validarPassword(String clave)
    {
        if (clave.length() > 8 && clave.length() < 14)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
