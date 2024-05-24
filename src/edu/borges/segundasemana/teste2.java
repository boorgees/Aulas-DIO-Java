package edu.borges.segundasemana;

public class teste2 {
    public static void main(String[] args) {

        String primeiroNome = "Christian";
        String segundoNome = "Borges";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Olá aluno " + primeiroNome.concat(" ").concat(segundoNome).concat(".");
    }

}