
package sc;

import javax.swing.text.*;

public class MaxLengthTextDocument extends PlainDocument{

private int maxChars;

@Override
public void insertString(int offs, String str, AttributeSet a)
throws BadLocationException {
if(str != null && (getLength() + str.length() < getMaxChars())){
    super.insertString(offs, str, a);
} }

public int getMaxChars(){
    return maxChars;
}

public void setMaxChars(int maxChars){
    this.maxChars = maxChars;
    }
}