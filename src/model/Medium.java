package model;

/**
 * Abstract class that will be used as a base class to be inherited from for every Media object such as Book.
 */
public abstract class Medium {

    protected String title;
    protected String author;

    public Medium(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract String mediumToString();    //Abstract method needs to be implemented in base class

    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
