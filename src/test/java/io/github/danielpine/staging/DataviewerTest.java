package io.github.danielpine.staging;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import io.github.danielpine.staging.vo.Emp;

@RunWith(BlockJUnit4ClassRunner.class)
public class DataviewerTest {

    @Test
    public void testDisplayList() {
	List<Emp> rows = Arrays.asList(
		new Emp("Tom", "32", "2000", "Shanghai"),
		new Emp("Daniel Pine", "22", "20", "Shanghai"),
		new Emp("Tom", "24", "2123", "Beijing"),
		new Emp("Tom", "22", "2000", "Shanghai"),
		new Emp("Tom", "26", "200033", "Beijing"),
		new Emp("Tom", "26", "200033", "Beijing"),
		new Emp("Tom", "26", "200033", "Beijing"),
		new Emp("Tom", "26", "200033", "Beijing"),
		new Emp("Tom", "26", "200033", "Beijing"),
		new Emp("Tom", "26", "200033", "Beijing"),
		new Emp("Tom", "29", "20004", "Shanghai"));
	Dataviewer.displayTable(rows);
    }

    @Test
    public void testDisplayTable() {
	Table table = Dataviewer.newTableBuilder()
		.addHeaders("Name", "Age", "Salary", "Desc")
		.enableAutoIndex()
		.build();
	table.put("Tom", "32", "2000", "Shanghai");
	table.put("Daniel Pine", "22", "20", "Shanghai");
	table.put("Tom", "24", "2123", "Beijing");
	table.put("Tom", "22", "2000", "Shanghai");
	table.put("Tom", "26", "202", "Beijing");
	table.put("Tom", "29", "20004", "Shanghai");
	table.display();
    }
}
