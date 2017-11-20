import java.util.Comparator;

public abstract class Transport implements Comparable{
    private String concern;
    private String model;
    private int year;
    private int numOfWheels;
    private int numOfSits;
    private boolean needHelm;
    private boolean needBelts;
    private boolean hasRoof;
    private int horsePower;

    public int getNumOfSits() {
        return numOfSits;
    }

    public void setNumOfSits(int numOfSits) {
        this.numOfSits = numOfSits;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    Transport(String concern, String model) {
        this.concern = concern;
        this.model = model;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public boolean isNeedHelm() {
        return needHelm;
    }

    public void setNeedHelm(boolean needHelm) {
        this.needHelm = needHelm;
    }

    public boolean isNeedBelts() {
        return needBelts;
    }

    public void setNeedBelts(boolean needBelts) {
        this.needBelts = needBelts;
    }

    public String toString() {
        String res;
        res = concern + " " + model + "(" + this.getYear() + ")\nHorse power = " + this.getHorsePower();
        return res;
    }

    public abstract  void makeVroom();

    public int compareTo(Object o) {
        int horsePower = ((Transport)o).getHorsePower();
        if (horsePower == this.getHorsePower())
            return 0;
        else
            return (horsePower < this.getHorsePower()) ? 1 : -1;
    }
}
