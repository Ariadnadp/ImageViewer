package imageviewer_1.view.persistence;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public interface ImageLoader {

    public static BufferedImage load(String path) throws IOException {
        return ImageIO.read(new File(path));
    }
}