
package sc;

import javax.swing.JTable;
import javax.swing.JViewport;

public class PlusScrollPaneTab extends JTable{
    
    @Override
    public boolean getScrollableTracksViewportWidth() {
        if (autoResizeMode != AUTO_RESIZE_OFF) {
            if (getParent() instanceof JViewport) {
            return (((JViewport)getParent()).getWidth() > getPreferredSize().width);
            }
        }
    return false;
    }
    
}
