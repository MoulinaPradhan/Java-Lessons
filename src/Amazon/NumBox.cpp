// Q1.
// You are an amazon delivery and you have some boxes that you have to deliver, but there are some conditions -

// You can take 2 boxes of same weight in one round
// you can take 3 boxes of same weight in one round
// You have to find the minimum number of rounds to deliver the boxes or -1 if it is not possible to deliver them.

// Example cases -
// Input: boxes - [2, 2, 3, 3, 2, 4, 4, 4, 4, 4]
// Output: 4
// Explanation: 3 boxes of weight 2 in 1st round, 2 boxes of weight 3 in 2nd round, 3 boxes of wt 4 in 3rd and 2 boxes of wt 4 in 4th round.

// Input: boxes - [2, 3, 3]
// Output: -1
// Explanation: There is only one box with weight 2 and we can only take either 2 or 3 boxes in one round not lesser.

// My Approach:

// Make a Counter of frequency of weights

// If there is any weight with frequency 1 return -1

// otherwise iterate through all frequencies and calculate minimum number of rounds for that frequency.

// this is similar to minimum number of coins to change the particular value where coins are 2 and 3
// Let f is the maximum of frequency of any weight and there are c unique weights then
// Time Complexity: O(max(f, c))
// Space Complexity: O(f)

// Minimum number of rounds can be calculated directly in O(1) because we can convert all the numbers as a sum of 2 and 3. (this came to my mind after submitting the test, I solved this using coin change method using DP)



unordered_map<int,int>mymap;
for(int i=0;i<nums.size();i++){
mymap[nums[i]]++;
}
int ans=0;
for(auto it:mymap)
{
if(it.second==1){
return -1;
}
else if(it.second%3==0){
  ans+=it.second/3;
}
else
{
ans+=it.second/3 +1;
}
}
return ans;
}
