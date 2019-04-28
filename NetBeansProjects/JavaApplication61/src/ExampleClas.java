import java.io.IOException;

public class ExampleClas {

    static int sizeOne;
    static int count;
    static char[] firstCharArray;
    static char[] secondCharArray;

    public static void main(String[] args) throws IOException {
        String firstString = "Java";
        String secondString = "Jvaa";
        sizeOne = firstString.length();
        count = 0;
        firstCharArray = new char[sizeOne];
        secondCharArray = new char[sizeOne];
        // assumption both are equal in size.
        for (int j = 0; j < sizeOne; j++) {
            firstCharArray[j] = firstString.charAt(j);
            secondCharArray[j] = secondString.charAt(j);
        }
        startAnagram(sizeOne);

        System.out.println("The strings are not anagram ");
    }

    // recursive anagram algorithem
    public static void startAnagram(int stringSize) {

        if (stringSize == 1) {
            return;
        }

        for (int i = 0; i < stringSize; i++) {
            startAnagram(stringSize - 1);
            if (stringSize == 2) // if innermost,
            {
                print();
            }
            rotateAnagram(stringSize); // rotate word
        }
    }

    // rotate left all chars from position to end
    public static void rotateAnagram(int currentSize) {
        int i;
        int position = sizeOne - currentSize;
        // temp for current letter.
        char temp = firstCharArray[position];
        //shift others left
        for (i = position + 1; i < sizeOne; i++) {
            firstCharArray[i - 1] = firstCharArray[i];
        }
        //put first on right
        firstCharArray[i - 1] = temp;
    }

    public static void print() {

        for (int i = 0; i < sizeOne; i++) {
            System.out.print(firstCharArray[i]);
        }
        System.out.println("");
        checkIfStringsEqual();
    }

    public static void checkIfStringsEqual() {

        boolean flag = true;

        for (int i = 0; i < sizeOne; i++) {
            if (firstCharArray[i] != secondCharArray[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The strings are anagram ");
            System.exit(1);
        }

    }
}

