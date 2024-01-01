package Polymorphism_3;

public class Main {
    public static void main(String[] args) {
        MathFunctions functions = new MathFunctions();

        int sum = functions.add(5, 3);
        int difference = functions.sub(7, 2);
        int product = functions.multiply(4, 6);
        double quotient = functions.div(20.0, 4.0);
        int absoluteValue = functions.abs(-7);
        double squareRoot = functions.sqrt(25.0);

        System.out.println("Sonlarning yig'indisi: " + sum);
        System.out.println("Sonlarning ayirmasi: " + difference);
        System.out.println("Sonlarning ko'paytmasi: " + product);
        System.out.println("Sonlarning bo'linmasi: " + quotient);
        System.out.println("Sonlarning absolute qiymati: " + absoluteValue);
        System.out.println("SSonlarning kvadrat qiymati: " + squareRoot);
    }
}

