package org.example;

/**
 * Точка входа в программу
 * Редактирование не требуется
 */
public class Main {
    public static void main(String[] args) {
        OutputProvider provider = new OutputProvider();
        for (String line : provider.getOutput()) {
            System.out.println(line);
        }
    }
}