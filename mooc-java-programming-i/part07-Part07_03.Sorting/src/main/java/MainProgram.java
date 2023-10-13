
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (currentValue < smallest) {
                smallest = currentValue;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (currentValue < smallest) {
                smallest = currentValue;
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            int currentValue = table[i];
            if (currentValue < smallest) {
                smallest = currentValue;
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        array[index1] = array[index2];
        array[index2] = first;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");

    }

    public static void sort(int[] array) {
        print(array);
        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, index);
            print(array);
        }
    }
}
