package com.codurance.training.tasks;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public final class Task {
    private final long id;
    private final String description;
    private boolean done;
    private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Task(long id, String description, boolean done, Date date) {
        this.id = id;
        this.description = description;
        this.done = done;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
