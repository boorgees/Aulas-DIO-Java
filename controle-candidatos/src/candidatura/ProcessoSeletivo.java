package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) throws Exception {

        System.out.println("Processo seletivo!");
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
       //  imprimirSelecionados();

    }

    // MÉTODO AUXILIAR, SIMULA DE FORMA RANDOMICA SE ACONTECEU O ATENDIMENTO
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    // MÉTODO PARA MOSTRAR SE CONSEGUIU ENTRAR EM CONTATO
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas "
                    + tentativasRealizadas + " realizada.");
        }
    }

    // MÉTODO PARA IMPRIMIR OS CANDIDATOS
    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação each: ");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {

        // MÉTODO PARA IMPRIMIR OS CANDIDATOS SELECIONADOS DE ACORDO COM O SALARIO
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga.");
            }
            candidatosAtual++;

        }
    }

    // MÉTODO QUE SIMULA O VALOR DE SALÁRIO PRETENDIDO

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
