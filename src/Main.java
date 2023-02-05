import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //array
        Integer[] arrayLong = {15, 7, 3, 5, 6};
        System.out.println(arrayLong.length);

        //Switch case, lamda, yield
        var nilai = "S";
        switch (nilai) {
            case "A":
                System.out.println("sangat Baik");
                break;
            case "B":
                System.out.println("baik");
                break;
            case "C":
            case "D":
                System.out.println("cukup");
                break;
            default:
                System.out.println("kurang");
        }

        switch (nilai) {
            case "A" -> System.out.println("sangat Baik");
            case "B" -> System.out.println("baik");
            case "C", "D" -> System.out.println("cukup");
            default -> System.out.println("kurang");
        }

        var hasil = switch (nilai) {
            case "A": yield "sangat Baik";
            case "B": yield "baik";
            case "C", "D": yield "cukup";
            default: yield "kurang";
        };
        System.out.println(hasil);

        //ternary
        System.out.println(1 > 2 ? "betul" : "salah");
    }
}