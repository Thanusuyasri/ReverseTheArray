import java.util.Scanner;

public class ReverseArrayPrograd {
    public static void reverseRange(int[] array)
    {
        int b=0,c= array.length-1;
        while(b<c)
        {
            int temp=array[b];
            array[b]=array[c];
            array[c]=temp;
            b++;
            c--;
        }
        for(int i:array)
        {
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        reverseRange(array);
    }
}
