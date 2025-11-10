package exercicio;

public class exemplo {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20; 
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("O primeiro número é: " + numeros[0]);
        System.out.println("O terceiro número é: " + numeros[2]);
        System.out.println("------------------------------------");

         System.out.println("O segundo número é: " + numeros[1]);
        numeros[1] = 25; // Alterando o segundo elemento de 20 para 25
        System.out.println("O novo valor do 2º número é: " + numeros[1]);
        System.out.println("------------------------------------");

        System.out.println("Iterando com o 'for' tradicional:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        System.out.println("------------------------------------");

        System.out.println("Iterando com o 'for-each':");
        for (int valor : numeros) {
            System.out.println("Valor: " + valor);
            }
        }    
}
