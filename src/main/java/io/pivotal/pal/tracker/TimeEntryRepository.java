package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class TimeEntryRepository {

    public List<TimeEntry> timeEntryList = new ArrayList<>();


    public TimeEntryRepository(){



    }

    public ResponseEntity create(TimeEntry any) {

        return null;

    }

    public void find(long id) {


    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity update(long eq, TimeEntry any) {
        return null;
    }

    public ResponseEntity<TimeEntry> delete(long l) {
        return null;
    }
}
