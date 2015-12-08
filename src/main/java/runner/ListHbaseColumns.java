package runner;

import hbase.Util;

import java.io.IOException;

/**
 * Created by vbos on 07/12/15.
 */
public class ListHbaseColumns {
	public static void main(String[] args) {
		try {
			Util util=new Util();
			for(String column:util.getColumns("partnermanagement_dev_public_v1_KpiDayValues")){
				System.out.println("Column: " + column);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
