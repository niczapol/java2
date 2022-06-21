package lesson1;

public class Treadmill implements Obstacle {

    private final int DISTANCE = 100;


    @Override
    public boolean passingAnObstacle(int runLengthLimit) {
        if (DISTANCE <= runLengthLimit) {
            System.out.println("Obstacle passed");
            return true;
        } else {
            System.out.println("Obstacle not passed");
            return false;
        }
    }
}


