package com.merge.pdf.util;// Merging multiple pdf documents here

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GFG {

    public static void main(String[] args)
    {

        if(args.length > 0){

            try {
                List<File> fileList = new ArrayList<>();

                // loading all the pdf files we wish to merge
                for (String filePath: args) {
                    File currentFile = new File(filePath);
                    fileList.add(currentFile);
                }

                // Instantiating PDFMergerUtility class

                PDFMergerUtility obj = new PDFMergerUtility();

                // Setting the destination file path

                obj.setDestinationFileName(
                        "newMerged.pdf");

                // Add all source files, to be merged

                for (File fileSource: fileList) {
                    obj.addSource(fileSource);
                }

                // Merging documents

                obj.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());

                System.out.println(
                        "PDF Documents merged to a single file");
            } catch (IOException ex) {
                System.out.println(
                        "An error occurred: Please try again!");
            }

        }
        else {
            System.out.println(
                    "Please specify almost a filename.");

        }

    }
}
