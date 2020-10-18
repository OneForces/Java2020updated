package Laba14;

public class Student {
    private int ID;
    private int[] marks;
    Student(int id,int ...marks){
        this.ID=id;
        this.marks=marks;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public String printMark(){
        String a="";
        double sum = 0;
        for (int i = 0; i < this.getMarks().length; ++i) {
            sum += this.getMarks()[i];
        }
        return ""+sum / this.getMarks().length;
    }
    @Override
    public String toString() {
        return "ID: "+ID+", Marks: "+printMark();
    }
}