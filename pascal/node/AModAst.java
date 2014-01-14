/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AModAst extends PAst
{
    private PAst _factor_;
    private PAst _term_;

    public AModAst()
    {
        // Constructor
    }

    public AModAst(
        @SuppressWarnings("hiding") PAst _factor_,
        @SuppressWarnings("hiding") PAst _term_)
    {
        // Constructor
        setFactor(_factor_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AModAst(
            cloneNode(this._factor_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModAst(this);
    }

    public PAst getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PAst node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    public PAst getTerm()
    {
        return this._term_;
    }

    public void setTerm(PAst node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._factor_)
            + toString(this._term_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._factor_ == oldChild)
        {
            setFactor((PAst) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PAst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
