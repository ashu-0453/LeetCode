class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
                List<Integer> list=new ArrayList<>();
            for(int i = left ; i<=right ; i++){
                    if(SelfDividing(i)){
                        list.add(i);
                    }
                }

                return list;
                
            }
            
    public boolean SelfDividing(int num){
        int x = num;
        while(num>0){
            
            int rem = num % 10;
            if(rem == 0){
                return false;
            }
            if(x % rem != 0){
                return false;
            }

            num= num/10;
        }

        return true;
    }
    
    
}
