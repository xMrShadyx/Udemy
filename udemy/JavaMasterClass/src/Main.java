
public class Main {
    public static void main(String[] args) {

        int n = 24;

        if ((n % 2 != 0) || ((n % 2 == 0) && (n > 6 && n <= 20))) {
            System.out.println("Weird");
        } else if ((n % 2 == 0) && ((n > 2 && n <= 5) || (n > 20))) {
            System.out.println("Not Weird");
        }


    }
}