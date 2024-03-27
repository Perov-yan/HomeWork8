import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int [] arr = new int [] {1,2,3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        int [] number = new int[12];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        System.out.println(" ");
        System.out.println("Задание 2:");
        int i = 0;
        for (;i < arr.length;i++){
            System.out.print(arr[i]);
            if (i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");
        i = 0;
        for (;i < doubleArr.length;i++){
            System.out.print(doubleArr[i]);{
                if (i != doubleArr.length - 1){
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(doubleArr));
        System.out.println(" ");
        i = 0;
        for (;i < number.length;i++){
            System.out.print(number[i]);
            if (i != number.length - 1 ){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(number));
        System.out.println(" ");
        System.out.println("Задание 3");
        i = 2;
        for (;i < arr.length; i--){
            if (i > -1){
                System.out.print(arr[i]);
                if (i != 0){
                System.out.print(", ");
                }
            }
        }
        System.out.println(" ");
        i = 2;
        for (;i < doubleArr.length; i--){
            if (i > -1){
                System.out.print(doubleArr[i]);
                if (i != 0){
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" ");
        i = 11;
        for (; i < number.length; i--){
            if (i > -1){
                System.out.print(number[i]);
                if (i !=0){
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Задание 4:");
        i = 0;
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");
        for (;i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] = arr[i] + 1;
                System.out.print(arr[i]);
                if (i != arr.length -1){
                    System.out.print(", ");
                }
            } else {
                System.out.print(arr[i]);
                if (i != arr.length -1){
                    System.out.print(", ");
                }
            }
        }
    }
}