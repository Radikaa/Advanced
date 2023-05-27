package P04_Streams_Files_Directories;

import java.io.*;

public class EX_01_Sum_Lines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Resource/input.txt"));

        String line = bufferedReader.readLine();
        while (line != null) {
            long sum = 0;
            char[] charactersFromLine = line.toCharArray();
            for (char character : charactersFromLine) {
                sum += character;
            }
            System.out.println(sum);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}