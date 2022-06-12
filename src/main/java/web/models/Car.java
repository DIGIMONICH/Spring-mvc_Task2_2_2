package web.models;


public class Car {

    private int series;
    private String modelName;
    private String color;

    Car() {}

    public Car(int series, String modelName, String color) {
        this.series = series;
        this.modelName = modelName;
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
