package runner;

import hbase.Util;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vbos on 07/12/15.
 */
public class ListHbaseTablesAndColumns {
	public static void main(String[] args) {
		try {
			Util util=new Util();
			for(String hbaseTable:util.getTableNames(".*acc_public.*")){
				if (!hbaseTable.matches(".*versions") &&
						!hbaseTable.matches("fraudandrisk.*") &&
						!hbaseTable.matches("FRK.*")
						) {
					for (String column : util.getColumns(hbaseTable, 10000)) {
						System.out.println(hbaseTable + "," + column);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
