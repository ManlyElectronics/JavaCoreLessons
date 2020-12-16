package lesson6.homework;

public abstract class Animal {
    int distance;
    int height;
    int runLimit;
    double jumpLimit;
    int swimLimit;
Animal (int runLimit, double jumpLimit, int swimLimit){
this.runLimit = runLimit;
this.jumpLimit = jumpLimit;
this.swimLimit = swimLimit;
}
    public boolean run(int distance){
    if (runLimit > distance){
        System.out.println("животное пробежало расстояние " +distance );
        return true;}
        else System.out.println("животное не может пробежать расстояние " + distance);
        return false;
    };
    public boolean swim(int distance){
        if (swimLimit > distance){
        System.out.println("животное проплыло расстояние " +distance);
        return true;}
        else  System.out.println("животное не может проплыть расстояние " + distance);
        return false;
    };
    public boolean jump(int height){
        if (jumpLimit> height) {
            System.out.println("животное прыгнуло на " + height);
        return true;}
        else System.out.println("животное не может прыгнуть " + height);
        return false;
    };

}
