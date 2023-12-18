package com.jap.course3;

public class Author {
    private String authorName;
    public String authorPenName;

    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorPenName() {
        return authorPenName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }
    public String toString(){
        return "Author: "+authorName+ ", Author Pen name: "+authorPenName;
    }
}
