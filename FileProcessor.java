import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public static String[] getFiles(String folderPath) {
        // Get all files in folder
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        String[] fileNames = new String[listOfFiles.length];
        for (int i = 0; i < listOfFiles.length; i++) {
            fileNames[i] = listOfFiles[i].getName();
        }
        return fileNames;
    }

}