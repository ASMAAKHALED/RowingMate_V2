package info.android.rowing.activity;

/**
 * Created by hp on 19/04/2017.
 */

public class RowerData {
    private double strokeRate;
    private double speed;
    private int angle;
    private float distance;
    private  String time;
    private  String name;

    public RowerData( String name ,double strokeRate,double speed, int angle,float distance,String time) {
        this.name=name;
        this.strokeRate = strokeRate;
        this.speed = speed;
        this.angle = angle;
        this.distance=distance;
        this.time=time;    }

    public void setStrokeRate(double strokeRate) {
        this.strokeRate = strokeRate;
    }

    public double getStrokeRate() {
        return strokeRate;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
