package in.co.akashkumar.quakereport;

public class Earthquake {
    private String magnitude;
    private String location;
    private long timeInMilliseconds;

    public Earthquake(String magnitude, String location, long mTimeInMilliseconds) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = mTimeInMilliseconds;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
