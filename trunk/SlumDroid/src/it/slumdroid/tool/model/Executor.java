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

package it.slumdroid.tool.model;

import android.test.ActivityInstrumentationTestCase2;

import it.slumdroid.droidmodels.model.Trace;
import it.slumdroid.droidmodels.model.Transition;
import it.slumdroid.droidmodels.model.UserEvent;
import it.slumdroid.droidmodels.model.UserInput;

public interface Executor {

	public void bind (ActivityInstrumentationTestCase2<?> engine);
	public void fireEvent (UserEvent e);
	public void setInput (UserInput i);
	public void process (Trace t);
	public void process (Transition tr);
	public void finalize();
	public void wait (int milli);

}