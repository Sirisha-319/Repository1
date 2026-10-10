public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int i,j,max;
        int []a = new int[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        max1 = a[0];
        max2 
        for(i=0;i<n;i++){
                if(a[i]>max){
                    max1 = a[i];
                }
                if(a[i]>max2 && a[i]!=max1){
                    max2 = a[i];
                }
                if( a[i] === max1){
                    continue;
                }

        }
        System.out.println("max element in the given array is "+max2);
    }
}