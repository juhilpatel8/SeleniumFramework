package com.barclaycardus.e2e.ui.monte.screenrecorder;

import com.barclaycardus.e2e.exception.MonteBeanCreationException;
import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

/**
 * Created by Juhil on 7/23/2017.
 */
public class RecordScript {

    private ScreenRecorder screenRecorder;
    private String movieFileName;
    public RecordScript()
    {

    }
    public ScreenRecorder getScreenRecorderInstance() throws MonteBeanCreationException
    {
        if(this.screenRecorder==null)
        {
            this.screenRecorder=screenRecorder();
        }
        return this.screenRecorder;
    }
    public void close()
    {
        this.screenRecorder=null;
    }
    public void setMovieFileName(String movieFileName)
    {
        this.movieFileName=movieFileName;
    }
    public ScreenRecorder screenRecorder() throws MonteBeanCreationException{
        GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();
    SeleniumScreenRecorder seleniumScreenRecorder =null;
        try
        {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = screenSize.width;
            int height = screenSize.height;

            Rectangle captureSize = new Rectangle(0,0, width,height);

            String videoReportLocation= System.getProperty("videoReportLocation");
            File file =new File(videoReportLocation);

            seleniumScreenRecorder =new SeleniumScreenRecorder(
                    gc, captureSize,
                    new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                            CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                            DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                            QualityKey, 1.0f,
                            KeyFrameIntervalKey, 15 * 60),
                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                            FrameRateKey, Rational.valueOf(30)),
                    null, file,movieFileName);
        }
        catch (IOException e)
        {
            throw new MonteBeanCreationException(e.getMessage(),e);
        }
        catch (AWTException e)
        {
            throw new  MonteBeanCreationException(e.getMessage(),e);
        }
        return seleniumScreenRecorder;
    }
}
