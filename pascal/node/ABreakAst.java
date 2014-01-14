/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class ABreakAst extends PAst
{
    private TBreak _break_;

    public ABreakAst()
    {
        // Constructor
    }

    public ABreakAst(
        @SuppressWarnings("hiding") TBreak _break_)
    {
        // Constructor
        setBreak(_break_);

    }

    @Override
    public Object clone()
    {
        return new ABreakAst(
            cloneNode(this._break_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABreakAst(this);
    }

    public TBreak getBreak()
    {
        return this._break_;
    }

    public void setBreak(TBreak node)
    {
        if(this._break_ != null)
        {
            this._break_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._break_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._break_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._break_ == child)
        {
            this._break_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._break_ == oldChild)
        {
            setBreak((TBreak) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
