package strategy;

public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    public ImageStorage() {
        this.compressor = new JpegCompressor();
        this.filter = new BlackWhiteFilter();
    }

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){

        // Compress the image into a smaller size using one of the image compression algorithms:
        //  - JPEG
        //  - PNG
        //  - etc.
        compressor.compress(fileName);

        // Apply filter so all images have a common look such as B&W, High Contrast etc.
        //  - B&W
        //  - High Contrast
        //  - etc.
        filter.apply(fileName);

    }

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
