package ArrayHomeworks;
import java.util.Arrays;

public class ArraysFrekans {

    static boolean isFind(int[] list , int value){
        for(int i : list){
            if(value == i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {10,20,20,10,10,20,5,20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] duplicate = new int[arr.length];

        int count = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j])){
                    count++;
                }
            }
            if(!isFind(duplicate, arr[i])){
                System.out.println(arr[i] + " sayısı " + (count + 1) + " kere tekrar edildi.");
                duplicate[index++] = arr[i];
            }
        }
    }
}