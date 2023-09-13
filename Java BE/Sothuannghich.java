import java.util.Scanner;
public class Sothuannghich {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] arrTestCase = new int[testCase];
        for(int i = 0; i < testCase; i++){
            int num = scanner.nextInt();
            arrTestCase[i] = num;
        }
        for(int j = 0; j < testCase; j++){
            checkSoThuanNghich(arrTestCase[j]);
        }
    }
    public static void checkSoThuanNghich(int intNum){
        int num = Math.abs(intNum);
        String strNum = String.valueOf(num);
        char[] arrCharNum = strNum.toCharArray();
        int value = Math.round((float)(arrCharNum.length - 1)/2);
        if(value == 1){
            if(arrCharNum[0] == arrCharNum[1]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            int count = 0;
            for(int idx = 0; idx < value; idx++){
                if(arrCharNum[value + 1] != arrCharNum[value - 1]){
                    System.out.println("NO");
                    break;
                }
                else{
                    count += 1;
                }
            }
            if(count == value){
                System.out.println("YES");
            }
        }
    }
}
