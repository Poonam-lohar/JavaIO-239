package com.bridgelabz;

import java.io.File;

public class FileUtils {

    public static boolean deleteFiles(File contentToDelete){
        //using variable call listFiles method that will be store in allData variable
        File[] allData = contentToDelete.listFiles();
        if (allData != null) {
            //iterate for each loop over addData
            for (File file : allData) {
                deleteFiles(file); //calling method
            }
            }
        return contentToDelete.delete();
    }
}
