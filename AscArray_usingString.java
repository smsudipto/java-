package AscArray_usingString;

import java.util.Arrays;
import java.util.Scanner;

public class AscArray_usingString {
    public static void main(String[]args)
    {
        System.out.println("Import your Array:");
        String[] Array={"SUSIPTO","KAPIL","NEMAI","OVI","RAIHAN","SHOJIB"};

        for(int i=0;5>i;i++)//int[5](5>i) so correct array is count 4.
        {
            System.out.print(" "+Array[i]);
        }

        Arrays.sort(Array);
        System.out.println("Descending Array is:");
        for(int i=0;5>i;i++)//int[5](5>i) so correct array is count 4.
        {
            System.out.print(" "+Array[i]);
        }
    }
}
