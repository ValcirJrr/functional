import java.util.function.Predicate;

public class _Predicate {

    /*
    * Predicate sempre representará uma função que retorna um booleano,
    * a ideia é desenvolver uma lógica que pode ser verdade para alguns casos e falso para outros,
    * por exemplo, o DDD do telefone é 46?
    * */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jorge", "46999999999");
        Pessoa p2 = new Pessoa("ChiCoin", "47999999999");

        /* Invocando métodos de forma imperativa*/
        System.out.println("Imperativa");
        System.out.println(dddEhQuatroMeia(p1) ? "É 46" : "Não é 46");

        /* Invocando métodos de forma declarativa*/
        System.out.println("Declarativa ou Funcional");
        System.out.println(dddEhQuatroMeiaDeclarativo.test(p2) ? "É 46" : "Não é 46");
    }

    public static Boolean dddEhQuatroMeia(Pessoa pessoa){
        /* USei um if else aqui desnecessário, a maneira mais simples de fazer é como está na função declarativa,
        * porém essa é mais fácil de entender, comparem os dois e entendam porque eles são mesma coisa!
        * */
        if(pessoa.telefone.startsWith("46"))
            return true;
        return false;
    }

    static Predicate<Pessoa> dddEhQuatroMeiaDeclarativo =
            pessoa -> pessoa.telefone.startsWith("46");
}
