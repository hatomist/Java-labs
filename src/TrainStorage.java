import java.time.LocalTime;
import java.util.Arrays;

class TrainStorage {
    private Train[] models;

    TrainStorage() {
        models = new Train[0];
    }

    void getModelsFromDatabase() {
        models = new Train[10];
        models[0] = new Train(15, LocalTime.of(1, 18), "Рахов",
          "Харьков", 20, 70, 80, 0);
        models[1] = new Train(16, LocalTime.of(4, 35), "Харьков",
          "Львов", 0, 0, 80, 60);
        models[2] = new Train(17, LocalTime.of(1, 52), "Лубны",
          "Батево", 0, 60, 120, 30);
        models[3] = new Train(24, LocalTime.of(1, 6), "Москва",
          "Одесса", 30, 80, 120, 0);
        models[4] = new Train(74, LocalTime.of(19, 47), "Москва",
          "Львов", 25, 60, 45, 0);
        models[5] = new Train(94, LocalTime.of(2, 35), "Казатин",
          "Чернигов", 0, 0, 40, 80);
        models[6] = new Train(138, LocalTime.of(1, 18), "Чугуев",
          "Гнивань", 0, 0, 50, 50);
        models[7] = new Train(144, LocalTime.of(20, 19), "Волочиск",
          "Кременчуг", 20, 60, 60, 0);
        models[8] = new Train(779, LocalTime.of(10, 9), "Винница",
          "Путивль", 0, 0, 40, 60);
        models[9] = new Train(780, LocalTime.of(17, 9), "Путивль",
                "Винница", 0, 30, 30, 0);
    }

    void add(Train train) {
        models = Arrays.copyOf(models, models.length + 1);
        models[models.length - 1] = train;
    }

    Train[] getModels() {
        return models;
    }

    int len() {
        return models.length;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("-".repeat(75))
                .append('\n')
                .append("№").append(" ".repeat(5))
                .append("Время отпр.").append(" ".repeat(5))
                .append("Пункт отпр.").append(" ".repeat(5))
                .append("Пункт назн.").append(" ".repeat(7))
                .append("1кл").append(" ".repeat(2))
                .append("2кл").append(" ".repeat(2))
                .append("3кл").append(" ".repeat(2))
                .append("4кл")
                .append("\n")
                .append("-".repeat(75))
                .append('\n');

        for (Train train: models)
        {
            ret.append(train.toString());
        }

        ret.append('\n');
        return ret.toString();
    }
}
