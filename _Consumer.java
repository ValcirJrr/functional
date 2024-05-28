import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    /*
     * Consumer é um dos mais utilizados junto com o método Function. Reparem bem na sua estrutura!
     * Ele tem a intenção de executar uma função com um objeto presente, sem alterá-lo
     * Como fazer um System.out.println.
     * */

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Grécio", "46 99920-2050");

        /* Invocando métodos de forma imperativa*/
        System.out.println("Imperativa");
        apresentarUsuario(p1);
        apresentarUsuarioComTelefone(p1, false);

        /* Invocando métodos de forma declarativa*/
        System.out.println("Declarativa ou Funcional");
        apresentarUsuarioDeclarativo.accept(p1);
        apresentarUsuarioComTelefoneDeclarativo.accept(p1, true);

    }

    public static void apresentarUsuario(Pessoa pessoa){
        System.out.println("Olá " + pessoa.nome);
    }


    static Consumer<Pessoa> apresentarUsuarioDeclarativo =
            pessoa -> System.out.println("Olá " + pessoa.nome);

    public static void apresentarUsuarioComTelefone(Pessoa pessoa, Boolean deveApresentar){
        /*
        * Reparem na parte em que o if ternário está sendo usado
        * */
        System.out.println("Olá " + pessoa.nome + ", Telefone: " + (deveApresentar ? pessoa.telefone : "*********"));
    }

    static BiConsumer<Pessoa, Boolean> apresentarUsuarioComTelefoneDeclarativo =
            (pessoa, deveApresentar) -> System.out.println("Olá " + pessoa.nome + ", Telefone: " + (deveApresentar ? pessoa.telefone : "*********"));

}
