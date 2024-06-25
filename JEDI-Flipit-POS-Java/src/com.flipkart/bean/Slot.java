package com.flipkart.bean;

public class Slot {
    private String slotId;
    private String gymId;
    private LocalTime slotTime;

    public Slot(String slotId, String gymId, LocalTime slotTime) {
        this.slotId = slotId;
        this.gymId = gymId;
        this.slotTime = slotTime;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public LocalTime getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(LocalTime slotTime) {
        this.slotTime = slotTime;
    }
}