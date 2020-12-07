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
		return current < end;
	}

	

}