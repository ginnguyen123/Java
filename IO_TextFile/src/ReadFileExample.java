import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn đến file: ");
        String srcLinks = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample(); // không có static nên gọi thông qua class
        readFileExample.readFileText(srcLinks);
    }
    public void readFileText(String filePath){
        try{
            File file = new File(filePath); // tạo đối tượng file mới, truyền tên file vào theo tham số filePath kiểu string
            if (!file.exists()){ //check fil có tồn tại hay không, sử dụng .exists()
                throw new FileNotFoundException();
            }
            //đọc file thông qua lớp Reader
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            //đọc file xong cần đóng file
            bufferedReader.close();
            System.out.println("Sum: " +sum);
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
