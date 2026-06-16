<<<<<<< HEAD
<<<<<<< HEAD
public class CountLetterA {

    public int totalA(String text) {

        int total = 0;

        for (char ch : text.toCharArray()) {

            if (ch == 'A' || ch == 'a') {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        CountLetterA obj = new CountLetterA();

        int result = obj.totalA("AASAAR");

        System.out.println("Total A's = " + result);

        if (result == 4) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
=======
//h
public class CountLetterA {

    public int totalA(String text) {

        int total = 0;

        for (char ch : text.toCharArray()) {

            if (ch == 'A' || ch == 'a') {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        CountLetterA obj = new CountLetterA();

        int result = obj.totalA("AASAAR");

        System.out.println("Total A's = " + result);

        if (result == 4) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
>>>>>>> 927beabffb243e7bdc3ebfb6823a824a3f5bc4e7
=======
//this is my code file
public class CountLetterA {

    public int totalA(String text) {

        int total = 0;

        for (char ch : text.toCharArray()) {

            if (ch == 'A' || ch == 'a') {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        CountLetterA obj = new CountLetterA();

        int result = obj.totalA("AASAAR");

        System.out.println("Total A's = " + result);

        if (result == 4) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
>>>>>>> 9984dfb916ced082e4c7f70bdba3a2e58caa2d8b
