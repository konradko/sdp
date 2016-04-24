public abstract class Car {
    protected Product product;

    protected Car(Product product) {
        this.product = product;
    }

    public abstract void produceProduct();

    public abstract void assemble();

    public abstract void printDetails();
}
