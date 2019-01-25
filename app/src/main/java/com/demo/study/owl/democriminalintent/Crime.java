package com.demo.study.owl.democriminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID id;
    private String title;
    private Date date;
    private boolean solved;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public Crime() {
        this.id = UUID.randomUUID();
        date = new Date();
    }
}
