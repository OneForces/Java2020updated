package Laba14;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {

    public Student[] mergeSort(Student[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || compare(source[cursor],source[delimiter])==1)  {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
        return buffer;
    }
    public Student[] MergeSort(Student[] students) {
        return mergeSort(students,0,students.length-1);
    }

    public Student[] quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return array;
        if (low >= high)
            return array;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (compare(array[i],opora)==1) {
                i++;
            }
            while (compare(array[j],opora)==-1) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
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
        return array;
    }
    public Student[] QuickSort(Student[] students) {
        return quickSort(students,0, students.length-1);
    }
    public Student linearSearch(Student arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index].getID() == elementToSearch)
                return arr[index];
        }
        return null;
    }
    public Student binarySearch(Student arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex].getID() == elementToSearch) {
                return arr[middleIndex];
            }
            else if (arr[middleIndex].getID() < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex].getID() > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return null;
    }
    public Student recursiveBinarySearch(Student arr[], int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (arr[mid].getID() == elementToSearch)
                return arr[mid];
            if (arr[mid].getID() > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return null;
    }
    @Override
    public int compare(Student o1, Student o2) {
        double sum1=0,sum2=0;
        for(int i: o1.getMarks()){
            sum1+=i;
        }
        sum1/=o1.getMarks().length;
        for(int i: o2.getMarks()){
            sum2+=i;
        }
        sum2/=o2.getMarks().length;
        if(sum1>sum2){return 1;}
        if(sum1<sum2){return -1;}
        return 0;
    }
}
