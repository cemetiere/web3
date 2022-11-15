package beans;

import jakarta.persistence.*;
import java.io.Serializable;



@Entity(name="results")
@Table(name="results", schema = "public")
public class Result implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private double x;
    private double y;
    private double r;
    private String currentTime;
    private String executionTime;
    private boolean hitFact;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public boolean isHitFact() {
        return hitFact;
    }

    public void setHitFact(boolean hitFact) {
        this.hitFact = hitFact;
    }

}