public class Treadmill implements Obstacle{

    int distance;
    public Treadmill(int distance){
        this.distance = distance;
    }
public int go(){
        return distance;
}

}

