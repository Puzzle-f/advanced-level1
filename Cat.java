public class Cat implements RunJump, Distinguish{

    int  canRun;
    int canJump;
    public Cat(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public boolean run(int run){
        if (run <= canRun){
            System.out.println("Cat run " + run + " m");
            return true;
        }
        System.out.println("Cat no run " + run + " m");
        return false;
    }
    @Override
    public boolean jump(int jump){
        if (jump <= canJump){
            System.out.println("Cat jump " + jump + " m");
            return true;
        }
        System.out.println("Cat no jump " + jump + " m");
        return false;
    }
    public boolean recognizeAndGo (Object o){   // распознать препятствие и выполнить
        if (o instanceof Woll) {
            return jump(((Woll) o).go());
        } else if (o instanceof Treadmill){
            return  run(((Treadmill) o).go());
        } else {
            System.out.println(" Кот препятствие не распознал ");
        }
        return false;
    }
    }

