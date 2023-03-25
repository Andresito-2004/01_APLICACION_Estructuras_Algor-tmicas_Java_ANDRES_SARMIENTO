import java.util.Scanner;;
public class Reto5 {
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
    String Nombre,Juego="0",Juegom="0";
    int Edad,Maquina,vidas=3,respuesta,i=0,jugador;
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
        while(vidas>0){
            Maquina = (int)Math.floor(Math.random() * (3 - 1 + 1)) + 1;
            System.out.println("Elige una de las siguientes opciones\n1. Piedra\n2. Papel\n3. Tijera \nIngresa la jugada: ");
            jugador= Leer.nextInt();
            if (jugador==1) {
                Juego="Piedra";
            }
                else if (jugador==2) {
                    Juego="Papel";
                }
                    else if (jugador==3) {
                        Juego="Tijera";
                    }
            if (Maquina==1) {
                    Juegom="Piedra";
                    }
                    else if (Maquina==2) {
                        Juegom="Papel";
                        }
                            else if (Maquina==3) {
                                Juegom="Tijera";
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
            vidas-=1;
            System.out.println("Perdiste "+Nombre+" tu jugada es: "+Juego+" y el sistema es: "+Juegom+"Te quedan: "+vidas+" vidas");
               
                if (vidas<=0) {
                    System.out.println("Deseas volver a jugar \n1.No \n2.No");
                    respuesta=Leer.nextInt();
                    if (respuesta==1) {
                        vidas+=3;
                    }
                    else if (respuesta==2) {
                        System.out.println("Gracias por jugar"+i);
                    }
                }
            }
        } 
    
        }
Leer.close();
}
}



