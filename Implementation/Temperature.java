public class Temperature {

    private int temperature;

    public Temperature(){
        temperature = (int)(Math.random() *30 -30);
    }

    //** Getters */
    public int getCelsius()
    {
        return (int)(Math.random() *30 -30);
    }

}
