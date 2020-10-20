package Laba14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    private ArrayList<Student> students;

    private void quickSort(ArrayList<Student> students, int low, int high) {
        this.students = students;

        if (students.size() == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student std = students.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (compare(students.get(i), std) > 0)
                i++;
            while (compare(students.get(j), std) < 0)
                j--;
            if (i <= j) {
                Collections.swap(students, i, j);
                i++;
                j--;
            }
            if (low < j)
                quickSort(students, low, j);
            if (high > i)
                quickSort(students, i, high);
        }
    }

    public void equals() {
        while (i <= j) {
            while (Mid(array[i]) > Mid(opora)) {
                i++;
            }
            while (Mid(array[j]) < Mid(opora)) {
                j--;
            }
            if (i <= j) {
                Laba13.Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public SortingStudentsByGPA(ArrayList<Student> students) {
        this.students = students;
        int low = 0, high = students.size() - 1;
        quickSort(students, low, high);
    }
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getFactor(), o2.getFactor());
    }
    public void PrintList() {
        for (Student s : students) {
            System.out.println("Student " + s.getName() + ": id" + s.getId() + ", rating is " + s.getFactor());
        }
    }
}