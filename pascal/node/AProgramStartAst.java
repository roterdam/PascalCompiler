/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.node;

import java.util.*;
import pascal.analysis.*;

@SuppressWarnings("nls")
public final class AProgramStartAst extends PAst
{
    private TIdentifier _identifier_;
    private final LinkedList<PAst> _declarations_ = new LinkedList<PAst>();
    private PAst _body_;

    public AProgramStartAst()
    {
        // Constructor
    }

    public AProgramStartAst(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<?> _declarations_,
        @SuppressWarnings("hiding") PAst _body_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setDeclarations(_declarations_);

        setBody(_body_);

    }

    @Override
    public Object clone()
    {
        return new AProgramStartAst(
            cloneNode(this._identifier_),
            cloneList(this._declarations_),
            cloneNode(this._body_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramStartAst(this);
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

    public LinkedList<PAst> getDeclarations()
    {
        return this._declarations_;
    }

    public void setDeclarations(List<?> list)
    {
        for(PAst e : this._declarations_)
        {
            e.parent(null);
        }
        this._declarations_.clear();

        for(Object obj_e : list)
        {
            PAst e = (PAst) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declarations_.add(e);
        }
    }

    public PAst getBody()
    {
        return this._body_;
    }

    public void setBody(PAst node)
    {
        if(this._body_ != null)
        {
            this._body_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._body_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._declarations_)
            + toString(this._body_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._declarations_.remove(child))
        {
            return;
        }

        if(this._body_ == child)
        {
            this._body_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PAst> i = this._declarations_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAst) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._body_ == oldChild)
        {
            setBody((PAst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
