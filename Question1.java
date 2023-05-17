import java.util.*;

// class job that holds id ,deadline , profit values 
class Job {
    int id, deadline, profit;
// initialize constructor that holds the values of the class
    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Question1{
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job(1, 4, 20));
        jobs.add(new Job(2, 1, 10));
        jobs.add(new Job(3, 1, 40));
        jobs.add(new Job(4, 1, 30));

        int maxDeadline = 0;
        //for each loop that iterates over the job list
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        // initialize slots array of size max deadline and all it's elements equal zero
        int[] slots = new int[maxDeadline];

    }
}