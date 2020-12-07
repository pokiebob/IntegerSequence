import java.util.NoSuchElementException;

class Range implements IntegerSequence {

	private int start, end, current;

	public Range(int start, int end) {
		if (end < start) {
			throw new IllegalArgumentException(
				"end value " + end + " cannot be less than start value " + start);
		}
		this.start = start;
		this.end = end;
		current = start;
	}

	public void reset() {
		current = start;
	}

	public int length() {
		return end - start + 1;
	}

	public boolean hasNext() {
		return current <= end;
	}

	public int next() {
		if (hasNext()) {
			current++;
			return current - 1;
		} else {
			throw new NoSuchElementException(
				"current value " + current + " cannot exceed end value " + end);
		}
	}

	public static void main(String[] args) {
		IntegerSequence r = new Range(10,20);
	    while(r.hasNext()) {
	      System.out.print(r.next());
	       if( r.hasNext() ) {
	          System.out.print( ", " );
	       }
	    }
	    System.out.println();
	}


}