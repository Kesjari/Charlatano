/*
 * Charlatan is a premium CS:GO cheat ran on the JVM.
 * Copyright (C) 2016 Thomas Nappo, Jonathan Beaudoin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.charlatano.scripts

import co.paralleluniverse.strands.Strand.sleep
import com.charlatano.BUNNY_HOP_KEY
import com.charlatano.game.CSGO.clientDLL
import com.charlatano.game.hooks.onGround
import com.charlatano.game.offsets.ClientOffsets.dwForceJump
import org.jire.arrowhead.keyPressed

fun bunnyHop() = onGround {
	if (keyPressed(BUNNY_HOP_KEY)) {
		clientDLL[dwForceJump] = 5.toByte()
		sleep(20)
		clientDLL[dwForceJump] = 4.toByte()
	}
}