package io.github.danielpine.staging;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class Dataviewer {

    public static TableBuilder newTableBuilder() {
	return new TableBuilder();
    }

    public static <T> void displayTable(List<T> rows) {
	System.out.println(rows.getClass());
	ParameterizedType type = (ParameterizedType) rows.getClass().getGenericSuperclass();
	System.out.println(type.getActualTypeArguments()[0]);
	Class<?> itemClass = (Class<?>) type.getActualTypeArguments()[0];
	System.out.println(itemClass);
	Table table = Dataviewer.newTableBuilder()
		.addHeaders("Name", "Age", "Salary", "Desc")
		.enableAutoIndex()
		.build();
	table.put("Tom", "32", "2000", "Shanghai");
	table.display();
    }

}
