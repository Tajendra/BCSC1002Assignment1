/*  Created by IntelliJ IDEA.
 *  User: Tajendra Singh (191500840)
 *  Date: 29/08/20
 *  Time: 9:35 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Student currentlyInteractStudent;
        Scanner scannerObject = new Scanner(System.in);
        int studentInput;

        Library libraryObject = new Library();
        Student studentObject = new Student();
        Book bookObject = new Book();

        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?\n");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter you choice (1..4): ");
            studentInput = scannerObject.nextInt();
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK_FOR_ME:
                    scannerObject.nextLine();
                    System.out.println("Enter the name of the books that you want to issue: ");
                    String[] bookNames = new String[5];
                    for (int i = 0; i < 5; i++) {
                        bookNames[i] = scannerObject.next();
                    }
                    for (String bookName : bookNames) {
                        System.out.println(bookName);
                    }

                    break;
                case RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME:
                    System.out.println("Enter the name of the name of book that you wan to return: ");
                    scannerObject.nextLine();
                    //videoName = scanner.nextLine();
                    //myVideoStore.doCheckout(videoName);
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOKS:
                    System.out.println("Your all issues book names are: ");
                    scannerObject.nextLine();
                    //videoName = scanner.nextLine();
                    //myVideoStore.doReturn(videoName);
                    break;

                default:
            }
        } while (studentInput != EXIT);
        scannerObject.close();
    }
}
