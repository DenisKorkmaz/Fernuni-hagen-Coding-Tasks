import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] jaggedArray = new int[10][];

        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = j;
            }
        }

        for (int[] i : jaggedArray) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
