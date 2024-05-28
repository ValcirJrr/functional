import java.util.Comparator;
import java.util.List;

public class Main {

    /*
    * Vamos fazer algumas operações com List e Stream utilizando
    * métodos declarativos
    *
    * */
    public static void main(String[] args) {

        List<Pessoa> pessoas = List.of(
                new Pessoa("Grécio", "44 99920-2050"),
                new Pessoa("Américo", "42 99920-2050"),
                new Pessoa("Guiana", "46 99920-2050"),
                new Pessoa("Belizo", "46 99920-2050"),
                new Pessoa("Méxica", "47 99920-2050")
        );

        /*Contar quantos ddd 46 existem*/
        /*
         * Note que as funções seguem uma ordem de execução direta
         * - transformar a list em stream pessoas.stream()
         * - filtrar as pessoas através de um predicate .filter(pessoa -> pessoa.telefone.startsWith("46"))
         * - contar quantos objetos existem depois de filtrado .count()
         */
        long numeroDePessoasComDDD46 = pessoas.stream()
                .filter(pessoa -> pessoa.telefone.startsWith("46")) //Aqui foi usado um predicate para validar se os primeiros dígitos são 46, veja o arquivo _Predicate
                .count(); // Esse é ouro método fornecido por Streams, para contar objetos.
        System.out.println("Número de pessoas com ddd 46 é " + numeroDePessoasComDDD46);


        /*Imprimir o nome das pessoas com DDD 46*/
        /*
         * Também as funções seguem uma ordem de execução direta
         * - transformar a list em stream pessoas.stream()
         * - filtrar as pessoas através de um predicate .filter(pessoa -> pessoa.telefone.startsWith("46"))
         * - mapeia Strings que são o nome das pessoas utilizando uma _Funtion
         * - através de um _Consumer imprime as strings extraídas na função acima
         */
        pessoas.stream()
                .filter(pessoa -> pessoa.telefone.startsWith("46")) //Aqui foi usado um predicate para validar se os primeiros dígitos são 46, veja o arquivo _Predicate
                .map(pessoa -> pessoa.nome)// Aqui o _Function representa uma função que tem como parâmetro uma pessoa e retorno uma String
                .forEach(System.out::println);// usa um _Consumer para uma função sem retorno que tem como parâmetro um String retornada na função de cima


    }
}
