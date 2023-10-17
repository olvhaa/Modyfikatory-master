package pl.gornik;

public class Product {
    String name;
    String category;
    private double price;
    private double weightOrCapacity;
    private String unitOfMeasure;

    public Product(String name, String category, double price, double weightOrCapacity, String unitOfMeasure) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.weightOrCapacity = weightOrCapacity;
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeightOrCapacity(double weightOrCapacity) {
        this.weightOrCapacity = weightOrCapacity;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void pricePerUnit() {
        double pricePerUnit = price / weightOrCapacity;
        System.out.println("Cena " + name + " wynosi" + pricePerUnit + " zl/" + unitOfMeasure);
    }
//        double result = 0;
//        switch (unitOfMeasure) {
//            case "l" -> {
//
//            }
//            case "kg" -> {
//
//            }
//         default -> {
//
//
// }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getWeightOrCapacity() {
        return weightOrCapacity;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", weightOrCapacity=" + weightOrCapacity +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                '}';
    }
}


//    TODO pola klasy zrób prywatne

//    TODO zrób konstruktor

//    TODO stwórz metodę obliczającą cenę jednostkową (np ..zł/kg, ..zł/l, itp)

//    TODO utwórz metodę toString()