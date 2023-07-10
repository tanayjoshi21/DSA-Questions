class Solution {
/*Better approach is first loop in array and find the larest element from array
 * the again loop from in  the array and find secondd largest  element in array
 * timee commplexity  is O(n)+O(n) = O(2n) 
 */

 /* Brute force approach 
  * 1. sort the array then
2. loop from last to start to check is second element is small from last one  eg(1,4,6,7,8,8){after sorting} 
3. check the condtion is array greated
4. time complexity O(nlogn + n) and space complexity O(1)
  */


//best method is this  
// time complexity is O(n)
    int print2largest(int arr[], int n) {
        // code here
        int max =arr[0];
        int smax= arr[1];
        if(smax>max){
            int temp = smax;
            smax= max;
            max= temp;
        }
        for(int i=2;i<arr.length;i++){
            if(smax<arr[i]){
                if(max<arr[i]){
                    int temp =max;
                    max= arr[i];
                    smax= temp;
                }else{
                    smax= arr[i];
                }
            }
        }
        return smax;
    }


}