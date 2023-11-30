public class BottleOfWater extends Product{
    private int volume;
    public BottleOfWater(String name, int cost, int volue) {
        super(name, cost);
        this.volume = volue;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";volume=" + volume +
                '}';
    }
}
