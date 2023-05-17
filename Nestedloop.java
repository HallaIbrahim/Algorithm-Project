import java.util.*;

// class job that holds id ,deadline , profit values

// initialize slots array of size max deadline and all it's elements equal zero
int[]slots=new int[maxDeadline];

// Sort jobs in decreasing order of profit in lambda expression by subtracting
// adjacent elements a from b
jobs.sort((a,b)->b.profit-a.profit);
int numJobs=0,totalProfit=0;

for(Job job:jobs){
// Find the first available slot starting from the last job's deadline
for(int i=job.deadline-1;i>=0;i--){
  if(slots[i]==0){
    slots[i]=1;
    numJobs++;
    totalProfit+=job.profit;
    break;
  }

}
}

System.out.println("Number of jobs done: "+numJobs);
System.out.println("Maximum profit: "+totalProfit);
}
}
