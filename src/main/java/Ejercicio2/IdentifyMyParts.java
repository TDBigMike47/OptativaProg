package Ejercicio2;

public class IdentifyMyParts {
    public static int x = 7;
    //En este punto como se puso como valor estatico, X cambiara al ultimo valor que se recibio dentro del mismo
    public int y = 3;

    public static void main(String[] args) {
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        // a.y = 5
        System.out.println("b.y = " + b.y);
        //b.y = 6
        System.out.println("a.x = " + a.x);
        //a.x = 2
        /*
        Como podemos observar, asignamos a.x  con el valor de 1, pero al momento
        de obtener el valor de esa area podemos observar que cambio a 2 y esto se debe
        a que como al momento que se stablece en la clase es estatico, esto hace que se
        compartan todas las estancias de x con el ultimo valor asignado al mismo, en este caso
        es el 2, por eso al buscar el valor de x en cada uno de los objetos que creamos nos da 2
        y tambien si lo buscamos dentro de la clase nos da 2, como se ve en la ultima parte.
        Estó cambiaria con el hecho que cambies el ultimo valor y todos compartiran ese valor.
         */
        System.out.println("b.x = " + b.x);
        //b.x = 2
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
        //IdentifyMyParts.x = 2
    }
}