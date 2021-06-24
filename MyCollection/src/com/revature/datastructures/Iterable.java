package com.revature.datastructures;

import java.util.Objects;
import java.util.function.Consumer;

public interface Iterable<T> {
	
	Iterator<T> iterator();
	
}