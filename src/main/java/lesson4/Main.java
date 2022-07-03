package lesson4;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        if (Arrays.equals(arrayCalculationsTimeCheck(), arrayCalculationsTimeCheckWithThreads())) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }


    private static float[] arrayCalculationsTimeCheck() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Calculations in array without using threads: " + (System.currentTimeMillis() - a));
        return arr;

    }


    private static float[] arrayCalculationsTimeCheckWithThreads() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();


        float[] tempArr1 = new float[h];
        float[] tempArr2 = new float[h];
        System.arraycopy(arr, 0, tempArr1, 0, h);
        System.arraycopy(arr, h, tempArr2, 0, h);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < tempArr1.length; i++) {

                tempArr1[i] = (float) (tempArr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread.start();

        int j = h - 1;
        for (int i = 0; i < tempArr2.length; i++) {
            j++;
            tempArr2[i] = (float) (tempArr2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(tempArr1, 0, arr, 0, h);
        System.arraycopy(tempArr2, 0, arr, h, h);

        System.out.println("Calculations in array with using threads: " + (System.currentTimeMillis() - a));
        return arr;
    }
}
