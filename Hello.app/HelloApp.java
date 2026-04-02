package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                if (nameBuilder.length() > 0) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
            }

            message = nameBuilder.toString();
        }

        System.out.println("Hello, " + message + "!");
    }
}