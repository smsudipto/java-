package LinkedHashMap;

import java.util.*;

public class AddingElement {
    public static void main(String[] args) {
        Map<String,Integer>m=new LinkedHashMap<>();
        Map<String,Integer>M=new LinkedHashMap<>();
        m.put("sudipto",1);
        m.put("Dipto",2);
        m.put("Shojib",3);
        m.put("raihan",4);

        M.put("SUDIPTO",1);
        M.put("DIPTO",2);
        M.put("SHOJIB",3);
        M.put("RAIHAN",4);

        System.out.println("First Map element is"+m );
        System.out.println("Second Map element is"+M );

    }
}
