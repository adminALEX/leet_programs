class RandomizedSet {
    List<Integer> l;
    public RandomizedSet() {
        this.l = new ArrayList<Integer>();
    }
    
    public Boolean insert(int val) {
        if(l.isEmpty()){
          l.add(val);
            
          return true;
        } 
        if(!l.contains(val)) {
            l.add(val);
            return true;
        }
       
        return false;
        }
        
    
    public Boolean remove(int val) {
        if(l.isEmpty())
            return false;
        if(l.contains(val))
        {
            l.remove(l.indexOf(val));
            return true;
        }
            return false;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomIndex;
        if(!l.isEmpty())
        {randomIndex = rand.nextInt(l.size());
         return l.get(randomIndex);}
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */