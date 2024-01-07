package com.java.practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;

public class CsvReader {


    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("SampleCSV.csv"));
            String line = "";
            List<DataPojo> list = new ArrayList<>();

            //  DataPojo dataPojo = new DataPojo();
            while ((line = bufferedReader.readLine()) != null) {
                //  line = bufferedReader.readLine();

                // System.out.println(line);
                String[] search = line.split("\\s+|,");
                for (String s : search) {
                    if (s.equals("Holmes")) {
                        System.out.println("Found");
                        exit(1);
                    }
                }

                String[] data = line.split(",");
                DataPojo dataPojo = createBook(data);
                list.add(dataPojo);

//                list.add(line.split(","));
            }

            for (DataPojo data : list) {
                System.out.println(data.id + " : " + data.bookName + " : " + data.name);
            }
//            for (String[] s : list) {
//                StringBuilder sb = new StringBuilder();
//
//                for (String string : s) {
//                    sb.append(string).append(",");
//                }
//                System.out.println(sb);
//
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static DataPojo createBook(String[] data) {

        int id = Integer.parseInt(data[0]);
        String bookName = data[1];
        String name = data[2];

        return new DataPojo(id, bookName, name);
    }

    @Override
    public String toString() {
        return null;
    }


}
