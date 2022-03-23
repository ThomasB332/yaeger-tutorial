package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.text.*;

public class GameLevel extends DynamicScene {
	private Waterworld waterworld;
	
	public GameLevel(Waterworld waterworld) {
		this.waterworld = waterworld;
	}
	@Override
	public void setupScene() {
		setBackgroundAudio("audio/waterworld.mp3");
		setBackgroundImage("backgrounds/background2.jpg");
	}

	@Override
	public void setupEntities() {
		var swordfish = new Swordfish(new Coordinate2D(getWidth() / 2, getHeight() / 2));
		var healthText = new HealthText(new Coordinate2D(getWidth() * .05, getHeight() * .05));
		var hanny = new Hanny(new Coordinate2D(getWidth() * .05, getHeight() * .05), healthText, waterworld);

		addEntity(healthText);
		addEntity(swordfish);
		addEntity(hanny);
	}

}
