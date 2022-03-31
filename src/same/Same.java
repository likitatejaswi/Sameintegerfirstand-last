package same;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int lengthOfArray = s.nextInt();

        System.out.println("Enter the elements in array");
        int[] array = new int[lengthOfArray];
        for (int i=0; i<lengthOfArray; i++){
            array[i] = s.nextInt();
        }
        Ex75 ex = new Ex75();
        boolean result = ex.ele(array);
        System.out.println("Final result :"+result);
    }
}
