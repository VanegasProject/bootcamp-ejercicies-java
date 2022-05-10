// Desarrollado por Ing. Luis Vanegas
// Curso Introduccion a la programacion

public class Main {
    public static void main(String[] args){
        // Parte 1
        int resultado = 0;
        resultado = suma(5,  25,  5);
        System.out.println("El resultado es: " + resultado);

        Coche miCoche = new Coche(2);
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        System.out.println("Numero de Puertas: " + miCoche.nPuertas);
    }
    public static int suma( int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int nPuertas = 0;

    Coche(int puerta){
        this.nPuertas = puerta;
    }

    public void AumentarPuerta(){
        this.nPuertas ++;
    }
}
