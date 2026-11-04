class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
            ArrayList<Integer>ans=new ArrayList<>();
                int i = 0;
                int j = arr.length - 1;

                while (i < j) {
                    int sum = arr[i] + arr[j];

                    if (sum == target) {
                        ans.add(i+1);
                        ans.add(j+1);
                        return ans;
                        
                    }

                    if (sum < target) {
                        i++;
                    } else {
                        j--;
                    }
                }
                
                ans.add(-1);
                ans.add(-1);
                return ans;
             
            }
        }
