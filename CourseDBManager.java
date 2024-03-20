package com.example.cmsc_project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDBManager extends Object implements CourseDBManagerInterface {
    private CourseDBStructure structure;

    public CourseDBManager() {
        structure = new CourseDBStructure(10);
    }

    public void add(String id, int crn, int credits, String roomNum, String instructor) {
        structure.add(new CourseDBElement(id, crn, credits, roomNum, instructor));
    }

    public CourseDBElement get(int crn) {
        try {
            return structure.get(crn);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void readFile(File input) throws FileNotFoundException {
        try {
            File file = input;

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> showAll() {
        return structure.showAll();
    }
}
