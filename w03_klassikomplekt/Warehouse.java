import java.util.List;

public class Warehouse {
    
    private int area; //ruutmeetrit
    private int height; //meetrit 
    private int warehouseVolume;
    private List<Fridge> fridgeLst;
    private int freeSpace;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area * 10000; //teisendmine cm
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height * 100; //teisendamine cm
    }

    public int getWarehouseVolume() {
        return this.area * this.height;
    }

    public void setWarehouseVolume(int warehouseVolume) {
        this.warehouseVolume = warehouseVolume;
    }

    public List<Fridge> getFridgeLst() {
        return fridgeLst;
    }

    public void addFridge(Fridge fridge) {

        if (((fridge.getTypeOfFridges() * fridge.getArea()) < this.freeSpace)) {
            System.out.println("Lisasti külmik: " + fridge.getName());
            this.freeSpace = this.freeSpace - (fridge.getCapacity() * fridge.getTypeOfFridges());
            this.fridgeLst.add(fridge);
        }else{
            System.out.println("Laos pole enam ruumi");
        }
    }


    public Warehouse(int area, int height, List<Fridge> fridgeLst) {
        this.area = area * 10000;
        this.height = height * 100;
        this.fridgeLst = fridgeLst;
        this.freeSpace = this.area * this.height;
    }

    public void setFridgeLst(List<Fridge> fridgeLst) {
        this.fridgeLst = fridgeLst;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }
    
}
