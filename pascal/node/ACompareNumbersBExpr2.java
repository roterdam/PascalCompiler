/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class ACompareNumbersBExpr2 extends PBExpr2
{
    private TNumber _first_;
    private PCompare _compare_;
    private TNumber _second_;

    public ACompareNumbersBExpr2()
    {
        // Constructor
    }

    public ACompareNumbersBExpr2(
        @SuppressWarnings("hiding") TNumber _first_,
        @SuppressWarnings("hiding") PCompare _compare_,
        @SuppressWarnings("hiding") TNumber _second_)
    {
        // Constructor
        setFirst(_first_);

        setCompare(_compare_);

        setSecond(_second_);

    }

    @Override
    public Object clone()
    {
        return new ACompareNumbersBExpr2(
            cloneNode(this._first_),
            cloneNode(this._compare_),
            cloneNode(this._second_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompareNumbersBExpr2(this);
    }

    public TNumber getFirst()
    {
        return this._first_;
    }

    public void setFirst(TNumber node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public PCompare getCompare()
    {
        return this._compare_;
    }

    public void setCompare(PCompare node)
    {
        if(this._compare_ != null)
        {
            this._compare_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._compare_ = node;
    }

    public TNumber getSecond()
    {
        return this._second_;
    }

    public void setSecond(TNumber node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._first_)
            + toString(this._compare_)
            + toString(this._second_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._compare_ == child)
        {
            this._compare_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._first_ == oldChild)
        {
            setFirst((TNumber) newChild);
            return;
        }

        if(this._compare_ == oldChild)
        {
            setCompare((PCompare) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
