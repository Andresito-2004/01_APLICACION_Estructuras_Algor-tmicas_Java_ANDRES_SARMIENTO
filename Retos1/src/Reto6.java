import java.util.Scanner;;
public class Reto6 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String nombre="a",respuesta, correcto="moto";
        int R2,R3=0, i=0;

        System.out.println("Bienvenido a ADIVINE LA PALABRA ");
        System.out.println(" ");
        System.out.println("Ingrese por favor su nombre: ");
        Leer.next();
        do {
        System.out.println("\nPISTA: tiene 4 letras (POR FAVOR INGRESE LAS LETRAS EN MAYUSCULA)");
        respuesta=Leer.next();
        if (respuesta.equals(correcto)) {
            System.out.println("Has adivinado "+nombre+"la palabra correcta, felicitaciones");
        }
        else {
            System.out.println("¡Ou! Parece que no le atinaste \n¿Deseas Una nueva pista? \n1.Si \n2.No" +respuesta);
            R2=Leer.nextInt();
            if (R2==1) {
                System.out.println("\nPISTA 2 \n Es un medio de transporte utilizado dia a dia"+i);
                respuesta=Leer.next();
                    if (respuesta.equals(correcto)) {
                        System.out.println("Has adivinado la palabra correcta, felicitaciones");
                    }
                    else {
                        System.out.println("¡Ou! Parece que no le atinaste \n¿Deseas jugar de nuevo? \n1.Si \n2.No");
                        R3=Leer.nextInt();
                    }
                }
                else if (R2==2) {
                    System.out.println("Gracias por jugar");
                }
            }
        }
    while (R3==1);
    i++;
    if (R3==2) {
        System.out.println("Gracias por jugar");
    }
    Leer.close();
    }
}