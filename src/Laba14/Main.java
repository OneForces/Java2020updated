package Laba14;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array=new int[10];
        Student[] Num=new Student[5];
        Random rand=new Random();
        Num[0]=new Student(1,3,4,5,3,4);
        Num[1]=new Student(2,2,2,2,2,2);
        Num[2]=new Student(3,5,5,5,5,5);
        Num[3]=new Student(4,4,4,4,4,4);
        Num[4]=new Student(5,2,5,5,3,3);
        for(int j=0;j<Num.length;++j){
            System.out.println(Num[j]);
        }
        System.out.println();
        SortingStudentByGPA ssss=new SortingStudentByGPA();
        ssss.QuickSort(Num);
        for(int j=0;j<Num.length;++j){
            System.out.println(Num[j]);
        }
    }
}