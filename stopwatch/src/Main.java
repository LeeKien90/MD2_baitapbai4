import Ra.StopWatch;

public class Main {
    public static void main(String[] args) {
       //b1. khai bao va khoi tao mang 10.000 phan tu
        int[] arrInt = new int[10000];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.random()*10000;
        }
        //b2. Start dong ho de bat dau dem thoi gian giai thuat selection sort thuc hien
        StopWatch sw = new StopWatch();
        sw.start();

        //b3. thuc hien giai thuat selection sort de sap xep mang so nguyen 10000 phan tu
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = 0; j < arrInt.length; j++) {
                if (arrInt[i]>arrInt[j]) {
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }

        //b4. Stop dong ho de tinh so thoi gian thuc hien giai thuat
        sw.stop();

        //b5. in ra thoi gian thuc hien giai thuat
        System.out.println("Thoi gian thuc hien giai thuat la: "+sw.getElapsetTime());
    }
}