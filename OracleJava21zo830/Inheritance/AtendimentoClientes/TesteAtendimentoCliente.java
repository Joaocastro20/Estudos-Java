package OracleJava21zo830.Inheritance.AtendimentoClientes;

import java.util.*;

public class TesteAtendimentoCliente {

    public static void main(String[] args) {
        List<Cliente> clientes = List.of(
                new Cliente("Ana", "Centro"),
                new Cliente("Bruno", "Zona Norte"),
                new Cliente("Carlos", "Centro"),
                new Cliente("Daniela", "Zona Sul"),
                new Cliente("Eduardo", "Zona Leste"),
                new Cliente("Fernanda", "Zona Norte"),
                new Cliente("Gabriel", "Zona Oeste"),
                new Cliente("Helena", "Centro"),
                new Cliente("Igor", "Zona Sul"),
                new Cliente("Juliana", "Zona Leste"),
                new Cliente("Kleber", "Zona Oeste"),
                new Cliente("Larissa", "Zona Norte"),
                new Cliente("Marcos", "Centro"),
                new Cliente("Natália", "Zona Sul"),
                new Cliente("Otávio", "Zona Leste")
        );

        Map<String, List<Cliente>> atendentes = new HashMap<>();
        Map<String, Set<String>> locaisPorAtendente = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            String nome = "Atendente " + i;
            atendentes.put(nome, new ArrayList<>());
            locaisPorAtendente.put(nome, new HashSet<>());
        }

        for (Cliente cliente : clientes) {
            for (String atendente : atendentes.keySet()) {
                if (!locaisPorAtendente.get(atendente).contains(cliente.getLocal())) {
                    atendentes.get(atendente).add(cliente);
                    locaisPorAtendente.get(atendente).add(cliente.getLocal());
                    break;
                }
            }
        }

        // Exibir resultado
        for (String atendente : atendentes.keySet()) {
            System.out.println("\n" + atendente + " atenderá:");
            for (Cliente c : atendentes.get(atendente)) {
                System.out.println(" - " + c.getNome() + " (" + c.getLocal() + ")");
            }
        }
    }

}
