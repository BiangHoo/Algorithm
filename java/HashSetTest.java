import java.util.*;  
  
  
/** 
 * Description：find the number which appear the most frequently in an array 
 * @author Biang Hoo 
 * Aug 19 2013 
 */  
public class HashSetTest {  
    public static void main(String []args){  
        int array[]={1,2,3,4,5,6,7,3,2,3,1,6,4,1,3,};  
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();  
        for(Integer m:array){//遍历数组，将数和它个数作为键和值存入HashMap  
            int i=1;  
            if(hs.get(m)!= null){  
                 i = (hs.get(m))+1;  
            }  
            hs.put(m,i);  
            //System.out.println(hs.get(m));  
        }  
        Iterator itor= hs.keySet().iterator();  
        int MAX =-1;  
        Object Max_Key=null;  
        while(itor.hasNext()){//找到出现次数最多的数  
            Object key = itor.next();  
            if(hs.get(key)>MAX){  
                MAX = hs.get(key);  
                Max_Key =key;  
            }  
        }  
        System.out.println(Max_Key+" "+hs.get(Max_Key));  
    }  
}  