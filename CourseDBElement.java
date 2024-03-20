package com.example.cmsc_project4;

public class CourseDBElement extends Object {
    private String courseID;
    private int crn;
    private int numCredits;
    private String roomNum;
    private String instructorName;

    public CourseDBElement() {
        this.courseID = "";
        this.crn = 0;
        this.numCredits = 0;
        this.roomNum = "";
        this.instructorName = "";
    }
    public CourseDBElement(String id, int crn, int credits, String roomNum, String instructor) {
        this.courseID = id;
        this.crn = crn;
        this.numCredits = credits;
        this.roomNum = roomNum;
        this.instructorName = instructor;
    }
    public CourseDBElement(CourseDBElement element) {
        this.courseID = element.courseID;
        this.crn = element.crn;
        this.numCredits = element.numCredits;
        this.roomNum = element.roomNum;
        this.instructorName = element.instructorName;
    }
    public void setId(String id) {
        this.courseID = id;
    }
    public String getID() {
        return this.courseID;
    }
    public void setCRN(int crn) {
        this.crn = crn;
    }
    public int getCRN() {
        return this.crn;
    }
    public void setCredits(int credits) {
        this.numCredits = credits;
    }
    public int getCredits() {
        return this.numCredits;
    }
    public void setInstructor(String instructor) {
        this.instructorName = instructor;
    }
    public String getInstructor() {
        return instructorName;
    }
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
    public String getRoomNum() {
        return roomNum;
    }
    public int hashCode() {
        return crn;
    }
    //is broken?
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) {
            return true;
        }
        return false;
    }
    //change later
    public String toString() {
        return "CourseDBElement: " +
                "courseID='" + courseID + '\'' +
                ", crn=" + crn +
                ", numCredits=" + numCredits +
                ", roomNum='" + roomNum + '\'' +
                ", instructorName='" + instructorName + '\'';
    }
}
