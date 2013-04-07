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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Thom Wiggers
 *
 */
public class IrcNetworkTest {

    /**
     * Test method for {@link java.lang.Object#toString()}.
     */
    @Test
    public void testToString() {
	final IrcNetwork n = new IrcNetwork("Name");
	assertEquals("IrcNetwork: Name", n.toString());
    }

}
