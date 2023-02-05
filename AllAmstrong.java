import java.util.Scanner;

public class AllAmstrong{
    void allAmstrong(){
        System.out.println("Enter the Input value : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r,i,sum=0,t;
        
        for( i=11;i<=n;i++){
            t=i;
            while(t>0){
               r=t%10;
               sum=sum+(r*r*r);
               t=t/10;
            }
            if(sum==i){
            System.out.print(" "+sum);
            }
            sum=0;
        }
 
    }
    public static void main(String args[]){
        AllAmstrong a=new AllAmstrong();
        a.allAmstrong();
    }
}
