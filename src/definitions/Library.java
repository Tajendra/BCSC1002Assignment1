/* Created by IntelliJ IDEA.
 *  Author: Tajendra Singh (191500840)
 *  Date: 8/29/2020
 *  Time: 8:31 PM
 *  File Name : Library.java
 */

package definitions;

import java.util.Arrays;

public class Library {
    private Book[] stock;

    public Library() {
        this.stock = new Book[10];
        for (int index = 0; index < stock.length; index++) {
            stock[index] = new Book("AvailableBook " + (index + 1));
        }
    }

    public Library(Book[] stock) {
        this.stock = stock;
    }

    public Book[] getStock() {
        return this.stock;
    }

    public void setStock(Book[] stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Library{" +
                "stock=" + Arrays.toString(stock) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getStock(), library.getStock());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStock());
    }
}
