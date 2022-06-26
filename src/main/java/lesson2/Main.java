package lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] str = new String[][]{
                {"4", "2", "44", "7"},
                {"0", "1", "3", "84"},
                {"9", "12", "7", "83"},
                {"88", "6", "55", "0"}
        };

        String[][] str2 = new String[][]{
                {"4", "2", "QW", "7"},
                {"0", "1", "gs", "84",},
                {"9", "12", "7", "83"},
                {"88", "6", "55", "K"}
        };

        String[][] str3 = new String[][]{
                {"4", "2", "44", "7"},
                {"0", "1", "3", "84", "4"},
                {"9", "12", "7", "83"},
                {"88", "6", "55", "0"}
        };

        try {
            System.out.println(sumOfArrayElements(str));
    //        System.out.println(sumOfArrayElements(str2));
    //        System.out.println(sumOfArrayElements(str3));

        } catch (MySizeArrayException e) {
            e.printStackTrace();
            System.out.println("Array size should be 4x4 ");
            System.exit(1);

        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static int sumOfArrayElements(String[][] arr) throws MyArrayDataException, MySizeArrayException {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr.length != 4 | arr[j].length != 4) {
                    throw new MySizeArrayException("Incorrect array size");
                }

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
