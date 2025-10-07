import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class firstAssignment {
    static String str;
    static Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter a string");
        str = sc.nextLine();
        System.out.println("Entered string is:" + str);
    }

    public String append(String str) {
        System.out.println("Enter string to be appended:");
        String s = sc.nextLine();
        str = str + s; // append to existing string
        System.out.println("After appending: " + str);
        return str;
    }

    public int countWords(String str) {
        str = str.trim();
        if (str.length() == 0) {
            System.out.println("Total words is:0");
            return 0;
        }
        int words = 1;
        char curr = str.charAt(1), prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            prev = str.charAt(i - 1);
            curr = str.charAt(i);
            char ch = Character.toLowerCase(curr);
            if (prev == ' ' && ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                words++;
        }
        System.out.println("Total words is:" + words);
        return words;
    }

    public String replace(String str) {
        String s = "";
        System.out.println("Enter character to be replaced");
        char ch1 = sc.next().charAt(0);
        System.out.println("Replace with");
        char ch2 = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch1)
                s = s + str.charAt(i);
            else
                s = s + ch2;
        }
        System.out.println("Result is:" + s);
        return s;
    }

    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("String is not palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("String is palindrome");
        return true;
    }

    public String splice(String str) {
        System.out.println("Enter starting index");
        int start = sc.nextInt();
        System.out.println("Enter Length");
        int length = sc.nextInt();
        String s = "";
        int i = 0;
        for (i = 0; i < start; i++) {
            s = s + str.charAt(i);
        }
        int cnt = 1;
        while (cnt <= length) {
            i++;
            cnt++;
        }
        while (i < str.length()) {
            s = s + str.charAt(i);
            i++;
        }
        System.out.println("Result is:" + s);
        return s;
    }

    public String[] split(String str) {
        int cnt = 1;
        System.out.println("Enter the pattern to split");
        char ch = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                cnt++;
        }
        String[] result = new String[cnt];
        int index = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result[index] = word;
                word = "";
                index++;
            } else {
                word = word + str.charAt(i);
            }
        }
        result[index] = word;
        System.out.println("After split the result is:");
        for (int i = 0; i < cnt; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    public char maxRepeatingCharacter(String str) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (mpp.containsKey(ch)) {
                mpp.put(ch, mpp.get(ch) + 1);
            } else {
                mpp.put(ch, 1);
            }
        }
        int maxi = 0;
        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            if (maxi < entry.getValue())
                maxi = entry.getValue();
        }
        char ch = ' ';
        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == maxi) {
                ch = entry.getKey();
                System.out.println("Character " + ch + " Occurs " + entry.getValue() + " times");
            }
        }
        return ch;
    }

    public String sort(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
    String sortedStr = new String(chars);
    System.out.println("Sorted string: " + sortedStr);
    return sortedStr;
    }

    public String shift(String str){
        System.out.println("Enter number of character that is to be shifted from start to end");
        int n=sc.nextInt();
        String s="";
        int cnt=1;
        int i=0;
        while(cnt<=n){
            cnt++;
            i++;
        } 
        while(i<str.length()){
            s=s+str.charAt(i);
            i++;
        }
        for(int j=0;j<n;j++){
            s=s+str.charAt(j);
        }
        System.out.println("Resultant string is:"+s);
        return s;
    }


    public String reverse(String str){
        char[] chars=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        String reversedString=new String(chars);
        System.out.println("Reversed string is:"+reversedString);
        return reversedString;
    }
    public static void main(String args[]) {
        firstAssignment obj = new firstAssignment();
        obj.input();
        System.out.println(
                "Enter 1. for Append\n2. for CountWords\n3. for Replace\n4. for isPalindrome\n5. for Splice\n6. for Split\n7. for MaxRepeatingCharacter\n8. for Sort\n9. for Shift\n10. for Reverse");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                obj.append(str);
                break;
            case 2:
                obj.countWords(str);
                break;
            case 3:
                obj.replace(str);
                break;
            case 4:
                obj.isPalindrome(str);
                break;
            case 5:
                obj.splice(str);
                break;
            case 6:
                obj.split(str);
                break;
            case 7:
                obj.maxRepeatingCharacter(str);
                break;
            case 8:
                obj.sort(str);
                break;
            case 9:
            obj.shift(str);
            break;
            case 10:
            obj.reverse(str);
            break;
            default:
            System.out.println("Not a valid choice");
            break;
        }
    }
}