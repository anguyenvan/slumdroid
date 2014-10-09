/* This file is part of SlumDroid <https://code.google.com/p/slumdroid/>.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License <http://www.gnu.org/licenses/gpl-3.0.txt>
 * for more details.
 * 
 * Copyright (C) 2014 Gennaro Imparato
 */

package it.slumdroid.utilities;

import java.awt.EventQueue;
import java.io.File;

import it.slumdroid.utilities.module.*;

public class Utilities {
	
	public static final String ACTIVITY = "/activities.xml";
	public static final String ACTIVITY_DIR = "./diet/activity/";
	public static final String ACTIVITY_SUB = "activities_";
	public static final String COV_GENERATOR = "%EMMA% report -r html -sp %APKPATH%\\src -Dreport.sort=+name -in ";
	public static final String DIET_DIR = "./diet/";
	public static final String GUITREE = "/guitree.xml";
	public static final String GUITREE_DIR = "./diet/guitree/";
	public static final String GUITREE_SUB = "guitree_"; 
	public static final String INCREMENTAL_COV = "%EMMA% report -r txt -Dreport.sort=+name -in ";
	public static final String TOOL = "it.slumdroid.tool";

	public static void main(String[] args) {
		if (args.length!=0){
			if (args[0].equals("buildControl")) new Tools().buildControl(args[1]);
			else if (args[0].equals("countEvents")) new Tools().countEvents(args[1]);
			else if (args[0].contains("coverage")) {
				if (args[0].equals("coverageG")) new Tools().covGenerator(COV_GENERATOR);  	
				else if (args[0].equals("coverageI")) new Tools().covGenerator(INCREMENTAL_COV);
				else if (args[0].equals("coverageText")) new Tools().covTextParsing(args[1]); 
			} 	
			else if (args[0].equals("graphicalEditor")) {
				final boolean random = args[1].equals("1"); 
				final String path = args[2];
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GraphicalEditor frame = new GraphicalEditor(random, path);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
			else if (args[0].contains("merge")) {
				if (args[0].equals("mergeAct")) new Tools().mergeA(args[1]);
				else if (args[0].equals("mergeGui")) new Tools().mergeG(args[1]);
			}
			else if (args[0].equals("preferenceEditor")) new PreferenceEditor().preferenceEditor(args); 
			else if (args[0].equals("retarget")) new Tools().retarget(args[1], args[2]);
			else if (args[0].contains("split")) {
				if (!new File(DIET_DIR).exists()) new File(DIET_DIR).mkdir();
				if (args[0].equals("splitAct")) new Tools().split(args[1], ACTIVITY_DIR, ACTIVITY, ACTIVITY_SUB);
				else if (args[0].equals("splitGui")) new Tools().split(args[1], GUITREE_DIR, GUITREE, GUITREE_SUB); 			
			}
			else if (args[0].equals("tasklist")){
				if (!new File(DIET_DIR).exists()) new File(DIET_DIR).mkdir();
				new UnionTaskListDiet().tasklistDiet(args[1], args[2]);
			}
			else if (args[0].equals("traslate")) new Tools().traslate(args[1], args[2]);
		}
	}

}