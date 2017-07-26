package com.barclaycardus.e2e.ui.monte.screenrecorder;

import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Juhil on 7/23/2017.
 */
import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.monte.media.Format;
import org.monte.media.Registry;
import org.monte.screenrecorder.ScreenRecorder;

public class SeleniumScreenRecorder extends ScreenRecorder {

        private String name;

        public SeleniumScreenRecorder(GraphicsConfiguration cfg,
                                         Rectangle captureArea, Format fileFormat, Format screenFormat,
                                         Format mouseFormat, Format audioFormat, File movieFolder,
                                         String name) throws IOException, AWTException {
            super(cfg, captureArea, fileFormat, screenFormat, mouseFormat,
                    audioFormat, movieFolder);
            this.name = name;
        }

        @Override
        protected File createMovieFile(Format fileFormat) throws IOException {
            if (!movieFolder.exists()) {
                movieFolder.mkdirs();
            } else if (!movieFolder.isDirectory()) {
                throw new IOException("\"" + movieFolder + "\" is not a directory.");
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH.mm.ss");

            return new File(movieFolder, name + "-" + dateFormat.format(new Date()) + "."
                    + Registry.getInstance().getExtension(fileFormat));
        }
}
