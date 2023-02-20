package a_introduction;

public class Task5 {
    public static void main(String[] args) {
        String name = "Jess";
        int age = 38;

        String message = name + ", is " + age + " years old and is ";
        if (age < 18) {
            message += "underage";
        } else {
            message += "not underage";
        }
        System.out.println(message);
    }
}

