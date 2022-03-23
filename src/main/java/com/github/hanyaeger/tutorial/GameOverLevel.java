package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOverLevel extends StaticScene {

	private Waterworld waterWorld;
	
	
	public GameOverLevel(Waterworld waterWorld) {
		this.waterWorld = waterWorld;
	}

	@Override
	public void setupScene() {
		setBackgroundAudio("audio/ocean.mp3");
		setBackgroundImage("backgrounds/background1.jpg");		
	}

	@Override
	public void setupEntities() {
		var gameoverText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 2), "Game Over");
		gameoverText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		gameoverText.setFill(Color.DARKBLUE);
		gameoverText.setFont(Font.font("Roboto", FontWeight.BOLD, 80));
		var restartButton = new RestartButton(new Coordinate2D(getWidth() / 2, getHeight() / 8), waterWorld);
		restartButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);

		addEntity(restartButton);
		addEntity(gameoverText);
	}

}
