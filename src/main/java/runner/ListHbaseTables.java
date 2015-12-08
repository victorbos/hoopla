package runner;

import hbase.Util;

import java.io.IOException;

public class ListHbaseTables {

	public static void main(String[] args) {
		try {
			Util listTables=new Util();
			for (String name:listTables.getTableNames(".*tst.*")){
				System.out.println("Table: " + name);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
