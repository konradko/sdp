public class CentralLocking implements Product {
    private String name;

    public CentralLocking(String name) {
        this.name = name;
    }

    @Override
    public void produceProduct() {
        System.out.println("Producing " + this.name);
        System.out.print("Modifying product " + this.name + " according to ");
    }

    @Override
    public void assemble() {
        System.out.print("Assembling " + this.name + " for ");
    }

    @Override
    public void printDetails() {
        System.out.println("Product: " + this.name);
    }
}
