/*
 * dataFormat.java
 * 
 * v1.0
 * 
 * @Author Xin He, Phd, Brandon D. Gallas, PhD, Rohan Pathare
 * 
 * Copyright 2013 Food & Drug Administration, Division of Image Analysis & Mathematics
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 *     Verbal description of the formatting necessary to input raw study data
 */

package mrmc.gui;

public class dataFormat {

	String fmtHelp;
	String sampleFmt;

	public String getInfo() {
		return fmtHelp;
	}

	public String getSample() {
		return sampleFmt;
	}

	public dataFormat() {
		fmtHelp = "The file format has two parts: the study description at the top followed by a list of the ROC ratings. The\n"
				+ "study description can include any information as free text. It must include three lines corresponding to the\n"
				+ "size of the experiment and then conclude with a line stating \"BEGIN DATA\". We demonstrate the formatting of\n"
				+ "these lines in an example. If the study has 9 readers, 55 diseased patients, and 75 nondiseased patients, \n"
				+ "and 5 modalities, then a legitimate study description can be nothing more than the following lines.\n"
				+ "N0: 75\n"
				+ "N1: 55\n"
				+ "NR: 9\n"
				+ "NM: 5\n"
				+ "BEGIN DATA\n"
				+ "... ...\n"
				
				+ "The list of ROC ratings has a row for each reader scoring each case for each modality in the study, in any order. It also has rows \n"
				+ "specifying the truth value of each case. iMRMC can handle non-fully-crossed data for any number of modalities, though only two of \n"
				+ "those modalities may be used at a time for variance analysis. Each row has four fields: the reader id (integer), case id (integer), \n"
				+ "modality index (-1 = truth, 1 = modality 1, 2 = modality 2, etc.), and the score correspending to the value for a particular modality. \n"
				+ "The score would be 0 or 1 for a truth modality index (indicating normal or diseased) or a value (integer or float) for a particular \n" 
				+ "modality. Higher scores should indicate higher likelihood or confidence of disease and low ratings should indicate lesser likelihood or \n"
				+ "confidence of disease. Otherwise, AUC calculations and ROC curve displays will be incorrect. Each field should be separated by only a \n"
				+ "comma and each row terminated by a newline. For example, the first few rows could look like the following: \n"
				
				+ "-1,1,0,1\n"
				+ "-1,2,0,0\n"
				+ "1,1,1,3\n"
				+ "1,1,2,5\n"
				+ "1,1,3,55.12\n"
				+ "2,1,1,2\n"
				+ "2,1,2,7\n"
				+ "2,1,3,46.3\n"
				+ "1,2,1,1\n"
				+ "1,2,2,0\n"
				+ "1,2,3,23.32\n"
				+ "2,2,1,1\n"
				+ "2,2,2,3\n"
				+ "2,2,3,15.8\n"
				+ "\n"
				+ "In the example, we see the ROC ratings from two readers reading two cases with three modalities each. The first line indicates that case 1 \n"
				+ "is a diseased (N1) case. The second line indicates that case 2 is a normal (N0) case. The third through fifth lines show reader 1's scores \n"
				+ "for modalities 1 through 3 on case 1. The sixth through eighth lines indicate the same, but for reader 2 instead. The remaining lines repeat \n"
				+ "the pattern with readers 1 and 2 scoring the modalities of case 2. \n";

		sampleFmt = "\n";

	}
}
