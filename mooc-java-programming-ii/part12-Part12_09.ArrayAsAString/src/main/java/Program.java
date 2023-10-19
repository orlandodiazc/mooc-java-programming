
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] twoDimensionalArray = new int[rows][columns];

        twoDimensionalArray[0][1] = 4;
        twoDimensionalArray[1][1] = 1;
        twoDimensionalArray[1][0] = 8;
        String result = arrayAsString(twoDimensionalArray);
        System.out.println(result);
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                numbers.append("\n");
            }
            for (int j = 0; j < array[i].length; j++) {
                numbers.append(array[i][j]);
            }
        }
        return numbers.toString();
    }

}
