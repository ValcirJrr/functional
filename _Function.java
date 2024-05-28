import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    /*
    * Function tem a intenção de executar instruções de código em cima de um objeto
    * e retornar outro. Vai ser muito utilizado para mapear elementos, por exemplo:
    * Imaginem que vocês têm uma lista de pessoas, e essas pessoas tem um telefone com DDD
    * ao percorrer a lista de pessoas seu objetivo pode ser buscaar todos os DDDs presentes,
    * então você vai mapear um Integer ou String através de uma pessoa.
    *
    * */

    public static void main(String[] args) {
        /* Invocando métodos de forma imperativa*/
        int numero = 1;
        System.out.println("Imperativa");
        numero = incrementarUm(numero);
        numero = multiplicarPorX(numero, 10);
        System.out.println(numero);


        /* Invocando métodos de forma declarativa*/
        numero = 1; //Preciso dizer porque não tem o "int" no começo dessa linha?
        System.out.println("Declarativa ou Funcional");
        numero = incrementaUmDeclarativo.apply(numero);
        numero = multiplicarPorXDeclarativo.apply(numero, 10);
        System.out.println(numero);
    }

    /* Função de forma imperativa
    *  - Lembrar que sempre vamos fazer assim para definir métodos de instrução
    *  - Ela está aqui para servir de comparativo com o mode declarativo utilizando a biblioteca Function
    * que permite-nos criar métodos de forma declarativa
    *  - Lembrar que ela só é static porque queremos chamar diretamente no método Main sem precisar criar
    * uma instância de uma classe para chamar o método. Sei que não preciso por aqui o que é static, pois todos
    * vocês já sabem de cor ♥
    *  */

    public static int incrementarUm(int numero) {
        return numero + 1;
    }

    /*
    * Aqui está de forma declarativa
    * - Precisamos aprender a formular métodos utilizando a biblioteca Function, pois será muito presente
    * quando trabalharmos com listas
    * */

    static Function<Integer, Integer> incrementaUmDeclarativo =
            numero -> numero + 1;

    /*Funções com dois parâmetros um retorno
    * - Lembrar que para a classe Function, cada formato é transformado diretamente em uma subclasse sem poder ser alterado,
    * por exemplo, uma função que recebe dois parâmetros com um retorno é representada pela subclasse BiFunction
    * */

    public static Integer multiplicarPorX(Integer numero, Integer multiplicador) {
        return numero * multiplicador;
    }

    /*
    * Função com dois parâmetros e um retorno de forma declarativa
    * */
    static BiFunction<Integer,Integer,Integer> multiplicarPorXDeclarativo =
            (numero, multiplicador) -> numero * multiplicador;



}
