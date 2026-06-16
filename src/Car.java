public class Car {
    int id;
    double price;
    Engine engine;
    Tyres[] tyres;

    public Car(int id, double price, Engine engine) {
        this.id = id;
        this.price = price;
        this.engine = engine;

        tyres = new Tyres[4];
        for (int i = 0; i < tyres.length; i++) {
            tyres[i] = new Tyres("MRF");
        }
    }
}
