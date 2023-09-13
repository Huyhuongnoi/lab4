import java.util.Scanner;
public class Mahoachuoi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        String[] arrTestCase = new String[testCase];
        for(int i = 0; i < testCase; i++){
            String str  = scanner.next();
            arrTestCase[i] = str;
        }
        for(int j = 0; j < testCase; j++){
            maHoa(arrTestCase[j]);
        }
    }
    public static void maHoa(String str){
        String Str = str.toUpperCase();
        char[] charArray = Str.toCharArray();
        char value = charArray[0];
        int count = 0;
        for(int index = 0; index < charArray.length; index++){
            if(charArray[index] == value){
                count += 1;
            }
            else{
                System.out.print(value + String.valueOf(count));
                count = 1;
                value = charArray[index];
            }
            if(index == charArray.length - 1){
                System.out.println(value + String.valueOf(count));
            }
        }

    }
}
