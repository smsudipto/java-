package LinkedHashMap;
import java.util.*;
public class RemoveElement {
        public static void main(String[] args) {
            Map<String,Integer> m=new LinkedHashMap<>();
            Map<String,Integer>M=new LinkedHashMap<>();

            M.put("SUDIPTO",1);
            M.put("DIPTO",2);
            M.put("SHOJIB",3);
            M.put("RAIHAN",4);

            System.out.println("Second Map element is"+M );
            M.remove(new String("DIPTO"));
            System.out.println("Removing element is :"+M);

        }
    }


