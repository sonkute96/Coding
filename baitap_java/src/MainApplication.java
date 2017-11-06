public class MainApplication {
    // chuong 1 - bai 1.
    public int tinhSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // chuong 1 - bai 2.
    public int tinhSumB2(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    // chuong 1 - bai 3.
    public double tinhSumB3(int n) {
        double sum = 0f;
        for(int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        return sum;
    }
    // chuong 1 - bai 4.
    public double tinhSumB4(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += (double)1 / (2*i);
        }
        return sum;
    }
    // chuong 1 - bai 6
    public double tinhSumB6(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += (double)1 / (i * (i + 1));
        }
        return sum;
    }
    // chuong 1 - bai 7
    public double tinhSumB7(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
        }
        return sum;
    }
    // chuong 1 - bai 8.
    public double tinhSumB8(int n) {
        double sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += (double) (2 * i + 1) / (2 * i + 2);
        }
        return sum;
    }
    // chuong 1 - bai 11.
    public int tinhGiaiThua(int index) {
        if (index == 1 || index == 0) {
            return 1;
        }
        return index * tinhGiaiThua(index -1);
    }
    public int tinhSumB11(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += tinhGiaiThua(i);
        }
        return sum;
    }
    public int tinhSumB14(int n) {
        int sum = 0;
        int x = 2;
        for(int i = 0; i <= n; i++) {
            sum += Math.pow(x, (2 * i + 1));
        }
        return sum;
    }
    public double tinhSumB16(int n) {
       double sum = 0;
       int x = 2;
       int tempTu = 1;
       int tempMau = 0;
       for(int i = 1; i <= n; i++) {
           tempTu *= x;
           tempMau += i;
           sum += (double)tempTu / tempMau;
       }
       return sum;
    }
    public double tinhSumB17(int n) {
        double sum = 0;
        int x = 2;
        int tempTu = 1;
        int tempMau = 1;
        for(int i = 1; i <= n; i++) {
            tempTu *= x;
            tempMau *= i;
            sum += (double) tempTu / tempMau;
        }
        return sum;
    }
    public double tinhSumB19(int n) {
       int x = 2;
       double sum = 1;
       int tempTu;
       int tempMau;
       for(int i = 0; i<= n; i++) {
           tempTu = (int)Math.pow(x, 2 * i + 1);
           tempMau = tinhGiaiThua((2 * i + 1));
           sum += (double) tempTu / tempMau;
       }
       return sum;
    }
    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        double result = mainApplication.tinhSumB19(2);
        System.out.println(result);
    }
}
