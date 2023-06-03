import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//C:\Users\msi\Desktop\ІТРЕ\testMy.txt

public class FileRead {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String filePath = scanner.nextLine();
        scanner.close();

        FileReader fileReader = new FileReader(filePath);
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        fileReader.close();
    }
}
