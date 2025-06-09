class Solution {
public:
    vector<int> lexicalOrder(int n) {
        vector<int> ans;

        for(int i=1;i<10;i++){
            solveWithDfs(i,n,ans);
        }

        return ans;
    }

    void solveWithDfs(int curr,int n,vector<int>& ans){
        if(curr>n) return;

        ans.push_back(curr);

        for(int i=0;i<=9;i++){
            int newCurr = (10*curr)+i;
            solveWithDfs(newCurr,n,ans);
        }
    }
};