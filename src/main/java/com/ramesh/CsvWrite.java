package com.ramesh;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvWrite {

    private static final String CSV_FILE_PATH
            = "./result.csv";
    public static void main(String[] args)
    {
        addDataToCSV(CSV_FILE_PATH);
    }
    public static void addDataToCSV(String output)
    {
        File file = new File(output);
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            String[] data = { "Name", "Class", "Marks" };
           for(int i=0;i<1000000;i++) {
               writer.writeNext(data);
           }
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
