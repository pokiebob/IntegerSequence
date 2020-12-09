import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
	int currentIndex;
	int[] data;

	public ArraySequence(int[] other) {
		data = other;
		currentIndex = 0;
	}

	public ArraySequence(IntegerSequence otherSeq) {
		data = new int[otherSeq.length()];
		for (int i = 0; i < otherSeq.length(); i++) {
			data[i] = otherSeq.next();
		}
		otherSeq.reset();
	}


	public boolean hasNext() {
		return currentIndex < length();
	}

	//does the sequence have more elements?
	public int next() {
		if (hasNext()) {
			currentIndex++;
			return data[currentIndex - 1];
		} else {
			throw new NoSuchElementException(
				"currentIndex " + currentIndex + " cannot exceed ArraySequence length " + length());
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
		int[]nums = {1,3,5,0,-1,3,9};
	    IntegerSequence as = new ArraySequence(nums);

	    System.out.println("ArraySequence(array):");
	    while(as.hasNext()){
	      System.out.print(as.next()+", ");
	    }
	    System.out.println();

	    IntegerSequence r = new Range(10,20);
	    IntegerSequence as2 = new ArraySequence(r);
	   
	    System.out.println("ArraySequence(seq):");
	    while(as2.hasNext()){
	      System.out.print(as2.next()+", ");
	    }
	    System.out.println();
		}
}