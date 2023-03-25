import java.util.Scanner;;
public class Reto7 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Nombre,Apellido,edad,usuario;
        int Identificación, contraseña, nuevo, i=0,Tipidentificación;
        do {
            System.out.println("Por favor ingrese su nombre");
            Nombre=Leer.next();
            System.out.println("Por favor ingrese su apellido");
            Apellido=Leer.next();
            System.out.println("Por favor seleccione su tipo de identificación \n1. Cedula de ciudadania \n2. Tarjeta de identidad \n3. Cedula de extranjeria \n4. Pasaporte");
            Tipidentificación=Leer.nextInt();
            System.out.println("Por favor ingrese su identificación");
            Identificación=Leer.nextInt();
            System.out.println("Por favor ingrese su edad");
            edad=Leer.next();
            System.out.println("Por favor ingrese un usuario para ingresar");
            usuario=Leer.next();
            System.out.println("Por favor ingrese su contraseña");
            contraseña=Leer.nextInt();
            System.out.println("Desea realizar un nuevo registro \n1.Si \n2.No");
            nuevo=Leer.nextInt();
        } while (nuevo==1);
        i++;
        if (nuevo==2) {
            System.out.println("Muchas gracias por utilizar nuestros servicios");
        }
    }
}
