public class MinhaClasse {
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

/* VISÃO GERAL
-- todo arquivo é .java e deve comecar com maisculo; 
-- valores imutáveis são escritos em maisculo(uppercase);
-- é preciso seguir padroes de escrita(camelcase);
-- toda lingaguem tem classes especificas;
-- classe executavel precisa ter metodo especial;
-- palavra composta, a segunda palavra em diante começa com maiscula;
*/

/* MÉTODOS
-- metodos tem estrutura especifica -> TipoRetorno NomeObjetivoNoInfinitivo Parametro(s);
-- os métodos devem ser nomeados como verbos;
-- quando nome composto, a segunda palavra começa com maisculo;
*/

/* VARIÁVEIS
-- uma variavel é sempre no singular, exceto quando for array ou coleção;
-- usar somente um idioma no código;
-- não abreviar variaveis;
-- nomear de forma clara e objetiva;
-- variavel se define por, Tipo NomeBemDefinido = atribuição/valor (opcional em alguns casos);
-- as variaveis tem tipos especificos;
*/