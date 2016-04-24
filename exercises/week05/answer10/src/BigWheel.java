public class BigWheel extends Car {
    private String name;

    public BigWheel(Product product, String name) {
        super(product);
        this.name = name;
    }

    @Override
    public void produceProduct() {
        product.produceProduct();
        System.out.println(this.name);
    }

    @Override
    public void assemble() {
        product.assemble();
        System.out.println(this.name);
    }

    @Override
    public void printDetails() {
        System.out.print("Car: " + this.name + ", ");
        product.printDetails();
    }
}
