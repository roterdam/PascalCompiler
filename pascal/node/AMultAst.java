/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AMultAst extends PAst
{
    private PAst _left_;
    private PAst _right_;

    public AMultAst()
    {
        // Constructor
    }

    public AMultAst(
        @SuppressWarnings("hiding") PAst _left_,
        @SuppressWarnings("hiding") PAst _right_)
    {
        // Constructor
        setLeft(_left_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AMultAst(
            cloneNode(this._left_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultAst(this);
    }

    public PAst getLeft()
    {
        return this._left_;
    }

    public void setLeft(PAst node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public PAst getRight()
    {
        return this._right_;
    }

    public void setRight(PAst node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PAst) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PAst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
