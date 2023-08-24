package enums.general_examples;

import java.util.List;


public class Rivian {

    public static final String BASE_URL = "https://rivian.com/";

    public Rivian(String modelName, String storageSpace, String modelRange, String modelHorsePower, List<String> modelDriverModes) {
        this.modelName = modelName;
        this.storageSpace = storageSpace;
        this.modelRange = modelRange;
        this.modelHorsePower = modelHorsePower;
        this.modelDriverModes = modelDriverModes;
    }

    public Rivian() {
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
    }

    public String getModelRange() {
        return modelRange;
    }

    public void setModelRange(String modelRange) {
        this.modelRange = modelRange;
    }

    public String getModelHorsePower() {
        return modelHorsePower;
    }

    public void setModelHorsePower(String modelHorsePower) {
        this.modelHorsePower = modelHorsePower;
    }

    public List<String> getModelDriverModes() {
        return modelDriverModes;
    }

    public void setModelDriverModes(List<String> modelDriverModes) {
        this.modelDriverModes = modelDriverModes;
    }

    @Override
    public String toString() {
        return "Rivian{" +
                "modelName='" + modelName + '\'' +
                ", storageSpace='" + storageSpace + '\'' +
                ", modelRange='" + modelRange + '\'' +
                ", modelHorsePower='" + modelHorsePower + '\'' +
                ", modelDriverModes=" + modelDriverModes +
                '}';
    }

    private String modelName;
    private String storageSpace;
    private String  modelRange;
    private String modelHorsePower;
    private List<String> modelDriverModes;
}
