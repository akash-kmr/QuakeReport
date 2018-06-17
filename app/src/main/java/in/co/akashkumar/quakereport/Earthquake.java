package in.co.akashkumar.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
