package lesson1;

public class Human implements Participant {

    private final int JUMP_HEIGHT_LIMIT = 5;
    private static final int RUN_LENGTH_LIMIT = 100;


    @Override
    public void jump() {
        System.out.println("Human jumped " + JUMP_HEIGHT_LIMIT + " meters");
    }

    @Override
    public void run() {
        System.out.println("Human ran " + RUN_LENGTH_LIMIT + " meters");
    }

    @Override
    public int getJumpHeightLimit() {
        return JUMP_HEIGHT_LIMIT;
    }

    @Override
    public int getRunLengthLimit() {
        return RUN_LENGTH_LIMIT;
    }

    public static int ggetRunLengthLimit() {
        return RUN_LENGTH_LIMIT;
    }
}
