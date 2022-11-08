import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> nums = readAndWriteFile.readFile("C:\\Users\\Gin\\Desktop\\Java\\IO_TextFile\\IOText.txt");
        int max = readAndWriteFile.findMax(nums);
        readAndWriteFile.writerFile("C:\\Users\\Gin\\Desktop\\Java\\IO_TextFile\\outIOText\\result.txt", max);

    }
}
