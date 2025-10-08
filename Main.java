import java.util.Scanner;

/**
 * @Filename-Main.java
 * @Description-This is the entry point
 * @Author-Aditya Virmani
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial string");
        String initialString = sc.nextLine();
        MyString obj = new MyString(initialString);
        System.out.println(
                "Enter 1. for Append\n2. for CountWords\n3. for Replace\n4. for isPalindrome\n5. for Splice\n6. for Split\n7. for MaxRepeatingCharacter\n8. for Sort\n9. for Shift\n10. for Reverse");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:

                System.out.println("Enter string to be appended");
                String append= sc.nextLine();
                obj.append(append);
                System.out.println("Result is:" + obj.str);
                break;
            case 2:
                int word = obj.countWords(initialString);
                System.out.println("total Words:" + word);
                break;
            case 3:
                System.out.println("Enter character to be replaced");
                char ch1 = sc.next().charAt(0);
                System.out.println("Replace with");
                char ch2 = sc.next().charAt(0);
                obj.replace(initialString, ch1, ch2);
                System.out.println("Result is:" + obj.str);
                break;
            case 4:
                boolean result = obj.isPalindrome(initialString);
                if (result == true)
                    System.out.println("String is palindrome");
                else
                    System.out.println("String is not palindrome");
                break;
            case 5:
                System.out.println("Enter starting index");
                int start = sc.nextInt();
                System.out.println("Enter Length");
                int length = sc.nextInt();
                obj.splice(initialString, start, length);
                System.out.println("Result is:" + obj.str);
                break;
            case 6:
                System.out.println("Enter the pattern to split");
                char ch = sc.nextLine().charAt(0);
                String[] result1 = obj.split(initialString, ch);
                System.out.println("Result is:");
                for (int i = 0; i < result1.length; i++) {
                    System.out.println(result1[i]);
                }
                break;
            case 7:
                
                System.out.println(obj.maxRepeatingCharacter(initialString));
                break;
            case 8:
                obj.sort(initialString);
                System.out.println("Result is:" + obj.str);
                break;
            case 9:
                System.out.println("Enter number of character that is to be shifted from start to end");
                int n = sc.nextInt();
                obj.shift(initialString, n);
                System.out.println("Result is:" + obj.str);
                break;
            case 10:
                obj.reverse(initialString);
                System.out.println("Result is:" + obj.str);
                break;
            default:
                System.out.println("Not a valid choice");
                break;

        }

    }
}
