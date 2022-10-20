public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){}
    public StopWatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public long getStartTime(){
        return startTime;
    }
    public long getStopTime(){
        return endTime;
    }
    public void setStartTime(int startTime){
        this.startTime = startTime;
    }
    public void setEndTime(int endTime){
        this.endTime = endTime;
    }
}
