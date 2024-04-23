package homework27;

import java.util.ArrayList;

public class MovieSet {
    public static void main(String[] args) {
        ArrayList<FilmStudioEmployee> filmStudioEmployees = new ArrayList<>();
        Director director = new Director("Löwe","Direktor", 10);
        SoundEngineer soundEngineer = new SoundEngineer("Lakes", "Sound Engineer", 6);
        CameraOperator cameraOperator = new CameraOperator("Maximilan", "Kameraman", 15);
        FinancialDirector financialDirector = new FinancialDirector("Johnson", "Financial Director", 5);
        filmStudioEmployees.add(director);
        filmStudioEmployees.add(soundEngineer);
        filmStudioEmployees.add(cameraOperator);
        filmStudioEmployees.add(financialDirector);

        for(final FilmStudioEmployee filmStudioEmployee : filmStudioEmployees) {
            filmStudioEmployee.work();
        }

    }
}
