// This function finds the maximum profit that can be earned by scheduling a set of jobs.
int maxProfit(vector<Job>& jobs) {
    // Sort the jobs by their end times.
    sort(jobs.begin(), jobs.end(), compare);
    // Create a vector to store the maximum profit that can be earned by scheduling the first `i` jobs.
    vector<int> maxProfit(jobs.size());
    // Initialize the maximum profit for the first job to be its profit.
    maxProfit[0] = jobs[0].profit;
    // Iterate through all the jobs.
    for (int i = 1; i < jobs.size(); i++) {
        // The current profit is the profit of the current job.
        int currProfit = jobs[i].profit;
        // The previous job index is the index of the previous job that ends before the current job starts.
        int prevJobIndex = -1;
