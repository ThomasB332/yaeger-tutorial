module waterworld {
	requires javafx.graphics;
	requires hanyaeger;

    exports com.github.hanyaeger.tutorial;

    opens audio;
    opens backgrounds;
    opens sprites;
}
