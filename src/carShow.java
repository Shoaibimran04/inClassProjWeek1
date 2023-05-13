public class carShow {
    private String make;
    private String model;
    private int year;

    public carShow(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            throw new IllegalArgumentException("Make cannot be empty");
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2023) {
            throw new IllegalArgumentException("Year must be between 1900 and 2023");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

