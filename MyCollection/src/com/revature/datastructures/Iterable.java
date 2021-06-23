package com.revature.datastructures;

import java.util.Iterator;
import java.util.function.Consumer;

public interface Iterable<T> {
	
	void forEach(Consumer<? super T> action);
	
	Iterator<T> iterator();
	
}
