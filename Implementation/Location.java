public class Location
{
    private boolean isCovered;
    private String location;
    //private Sensor sensor;

    @Override
    public String toString() {
        return ",Location: " +
                "isCovered=" + isCovered +
                ", location= " + location +
                ' ';
    }

    public Location(String location) {
        this.location = location;
    }

    //** Getters */
    public boolean isCovered() {
        return isCovered;
    }

    public String getLocation() {
        return location;
    }

    //public Sensor getSensor() {
      //  return sensor;
    //} 

    //** Setters */
    public void setCovered(boolean covered) {
        isCovered = covered;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //public void setSensor(Sensor sensor) {
      //  this.sensor = sensor;
    //}

}
