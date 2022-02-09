package Tamrin3;

import java.util.ArrayList;

public class Tamrin3 {
    public void delet(ArrayList<Integer> array){
             int len = array.size();
             if (len%2 !=0){
                 len -=1;
                 array.remove(len);
             }
             ArrayList<Integer> rem= new ArrayList<>();
             for (int i =0;i<len+1;i +=2){
                 for (int j = i+1;j<len;) {
                     if (array.get(i) > array.get(j)) {
                         rem.add(array.get(i));
                         rem.add(array.get(j));
                     }
                     break;
                 }
             }
             int o = 0;
             for (int b = 0;b<rem.size();b++){
                 o=rem.get(b);
            array.remove(Integer.valueOf(o));

             }
        System.out.println(rem);
        System.out.println(array);
    }
}
