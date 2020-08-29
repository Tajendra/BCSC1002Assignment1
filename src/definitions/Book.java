/*  Created by IntelliJ IDEA.
 *  User: Tajendra Singh (191500840)
 *  Date: 29/08/20
 *  Time: 7:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {

    //Components of a definition class in Java.
    // 1. private fields.
    // 2. getter methods for private fields.
    // 3. setter methods for private fields.
    // 4. Constructors for initializing the fields of an object.
    // 5. the toString() method.
    // 6. the equals() and the hashCode() methods.

    private String nameOfBook;
    private String authorOfBook;
    private String thirteenDigitISBNNumberOfBook;

    //Constructor Methods : used to initialise the values (fields) of an object.

    // 1. Non-Parameterized constructor : it has no parameters.
    public Book() {
        nameOfBook = "Beginning Programming with Java";
        authorOfBook = "Barry Burd";
        thirteenDigitISBNNumberOfBook = "5790760157273";
    }

    // 2. Parameterized constructor : it has some parameters.
    public Book(String nameOfBook, String authorOfBook, String thirteenDigitISBNNumberOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.thirteenDigitISBNNumberOfBook = thirteenDigitISBNNumberOfBook;
    }

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    //1. The getter method : it is used to read the value of a private field.
    // Observer methods / Accessor Methods

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    //2. The setter method : used to write the value of a private field.
    // Transformer methods / Mutator Methods

    /**
     * This method will change the book name
     *
     * @param nameOfBook The name of the book that you want to given
     */

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    /**
     * This method returns the name of the author of the book.
     *
     * @return The name of author of the book.
     */

    public String getAuthorOfBook() {
        return this.authorOfBook;
    }

    /**
     * This method will change the author name of book
     *
     * @param authorOfBook The author name of the book that you want to given
     */

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    /**
     * This method returns the ISBN number of the book
     *
     * @return ISBN number of the book
     */

    public String getThirteenDigitISBNNumberOfBook() {
        return this.thirteenDigitISBNNumberOfBook;
    }

    /**
     * This method will change the ISBN number of book
     *
     * @param thirteenDigitISBNNumberOfBook ISBN number of the book that you want to given
     */

    public void setThirteenDigitISBNNumberOfBook(String thirteenDigitISBNNumberOfBook) {
        this.thirteenDigitISBNNumberOfBook = thirteenDigitISBNNumberOfBook;
    }

    public void getData() {
        System.out.println("Book Name: " + nameOfBook);
    }

    //The toString() method
    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                ", thirteenDigitISBNNumberOfBook='" + thirteenDigitISBNNumberOfBook + '\'' +
                '}';
    }

    //The equals() and hashcode() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(getAuthorOfBook(), book.getAuthorOfBook()) &&
                Objects.equals(getThirteenDigitISBNNumberOfBook(), book.getThirteenDigitISBNNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getAuthorOfBook(), getThirteenDigitISBNNumberOfBook());
    }
}
