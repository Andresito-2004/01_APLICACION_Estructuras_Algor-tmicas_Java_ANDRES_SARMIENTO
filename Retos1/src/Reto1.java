import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double Fahrenheit ;
        int Centigrados;
        double mult = 1.8;
        System.out.print("Por favor ingrese el los centigrados: ");
        Centigrados=Leer.nextInt();
        Fahrenheit=(Centigrados+32)*mult;
        System.out.print("Los Fahrenheit son: "+Fahrenheit+"°");
        Leer.close();
    }
}
