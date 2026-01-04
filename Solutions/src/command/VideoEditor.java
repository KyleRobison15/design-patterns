package command;

public class VideoEditor {
    private float contrast = 0.5f;
    private float saturation = 1.0f;
    private String text;

    public void increaseContrast() {
        contrast += 0.1f;
    }

    public void decreaseContrast() {
        contrast -= 0.1f;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    public float getSaturation() {
        return saturation;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", saturation=" + saturation +
                ", text='" + text + '\'' +
                '}';
    }
}
