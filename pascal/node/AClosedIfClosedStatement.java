/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AClosedIfClosedStatement extends PClosedStatement
{
    private PClosedIfStatement _closedIfStatement_;

    public AClosedIfClosedStatement()
    {
        // Constructor
    }

    public AClosedIfClosedStatement(
        @SuppressWarnings("hiding") PClosedIfStatement _closedIfStatement_)
    {
        // Constructor
        setClosedIfStatement(_closedIfStatement_);

    }

    @Override
    public Object clone()
    {
        return new AClosedIfClosedStatement(
            cloneNode(this._closedIfStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClosedIfClosedStatement(this);
    }

    public PClosedIfStatement getClosedIfStatement()
    {
        return this._closedIfStatement_;
    }

    public void setClosedIfStatement(PClosedIfStatement node)
    {
        if(this._closedIfStatement_ != null)
        {
            this._closedIfStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._closedIfStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._closedIfStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._closedIfStatement_ == child)
        {
            this._closedIfStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._closedIfStatement_ == oldChild)
        {
            setClosedIfStatement((PClosedIfStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
