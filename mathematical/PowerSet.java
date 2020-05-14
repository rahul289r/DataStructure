import java.io.*;
import java.util.HashSet;
class PowerSet {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[];
        int M;
       
        M=Integer.parseInt(br.readLine());
        str=br.readLine().split(" ");
        int valid[]=new int[M];
        for(int i=0;i<M;i++)
        {
            valid[i]=Integer.parseInt(str[i]);
        }
        HashSet<Integer> allowed=new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<(2<<M);i++)
        {
            sum=0;
            for(int j=0;j<M;j++)
            {
			System.out.println(i+" is i and (2<<j) is "+((2<<j))+"  and (i&(2<<j) is "+(i&(2<<j) ));
                if((i&(2<<j))!=0)
                {
                    sum+=valid[j];
                }
            }
            if(!allowed.contains(sum))
                allowed.add(sum);
        }
        System.out.println("HashSet contains distinct sum of all the elements.The number of elements in hashset are :");
        for(int a:allowed)
        {
            System.out.print(a+" ");
        }
            
    }
}
/*
Custom input:-
3
1 2 8
Custom output:-
HashSet contains distinct sum of all the elements.The number of elements in hashset are :
0 1 2 3 8 9 10 11

*/
