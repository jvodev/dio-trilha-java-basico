public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        String meuNome = "João Vitor";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //se utilizar o "FINAL" o JAVA entende 
        // que não é uma variável mas sim uma constante!

        // VALOR_DE_PI = 10.75;

        System.out.println(VALOR_DE_PI);
        System.out.println(meuNome);

    }
}