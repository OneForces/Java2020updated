package Laba23;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main <T>{
    public  List<T> conversion (T arr[]){
        List<T> listConversion = new ArrayList<T>();
        Collections.addAll(listConversion,arr);
        return  listConversion;

    }
    public static void katalog(){
        String path = "src/Laba23";
        File directory = new File(path);
        if (directory.isDirectory()){
            String []content = directory.list();
            if(content != null){
                int k = 0;
                for(String a: content){
                    File file = new File(path +"/" +a);
                    if (k <5)
                        System.out.println(a);
                }
            }
        }
    }
    public static void main(String[] args) {
        String []arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]="i"+i;
        }
        Integer arr2[] = new Integer[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=i;
        }
        Main amm = new Main();
        amm.conversion(arr);
        for (Object arr3: amm.conversion(arr) ) {
            System.out.println(arr3);
        }
        Double []d = new Double[2];
        d[0]=21.3;
        d[1]=22.44;
        AnyType anyType = new AnyType();
        anyType.setArr(d);
        System.out.println(anyType.getElementIndex(1));
        katalog();
        Solution solution = new Solution();
        solution.newArraList(new Integer(10),new Integer(29));
    }
}
