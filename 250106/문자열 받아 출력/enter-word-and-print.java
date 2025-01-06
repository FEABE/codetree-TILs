import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.length() < 1 || input.length() > 100) {
            System.out.println("Error: 문자열의 길이는 1 이상 100 이하여야 합니다.");
        } else {
            System.out.println(input);
        }

        sc.close(); 
    }

}
