public class tiposVariaveis {
    public static void main(String[] args) throws Exception { 
        // double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        int numeroCurto2 = (short) numeroNormal;      
        
        int numero = 5;
        System.out.println(numero);
        
        numero = 10;

        
        System.out.println(numeroCurto2);
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // ASSIM QUE É DECLARADA UMA CONSTANTE;

        System.out.println(VALOR_DE_PI);
		
    }
}

/*  TIPOS PRIMITIVOS 
-- não são considerados objetos, são valores brutos de memória;
-- int, byte, short, long, float, double, boolean e char;
-- tipos que podem conter partes fracionárias
    -> float
    -> double
-- na maioria do cenários é usado INT para inteiro e DOUBLE para fracionários;
-- ao criar uma variável é necessário entender o valor que será usado;
-- uma variável é um espaço na memória;
-- <TIPO> <NOME-DA-VARIAVEL> <ATRIBUIÇÃO-DE-VALOR-OPCIONAL>;
-- PECULIARIDADES
    byte idade = 123;
	short ano = 2021;
	int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
	long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
	float pi = 3.14F;
	double salario = 1275.33;
 */

 /* VARIÁVEIS E CONSTANTES
-- uma constante não poderá alterar o seu valor;
-- constantes devem ser declaradas em MAISUCULO;
-- deve ter o "final" no começo para ser constante;


  */ 