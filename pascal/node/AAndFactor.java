/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AAndFactor extends PFactor
{
    private PFactor _factor_;
    private TAnd _and_;
    private PTerm _term_;

    public AAndFactor()
    {
        // Constructor
    }

    public AAndFactor(
        @SuppressWarnings("hiding") PFactor _factor_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setFactor(_factor_);

        setAnd(_and_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AAndFactor(
            cloneNode(this._factor_),
            cloneNode(this._and_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndFactor(this);
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
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

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
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
            + toString(this._and_)
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

        if(this._and_ == child)
        {
            this._and_ = null;
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
            setFactor((PFactor) newChild);
            return;
        }

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
