import java.util.Scanner;
public class Ejercicio9
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cedula sin puntos ni guion ");
        String cedula = leer.nextLine();

        boolean esValida = validarCedula(cedula);
        System.out.println("¿Cedula válida? " + esValida);
    }

    public static boolean validarCedula(String cedula)
    {
        if (cedula.length() < 7 || cedula.length() > 8)
        {
            return false;
        }

        int[] multiplicadores = {2, 9, 8, 7, 6, 3, 4};
        int suma = 0;

        for (int i = 0; i < 7; i++)
        {
            int digito = Integer.parseInt(cedula.substring(i, i + 1));
            suma += digito * multiplicadores[i];
        }

        int modulo = suma % 10;
        int digitoCalculado = (10 - modulo) == 10 ? 0 : (10 - modulo);
        int digitoVerificador = Integer.parseInt(cedula.substring(7));

        return digitoCalculado == digitoVerificador;
    }
}
