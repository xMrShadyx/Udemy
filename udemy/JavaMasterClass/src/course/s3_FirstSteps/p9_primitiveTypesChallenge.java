package course.s3_FirstSteps;

public class p9_primitiveTypesChallenge {
    public static void main(String[] args) {
        // Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter.
        byte firstVal = 25;

        // Create a short variable and set it to any valid short number.
        short secondVal = 32000;

        //Create an int variable and set to any valid int number.
        int thirdVal = 55000555;

        // Lastly create a variable of type long and make it equal to 50000 plus 10 times the sum of the
        // byte + short + int values



        long mofoType = 50000L + ((firstVal + secondVal + thirdVal) * 100L);
        System.out.println(mofoType);
    }
}
