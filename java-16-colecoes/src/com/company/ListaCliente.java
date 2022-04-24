package com.company;

import java.util.ArrayList;

public class ListaCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente("maria",12);
        Cliente c2 = new Cliente("joao", 21);
        for(Cliente cliente : clientes){
            System.out.println("oi");
        }
    }
}
