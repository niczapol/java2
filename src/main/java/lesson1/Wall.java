package lesson1;

public class Wall implements Obstacle {

    private final int WALL_HEIGHT = 4;


    @Override
    public boolean passingAnObstacle(int jumpHeightLimit) {
        if (WALL_HEIGHT < jumpHeightLimit) {
            System.out.println("Obstacle passed");
            return true;
        } else {
            System.out.println("Obstacle not passed");
            return false;
        }
    }
}
