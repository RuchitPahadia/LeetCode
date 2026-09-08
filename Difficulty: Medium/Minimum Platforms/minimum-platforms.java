class Solution {
	public int minPlatform(int arr[], int dep[]) {
		//  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
		int platforms = 1;
		int i = 1;
		int j = 0;
		int res = 1;
		while (i<arr.length && j<dep.length) {
			if (arr[i] <= dep[j]) {
				platforms++;
				i++;
			}
			else {
				platforms--;
				j++;
			}
			res = Math.max(res, platforms);
			
		}
		return res;
	}
}
