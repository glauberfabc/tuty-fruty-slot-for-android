package eu.veldsoft.tuty.fruty.slot;
/*******************************************************************************
 *                                                                             *
 * Tuty-Fruty Slot is simple non gambling slot machine game.                   *
 * Copyright (C) 2008-2009 by Todor Balabanov ( tdb@tbsoft-bg.com )            *
 *                                                                             *
 * This program is free software: you can redistribute it and/or modify        *
 * it under the terms of the GNU General Public License as published by        *
 * the Free Software Foundation, either version 3 of the License, or           *
 * (at your option) any later version.                                         *
 *                                                                             *
 * This program is distributed in the hope that it will be useful,             *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of              *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the               *
 * GNU General Public License for more details.                                *
 *                                                                             *
 * You should have received a copy of the GNU General Public License           *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.        *
 *                                                                             *
 ******************************************************************************/

/**
 * Slot machine game main class. All game componets are part of this class.
 * Possible screens that slot game class can show are: splash screen, game
 * screen, help screen and pay table screen. It holds information about which
 * screen is being shown at the moment.
 *
 * @author Darina Evtomiva
 *
 * @email aleks_f@abv.bg
 *
 * @date 03 Oct 2008
 */
class SlotGame {
public:

	/**
	 * Splash screen constant flag.
	 */
	static const unsigned char SPLASH_SCREEN = 0;

	/**
	 * Game screen constant flag.
	 */
	static const unsigned char GAME_SCREEN = 1;

	/**
	 * Pay table screen constant flag.
	 */
	static const unsigned char PAYTABLE_SCREEN = 2;

	/**
	 * Help screen constant flag.
	 */
	static const unsigned char HELP_SCREEN = 3;

protected:
	/**
	 * Drawing screen on console.
	 */
	Canvas *canvas;

	/**
	 * Flag indicating which screen is shown at the moment.
	 */
	unsigned char activeScreen;

	//TODO Splash screen.

	/**
	 * Holds information about all game screen visual components.
	 */
	GameScreen *gameScreen;

	/**
	 * Holds informaton about pay table.
	 */
	PayTableScreen *payTableScreen;

	//TODO Help screen.

protected:

	/**
	 * Print statistics.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 17 Oct 2008
	 */
	void printStatistics();

public:

	/**
	 * Default constructor.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	SlotGame();

	/**
	 * Initializing all game visual components.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	virtual void initialize() = 0;

	/**
	 * Game loop.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	virtual void loop() = 0;

	/**
	 * Finalize the game.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	@Override
	virtual void finalize() = 0;

	/**
	 * Destructor.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	~SlotGame();
};
