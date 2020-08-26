public class Woll implements Obstacle{
    int height;

    public Woll(int height) {
        this.height = height;
    }
    public int go(){
        return height;
    }

}
