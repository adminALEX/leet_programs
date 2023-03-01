// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> i = null;
    Integer next;
	public PeekingIterator(Iterator<Integer> iterator) {
	    i=iterator;
        if(i.hasNext()) next = i.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
       return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer current = peek();
	    if(i.hasNext())
            next = i.next();
        else
            next=null;
        return current;
	}
	
	@Override
	public boolean hasNext() {
	    return next!=null || i.hasNext();
	}
}