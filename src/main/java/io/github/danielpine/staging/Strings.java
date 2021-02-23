package io.github.danielpine.staging;

public class Strings {
    public static String gen(String s, int count) {
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    builder.append(s);
	}
	return builder.toString();
    }
}
