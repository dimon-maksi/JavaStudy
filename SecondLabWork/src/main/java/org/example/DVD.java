package org.example;

public class DVD extends Item{
    private int duration;
    @Override
    void borrowItem() {
        setBorrowed(true);
    }

    @Override
    void returnItem() {
        setBorrowed(false);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
