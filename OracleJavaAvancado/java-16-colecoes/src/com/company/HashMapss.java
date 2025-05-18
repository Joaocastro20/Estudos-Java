import java.util.HashMap;
import java.util.Map;

public class HashMapss {
    /*
    nao aceita chaves duplicadas mais valores sim
     */
    public static void main(String[] args) {
        Map<String,Cliente> clientes = new HashMap<String,Cliente>();

        Cliente cliente1 = new Cliente("maria",43);
        Cliente cliente2 = new Cliente("jose",56);

        clientes.put("p",cliente1);
        clientes.put("o",cliente2);


        System.out.println(clientes.get("o"));
    }
}
