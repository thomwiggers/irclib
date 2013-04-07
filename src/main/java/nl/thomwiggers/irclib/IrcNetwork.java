/*  Java IRC Library
    Copyright (C) 2013  Thom Wiggers

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package nl.thomwiggers.irclib;

import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author Thom Wiggers
 *
 */
public class IrcNetwork {

    final private String name;

    static private Logger log = Logger.getLogger(IrcNetwork.class);

    /**
     * @param string
     *            Network name
     */
    public IrcNetwork(final String name) {
	this.name = name;

	BasicConfigurator.configure();
	log.info("Defaulted to stdout logging. See doc/logging.txt for how to use configurable logging");
    }

    /**
     * 
     * @param name
     *            Name of the network
     * @param logSettings
     *            settings of the log
     */
    public IrcNetwork(final String name, final Properties logSettings) {
	this.name = name;

	PropertyConfigurator.configure(logSettings);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "IrcNetwork: ".concat(name);
    }

}
