import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong dan: ");
        String filePath = sc.nextLine();
        ReadFile readFile = new ReadFile();
        readFile.readFile(filePath);
    }
}