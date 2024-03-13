package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class HouseholdWasteModel implements GINFO {

    private int totalField, curPoint;
    private double curLoad, totalTime;
    private ArrayList workLogs = new ArrayList();
    private GarbagePoint[] gps = new GarbagePoint[0];

    public HouseholdWasteModel() {
    }

    public int getTotalField() {
        return totalField;
    }

    public void setTotalField(int totalField) {
        this.totalField = totalField;
    }

    public int getCurPoint() {
        return curPoint;
    }

    public void setCurPoint(int curPoint) {
        this.curPoint = curPoint;
    }

    public double getCurLoad() {
        return curLoad;
    }

    public void setCurLoad(double curLoad) {
        this.curLoad = curLoad;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public ArrayList getWorkLogs() {
        return workLogs;
    }

    public void setWorkLogs(ArrayList workLogs) {
        this.workLogs = workLogs;
    }

    public GarbagePoint[] getGps() {
        return gps;
    }

    public void setGps(GarbagePoint[] gps) {
        this.gps = gps;
    }

    public boolean checkAddGarbagePoint(String input) {
        try {
            int value = Integer.parseInt(input);
            if (value <= 0 || value > MAXLOAD) {
                throw new RuntimeException("Amount of garbage must be greater than 0 and less than " + MAXLOAD);
            } else {
                gps = Arrays.copyOf(gps, gps.length + 1);
                gps[gps.length - 1] = new GarbagePoint(gps.length, value, "Address " + gps.length);
                return true;
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Amount of garbage must be the number");
        }
    }

    public void start() {
        curPoint = 0;
        totalField = 0;
        totalTime = 0;
        workLogs.clear();
        workLogs.add("Start at " + LocalDateTime.now());
        goNext();
    }

    public void goNext() {
        if (curLoad + gps[curPoint].getgLoad() <= MAXLOAD) {
            curLoad += gps[curPoint].getgLoad();
            totalTime += AVG_TIME;
            workLogs.add("Collect at point " + (curPoint + 1) + " in " + (gps[curPoint].getAddr()) + " on " + LocalDateTime.now());
            curPoint++;
            if (curPoint == gps.length) {
                if (curLoad > 0) {
                    goField();
                    goHome();
                } else {
                    goHome();
                }
            }
        } else {
            goField();
            curLoad = gps[curPoint].getgLoad();
            totalTime += AVG_TIME;
            workLogs.add("Collect at point " + (curPoint + 1) + " in " + (gps[curPoint].getAddr()) + " on " + LocalDateTime.now());
            curPoint++;
            if (curPoint == gps.length) {
                if (curLoad > 0) {
                    goField();
                    goHome();
                } else {
                    goHome();
                }
            }
        }
        if (curPoint < gps.length) {
            goNext();
        }
    }

    public void goField() {
        totalTime += AVG_TDUMP;
        totalField++;
        workLogs.add("Go to field  after " + (curPoint) + " on " + LocalDateTime.now());
    }

    public void goHome() {
        workLogs.add("End at " + LocalDateTime.now());
//        for (int i = 0; i < workLogs.size(); i++) {
//        System.out.println(workLogs.get(i));
//        }
//        DecimalFormat df = new DecimalFormat("#.###");
//        System.out.println("Money: " + df.format((totalField * getFEE() + (totalTime * getSALARY()) / 60))+"đ");
    }
    
    public double getTotal(){
        return totalField*COSTDUMP + ((totalTime * SALARY) / 60);
    }
}
