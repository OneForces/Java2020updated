package Laba14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static int[] randMark(int[] marks){
        Random r=new Random();
        int[] x=new int[marks.length];
        if(r.nextInt(100)<20){
            for(int i=0;i< marks.length;++i){
                x[i]=r.nextInt(100);
            }
        }else if(r.nextInt(100)<50){
            for(int i=0;i< marks.length;++i){
                x[i]=r.nextInt(50);
            }
        }else{
            for(int i=0;i< marks.length;++i){
                x[i]=r.nextInt(20);
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[] marks=new int[10];
        int size=10;
        Student[] students=new Student[size];
        Random rand=new Random();
        for(int i=0;i<size;++i){
            Student s1=new Student(i+1, randMark(marks));
            students[i]=s1;
        }
        SortingStudentByGPA sort=new SortingStudentByGPA();
        for(int i=0;i<size;++i){
            System.out.println(students[i]);
        }
        System.out.println();
        System.out.println("Рещультат поиска: "+sort.linearSearch(students,5));
        //sort.MergeSort(students);
        sort.QuickSort(students);
        System.out.println();
        for(int i=0;i<size;++i){
            System.out.println(students[i]);
        }
        System.out.println("Рещультат поиска: "+sort.binarySearch(students,7));
        System.out.println();
        System.out.println();
        System.out.println("Сортировка слиянием:");
        System.out.println("Временная сложность O(n log(n))");
        System.out.println("Пространственная сложность O(n)");
        System.out.println();
        System.out.println("Быстрая сортировка:");
        System.out.println("Временная сложность O(n log(n))");
        System.out.println("Пространственная сложность O(log(n))");
        System.out.println();
        System.out.println("Линейный поиск:");
        System.out.println("Временная сложность O(n)");
        System.out.println("Пространственная сложность O(1)");
        System.out.println();
        System.out.println("Бинарный поиск (итеративный):");
        System.out.println("Временная сложность O(log(n))");
        System.out.println("Пространственная сложность O(1)");
        System.out.println();
        System.out.println("Бинарный поиск (рекурсивный):");
        System.out.println("Временная сложность O(log(n))");
        System.out.println("Пространственная сложность в худшим случае O(log(n))");
        System.out.println();
        System.out.println("Время: MergeSort = QuickSort ; linearSearch > BinarySearch");
        System.out.println("Память: MergeSort > QuickSort ; linearSearch = BinarySearch");
    }
}