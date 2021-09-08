package a1_Challenges;

public class a2_MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(3000);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder = kiloBytes % 1024;
            int megabites = (kiloBytes - remainder) / 1000;

            System.out.println(kiloBytes + " KB = " + megabites + " MB and " + remainder +" KB");
        }
    }
}

