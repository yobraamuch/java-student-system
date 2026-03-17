package com.university.system.model;

/
public class Book {

    private String isbn;           
    private String title;          
    private String edition;        
    private String version;      
    private int    yearPublished;
    private int    totalCopies;
    private int    borrowedCopies; 

    
    public Book(String isbn, String title, String author,
                String edition, String version, int yearPublished, int totalCopies) {
        this.isbn          = isbn;
        this.title         = title;
        this.author        = author;
        this.edition       = edition;
        this.version       = version;
        this.yearPublished = yearPublished;
        this.totalCopies   = totalCopies;
        this.borrowedCopies = 0;
    }

    public Book() {}

    
    public int getAvailableCopies() {
        return totalCopies - borrowedCopies;
    }

    
    public boolean isAvailable() {
        return getAvailableCopies() > 0;
    }

    
    public boolean borrowCopy() {
        if (!isAvailable()) {
            System.out.println("No copies available for: " + title);
            return false;
        }
        borrowedCopies++;
        return true;
    }

    
    public boolean returnCopy() {
        if (borrowedCopies <= 0) {
            System.out.println("Error: no borrowed copies recorded for: " + title);
            return false;
        }
        borrowedCopies--;
        return true;
    }

    public String getIsbn()          { return isbn; }
    public String getTitle()         { return title; }
    public String getAuthor()        { return author; }
    public String getEdition()       { return edition; }
    public String getVersion()       { return version; }
    public int    getYearPublished() { return yearPublished; }
    public int    getTotalCopies()   { return totalCopies; }
    public int    getBorrowedCopies(){ return borrowedCopies; }

    
    public void setIsbn(String isbn)                   { this.isbn = isbn; }
    public void setTitle(String title)                 { this.title = title; }
    public void setAuthor(String author)               { this.author = author; }
    public void setEdition(String edition)             { this.edition = edition; }
    public void setVersion(String version)             { this.version = version; }
    public void setYearPublished(int yearPublished)    { this.yearPublished = yearPublished; }
    public void setTotalCopies(int totalCopies)        { this.totalCopies = totalCopies; }
    public void setBorrowedCopies(int borrowedCopies)  { this.borrowedCopies = borrowedCopies; }

    @Override
    public String toString() {
        return "[" + isbn + "] " + title + " by " + author +
               " | " + edition + " | Available: " + getAvailableCopies() +
               "/" + totalCopies;
    }
}
