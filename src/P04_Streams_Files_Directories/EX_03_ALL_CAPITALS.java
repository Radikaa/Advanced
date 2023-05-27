package P04_Streams_Files_Directories;

import java.io.*;

public class EX_03_ALL_CAPITALS {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("resources/output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("resources/input.txt"));
        br.lines().forEach(line -> pw.println(line.toUpperCase()));
        br.close();
        pw.close();
    }
}