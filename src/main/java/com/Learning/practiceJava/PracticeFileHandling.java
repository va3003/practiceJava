package com.Learning.practiceJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeFileHandling {

	public static void main(String args[]) throws IOException {
		PracticeFileHandling pfl = new PracticeFileHandling();
		pfl.CsvReader();
	}

	public void CsvReader() throws IOException {
		File fl = new File(
				"/Users/sukuruku/practice-spring/test-docway-component/src/main/ext-resources/data/mappings/repository/CMTT_CRTD_SNGL_CMMT_MLTPL_PROP.csv");
		FileReader flReader = null;
		List<String> flRead = new ArrayList<String>();
		String splitBy = ",";
		int i = 0;
		try {
			flReader = new FileReader(fl);
			BufferedReader br = new BufferedReader(flReader);
			String line = "";
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				flRead.add(line);
			}
		} catch (FileNotFoundException flE) {

		}
		Iterator<String> it = flRead.iterator();
		while (it.hasNext()) {
			String[] arr = it.next().split(splitBy);
			int j = 0;
			while (j < arr.length) {
				System.out.println(arr[j]);
				j++;
			}
		}
	}

}
