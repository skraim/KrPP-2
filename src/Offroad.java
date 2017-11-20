public class Offroad extends Car {
    private String concern;
    private String model;
    private int year;
    private int numOfWheels;
    private boolean needHelm;
    private boolean needBelts;
    private int horsePower;
    private int numOfSits;
    private boolean canTransportPeaple;
    private boolean canTransportPotatos;
    private boolean electroCar;
    private boolean hasRoof;
    private boolean canOffroad;
    private boolean automaticTransmission;

    public Offroad(String concern, String model) {
        super(concern, model);
        this.concern = concern;
        this.model = model;
    }

    @Override
    public void makeVroom() {
        System.out.println("Very loud \"VROOM!\"");
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
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int getNumOfSits() {
        return numOfSits;
    }

    @Override
    public void setNumOfSits(int numOfSits) {
        this.numOfSits = numOfSits;
    }

    @Override
    public boolean isCanTransportPeaple() {
        return canTransportPeaple;
    }

    @Override
    public void setCanTransportPeaple(boolean canTransportPeaple) {
        this.canTransportPeaple = canTransportPeaple;
    }

    @Override
    public boolean isCanTransportPotatos() {
        return canTransportPotatos;
    }

    @Override
    public void setCanTransportPotatos(boolean canTransportPotatos) {
        this.canTransportPotatos = canTransportPotatos;
    }

    @Override
    public boolean isElectroCar() {
        return electroCar;
    }

    @Override
    public void setElectroCar(boolean electroCar) {
        this.electroCar = electroCar;
    }

    @Override
    public boolean isHasRoof() {
        return hasRoof;
    }

    @Override
    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    @Override
    public boolean isCanOffroad() {
        return canOffroad;
    }

    @Override
    public void setCanOffroad(boolean canOffroad) {
        this.canOffroad = canOffroad;
    }

    @Override
    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    @Override
    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }
}
