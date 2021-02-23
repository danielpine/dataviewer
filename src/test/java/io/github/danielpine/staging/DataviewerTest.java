package io.github.danielpine.staging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class DataviewerTest {
    @Test
    public void testDisplayTable() {
	Table table = Dataviewer.newTableBuilder()
		.addHeaders("Name", "Age", "Salary", "Desc")
		.enableAutoIndex()
		.build();
	table.put("Tom", "22", "2000", "Shanghai");
	table.put("Daniel Pine", "22", "20", "Shanghai");
	table.put("Tom", "22", "2123", "Beijing");
	table.put("Tom", "22", "2000", "Shanghai");
	table.put("Tom", "22", "200033", "Beijing");
	table.put("Tom", "22", "20004", "Shanghai");
	table.display();
    }
}
