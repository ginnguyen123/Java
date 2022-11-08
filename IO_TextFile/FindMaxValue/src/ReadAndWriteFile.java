import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String linksFile){
        //đọc file ở link cung cấp ở tham số linksFile rồi ghi vào lớp arraylist để lưu trữ
        List<Integer> nums = new ArrayList<>();
        try{
            File file = new File(linksFile);
            if (!file.exists())
                throw new FileNotFoundException();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String lines = "";
            while ((lines = bufferedReader.readLine()) != null){
                nums.add(Integer.parseInt(lines));
            }
            bufferedReader.close();
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
        return nums;
    }
    public void writerFile(String linksFile, int max){
        //ghi ra file ở link người dùng cung cấp
        try{
            FileWriter fileWriter = new FileWriter(linksFile, true); // tạo file ghi mới ở link cung cấp linksFile
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max is: " + max); //ghi giá trị max ra file
            bufferedWriter.close(); // đóng file
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    public int findMax(List<Integer> nums){
        int max = nums.get(0);
        for (int i = 1; i<nums.size(); i++){
            if (max<nums.get(i))
                max = nums.get(i);
        }
        return max;
    }
}
