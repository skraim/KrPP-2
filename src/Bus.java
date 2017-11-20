public class Bus extends Car {
    private String concern;
    private String model;
    private int year;
    private int numOfWheels = 4;
    private boolean needHelm = false;
    private boolean needBelts = false;
    private int horsePower;
    private int numOfSits;
    private boolean canTransportPeaple = true;
    private boolean canTransportPotatos = false;
    private boolean electroCar;
    private boolean hasRoof = true;
    private boolean canOffroad = false;
    private boolean automaticTransmission = false;

    public Bus(String concern, String model) {
        super(concern, model);
        this.concern = concern;
        this.model = model;
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

    public boolean isCanOffroad() {
        return canOffroad;
    }

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

    @Override
    public void makeVroom() {
        System.out.println("No one can hear this \"VROOM!\" because everyone are deaf now.");
    }
}
