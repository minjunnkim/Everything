import java.util.*;
import java.io.*;
public class practice{
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[1001];
        x[1] = 2;
        x[2] = 2;
        x[3] = 3;
        for(int i = 4; i < 1001; i++){
        	x[i] = (x[i-1]+x[i-2]);
        }
        System.out.println(x[n]);
    }
}