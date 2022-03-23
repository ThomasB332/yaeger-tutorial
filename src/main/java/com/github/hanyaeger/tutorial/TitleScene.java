package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {
	private Waterworld waterworld;

	public TitleScene(Waterworld waterworld) {
		this.waterworld = waterworld;
	}

	@Override
	public void setupScene() {
		setBackgroundAudio("audio/ocean.mp3");
		setBackgroundColor(Color.DARKBLUE);
		setBackgroundImage("backgrounds/fireball-flame-ball.gif");
		
	}

	@Override
	public void setupEntities() {
		var waterworldText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 2), "Waterworld");
		waterworldText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		waterworldText.setFill(Color.DARKBLUE);
		waterworldText.setFont(Font.font("Roboto", FontWeight.BOLD, 80));
		var startButton = new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 8), waterworld);
		startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);

		addEntity(startButton);
		addEntity(waterworldText);
	}

}
