import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Nombre;
        int Edad;
        int Maquina;
        int jugador;
        System.out.println("Por favor ingrese su nombre");
        Nombre= Leer.nextLine();
        System.out.println("Por favor ingrese su edad");
        Edad = Leer.nextInt();
            if(Edad>=100){
                System.out.println("No puedes jugar, por tu edad corres riesgo");
            }
            else if(Edad<18){
                System.out.println("Estas chikito");
            }
            else if (Edad>=18){
                System.out.println("Elige una de las siguientes opciones\n1.Piedra\n2.Papel\n3.Tijera");
                System.out.println("Ingresa el numero de tu jugada: ");
                    jugador= Leer.nextInt();
                    Maquina = (int) (Math.random() * 3);
            if (jugador == Maquina) {
                System.out.println("No gano nadie");
            }
            else if (jugador==1 && Maquina==3) {
                System.out.println("Gano el jugador 1 y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: "+Maquina);
            }
            else  if (jugador==2 && Maquina==1) {
                System.out.println("Gano el jugador 1 y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: "+Maquina);
            }
            else  if (jugador==3 && Maquina==2) {
                System.out.println("Gano el jugador 1 y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: "+Maquina);
            }
            else {
                System.out.println("Perdio el jugador 1 y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: "+Maquina);
                }
            }
            Leer.close();
    }
}
