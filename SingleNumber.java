import java.util.Scanner;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumber(arr, n));
    }
    static int findNumber(int[] arr,int n) {
        int num = 0;
        num = arr[0];
        for(int i=1;i<n;i++) {
            num = num^arr[i];
        }
        return num;
    }
}