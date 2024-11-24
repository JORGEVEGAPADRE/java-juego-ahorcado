import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) throws Exception {
        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a Adivinar " + String.valueOf(letrasAdivinadas)+ " ("+ palabraSecreta.length()+ " letras)k"); //valueOf se usa cuando una palabra esta construida a partir de un arreglo de char
            //No es lo mismo un string formado a partir de un array de chars que una cadena
            System.out.println("Introduce una letra, por favor");

           // char letra = scanner.next().charAt(0); // usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto !!...Te quedan " + (intentosMaximos - intentos) + " intentos.");

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades !!! palabra secreta: " + palabraSecreta);

            }

        }

        if (!palabraAdivinada){
            System.out.println("Que pena ! ...Se han agotado los intentos...GAME OVER");
        }

        scanner.close();

    }

}
