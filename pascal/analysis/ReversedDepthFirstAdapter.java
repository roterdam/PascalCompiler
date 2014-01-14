/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.analysis;

import java.util.*;
import pascal.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPAst().apply(this);
        outStart(node);
    }

    public void inAProgramStartAst(AProgramStartAst node)
    {
        defaultIn(node);
    }

    public void outAProgramStartAst(AProgramStartAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgramStartAst(AProgramStartAst node)
    {
        inAProgramStartAst(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        {
            List<PAst> copy = new ArrayList<PAst>(node.getM());
            Collections.reverse(copy);
            for(PAst e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAProgramStartAst(node);
    }

    public void inAProgramHeaderAst(AProgramHeaderAst node)
    {
        defaultIn(node);
    }

    public void outAProgramHeaderAst(AProgramHeaderAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgramHeaderAst(AProgramHeaderAst node)
    {
        inAProgramHeaderAst(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAProgramHeaderAst(node);
    }

    public void inADeclarationsAst(ADeclarationsAst node)
    {
        defaultIn(node);
    }

    public void outADeclarationsAst(ADeclarationsAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationsAst(ADeclarationsAst node)
    {
        inADeclarationsAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outADeclarationsAst(node);
    }

    public void inAEmptyDeclarationsAst(AEmptyDeclarationsAst node)
    {
        defaultIn(node);
    }

    public void outAEmptyDeclarationsAst(AEmptyDeclarationsAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyDeclarationsAst(AEmptyDeclarationsAst node)
    {
        inAEmptyDeclarationsAst(node);
        outAEmptyDeclarationsAst(node);
    }

    public void inAVariablesDefinitionListAst(AVariablesDefinitionListAst node)
    {
        defaultIn(node);
    }

    public void outAVariablesDefinitionListAst(AVariablesDefinitionListAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariablesDefinitionListAst(AVariablesDefinitionListAst node)
    {
        inAVariablesDefinitionListAst(node);
        if(node.getVariablesDefinition() != null)
        {
            node.getVariablesDefinition().apply(this);
        }
        if(node.getVariablesDefinitionList() != null)
        {
            node.getVariablesDefinitionList().apply(this);
        }
        outAVariablesDefinitionListAst(node);
    }

    public void inAVariablesDefinitionAst(AVariablesDefinitionAst node)
    {
        defaultIn(node);
    }

    public void outAVariablesDefinitionAst(AVariablesDefinitionAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariablesDefinitionAst(AVariablesDefinitionAst node)
    {
        inAVariablesDefinitionAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAVariablesDefinitionAst(node);
    }

    public void inAIntegerAst(AIntegerAst node)
    {
        defaultIn(node);
    }

    public void outAIntegerAst(AIntegerAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerAst(AIntegerAst node)
    {
        inAIntegerAst(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerAst(node);
    }

    public void inABooleanAst(ABooleanAst node)
    {
        defaultIn(node);
    }

    public void outABooleanAst(ABooleanAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanAst(ABooleanAst node)
    {
        inABooleanAst(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanAst(node);
    }

    public void inABodyAst(ABodyAst node)
    {
        defaultIn(node);
    }

    public void outABodyAst(ABodyAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABodyAst(ABodyAst node)
    {
        inABodyAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outABodyAst(node);
    }

    public void inAStatementSequenceAst(AStatementSequenceAst node)
    {
        defaultIn(node);
    }

    public void outAStatementSequenceAst(AStatementSequenceAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatementSequenceAst(AStatementSequenceAst node)
    {
        inAStatementSequenceAst(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getStatementSequence() != null)
        {
            node.getStatementSequence().apply(this);
        }
        outAStatementSequenceAst(node);
    }

    public void inAStatementAst(AStatementAst node)
    {
        defaultIn(node);
    }

    public void outAStatementAst(AStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatementAst(AStatementAst node)
    {
        inAStatementAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAStatementAst(node);
    }

    public void inAOpenStatementAst(AOpenStatementAst node)
    {
        defaultIn(node);
    }

    public void outAOpenStatementAst(AOpenStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpenStatementAst(AOpenStatementAst node)
    {
        inAOpenStatementAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAOpenStatementAst(node);
    }

    public void inAClosedStatementAst(AClosedStatementAst node)
    {
        defaultIn(node);
    }

    public void outAClosedStatementAst(AClosedStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAClosedStatementAst(AClosedStatementAst node)
    {
        inAClosedStatementAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAClosedStatementAst(node);
    }

    public void inAOpenIfStatementAst(AOpenIfStatementAst node)
    {
        defaultIn(node);
    }

    public void outAOpenIfStatementAst(AOpenIfStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpenIfStatementAst(AOpenIfStatementAst node)
    {
        inAOpenIfStatementAst(node);
        if(node.getOpenStatement() != null)
        {
            node.getOpenStatement().apply(this);
        }
        if(node.getExprTop() != null)
        {
            node.getExprTop().apply(this);
        }
        outAOpenIfStatementAst(node);
    }

    public void inAOpenIfElseStatementAst(AOpenIfElseStatementAst node)
    {
        defaultIn(node);
    }

    public void outAOpenIfElseStatementAst(AOpenIfElseStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpenIfElseStatementAst(AOpenIfElseStatementAst node)
    {
        inAOpenIfElseStatementAst(node);
        if(node.getClosedStatement() != null)
        {
            node.getClosedStatement().apply(this);
        }
        if(node.getOpenStatement() != null)
        {
            node.getOpenStatement().apply(this);
        }
        if(node.getExprTop() != null)
        {
            node.getExprTop().apply(this);
        }
        outAOpenIfElseStatementAst(node);
    }

    public void inAClosedIfStatementAst(AClosedIfStatementAst node)
    {
        defaultIn(node);
    }

    public void outAClosedIfStatementAst(AClosedIfStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAClosedIfStatementAst(AClosedIfStatementAst node)
    {
        inAClosedIfStatementAst(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getExprTop() != null)
        {
            node.getExprTop().apply(this);
        }
        outAClosedIfStatementAst(node);
    }

    public void inAOpenWhileStatementAst(AOpenWhileStatementAst node)
    {
        defaultIn(node);
    }

    public void outAOpenWhileStatementAst(AOpenWhileStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpenWhileStatementAst(AOpenWhileStatementAst node)
    {
        inAOpenWhileStatementAst(node);
        if(node.getOpenStatement() != null)
        {
            node.getOpenStatement().apply(this);
        }
        if(node.getExprTop() != null)
        {
            node.getExprTop().apply(this);
        }
        outAOpenWhileStatementAst(node);
    }

    public void inAClosedWhileStatementAst(AClosedWhileStatementAst node)
    {
        defaultIn(node);
    }

    public void outAClosedWhileStatementAst(AClosedWhileStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAClosedWhileStatementAst(AClosedWhileStatementAst node)
    {
        inAClosedWhileStatementAst(node);
        if(node.getClosedStatement() != null)
        {
            node.getClosedStatement().apply(this);
        }
        if(node.getExprTop() != null)
        {
            node.getExprTop().apply(this);
        }
        outAClosedWhileStatementAst(node);
    }

    public void inASimpleStatementAst(ASimpleStatementAst node)
    {
        defaultIn(node);
    }

    public void outASimpleStatementAst(ASimpleStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleStatementAst(ASimpleStatementAst node)
    {
        inASimpleStatementAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outASimpleStatementAst(node);
    }

    public void inAWritelnAst(AWritelnAst node)
    {
        defaultIn(node);
    }

    public void outAWritelnAst(AWritelnAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWritelnAst(AWritelnAst node)
    {
        inAWritelnAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAWritelnAst(node);
    }

    public void inAAssignmentAst(AAssignmentAst node)
    {
        defaultIn(node);
    }

    public void outAAssignmentAst(AAssignmentAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentAst(AAssignmentAst node)
    {
        inAAssignmentAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAAssignmentAst(node);
    }

    public void inABlockAst(ABlockAst node)
    {
        defaultIn(node);
    }

    public void outABlockAst(ABlockAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlockAst(ABlockAst node)
    {
        inABlockAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outABlockAst(node);
    }

    public void inAEmptyAst(AEmptyAst node)
    {
        defaultIn(node);
    }

    public void outAEmptyAst(AEmptyAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyAst(AEmptyAst node)
    {
        inAEmptyAst(node);
        outAEmptyAst(node);
    }

    public void inAIfStatementAst(AIfStatementAst node)
    {
        defaultIn(node);
    }

    public void outAIfStatementAst(AIfStatementAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfStatementAst(AIfStatementAst node)
    {
        inAIfStatementAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAIfStatementAst(node);
    }

    public void inAEqualAst(AEqualAst node)
    {
        defaultIn(node);
    }

    public void outAEqualAst(AEqualAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualAst(AEqualAst node)
    {
        inAEqualAst(node);
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        outAEqualAst(node);
    }

    public void inALessAst(ALessAst node)
    {
        defaultIn(node);
    }

    public void outALessAst(ALessAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessAst(ALessAst node)
    {
        inALessAst(node);
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        outALessAst(node);
    }

    public void inAGreaterAst(AGreaterAst node)
    {
        defaultIn(node);
    }

    public void outAGreaterAst(AGreaterAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterAst(AGreaterAst node)
    {
        inAGreaterAst(node);
        if(node.getGreater() != null)
        {
            node.getGreater().apply(this);
        }
        outAGreaterAst(node);
    }

    public void inAGreaterEqAst(AGreaterEqAst node)
    {
        defaultIn(node);
    }

    public void outAGreaterEqAst(AGreaterEqAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterEqAst(AGreaterEqAst node)
    {
        inAGreaterEqAst(node);
        if(node.getGreaterEq() != null)
        {
            node.getGreaterEq().apply(this);
        }
        outAGreaterEqAst(node);
    }

    public void inALessEqAst(ALessEqAst node)
    {
        defaultIn(node);
    }

    public void outALessEqAst(ALessEqAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessEqAst(ALessEqAst node)
    {
        inALessEqAst(node);
        if(node.getLessEq() != null)
        {
            node.getLessEq().apply(this);
        }
        outALessEqAst(node);
    }

    public void inAUnequalAst(AUnequalAst node)
    {
        defaultIn(node);
    }

    public void outAUnequalAst(AUnequalAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnequalAst(AUnequalAst node)
    {
        inAUnequalAst(node);
        if(node.getUnequal() != null)
        {
            node.getUnequal().apply(this);
        }
        outAUnequalAst(node);
    }

    public void inAExprTopAst(AExprTopAst node)
    {
        defaultIn(node);
    }

    public void outAExprTopAst(AExprTopAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprTopAst(AExprTopAst node)
    {
        inAExprTopAst(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getExprTop() != null)
        {
            node.getExprTop().apply(this);
        }
        outAExprTopAst(node);
    }

    public void inAOrAst(AOrAst node)
    {
        defaultIn(node);
    }

    public void outAOrAst(AOrAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrAst(AOrAst node)
    {
        inAOrAst(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAOrAst(node);
    }

    public void inAXorAst(AXorAst node)
    {
        defaultIn(node);
    }

    public void outAXorAst(AXorAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorAst(AXorAst node)
    {
        inAXorAst(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAXorAst(node);
    }

    public void inAPlusAst(APlusAst node)
    {
        defaultIn(node);
    }

    public void outAPlusAst(APlusAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusAst(APlusAst node)
    {
        inAPlusAst(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPlusAst(node);
    }

    public void inAMinusAst(AMinusAst node)
    {
        defaultIn(node);
    }

    public void outAMinusAst(AMinusAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusAst(AMinusAst node)
    {
        inAMinusAst(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAMinusAst(node);
    }

    public void inAAndAst(AAndAst node)
    {
        defaultIn(node);
    }

    public void outAAndAst(AAndAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndAst(AAndAst node)
    {
        inAAndAst(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAAndAst(node);
    }

    public void inAModAst(AModAst node)
    {
        defaultIn(node);
    }

    public void outAModAst(AModAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModAst(AModAst node)
    {
        inAModAst(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAModAst(node);
    }

    public void inAMultAst(AMultAst node)
    {
        defaultIn(node);
    }

    public void outAMultAst(AMultAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultAst(AMultAst node)
    {
        inAMultAst(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAMultAst(node);
    }

    public void inADivAst(ADivAst node)
    {
        defaultIn(node);
    }

    public void outADivAst(ADivAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivAst(ADivAst node)
    {
        inADivAst(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outADivAst(node);
    }

    public void inANotAst(ANotAst node)
    {
        defaultIn(node);
    }

    public void outANotAst(ANotAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotAst(ANotAst node)
    {
        inANotAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outANotAst(node);
    }

    public void inANumberAst(ANumberAst node)
    {
        defaultIn(node);
    }

    public void outANumberAst(ANumberAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberAst(ANumberAst node)
    {
        inANumberAst(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberAst(node);
    }

    public void inAIdentifierAst(AIdentifierAst node)
    {
        defaultIn(node);
    }

    public void outAIdentifierAst(AIdentifierAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierAst(AIdentifierAst node)
    {
        inAIdentifierAst(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierAst(node);
    }

    public void inATrueAst(ATrueAst node)
    {
        defaultIn(node);
    }

    public void outATrueAst(ATrueAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueAst(ATrueAst node)
    {
        inATrueAst(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueAst(node);
    }

    public void inAFalseAst(AFalseAst node)
    {
        defaultIn(node);
    }

    public void outAFalseAst(AFalseAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseAst(AFalseAst node)
    {
        inAFalseAst(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseAst(node);
    }

    public void inAUnMinusAst(AUnMinusAst node)
    {
        defaultIn(node);
    }

    public void outAUnMinusAst(AUnMinusAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnMinusAst(AUnMinusAst node)
    {
        inAUnMinusAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAUnMinusAst(node);
    }

    public void inAUnPlusAst(AUnPlusAst node)
    {
        defaultIn(node);
    }

    public void outAUnPlusAst(AUnPlusAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnPlusAst(AUnPlusAst node)
    {
        inAUnPlusAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAUnPlusAst(node);
    }

    public void inABreakAst(ABreakAst node)
    {
        defaultIn(node);
    }

    public void outABreakAst(ABreakAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABreakAst(ABreakAst node)
    {
        inABreakAst(node);
        if(node.getBreak() != null)
        {
            node.getBreak().apply(this);
        }
        outABreakAst(node);
    }
}
