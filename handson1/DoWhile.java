package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanBuah =  String[] kumpulanBuah =  {"Apel", "Pisang","Mangga", "Jeruk", "Durian", "Anggur"} ;
        int counter = 0;
        while (counter < kumpulanBuah.length) {
            System.out.println("Elemen ke " + (counter) + " Adalah : " + kumpulanBuah[counter]);
            counter++;
        }

    }
}
