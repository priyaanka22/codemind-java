import java.util.*;
import java.io.*;
class Pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i);
            if(n>=48 && n<=57){
                String m="";
                m+=s.charAt(i);
                int res=Integer.parseInt(m);
                sum+=res;
            }
        }
        System.out.print(sum);
    }
}