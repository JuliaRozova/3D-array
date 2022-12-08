package ThreeDecimalArray;

import java.util.Random;

public class ThreeDecimalArray {
    int x;
    int y;
    int z;
    int[][][] array;

    public ThreeDecimalArray(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        array = new int[x][y][z];
    }

    public void createArray(){
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = random.nextInt(0,9);
                }
            }
        }
    }
    public void printArray(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("Sum of elements of edge " + (i + 1) + " is " + arraySum(array[i]));
            System.out.println();
        }
    }

    public static int arraySum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public void sortArray(){
        int[][] buffer = null;
        boolean unSorted = true;

        while (unSorted){
            unSorted = false;

            for (int i = 0; i < x - 1; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < z; k++) {
                        if(arraySum(array[i]) > arraySum(array[i + 1])){
                            buffer = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = buffer;
                            unSorted = true;
                        }
                    }
                }
            }
        }
    }
}

