import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class Main {
    public static final String CLIPFOLDER = {"clipFolder"};
    
    public static void main(String[] args) {
        // Get files of audio
        String[] fileNames = FileProcessor.getFiles(CLIPFOLDER);

        // Print filenames
        printFileNames(fileNames);
    }

    public static void printFileNames(String[]> fileNames) {
        // Print fileNames
        for (int i = 0; i < fileNames.size(); i++) {
            System.out.println("File: " + fileNames[i]);
        }
    }

}