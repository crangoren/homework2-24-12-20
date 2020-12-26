package lvl2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String arrStr[][] = {{"new", "arr", "array", "2", "5"}, {"array", "NEW", "ARR", "3"}};
        String arrStr1[][] = {{"new", "arr", "array", "2"}, {"array", "NEW", "ARR", "3"}};

        String intArr[][] = {{"1", "3", "6", "7"}, {"5", "6", "0", "5"}};
        arrayExc(arrStr);
        arrayExc(arrStr1);
        arrayExc(intArr);


    }

    public static void arrayExc(String array[][]) {
        try {

            int sum = 0;

            if (array[0].length != 4 || array[1].length != 4) {

                System.out.println(array[0][-1]);
            } else {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < 4; ) {

                        if (myArrayDataException(array[i][j])) {
//
                            int temp = Integer.parseInt(array[i][j]);

                            sum = sum + temp;
                            j++;


                        } else {

                            j++;
                        }
                    }
//                        int temp = Integer.parseInt(array[i][j]);
//                        sum = sum + temp;


                }

//                        System.out.println(array[i][j]);

            }


            System.out.println(sum);

        } catch (ArrayIndexOutOfBoundsException MyArraySizeException) {
            System.out.println("Размер массива должен быть 4х4!");

//            System.out.println("Конец");



//        } finally {
//            int sum = 0;
//
//
//                for (int i = 0; i < array.length; i++) {
//
//                    for (int j = 0; j < 4; ) {
//                        if (!(array[i][j] instanceof String)) {
//                            int temp = Integer.parseInt(array[i][j]);
//
//                            sum = sum + temp;
//                            j++;
//
//                        } else {
//
//                            j++;
//                        }
//                    }
//
////                        System.out.println(array[i][j]);
//
//                }System.out.println(sum);
//            }



        }


    }
    private static boolean myArrayDataException(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }


}
