package io.github.danielpine.staging;

import java.util.ArrayList;
import java.util.List;

public class TableBuilder {
    List<String> headers = new ArrayList<String>();
    boolean autoIndex = false;

    public TableBuilder addHeaders(String... headers) {
	for (String header : headers) {
	    this.headers.add(header);
	}
	return this;
    }

    public Table build() {
	Table table = new Table();
	table.setHeaders(headers);
	table.setRows(new ArrayList<List<String>>());
	return table;
    }

    public TableBuilder enableAutoIndex() {
	autoIndex = true;
	return this;
    }

}