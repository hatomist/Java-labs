import java.time.LocalTime;

class TrainController {      // Controller
    private TrainView view;
    private TrainStorage storage;

    public TrainController(){
        this.storage = new TrainStorage();
        storage.getModelsFromDatabase();
        this.view = new TrainView();
    }

    public void run()
    {
        int option;
        do {
            do {
                option = view.menuPrompt();
            } while(option < 1 || option > 4);

            switch(option) {
                case 1:
                    System.out.print(storage);
                    break;
                case 2:
                    TrainStorage search;
                    search = filterBy4Class(storage.getModels());
                    System.out.print(search);
                    break;
                case 3:
                    String destination = view.destinationPrompt();
                    LocalTime time = view.timePrompt();
                    search = filterByDestTime(destination, time, storage.getModels());
                    System.out.print(search);
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        } while (option != 1);
    }

    public static TrainStorage filterBy4Class(Train[] trains) {
        TrainStorage filtered_trains = new TrainStorage();
        for (Train train : trains) {
            if (train.getSeats4() != 0)
            {
                filtered_trains.add(train);
            }
        }
        return filtered_trains;
    }

    public static TrainStorage filterByDestTime(String destination, LocalTime time, Train[] trains) {
        TrainStorage filtered_trains = new TrainStorage();
        for (Train train : trains) {
            if (train.getDestination().equalsIgnoreCase(destination) && train.getDepartureTime().isAfter(time))
            {
                filtered_trains.add(train);
            }
        }
        return filtered_trains;
    }

}
