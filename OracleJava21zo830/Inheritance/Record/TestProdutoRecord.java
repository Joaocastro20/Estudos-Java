package OracleJava21zo830.Inheritance.Record;

public class TestProdutoRecord {
    public static void main(String[] args) {
        Produto produto = new Produto("Teste", 2500);
        System.out.println(produto.nome());
        System.out.println(produto.preco());
        System.out.println(produto.descricao());

        Person person = new Person();
        person.canDrink("Teste");

        PersonTwo personTwo = new PersonTwo("teste", 78);
        System.out.println(personTwo.toString());

        PersonTwo personTwo1 = new PersonTwo("test", 78);
        System.out.println(personTwo.equals(personTwo1));

        System.out.println(personTwo.hashCode());
        System.out.println(personTwo1.hashCode());

    }
}
