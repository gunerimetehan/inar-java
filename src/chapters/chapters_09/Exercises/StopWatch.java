package chapters.chapters_09.Exercises;

public class StopWatch {
    //Datafields
    private long startTime;
    private long endTime;

    //no arg constructer
    StopWatch(){
        this.startTime=System.currentTimeMillis();
    }
    public void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){ //better to use getters
        return getEndTime()-getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
