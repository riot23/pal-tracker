package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;

public class TimeEntry {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return id == timeEntry.id &&
                projectId == timeEntry.projectId &&
                userId == timeEntry.userId &&
                hours == timeEntry.hours &&
                Objects.equals(date, timeEntry.date);
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, projectId, userId, date, hours);
    }

    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long l, long l1, LocalDate parse, int i) {
        this.projectId = l;
        this.userId = l1;
        this.date = parse;
        this.hours = i;
    }

    public TimeEntry(long l, long l1, long l2, LocalDate parse, int i) {
        this.id = l;
        this.projectId = l1;
        this.userId = l2;
        this.date = parse;
        this.hours = i;
    }

    public TimeEntry() {

    }

    public TimeEntry(Object id, long l1, long l2, LocalDate parse, int i) {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long newId){ this.id = newId; }
}
