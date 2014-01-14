/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AClosedWhileClosedStatement extends PClosedStatement
{
    private PClosedWhileStatement _closedWhileStatement_;

    public AClosedWhileClosedStatement()
    {
        // Constructor
    }

    public AClosedWhileClosedStatement(
        @SuppressWarnings("hiding") PClosedWhileStatement _closedWhileStatement_)
    {
        // Constructor
        setClosedWhileStatement(_closedWhileStatement_);

    }

    @Override
    public Object clone()
    {
        return new AClosedWhileClosedStatement(
            cloneNode(this._closedWhileStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClosedWhileClosedStatement(this);
    }

    public PClosedWhileStatement getClosedWhileStatement()
    {
        return this._closedWhileStatement_;
    }

    public void setClosedWhileStatement(PClosedWhileStatement node)
    {
        if(this._closedWhileStatement_ != null)
        {
            this._closedWhileStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._closedWhileStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._closedWhileStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._closedWhileStatement_ == child)
        {
            this._closedWhileStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._closedWhileStatement_ == oldChild)
        {
            setClosedWhileStatement((PClosedWhileStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
