/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class TWriteln extends Token
{
    public TWriteln(String text)
    {
        setText(text);
    }

    public TWriteln(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TWriteln(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTWriteln(this);
    }
}
