package assignment1;

public class Form {
    public String SVName;
    public String BookName;
    public String Date;
    public String Depcrip;

    public Form(String SVName, String bookName, String date, String depcrip) {
        this.SVName = SVName;
        BookName = bookName;
        Date = date;
        Depcrip = depcrip;
    }

    public String getSVName() {
        return SVName;
    }

    public void setSVName(String SVName) {
        this.SVName = SVName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDepcrip() {
        return Depcrip;
    }

    public void setDepcrip(String depcrip) {
        Depcrip = depcrip;
    }
    public String toString(){
        return getSVName()+getBookName()+getDate()+getDepcrip();
    }
}
