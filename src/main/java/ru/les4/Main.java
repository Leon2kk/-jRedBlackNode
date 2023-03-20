package ru.les4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main( String[] args )
    {
        lRedBlack tree = new lRedBlack();
        tree.insert(5, "Five");
        tree.insert(10, "Ten");
        tree.insert(15, "Fifteen");
        tree.insert(20, "Twenty");
        tree.insert(25, "Twenty-Five");
        final rRedBlack<Integer> rRedBlack = new rRedBlack<>(Integer::compareTo);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    Integer value = Integer.parseInt(reader.readLine());
                    rRedBlack.add(value);
                    System.out.println("finish");
                } catch (NumberFormatException exception) {
                    return;
                }
            }
        } catch (IOException ignored) {
        }
    }
}
