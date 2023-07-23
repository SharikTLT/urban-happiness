package org.example;

/**
 * Поставщик строк для вывода в консоль
 * Необходимо вносить правки в метод getOutput
 */
public class OutputProvider {

    public String[] getOutput(){
        return new String[]{
                "--------------------------------",
                "Строки для вывода в консоль",
                "--------------------------------"
        };
    }
}
