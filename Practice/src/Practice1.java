import java.util.*;
import java.io.*;
public class Practice1{
    public static void main(String[]args)throws IOException{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[5001];
        a[0] = 0;
        a[1] = -1;
        a[2] = -1;
        a[3] = 1;
        a[4] = -1;
        a[5] = 1;
        for(int i = 6; i <= 5000; i++){
        	if(a[i-5] >= 1) a[i] = a[i-5]+1;
            else if(a[i-3] >= 1) a[i] = a[i-3]+1;
            else a[i] = -1;
        }
        System.out.println(a[n]);
    }
}