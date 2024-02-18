
package edu.hanover.schedulevisualizer.core;

import java.util.List;
import java.util.function.Consumer;

/**
 * Represents an unassigned time slot.
 * indicating a time slot that has not been assigned any specific details.
 */

public class UnassignedTimeSlot implements TimeSlot {
    private final static UnassignedTimeSlot instance = new UnassignedTimeSlot();

    UnassignedTimeSlot(){}

    /**
     * Get the singleton instance of UnassignedTimeSlot.
     *
     * @return The singleton instance of UnassignedTimeSlot.
     */
    static UnassignedTimeSlot getInstance() {
        return instance;
    }

    public String getId() {
        return "-";
    }

    public String getAbbrId() {
        return "-";
    }

    public List<Weekday> getWeekdayList() {
        return List.of();
    }

    public boolean overlaps(final TimeSlot otherSlot) {
        return false;
    }

    public void ifAssignedSlotNumberDo(final Consumer<Integer> f) {
        // Do nothing if timeslot is not assigned number
    }

    public void ifUnassignedSlotDo(final Runnable runnable) {
        runnable.run();
    }
}
