package Problem2;

public class Trip {
    private String startingLocation, endingLocation;
    private Time startTime, endTime;


    /**
     * Constructor that creates a new Trip object with specified
     * startingLocation, endingLocation, startTime and endTime.
     * @param startingLocation - startingLocation of the Trip object.
     * @param endingLocation - ending location of the Trip object.
     * @param startTime - start time of the Trip object.
     * @param endTime - end time of the Trip object.
     */
    public Trip(String startingLocation, String endingLocation, Time startTime, Time endTime){
        this.startingLocation = startingLocation;
        this.endingLocation = endingLocation;
        this.startTime = startTime;
        this.endTime = endTime;

    }
    /**
     * Returns the startingLocation of the Trip.
     * @return the startingLocation of the Trip.
     */
    public String getStartingLocation(){
        return this.startingLocation;
    }

    /**
     * Returns the endingLocation of the Trip.
     * @return the endingLocation of the Trip.
     */
    public String getEndingLocation(){
        return this.endingLocation;
    }

    /**
     * Returns the startingTime of the Trip.
     * @return the startingTime of the Trip.
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * Returns the endingTime of the Trip.
     * @return the endingTime of the Trip.
     */
    public Time getEndTime() {
        return endTime;
    }

    /**
     * Sets the starting location of the Trip.
     */
    public void setStartingLocation(String startingLocation){
        this.startingLocation = startingLocation;
    }

    /**
     * Sets the ending location of the Trip.
     */
    public void setEndingLocation(String endingLocation){
        this.endingLocation = endingLocation;
    }

    /**
     * Sets the start Time of the Trip.
     * @param startTime - starting Time
     */
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets end Time of the Trip.
     * @param endTime - ending Time.
     */
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
    /**
     * Returns the duration of Time.
     * @return the endTime using the getDifference method
     */
    public Time getDuration(){
       return this.endTime.getDifference(this.startTime);

    }
}