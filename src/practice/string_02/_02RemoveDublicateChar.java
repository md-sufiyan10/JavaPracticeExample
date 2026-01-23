package practice.string_02;

public class _02RemoveDublicateChar {
    static void main() {
        String str="programming";     // r-2 , g-2 , m-2
        StringBuilder sb1=new StringBuilder();
         //  Approach -1 using java -8 features
        System.out.println("Original String:"+str);
        str.chars().distinct().forEach(c-> sb1.append((char)c));
        System.out.println("Remove Dublicate Character:"+ sb1);

        // Approach -2 using indexOf() method
        StringBuilder sb2=new StringBuilder();
        for (int i=0; i<str.length()-1; i++ ){
           char ch= str.charAt(i);
            int idx=  str.indexOf(ch, i+1);
            if(idx==-1){
                sb2.append(ch);
            }
        }
        System.out.println("----------------------");
        System.out.println("---Using indexOf() method for dublicate char---");
        System.out.println("Remove Dublicate Character:"+sb2);


    }
}
