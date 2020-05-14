import java.io.*;
import java.util.Stack;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n=0;
        String str[];
        while(t>0)
        {
            n=Integer.parseInt(br.readLine());
            str=br.readLine().split(" ");
            long a[]=new long[n];
            Stack<Long> stack=new Stack<Long>();
            for(int j=0;j<n;j++)
            {
                a[j]=Long.parseLong(str[j]);
                stack.push(a[j]);
            }
            long first=0,second=0,hcf=0,lcm=0;
            while(!stack.isEmpty())
            {
                first=stack.pop();
                if(stack.isEmpty())
                     break;
                second=stack.pop();
                 long temp1=first<second?first:second;
                 
               // System.out.println("The first element is "+temp1);
                long temp2=first>=second?first:second;
            //    System.out.println("The 2nd element is "+temp2);
                hcf=gcd(first<second?first:second,first>=second?first:second);
                if(first>hcf)
                {
                    lcm=first/hcf;
                    lcm*=second;
                }
                else if(second>hcf)
                {
                    lcm=second/hcf;
                    lcm*=first;
                }
                else
                    lcm=(first*second)/hcf;
System.out.println("When numbers are "+first+" and "+second+" The hcf is "+hcf+" Lcm is "+lcm);
                stack.push(lcm%1000000007); 
            }
            
            System.out.println(first%1000000007);
            t--;
        }
    }
    public static long gcd(long a,long b)
    {
     //   System.out.println("a is "+a+" b is "+b);
        if(a==0)
            return b;
            return gcd(b%a,a);
    }
}
