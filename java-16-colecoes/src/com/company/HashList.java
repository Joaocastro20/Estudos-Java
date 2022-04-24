package com.company;

import java.util.HashSet;
import java.util.Set;

public class HashList {
    public static void main(String[] args) {
        //nao salva valores reptidos
        //nao possui indices
        Set<String> nomes = new HashSet<String>();

        nomes.add("maria cecilia");
        nomes.add("jose");
        nomes.add("eustaquio");
        nomes.add("maria");

        System.out.println(nomes.contains("maria"));

        for(Object nome : nomes){
            System.out.println(nome);
        }
    }

    }

