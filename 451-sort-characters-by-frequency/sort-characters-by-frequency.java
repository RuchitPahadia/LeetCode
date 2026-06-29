class Solution {
    public String frequencySort(String s) {
        String[] nums = s.split("");
        HashMap<String, Integer> freq = new HashMap<>();
        for(String i: nums){
            if(freq.containsKey(i)){
                int t = freq.get(i);
                t++;
                freq.put(i,t);
            }
            else{
                freq.put(i,1);
            }
        }
        StringBuilder res = new StringBuilder();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for(int i=0;i<list.size();i++){
            int t = list.get(i).getValue();
            for(int j=0;j<t;j++){
               res.append(list.get(i).getKey());
            }
        }
        return res.toString();
    }
}