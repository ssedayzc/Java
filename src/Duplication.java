import java.util.Arrays;
import java.util.Scanner;

public class Duplication {
    public static void main(String[] args) {

        int[] list = {5,6,3,3,6,8,1,6,5};
        int startIndex = 0;
        int [] duplicates = new int [list.length];

        for(int i = 0;i< list.length ;i++){
            for(int j = 0; j< list.length;j++){
                if( (i!=j) && (list[i] == list[j]) ){
                    duplicates[startIndex++] = list[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicates));
        for(int k=0;k<duplicates.length;k++){
            if(duplicates[k] % 2 == 0)
                System.out.print(duplicates[k]);
        }



        }
}