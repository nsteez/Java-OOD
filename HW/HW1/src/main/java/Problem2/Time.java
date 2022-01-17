package Problem2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    /**
     * Constructor that creates a new Time object with the specified hour, minute and second.
     * @param hour - hour of the Time object.
     * @param minute - minute of the Time object.
     * @param second - second of the Time object.
     */
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    /**
     * This function subtracts the time obj provided as an argument from this Time object.
     * @return difference between two Time objects
     */
    public Time getDifference(Time startTime){
        Time endTime = this;

        int durationSeconds = endTime.second - startTime.second;
        if (durationSeconds < 0)
        {
            durationSeconds += 60;
            endTime.minute -= 1;
        }
        int durationMinute = endTime.minute - startTime.minute;
        if (durationMinute < 0)
        {
            durationMinute += 60;
            endTime.hour -= 1;
        }
        int durationHour = endTime.hour - startTime.hour;


        return new Time(durationHour, durationMinute, durationSeconds);
    }

    /**
     * Returns a string representation of Time with hour, minute and second.
     * @return a formatted string.
     */
   public String toString(){
       String isHour = this.hour == 1 ? " hour " : " hours ";
       String isMinute = this.minute == 1 ? " minute " : " minutes ";
       String isSecond = this.second == 1 ? " second" : " seconds";

       return this.hour + isHour + this.minute + isMinute + this.second + isSecond;
    }
}
