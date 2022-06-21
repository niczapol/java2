package lesson1;

public class Robot implements Participant {

    private final int JUMP_HEIGHT_LIMIT = 3;
    private final int RUN_LENGTH_LIMIT = 80;


    @Override
    public void jump() {
        System.out.println("Robot jumped " + JUMP_HEIGHT_LIMIT + " meters");
    }

    @Override
    public void run() {
        System.out.println("Robot ran " + RUN_LENGTH_LIMIT + " meters");
    }

    @Override
    public int getJumpHeightLimit() {
        return JUMP_HEIGHT_LIMIT;
    }

    @Override
    public int getRunLengthLimit() {
        return RUN_LENGTH_LIMIT;
    }
}
