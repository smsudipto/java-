package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Geeks {

        public static void main(String[] args) {
            //creating a map using HashMap;
            Map<String,Integer> M=new LinkedHashMap<>();
            //Adding key value paire to map;
            M.put("Sudipto",1);
            M.put("Shojib",2);
            M.put("Raihan",3);
            System.out.println(" Map implement is:"+M );

            for(Map.Entry<String,Integer>me:M.entrySet())
            {
                System.out.print(me.getKey()+":");
                System.out.println(me.getValue());
            }

        }
    }


