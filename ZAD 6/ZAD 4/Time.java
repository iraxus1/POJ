package pl.edu.pja;

public class Time {
    private final int hour;
    private final int minute;

    public Time(final int hour, final int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public Time add(final Time time) {
        final int addhour = ((this.minute + time.minute) / 60);
        return new Time(this.hour + time.hour + addhour, (this.minute + time.minute) % 60);
    }

    public Time mult(final int times) {
        final int multihours = ((this.minute * times) / 60);
        return new Time(this.hour * times + multihours, (this.minute * times) % 60);
    }
}
