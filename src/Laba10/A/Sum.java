package Laba10.A;

public class Sum {

    public int cnt = 0;
    public double k = 0;
    public double s = 0;

    public double getK() {
        return k;
    }

    public double getS() {
        return s;
    }

    public int getCnt() {
        return cnt;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void Count(){
        int i = (int) Math.pow(10, this.k-1);
        while (i < Math.pow(10, this.k)) {
            int Ssum = 0;
            int num = i;

            while(num != 0) {
                Ssum += num % 10;
                num /= 10;
            }

            if (Ssum == s) {
                System.out.print(i + " ");
                this.cnt++;
            }
            i += 1;
        }
        System.out.println("\nCount of this numbers: " + this.cnt);
    }
}