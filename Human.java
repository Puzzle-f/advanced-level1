
public class Human implements RunJump, Distinguish{
    int canRun;
    int canJump;

    public Human(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public boolean run(int l) {
        if (l <= canRun) {
            System.out.println("Human run " + l + " m");
            return true;
        }
        System.out.println("Human no run");
        return false;
    }

    @Override
    public boolean jump(int jump) {
        if (jump <= canJump) {
            System.out.println("Human jump " + jump + " m");
            return true;
        }
        System.out.println("Human no jump");
        return false;
    }
    public boolean recognizeAndGo (Object o){   // распознать препятствие и выполнить
        if (o instanceof Woll) {
            return jump(((Woll) o).go());
        } else if (o instanceof Treadmill){
          return  run(((Treadmill) o).go());
        } else {
            System.out.println(" Человек препятствие не распознал ");   // если новое препятствие не добавлено в функцию распознавания
        }
        return false;
    }
}



