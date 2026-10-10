import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int i,j,max;
        int []a = new int[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(i=0;i<n;i++){
                if(a[i]>max){
                    max = a[i];
            }
        }
        System.out.println("max element in the given array is "+max);
    }
}