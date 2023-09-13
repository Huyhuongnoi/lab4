import java.util.Scanner;
public class Xaupangram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        String[][] arrTestCase = new String[testCase][2];
        for(int i = 0; i < testCase; i++){
            String str = scanner.next();
            String K = scanner.next();
            arrTestCase[i][0] = str;
            arrTestCase[i][1] = K;
        }
        for(int j = 0; j < testCase; j++) {
            check(arrTestCase[j][0], arrTestCase[j][1]);
        }
    }
    public static void check(String s, String k){
        int K = Integer.parseInt(k);
        String str = s.toLowerCase();
        int count = 0;
        char[] arrCharStr = str.toCharArray();
        if(arrCharStr.length < 26){
            System.out.println(0);
            return;
        }
        char[] alPhaBet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int idx = 0; idx < alPhaBet.length ; idx++){
            for(int val = 0; val < arrCharStr.length; val++){
                if(alPhaBet[idx] == arrCharStr[val]){
                    count+=1;
                    break;
                }
            }
        }
        if(alPhaBet.length - count <= K){
            K = K - (alPhaBet.length - count);
            int ketqua = K/(alPhaBet.length) + 1;
            System.out.println(ketqua);
        }
        else{
            System.out.println(0);
        }
    }
}
