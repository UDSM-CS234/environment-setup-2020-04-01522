public class Position {

    public static void main(String[] args){
        double g=-9.81;
        double t=10;
        double vi=0.0;
        double xi=0.0;
        double x;
        x=(0.5*((g*t*t))+(vi*t)+(xi));
        System.out.println( x +"m");
    }
}