package Laba23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution <T,K> {
    public ArrayList <T> newArraList(T...elements){
        ArrayList <T> res = new ArrayList<>();
        for (T elm:elements){
            res.add(elm);
        }
        return res;
    }
    public HashSet<T> newHashSet(T...elements){
        HashSet<T> res = new HashSet<>();
        for(T elm: elements){
            res.add(elm);
        }
        return res;
    }
    public HashMap <K,T> newHasMap(List<?extends K> keys,List<? extends T> values){
        if(keys.size() != values.size()){
            throw new IllegalArgumentException();
        }
        HashMap <K,T> res = new HashMap<>();
        for (int i = 0;i < keys.size();i++){
            res.put(keys.get(i),values.get(i));
        }
        return res;
    }
}
