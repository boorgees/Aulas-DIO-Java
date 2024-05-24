public class Operadores {

    public static void main(String[] args) { 

        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = -1 * numero;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        
       int numero1 = 1;
       int numero2 = 2;
       
       if(numero1 > numero2)
           System.out.println("Numero 1 maior que numero 2");
       
       if(numero1 < numero2)
           System.out.println("Numero 1 menor que numero 2");
       
       if(numero1 >= numero2)
           System.out.println("Numero 1 maior ou igual que numero 2");
       
       if(numero1 <= numero2)
           System.out.println("Numero 1 menor ou igual que numero 2");
       
       if(numero1 != numero2)
           System.out.println("Numero 1 é diferente de numero 2");
        
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras.");
        }
        

    } 
}


/* OPERADORES

-- ATRIBUIÇÃO (=);
    -- inserir ou modificar o valor de uma variável;

--  ARITMÉTICOS ( + , - , * , / , % );
    -- realizar operações matemáticas;
        -- o operador + realiza concatenação se usado com strings (tomar cuidado);

-- UNÁRIOS 
    -- usados com outros operadores aritméticos para trabalhar com valores;
        -- Exemplo: (++) para incrementar;
                    (--) para decrementar; 
                    (- ) nega um valor aritmético;
                    (! ) para negar uma expressão booleana;

-- TERNÁRIOS
    -- É como uma condição IF resumida em uma operação;
    -- Usada em expressões booleanas;
        -- Exemplo: String resultado = (a==b) ? "verdadeiro" : "false";

-- RELACIONAIS
    -- Avaliam relação entre variáveis ou expressôes;
        -- Exemplo: (==) verifica igualdade;
                    (!=) verifica diferença;
                    (> ) verifica se é maior;
                    (< ) verifica se é menor;
                    (>=) verifica se é maior ou igual; 
                    (<=) verifica se é menor ou igual;
    -- Método .equal compara se conteúdo é igual, usado em objetos;

-- LÓGICOS
    -- Permite criar expressões lógicas da junção de uma ou mais expressões;
        -- Exemplo: (&&) operador "E", verifica se duas condições são verdadeiras;
                    (||) operador "OU", verifica se ao menos uma das condições são verdadeiras;

 */


