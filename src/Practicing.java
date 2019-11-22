import java.util.Arrays;
import java.util.Scanner;

public class Practicing {
    public static void main(String[] args) {
        getIntegers(5);

    }



    public static int[] getIntegers(int num){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Number: ");
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i]: " + arr[i]);
        }
    }

    public static int[] sortArr(int[] arr){
        int[] myArr = getIntegers(5);
        int[] sort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sort[i] = arr[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sort.length-1; i++){
                if(sort[i]< sort[i+1]){
                    temp = sort[i];
                    sort[i] = sort[i+1];
                    sort[i+1] = temp;
                    flag = true;
                }

            }
        }
        return sort;
    }



}