package practice.string_02;

public class _01ReverseString {
    static void main() {
        String str="Hello";
      // Approach -1
        char[] ch= str.toCharArray();
        System.out.println("Reverse String using toCharArray() Method: ");
        for (int i=ch.length-1; i>=0 ; i--){
            System.out.print(ch[i]);
        }

        System.out.println(" ");
        // Approach -2
        System.out.println("Rverse String Using charAt() Method: ");
        for (int i=str.length()-1 ; i>=0 ; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        // Approach -3
        System.out.println("String Reverse Using reverse() Method");
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
