package Builder;

public class House {
    private String color;
    private int nooFDoors;
    private int noOfWindows;
    private String floorType;
    private boolean garagePresent;
    private boolean poolPresent;

    private House(String color, int nooFDoors, int noOfWindows, String floorType, boolean garagePresent, boolean poolPresent) {
        this.color = color;
        this.nooFDoors = nooFDoors;
        this.noOfWindows = noOfWindows;
        this.floorType = floorType;
        this.garagePresent = garagePresent;
        this.poolPresent = poolPresent;
    }

    private House(HouseBuidler builder){
        //if any validation logic

        this.color = builder.getColor();
        this.nooFDoors = builder.getNooFDoors();
        this.noOfWindows =builder.getNoOfWindows();
        this.floorType = builder.getFloorType();
        this.garagePresent =builder.isGaragePresent();
        this.poolPresent =builder.isPoolPresent();
    }

    public String getColor() {
        return color;
    }

    public int getNooFDoors() {
        return nooFDoors;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public String getFloorType() {
        return floorType;
    }

    public boolean isGaragePresent() {
        return garagePresent;
    }

    public boolean isPoolPresent() {
        return poolPresent;
    }

    public static class HouseBuidler{
        private String color;
        private int nooFDoors;
        private int noOfWindows;
        private String floorType;
        private boolean garagePresent;
        private boolean poolPresent;

        public String getColor() {
            return color;
        }

        public int getNooFDoors() {
            return nooFDoors;
        }

        public int getNoOfWindows() {
            return noOfWindows;
        }

        public String getFloorType() {
            return floorType;
        }

        public boolean isGaragePresent() {
            return garagePresent;
        }

        public boolean isPoolPresent() {
            return poolPresent;
        }

        public HouseBuidler setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseBuidler setNooFDoors(int nooFDoors) {
            this.nooFDoors = nooFDoors;
            return this;
        }

        public HouseBuidler setNoOfWindows(int noOfWindows) {
            this.noOfWindows = noOfWindows;
            return this;

        }

        public HouseBuidler setFloorType(String floorType) {
            this.floorType = floorType;
            return this;

        }

        public HouseBuidler setGaragePresent(boolean garagePresent) {
            this.garagePresent = garagePresent;
            return this;

        }

        public HouseBuidler setPoolPresent(boolean poolPresent) {
            this.poolPresent = poolPresent;
            return this;

        }

        public House build(){
            return new House(this);
        }
    }

    public static HouseBuidler getBuilder(){
        return new HouseBuidler();
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", nooFDoors=" + nooFDoors +
                ", noOfWindows=" + noOfWindows +
                ", floorType='" + floorType + '\'' +
                ", garagePresent=" + garagePresent +
                ", poolPresent=" + poolPresent +
                '}';
    }
}
