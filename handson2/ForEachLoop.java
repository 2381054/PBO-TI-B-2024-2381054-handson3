package handson2;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12,14, 16, 18, 20};

        System.out.println("Bilangan genap dengan ForEachLoop: ");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
