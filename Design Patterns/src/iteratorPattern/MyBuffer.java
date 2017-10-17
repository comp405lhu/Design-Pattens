package iteratorPattern;

import java.util.Iterator;

public class MyBuffer<E> implements Iterable<E> {

	private final E[] buffer;
	private int index = 0;
	
	public MyBuffer(E[] array) {
		buffer = array;
	}
	
	@Override
	public Iterator iterator() {
		Iterator<E> iter = new Iterator<E>() {

			@Override
			public boolean hasNext() {
				return index < buffer.length;
			}

			@Override
			public E next() {
				return buffer[index++];
			}
			
			
		};
		return iter;
	}

}
