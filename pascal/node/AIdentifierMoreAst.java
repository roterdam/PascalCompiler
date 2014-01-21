/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AIdentifierMoreAst extends PAst
{
    private PAst _ast_;
    private TIdentifier _identifier_;

    public AIdentifierMoreAst()
    {
        // Constructor
    }

    public AIdentifierMoreAst(
        @SuppressWarnings("hiding") PAst _ast_,
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setAst(_ast_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AIdentifierMoreAst(
            cloneNode(this._ast_),
            cloneNode(this._identifier_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierMoreAst(this);
    }

    public PAst getAst()
    {
        return this._ast_;
    }

    public void setAst(PAst node)
    {
        if(this._ast_ != null)
        {
            this._ast_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ast_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ast_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ast_ == child)
        {
            this._ast_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ast_ == oldChild)
        {
            setAst((PAst) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
