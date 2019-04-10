package view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Imports the variations of the Clear-Sans font.
 */
class ClearSansLoader {

    /**
     * Only allow classes within the view package to instantiate ClearSansLoader.
     */
    protected ClearSansLoader() {}

    protected Font importFont(String fontType) {
	Font font;
	try {
	    InputStream is = getClass().getClassLoader().getResourceAsStream("res/clear-sans/ClearSans-" + fontType + ".ttf");
	    if (is == null) {	// null when working in eclipse...
		font = Font.createFont(Font.TRUETYPE_FONT, new File("res/clear-sans/ClearSans-" + fontType + ".ttf"));
	    } else {	// not null when exported to a .jar
		font = Font.createFont(Font.TRUETYPE_FONT, is);
		is.close();
	    }
	} catch (FontFormatException | IOException e) {
	    if (fontType.equalsIgnoreCase("bold")) font = new Font("Verdana", Font.BOLD, 1);
	    else font = new Font("Verdana", Font.PLAIN, 1);
	    e.printStackTrace();
	}
	return font;
    }

}