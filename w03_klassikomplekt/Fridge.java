public class Fridge {

    
    private String name;
    private int height; //cm
    private int width; //cm
    private int depth; //cm
    private int weight; //kg
    private int area;
    private int capacity; //Kuupsentimetrit;
    private boolean canbestacked;
    private int TypeOfFridges;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width ;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getArea() {
        return this.depth * this.width;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCapacity() {
        return this.depth * this.width * this.height;
    }  

    public boolean isCanbestacked() {
        return canbestacked;
    }

    public void setCanbestacked(boolean canbestacked) {
        this.canbestacked = canbestacked;
    }

    public int getTypeOfFridges() {
        return TypeOfFridges;
    }

    public void setTypeOfFridges(int typeOfFridges) {
        TypeOfFridges = typeOfFridges;
    }

    public Fridge(String name, int height, int width, int depth, int weight, boolean canbestacked, int typeOfFridges) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        this.canbestacked = canbestacked;
        TypeOfFridges = typeOfFridges;
    }
    
}
