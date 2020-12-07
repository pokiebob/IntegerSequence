import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
	int currentIndex;
	int[] data;

	public ArraySequence(int[] other) {
		data = other;
		currentIndex = 0;
	}

	public boolean hasNext() {
		return currentIndex <= length();
	}

	//does the sequence have more elements?
	public int next() {
		if (hasNext()) {
			currentIndex++;
			return currentIndex - 1;
		} else {
			throw new NoSuchElementException(
				"currentIndex " + currentIndnex + " cannot exceed ArraySequence length " + length());
		}

	}       
	//return the current value in the sequence and advances to the next element.
	public int length() {
		return data.length;
	}     
	//returns the total length of the sequence
	public void reset() {
		currentIndex = 0;
	}     
	//start over from the start of the sequence

	public static void main(String[] args) {

	}
}