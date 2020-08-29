/*  Created by IntelliJ IDEA.
 *  User: Tajendra Singh (191500840)
 *  Date: 24/08/20
 *  Time: 9:01 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    Student studentObject = new Student();
    private String studentFirstName, studentMiddleName, studentLastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] name;

    //Constructor Methods : used to initialise the values (fields) of an object.

    // 1. Non-Parameterized constructor : it has no parameters.
    public Student() {
        studentFirstName = "Tajendra";
        studentMiddleName = "Singh";
        studentLastName = "Jadon";
        universityRollNumber = 191500840;
        numberOfBooksIssued = 5;
        this.name = new Book[5];
        for (int index = 0; index < name.length; index++) {
            name[index] = new Book("IssuedBook " + (index + 1));
        }
    }

    // 2. Parameterized constructor : it has some parameters.
    public Student(String studentFirstName, String studentMiddleName, String studentLastName, long universityRollNumber, int numberOfBooksIssued, Book[] name) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.name = new Book[5];
        for (int index = 0; index < name.length; index++) {
            name[index] = new Book("Book " + (index + 1));
        }
    }

    public Student(String studentFirstName, String studentMiddleName, String studentLastName) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
    }

    //add getter and setter methods to read and write the value of private fields respectively

    /**
     * This method returns the first name of the student.
     *
     * @return The first name of the student.
     */

    public String getStudentFirstName() {
        return this.studentFirstName;
    }

    /**
     * This method sets the first name of student.
     *
     * @param studentFirstName The first name of the student that you want to set.
     */

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    /**
     * This method returns the middle name of the student.
     *
     * @return The middle name of the student.
     */

    public String getStudentMiddleName() {
        return this.studentMiddleName;
    }

    /**
     * This method sets the middle name of student.
     *
     * @param studentMiddleName The middle name of the student that you want to set.
     */

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    /**
     * This method returns the last name of the student.
     *
     * @return The last name of the student.
     */

    public String getStudentLastName() {
        return this.studentLastName;
    }

    /**
     * This method sets the last name of student.
     *
     * @param studentLastName The last name of the student that you want to set.
     */

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     * This method returns the university roll number of the student.
     *
     * @return The university roll number of the student.
     */

    public long getUniversityRollNumber() {
        return this.universityRollNumber;
    }

    /**
     * This method sets the university roll number of student.
     *
     * @param universityRollNumber The university roll number of the student that you want to set.
     */
    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    /**
     * This method returns the number of books issued by the student.
     *
     * @return The number of books issued by the student.
     */

    public int getNumberOfBooksIssued() {
        return this.numberOfBooksIssued;
    }

    /**
     * This method sets the number of books issued by the student.
     *
     * @param numberOfBooksIssued The number of books issued by the student that you want to given.
     */

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    /**
     * This method returns all the name of books issued by the student.
     *
     * @return All the name of books issued by the student.
     */

    public Book[] getName() {
        return this.name;
    }

    /**
     * This method sets the name of books issued by the student.
     *
     * @param name The name of books issued by the student that you want to given.
     */

    public void setName(Book[] name) {
        this.name = name;
    }


    //The toString() method
    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentMiddleName='" + studentMiddleName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", name=" + Arrays.toString(name) +
                '}';
    }

    //The equals() and hashcode() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getStudentFirstName(), student.getStudentFirstName()) &&
                Objects.equals(getStudentMiddleName(), student.getStudentMiddleName()) &&
                Objects.equals(getStudentLastName(), student.getStudentLastName()) &&
                Arrays.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentFirstName(), getStudentMiddleName(), getStudentLastName(), getUniversityRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getName());
        return result;
    }
}
