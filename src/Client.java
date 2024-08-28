public class Client {
    public void run() {
        // Створення фабрики для автомобілів
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        car.move(); // Виклик методу руху для автомобіля

        // Створення фабрики для літаків
        TransportFactory planeFactory = new PlaneFactory();
        Transport plane = planeFactory.createTransport();
        plane.move(); // Виклик методу руху для літака
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
