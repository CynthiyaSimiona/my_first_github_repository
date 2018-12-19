import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate {


    public void findDuplicate(List<Integer> l){

        Map<Integer,Integer> dup = new HashMap<>();

        for(int i=0;i<l.size();i++){

            int count=1;

            int key=l.get(i);

            if(dup.containsKey(key))

                count++;

            dup.put(key,count);




        }

        for (Map.Entry<Integer,Integer> dupKey : dup.entrySet()) {

            if(dupKey.getValue()>1)

            System.out.println(dupKey.getKey());
        }





        }

    }

