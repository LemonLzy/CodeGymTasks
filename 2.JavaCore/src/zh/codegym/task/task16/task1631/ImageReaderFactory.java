package zh.codegym.task.task16.task1631;

import zh.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes str) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (str.equals(ImageTypes.BMP)) {
            return new BmpReader();
        } else if (str.equals(ImageTypes.JPG)) {
            return new JpgReader();
        } else if (str.equals(ImageTypes.PNG)) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException();
        }
    }
}