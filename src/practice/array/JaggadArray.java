package practice.array;

public class JaggadArray {
    static void main() {


        int[][] juggedArray = new int[3][];
        juggedArray[0]= new int[3];  // first row 3 column
        juggedArray[1]=new int[2];    // second row 2 column
        juggedArray[2]=new int[4];  // third rwo 4 column

        // Assigning values
        juggedArray[0][0]=10;
        juggedArray[0][1]=20;
        juggedArray[0][2]=30;

        juggedArray[1][0] = 40;
        juggedArray[1][1] = 50;

        juggedArray[2][0] = 60;
        juggedArray[2][1] = 70;
        juggedArray[2][2] = 80;
        juggedArray[2][3] = 90;

        for(int[] rows: juggedArray){
        for (int num : rows){
            System.out.print(num +" ");
        }
            System.out.println();

        }

    }
}
