
public class Main {

    public static void main(String[] args) {
    // Variables
        int numeroIf = 5;
        int numeroWhile = 0;
        int numeroDoWhile = 2;
        var estacion = "Verano";
    /*
   Usando un if, crear una condición que compare si la variable numeroIf
   es positivo, negativo, o 0.
    */
        System.out.println("----------- Condicional If -----------");

        if (numeroIf > 0) {
            System.out.println("El numero es Positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es Negativo");
        }else{
            System.out.println("El numero es 0");
        }
    /*
   Crea un bucle While, este bucle tendrá que tener como condición que la
   variable numeroWhile sea inferior a 3, el bloque de código que tendrá
   el bucle deberá:
       Incrementar el valor de la variable en uno cada vez que se ejecute.
       Mostrarlo por pantalla cada vez que se ejecute.
    */
        System.out.println("----------- Bucle While -----------");

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

    /*
    Para el bucle Do While, deberás crear la misma estructura que en el
    While, pero solo se debe ejecutar una vez.
    */
        System.out.println("----------- Bucle Do While -----------");
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<3);
    /*
    Para el bucle For, crea una variable numeroFor, esta variable tendrá
    como valor 0 y su condición será que la variable sea igual o menor que
    3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
    */
        System.out.println("----------- Bucle For -----------");

        for (int numeroFor = 0; numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }
    /*
    Por último, para el Switch, deberás crear la variable estacion, y
    distintos case para las cuatro estaciones del año. Dependiendo del
    valor de la variable estacion se deberá mandar un mensaje por consola
    informando de la estación en la que está. También habrá que poner un
    default para cuando el valor de la variable no sea una estación.
    */
        System.out.println("----------- Bucle Switch -----------");

        switch (estacion){
            case "Spring":
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "Summer":
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Autumn":
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Winter":
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("La estacion del año no es correcta");
        }
    }
}
