import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
           marks[i]= sc.nextInt();
        }
        System.out.println("array elements:");
        for(int i=0;i<n;i++){
            System.out.print( marks[i]+" ");
        }
        

        
    }
    
}
