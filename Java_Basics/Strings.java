package Java_Basics;

public class Strings {

    public static void main(String[] args) {

        String name = "Tarun";

        System.out.println("Name: " + name);

        System.out.println("Length: " + name.length());

        System.out.println("Uppercase: " + name.toUpperCase());

        System.out.println("Lowercase: " + name.toLowerCase());

        System.out.println("First Character: " + name.charAt(0));

        String lastName = "Khadiya";

        System.out.println("Full Name: " + name + " " + lastName);

        System.out.println(name.equals("Tarun"));
    }
}