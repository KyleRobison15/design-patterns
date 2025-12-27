package strategy;

public class Demo {
    public static void show(){
        var storage = new ImageStorage();

        storage.store("WeddingVows.jpeg"); // JPEG + B&W (default)

        storage.setCompressor(new PngCompressor());
        storage.setFilter(new HighContrastFilter());

        storage.store("Headshot.jpg"); // PNG + High Contrast

    }
}
