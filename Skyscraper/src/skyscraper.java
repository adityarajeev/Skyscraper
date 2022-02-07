import java.util.*;
public class skyscraper{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the total number fboors in the building : ");
        int n = reader.nextInt();
        int x[] = new int[n+1];
        int i=0;
        for(i=1;i<n+1;i++){
            System.out.println("Enter the fboor size given on day : "+i);
            int m=reader.nextInt();
            x[m]=i;
        }
        int j=n;
        boolean fb;
        System.out.println("The order of construction is as follows ");
        for(i=1;i<=n;i++){
            fb=false;
            System.out.print("Day "+i+" :-- ");
            System.out.print("\n");
            while(j>=1 && x[j]<=i){
                fb=true;
                System.out.print(j +" ");
                j--;
            }
            if(fb==true){
                System.out.println("");
            }
        }
    }
}