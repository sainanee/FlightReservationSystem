import java.util.ArrayList;

public class Database {
    static ArrayList<Flight> allFlights = new ArrayList<Flight>();
    static ArrayList<Passenger> allPassengers = new ArrayList<Passenger>();
    public static void initDatabase(int n, int p) {
        for(int i = 0; i < p; i++) {
            allPassengers.add(new Passenger(i));
        }
        for (int i = 0; i < n; i++) {
            allFlights.add(new Flight(5, i));
        }
    }
    public static Passenger getPassenger(int pid) {
        return allPassengers.get(pid);
    }
}