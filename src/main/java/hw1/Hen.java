package hw1;

public class Hen extends Animal implements Jumpable {
    private final int RUN_LIMIT = 100;
    private final float JUMP_LIMIT = 10f;

    private final int SWIM_LIMIT = 100;
    private int swim_limit;
    private float jump_limit;

    public Hen(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        jump_limit = JUMP_LIMIT;
        swim_limit = SWIM_LIMIT;
    }

    public Hen(String name, int run_limit, float jump_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.swim_limit = swim_limit;
    }

    @Override
    public String voice() {
        return "ко-ко-ко!";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public int getSwimLimit() {
        return swim_limit;
    }


    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }

    @Override
    public float getJumpLimit() {
        return jump_limit;
    }
}