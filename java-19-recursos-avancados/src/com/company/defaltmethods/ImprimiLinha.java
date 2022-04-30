package com.company.defaltmethods;

import java.util.function.Consumer;

public class ImprimiLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
