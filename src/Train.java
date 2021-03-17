import java.time.LocalTime;

class Train {        // Model
    private int number;
    private final LocalTime departureTime;
    private final String departure;
    private final String destination;
    private final int[] seats = new int[4];  // 0 - СВ, 1 - купе, 2 - плацкарт, 3 - общие

    Train(int number, LocalTime departureTime, String departure, String destination,
          int seats1, int seats2, int seats3, int seats4) {
        this.number = number;
        this.departureTime = departureTime;
        this.departure = departure;
        this.destination = destination;
        this.seats[0] = seats1;
        this.seats[1] = seats2;
        this.seats[2] = seats3;
        this.seats[3] = seats4;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getSeats1() {
        return seats[0];
    }

    public Integer getSeats2() {
        return seats[1];
    }

    public Integer getSeats3() {
        return seats[2];
    }

    public Integer getSeats4() {
        return seats[3];
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-15s %-15s %4d %4d %4d %4d %n", getNumber(), getDepartureTime().toString(),
                getDeparture(), getDestination(), getSeats1(), getSeats2(), getSeats3(), getSeats4());
    }
}
