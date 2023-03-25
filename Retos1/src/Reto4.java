import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Nombre,Juego="0",Juegom="0";
        int Edad,Maquina,jugador;
            System.out.print("Por favor ingrese su nombre: ");
            Nombre= Leer.nextLine();
            System.out.print("Por favor ingrese su edad: ");
            Edad = Leer.nextInt();
            if (Edad>100) {
                System.out.println("No puedes jugar, por tu edad corres riesgo");
            }
            else if (Edad<18) {
                System.out.println("No puedes jugar, estas chikito");
            }
            else if (Edad>=18) {
                    Maquina = (int)Math.floor(Math.random() * (3 - 1 + 1)) + 1;
                    System.out.println("Elige una de las siguientes opciones\n1 Piedra\n2 Papel\n3 Tijera \n Ingresa la jugada: ");
                    jugador= Leer.nextInt();
                    if (jugador==1) {
                        Juegom="Piedra";
                    }
                        else if (jugador==2) {
                            Juegom="Papel";
                        }
                            else if (jugador==3) {
                                Juegom="Tijera";
                            }
                    if (Maquina==1) {
                            Juego="Piedra";
                            }
                            else if (Maquina==2) {
                                Juego="Papel";
                                }
                                    else if (Maquina==3) {
                                        Juego="Tijera";
                                    }
            
                    if (jugador==Maquina) {
                        System.out.println("Empate tu jugada es: "+Juego+" y el sistema es: "+Juegom);
                    }
                    else if (jugador==1 && Maquina==3) {
                        System.out.println("Ganaste "+Nombre+" tu jugada es: "+Juego+" y el sistema es: "+Juegom);
                    }
                    else if (jugador==2 && Maquina==1) {
                        System.out.println("Ganaste "+Nombre+" tu jugada es: "+Juego+" y el sistema es: "+Juegom);
                    }
                    else if (jugador==3 && Maquina==2) {
                        System.out.println("Ganaste "+Nombre+" tu jugada es: "+Juego+" y el sistema es: "+Juegom);
                    }
                    else{
                        System.out.println("perdiste "+Nombre+" tu jugada es: "+Juego+" y el sistema es: "+Juegom);
                    }
                }
    Leer.close();
    }
}
