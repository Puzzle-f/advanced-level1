public class Robot implements RunJump, Distinguish{

    int  canRun;
    int canJump;
    public Robot(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public boolean run(int run){
        if (run <= canRun){
            System.out.println("Robot run " + run + " m");
            return true;
        }
        System.out.println("Robot no run");
        return false;
    }
    @Override
    public boolean jump(int jump){
        if (jump <= canJump){
            System.out.println("Robot jump " + jump + " m");
            return true;
        }
        System.out.println("Robot no jump");
        return false;
    }
    public boolean recognizeAndGo (Object o){   // распознать препятствие и выполнить
        if (o instanceof Woll) {
            return jump(((Woll) o).go());
        } else if (o instanceof Treadmill){
            return  run(((Treadmill) o).go());
        } else {
            System.out.println(" Робот препятствие не распознал ");
        }
        return false;
    }
}

