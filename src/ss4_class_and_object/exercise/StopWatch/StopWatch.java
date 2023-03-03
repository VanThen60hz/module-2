package ss4_class_and_object.exercise.StopWatch;

public class StopWatch {
    private long StartTime;
    private long EndTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.StartTime = startTime;
        this.EndTime = endTime;
    }

    public long getStartTime() {
        return StartTime;
    }

    public void setStartTime(long startTime) {
        StartTime = startTime;
    }

    public long getEndTime() {
        return EndTime;
    }

    public void setEndTime(long endTime) {
        EndTime = endTime;
    }

    public void start(){
        StartTime = System.currentTimeMillis();
    }

    public void stop(){
        EndTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return EndTime - StartTime;
    }
}
