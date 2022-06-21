package lesson1;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human();
        participants[1] = new Robot();
        participants[2] = new Cat();

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Wall();
        obstacles[1] = new Treadmill();

        for (Participant participant :
                participants) {

            participant.jump();
            if (obstacles[0].passingAnObstacle(participant.getJumpHeightLimit())) {
                participant.run();
                obstacles[1].passingAnObstacle(participant.getRunLengthLimit());
            }
        }
    }
}

