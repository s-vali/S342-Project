public class Location
{
    private boolean isCovered;
    private String location;
    private Sensor sensor;

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

    public boolean isCovered() {
        return isCovered;
    }

    public void setCovered(boolean covered) {
        isCovered = covered;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public String getLocation() {
        return location;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

}
