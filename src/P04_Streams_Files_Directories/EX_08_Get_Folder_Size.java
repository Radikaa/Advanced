package P04_Streams_Files_Directories;

import java.io.File;
import java.util.ArrayDeque;

public class EX_08_Get_Folder_Size {
    public static void main(String[] args) {
        File folder = new File("resources");
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);

        int sumOfBytes = 0;

        while (!directories.isEmpty()) {
            File current = directories.poll();
            File[] files = current.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    sumOfBytes += file.length();
                }
            }
        }

        System.out.println(sumOfBytes);
    }
}