package Ficha_Pratica_06_Metodos;

public class Ex_03 {

    //3 - O exercício deve ser resolvido na mesma classe (por exemplo: Ex_03), deve acrescentar as funções conforme
    //solicitado. No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para
    //desenvolver nada no main), considere fazer o exercício 4 em concorrente para conseguir perceber se está tudo
    //como esperado.


    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 1  --------------------------//


    //a) Implemente uma função que determina se um número (passado por argumento) é par ou ímpar, a função
    // deve retornar true se par ou false se ímpar

    /**
     * Metodo que avalia se um numero é par ou impar
     *
     * @param num numero ser avaliado
     * @return True - se par || False se impar
     */
    static boolean par(int num) {


        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }


    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 2  --------------------------//

    // b) Implemente uma função que determina se um número (passado por argumento) é positivo ou negativo,
    //a função deve retornar true se zero ou positivo, ou false se negativo.

    /**
     * Metodo que avalia se um numero é positivo
     *
     * @param num -Numero a ser avaliado
     * @return -Se zero ou positivo- true || False se nagativo;
     */
    static boolean positivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }


    }


    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 3  --------------------------//

    //c) Implemente uma função que determina se um número (passado por argumento) é ou não primo, a função
    //deve retornar true se primo ou false se não primo;

    /**
     * Metodo que valida se um numero é primo ou não primo;
     *
     * @param num Numero a ser avaliado;
     * @return True se for primo || False - se não for primo;
     */
    static boolean primo(int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 4  --------------------------//


    //d) Implemente uma função que determina se um número (passado por argumento) é perfeito, a função deve
    //retornar true se perfeito ou false se não perfeito (Os números perfeitos são iguais à soma dos seus
    //divisores: 6 pode ser dividido por 1, 2 e 3 e, quando soma esses números, o resultado é 6).

    static boolean perfeito(int num) {

        int soma;
        soma = 0;

        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                soma = soma + divisor;
            }

        }
        if (num == soma) {
            return true;
        } else {
            return false;
        }


    }
    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 5  --------------------------//

    //e) Implemente uma função que determina se um número (passado por argumento) é triangular, a função
    //deve retornar true se triangular ou false se não triangular (Um número triangular é um número que pode
    //ser representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5)


    static boolean triangular(int num) {

        int somatorio=0;

        for ( somatorio = 0; somatorio < num; somatorio++) {

            if(num ==somatorio +somatorio +1){
                return true;
            }


        }if(num ==somatorio +somatorio +1)

        {
            return true;
        } else{
            return false;
        }
    }




}