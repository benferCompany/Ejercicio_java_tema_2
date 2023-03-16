package ejercicio.java;

public class Main {
    public static void main(String[] args) {

        double precio_sin_iva = 100;

        System.out.println("El precio final con iva =  "+precio_con_iva(precio_sin_iva));

    }

    public static double precio_con_iva(double precio){
        precio= precio * 1.21;
        return precio;
    }
}