public abstract class Car extends Transport {
    private String concern;
    private String model;
    private int year;
    private int numOfWheels = 4;
    private boolean needHelm = false;
    private boolean needBelts = true;
    private int horsePower;
    private int numOfSits;
    private boolean canTransportPeaple;
    private boolean canTransportPotatos;
    private boolean electroCar;
    private boolean hasRoof;
    private boolean canOffroad;
    private boolean automaticTransmission;

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public boolean isCanOffroad() {
        return canOffroad;
    }

    Car(String concern, String model) {
        super(concern, model);
        this.concern = concern;
        this.model = model;
    }

    public void setCanOffroad(boolean canMoceOffroad) {
        this.canOffroad = canMoceOffroad;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
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

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumOfSits() {
        return numOfSits;
    }

    public void setNumOfSits(int numOfSits) {
        this.numOfSits = numOfSits;
    }

    public boolean isCanTransportPeaple() {
        return canTransportPeaple;
    }

    public void setCanTransportPeaple(boolean canTransportPeaple) {
        this.canTransportPeaple = canTransportPeaple;
    }

    public boolean isCanTransportPotatos() {
        return canTransportPotatos;
    }

    public void setCanTransportPotatos(boolean canTransportPotatos) {
        this.canTransportPotatos = canTransportPotatos;
    }

    public boolean isElectroCar() {
        return electroCar;
    }

    public void setElectroCar(boolean electroCar) {
        this.electroCar = electroCar;
    }

    public abstract void makeVroom();
}
