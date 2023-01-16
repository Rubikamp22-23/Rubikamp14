public class Main {
    public static void main(String[] args) {

        /*
           System.out.println("Hello world!");
           System.out.println("Hello world!");
           System.out.println("Hello world!");
           System.out.println("Hello world!");
           System.out.println("Hello world!");
           System.out.println("Hello world!");
         */

        for (int i = 0; i < 6; i++) {
            //  System.out.println("Hello world!");
        }

        var num = 1.8;


        for (int i = 0; i <= 30; i += 3) {
            // System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                //  System.out.println("even result: " + i);
            }
        }

//        int number = 1;
//        do {
//            System.out.println(number);
//            number++;
//        }
//        while (number <=10);
//    }
//
//        int number = 0;
//        while (number < 1000) {
//            number += 100;
//            System.out.println("My Number Is: " + number);
//            if (number == 700) {
//                break;
//            }
//        }

        int number = 0;
        while (number < 1000) {
            number += 100;
            if (number == 300) {
                break;
            }
            System.out.println("My Number Is: " + number);
        }


    }

}