/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AOpenWhileStatementAst extends PAst
{
    private PAst _exprTop_;
    private PAst _openStatement_;

    public AOpenWhileStatementAst()
    {
        // Constructor
    }

    public AOpenWhileStatementAst(
        @SuppressWarnings("hiding") PAst _exprTop_,
        @SuppressWarnings("hiding") PAst _openStatement_)
    {
        // Constructor
        setExprTop(_exprTop_);

        setOpenStatement(_openStatement_);

    }

    @Override
    public Object clone()
    {
        return new AOpenWhileStatementAst(
            cloneNode(this._exprTop_),
            cloneNode(this._openStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpenWhileStatementAst(this);
    }

    public PAst getExprTop()
    {
        return this._exprTop_;
    }

    public void setExprTop(PAst node)
    {
        if(this._exprTop_ != null)
        {
            this._exprTop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprTop_ = node;
    }

    public PAst getOpenStatement()
    {
        return this._openStatement_;
    }

    public void setOpenStatement(PAst node)
    {
        if(this._openStatement_ != null)
        {
            this._openStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._openStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprTop_)
            + toString(this._openStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprTop_ == child)
        {
            this._exprTop_ = null;
            return;
        }

        if(this._openStatement_ == child)
        {
            this._openStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprTop_ == oldChild)
        {
            setExprTop((PAst) newChild);
            return;
        }

        if(this._openStatement_ == oldChild)
        {
            setOpenStatement((PAst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
