import java.util.Scanner;

public class miPrimerPrograma {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.println("Por favor ingrese el 1er número");
        int edad = pepe.nextInt();

        System.out.println("Por favor ingrese el 2do número");
        int edad2 = pepe.nextInt();

        System.out.print(
                "Escoja que función quieres hacer: \n 1: Sumar \n 2: Restar \n 3: Multiplica \n 4: Dividir \n Su elección fue el número: ");
        int result = pepe.nextInt();

        switch (result) {
            case 1:
                int edadSuma = edad + edad2;
                System.out.println("La suma es: " + edadSuma);
                break;
            case 2:
                int edadResta = edad - edad2;
                System.out.println("La resta es: " + edadResta);
                break;

            case 3:
                int edadMultiplicar = edad * edad2;
                System.out.println("La multiplicacion es: " + edadMultiplicar);
                break;

            case 4:
                int edadDividir = edad / edad2;
                System.out.println("La division es: " + edadDividir);
                break;

            default:
                System.out.println("Numero invalido");
                break;
        }

        pepe.close();
    }

}