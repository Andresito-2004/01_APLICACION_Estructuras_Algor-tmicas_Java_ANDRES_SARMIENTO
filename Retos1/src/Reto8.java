import java.util.Scanner;;
public class Reto8 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Nombre;
        int Edad,Maquina,vidas=3,respuesta=0,i=0,jugador;
        System.out.print("Por favor ingrese su nombre: ");
        Nombre=Leer.next();
        System.out.print("Por favor ingrese su edad: ");
        Edad=Leer.nextInt();
        if (Edad>100) {
            System.out.println("No puedes jugar, por tu edad corres riesgo");
        }
        else if (Edad<18) {
            System.out.println("No puedes jugar, estas chikito");
        }
        else if (Edad>=18) {
            while(vidas>0){
                Maquina = (int)Math.floor(Math.random() * (6 - 1 + 1)) + 1;
                System.out.println("Ingrese un numero(1-6): ");
                jugador= Leer.nextInt();
                    if (jugador==Maquina) {
                        System.out.println("Empate "+Nombre+" tu jugada es: "+jugador+" y el sistema es: "+Maquina);
                }
                    else if (jugador>Maquina) {
                        System.out.println("Ganaste "+Nombre+" tu jugada es: "+jugador+" y el sistema es: "+Maquina);
                }
                    else {
                        vidas-=1;
                        System.out.println("Perdiste "+Nombre+" tu jugada es: "+jugador+" y el sistema es: "+Maquina+" Te quedan: "+vidas+" vidas");
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
                        Leer.close();
        }
    }
}
}
