package io.github.danielpine.staging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Table {
    List<String> headers;
    List<List<String>> rows;

    public Table put(List<String> cols) {
	this.rows.add(cols);
	return this;
    }

    public Table put(String... cols) {
	this.rows.add(Arrays.asList(cols));
	return this;
    }

    public List<String> getHeaders() {
	return headers;
    }

    protected void setHeaders(List<String> headers) {
	this.headers = headers;
    }

    public List<List<String>> getRows() {
	return rows;
    }

    protected void setRows(List<List<String>> rows) {
	this.rows = rows;
    }

    public List<Integer> computeMaxColumnLength() {
	List<Integer> record = new ArrayList<Integer>(4);
	for (int i = 0; i < headers.size(); i++) {
	    record.add(headers.get(i).length());
	}
	for (List<String> cols : rows) {
	    for (int j = 0; j < cols.size(); j++) {
		int newLen = cols.get(j).length();
		if (newLen > record.get(j)) {
		    record.set(j, newLen);
		}
	    }
	}
	return record;
    }

    public void display() {
	List<Integer> record = computeMaxColumnLength();
	StringBuilder tplBuilder = new StringBuilder();
	for (int i = 0; i < headers.size(); i++) {
	    tplBuilder.append("| %-" + (record.get(i) + 2) + "s");
	}
	tplBuilder.append("|");
	StringBuilder borderBuilder = new StringBuilder();
	for (int i = 0; i < headers.size(); i++) {
	    borderBuilder.append("+-" + (Strings.gen("-", record.get(i) + 2)));
	}
	borderBuilder.append("+");
	String tpl = tplBuilder.toString();
	String border = borderBuilder.toString();
	System.out.println(border);
	System.out.println(String.format(tpl, headers.toArray()));
	System.out.println(border);
	for (List<String> cols : rows) {
	    System.out.println(String.format(tpl, cols.toArray()));
	    System.out.println(border);
	}
    }

}
