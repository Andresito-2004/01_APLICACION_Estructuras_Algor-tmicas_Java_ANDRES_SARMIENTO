import java.util.Scanner;
public class Reto3 {public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String Nombre,jugador;
    int Edad,Maquina;
    System.out.print("Digite su nombre por favor: "); 
        Nombre=leer.next();
    System.out.print("Digite su edad por favor: "); 
        Edad=leer.nextInt();
    if (Edad>=100) {
            System.out.println("No puedes jugar por tu edad");
        }
    else if (Edad<18) {
        System.out.print("No puedes jugar estas chiquito");
    }
    else if (Edad>=18) {
        System.out.println("Puedes jugar, \nPor favor digite su jugada \n(Cara o Sello): ");
        jugador=leer.next();
        Maquina= (int)(Math.random()*2);
        if (jugador=="Cara") {
            if (Maquina==0) {
                System.out.print("Gano el jugador con la jugada: "+jugador+" y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: Cara");
            }
            else{
                System.out.println("Perdio el jugador con la jugada: "+jugador+" y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: Sello");
            }
        }
        else if (jugador=="Sello") {
            if (Maquina==1) {
                System.out.println("Perdio el jugador con la jugada: "+jugador+" y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: Sello");
            }
            else{
                System.out.println("Perdio el jugador con la jugada: "+jugador+" y tiene el nombre de: "+Nombre+" y su edad es: "+Edad+" jugada de la maquina es: Cara");
            }
        }
    } 

    System.out.println("¡Gracias!");
    leer.close();
    }

}
