package com.example.cmsc_project4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CourseDBStructure extends Object implements CourseDBStructureInterface {
    private int size;
    LinkedList<CourseDBElement>[] hash;
    public CourseDBStructure(int num) {
        size = num;
        hash = new LinkedList[size];
    }
    public CourseDBStructure(String numElements, int size) {
        this.size = size;
        hash = new LinkedList[size];
    }
    public void add(CourseDBElement element) {
        int index = ((Integer)(element.getCRN())).hashCode() % size;

        LinkedList<CourseDBElement> currentBucket = hash[index];

        if (currentBucket == null) {
            currentBucket = new LinkedList<CourseDBElement>();
            hash[index] = currentBucket;
        }

        currentBucket.add(element);
    }

    public CourseDBElement get(int crn) throws IOException {
        int index = ((Integer) crn).hashCode() % size;

        LinkedList<CourseDBElement> currentBucket = hash[index];

        if (currentBucket != null) {
            for (CourseDBElement element : currentBucket) {
                if (element.getCRN() == crn) {
                    return element;
                }
            }
        }
        throw new IOException();
    }

    public ArrayList<String> showAll() {
        ArrayList<String> courseStrings = new ArrayList<>();

        for (LinkedList<CourseDBElement> bucket : hash) {
            if (bucket != null) {
                for (CourseDBElement element : bucket) {
                    String courseString = "Course:" + element.getID() + " CRN:" + element.getCRN() +
                            " Credits:" + element.getCredits() + " Instructor:" + element.getInstructor() +
                            " Room:" + element.getRoomNum();
                    courseStrings.add(courseString);
                }
            }
        }
        return courseStrings;
    }

    public int getTableSize() {
        return hash.length;
    }
    public static int get4KPrime(int num) {
        return 0;
    }
}
