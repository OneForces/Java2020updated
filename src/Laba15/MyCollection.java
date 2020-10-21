package Laba15;
import java.util.ArrayList;

class MyCollection extends ArrayList<Integer> {
    public int getIndex(int index) {
        return get(index);
    }

    @Override
    public boolean add(Integer value) {
        for (int i = 0; i < size(); i++) {
            set(i, get(i) + value);
        }
        return super.add(value);
    }

    public boolean remove(Integer value) {
        for (int j = 0; j < size(); j++) {
            set(j, get(j) - value);
        }
        return super.remove(value);
    }

    public double getAverage(){
        int sum = 0;
        double avg;
        for(int i = 0; i < size(); i++)
            sum += getIndex(i);
        avg = sum / size();
        return avg;
    }

    public int maxValue(){
        int max = 0;
        for(int i = 0; i < size(); i++) {
            if (getIndex(i) > max)
                max = getIndex(i);
        }
        return max;
    }

    public int minValue(){
        int min = getIndex(0);
        for(int i = 0; i < size(); i++) {
            if (getIndex(i) < min)
                min = getIndex(i);
        }
        return min;
    }
}