package ref;

public class NullMain1 {
    public static void main(String[] args) {

        /* null과 참조값 확인
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
         */

        /* nullException 체크
        Data data = null;
        data.value = 10;
        System.out.printf("data = "+ data.value);
         */

        /*
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerExcetion
        System.out.println("bigData.data.value=" + bigData.data.value);
         */
        
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);

        System.out.println("bigData = " + bigData);
    }
}
