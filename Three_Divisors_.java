import java.util.*;
class PAL
{
    static boolean prime(int n){
        int k=(int)Math.sqrt(n);
        if(n<=1)return false;
        for(int i=2;i<=k;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(prime(i))c++;
        }
        System.out.println(c);
    }
}
