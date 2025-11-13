import java.util.*;
class count{
 
    public static void main(String[] args) {
        int count=0;
       System.out.println("Enter the size of an array:");
       Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the "+num+" array elements:");
        for(int i=0;i<num;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<num;i++)
        if(arr[i]>50){
            count = count+1;
        }
        System.out.println("The number which are greater than 50 are: " +count);
    }
}
