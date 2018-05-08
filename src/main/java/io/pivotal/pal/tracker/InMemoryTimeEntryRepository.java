package io.pivotal.pal.tracker;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTimeEntryRepository {
    Map<  Long, TimeEntry>timeEntryMap = new HashMap<>();
    long counter;

    public InMemoryTimeEntryRepository(){

    }

    public TimeEntry create(TimeEntry inputTimeEntry) {
        inputTimeEntry.setId(++counter);
        timeEntryMap.put(counter, inputTimeEntry);
        return inputTimeEntry;
    }

    public TimeEntry find(long id) {

        return timeEntryMap.get(id);

    }

    public Map list() {
        return timeEntryMap;
    }

    public TimeEntry update(Object id, TimeEntry timeEntry) {
        TimeEntry updatedTimeEntry = new TimeEntry();
        return updatedTimeEntry;
    }

    public void delete(Object id) {

    }



}
