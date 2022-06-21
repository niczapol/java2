package lesson1;

public class Cat implements Participant {

    private final int JUMP_HEIGHT_LIMIT = 6;
    private final int RUN_LENGTH_LIMIT = 150;


    @Override
    public void jump() {
        System.out.println("Cat jumped " + JUMP_HEIGHT_LIMIT + " meters");
    }

    @Override
    public void run() {
        System.out.println("Cat ran " + RUN_LENGTH_LIMIT + " meters");
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
