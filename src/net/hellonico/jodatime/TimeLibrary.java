/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package net.hellonico.jodatime;


import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import processing.core.PApplet;

/**
 * This is a template class and can be used to start a new processing library or tool.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own library or tool naming convention.
 * 
 * @example Hello 
 * 
 * (the tag @example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 */

public class TimeLibrary {
	
	PApplet myParent;
	public final static String VERSION = "##library.prettyVersion##";
	
	public TimeLibrary(PApplet theParent) {
		myParent = theParent;
	}
	public DateTime getTime(String location) {
		DateTimeZone zone = DateTimeZone.forID(location);
		DateTime dt = new DateTime();
	    return dt.withZone(zone);
	}
	public String getTimeString() {
		return new DateTime().toString();
	}
	public String getTimeString(String location) {
		DateTime time = getTime(location);
	    DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
	    return time.toString(fmt.withLocale(Locale.JAPAN));
	}
	public String[] getTimezones() {
		return java.util.TimeZone.getAvailableIDs();
	}
	
	public static String version() {
		return VERSION;
	}
}

