package enums.general_examples;

public enum ElectricVehicles {
    RIVIAN_R1S("600"),BMW_I3("600"),NISSAN_LEAF("600"),TESLA_MODEL_3("600"),CHEVROLET_BOLT("600");


    public final String prices;

    ElectricVehicles(String prices){
        this.prices = prices;

    }
}


