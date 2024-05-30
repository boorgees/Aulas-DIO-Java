import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}

// USADO PARA UMA CONTAGEM SEM UMA QUANTIDADE DE REPETIÇÃO ESPECÍFICA
// AVALIA A CONDIÇÃO ANTES DE EXECUTAR O CÓDIGO
// CUIDAR COM LOOPS INFINITOS, A EXECUÇÃO PRECISA TER UM PONTO DE TÉRMINO
