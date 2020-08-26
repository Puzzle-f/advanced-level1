public class Main {

    public static void main(String[] args) {

        Distinguish[] distinguishes = {
        new Cat(50, 2),
        new Robot(10, 0),
        new Human(15, 3),
        new Cat(500, 3),
        new Robot(200, 5),
        new Human(100, 5)
        };

        Obstacle[] obstacles = {
                new Woll(1),
                new Treadmill(100),
                new Woll(2),
                new Treadmill(500)
        };

        for (Distinguish d : distinguishes) {
            for (Obstacle o : obstacles) {
                if (!d.recognizeAndGo(o)) {
                    break;
                }
                }

            }
        }

        public static void go(Obstacle o, RunJump r){
        r.jump(o.go());
        }
    }

