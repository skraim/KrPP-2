public class Bicycle extends Transport {
    private boolean needHelm = true;
    private boolean needBelts = false;
    private String concern;
    private String model;
    private int year;
    private int numOfWheels = 2;
    private int horsePower;

    public Bicycle(String concern, String model) {
        super(concern, model);
        this.concern = concern;
        this.model = model;
    }

    @Override
    public boolean isNeedHelm() {
        return needHelm;
    }

    @Override
    public void setNeedHelm(boolean needHelm) {
        this.needHelm = needHelm;
    }

    @Override
    public boolean isNeedBelts() {
        return needBelts;
    }

    @Override
    public void setNeedBelts(boolean needBelts) {
        this.needBelts = needBelts;
    }

    @Override
    public String getConcern() {
        return concern;
    }

    @Override
    public void setConcern(String concern) {
        this.concern = concern;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getNumOfWheels() {
        return numOfWheels;
    }

    @Override
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    @Override
    public void makeVroom() {
        System.out.println("Can't make \"VROOM\" T_T");
    }
}
