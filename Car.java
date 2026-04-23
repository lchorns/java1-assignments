public class Car {
    private int modelYear;
    private int purchasePrice;
    private int currentValue;

    public void setModelYear(int year) {
        modelYear = year;
    }

    public void setPurchasePrice(int price) {
        purchasePrice = price;
    }

    public void calcCurrentValue(int currentYear) {
        double depreciationRate = .15;
        int age = currentYear - modelYear;

        currentValue = (int)(purchasePrice * Math.pow((1 - depreciationRate), age));
    }

    public void printInfo() {
        System.out.println("Car's information:");
        System.out.println(" Model year: " + modelYear);
        System.out.println(" Purchase price: $" + purchasePrice);
        System.out.println(" Current value: $" + currentValue);
    }
}