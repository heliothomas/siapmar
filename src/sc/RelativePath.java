package sc;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RelativePath {

  public static void main(String[] args) throws IOException {
    File relative = new File("sc/is1.mp3");
    File file = new File(System.getProperty("user.dir")+"/files/is1.mp3");//"src/av/iniciosesion.mp3"

    int c = 92;
    System.out.println(String.valueOf((char)c));

    
    System.out.println("user.dir: " + System.getProperty("user.dir"));
    System.out.println("getName: " + relative.getName());
    System.out.println("getPath: " + relative.getPath());
    System.out.println("getAbsolutePath: " + file.getAbsolutePath());
    System.out.println("getCanonicalPath: " + file.getCanonicalPath());
    
    if (OSDetector.isWindows()) {
        JOptionPane.showMessageDialog(null, "Tu SO es: " + OSDetector.os);
    }
    if (OSDetector.isLinux()) {
        JOptionPane.showMessageDialog(null, "Tu SO es una distribución Linux: " + OSDetector.os);
    }
    if (OSDetector.isMac()) {
        JOptionPane.showMessageDialog(null, "Tu SO es Mac: " + OSDetector.os);
    }
}}

/*
public static boolean open(File f)
{
    try
    {
        if (OSDetector.isWindows())
        {
            Runtime.getRuntime().exec(new String[]
            {"rundll32 url.dll,FileProtocolHandler",
             file.getAbsolutePath()});
            return true;
        } else if (OSDetector.isLinux() || OSDetector.isMac())
        {
            Runtime.getRuntime().exec(new String[]{"/usr/bin/open",
                                                   file.getAbsolutePath()});
            return true;
        } else
        {
            // Unknown OS, try with desktop
            if (Desktop.isDesktopSupported())
            {
                Desktop.getDesktop().open(file);
                return true;
            }
            else
            {
                return false;
            }
        }
    } catch (Exception e)
    {
        e.printStackTrace(System.err);
        return false;
    }
}
*/