package Java.ControlWork;

public class Laptop {
    private String brand;
    private Integer randomAccessMemory;
    private Integer hardDiskDrive;
    private String operatSystem;
    private String colour;
    private Integer price;
    private Integer stock;

    public Laptop(String brand, Integer randomAccessMemory, Integer hardDiskDrive, String operatSystem, String colour,
            Integer price, Integer stock) {
        this.brand = brand;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        this.operatSystem = operatSystem;
        this.colour = colour;
        this.price = price;
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public Integer getHardDiskDrive() {
        return hardDiskDrive;
    }

    public String getOperatSystem() {
        return operatSystem;
    }

    public String getColour() {
        return colour;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer changePrice(int price) {
        return price;
    }

    public Integer changeStock(int stock) {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        String result = "Бренд  " + brand + "\n" + "ОЗУ " + randomAccessMemory + "\n" + "Объем ЖД " + hardDiskDrive
                + "\n" +
                "Операционная система " + operatSystem + "\n" + "Цвет " + colour + "\n" + "Цена " + price + "\n"
                + "Остаток " + stock;
        return result;
    }
}