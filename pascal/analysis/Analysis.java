/* This file was generated by SableCC (http://www.sablecc.org/). */

package pascal.analysis;

import pascal.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramStartAst(AProgramStartAst node);
    void caseAProgramHeaderAst(AProgramHeaderAst node);
    void caseASingleDeclarationsAst(ASingleDeclarationsAst node);
    void caseAMultipleDeclarationsAst(AMultipleDeclarationsAst node);
    void caseAEmptyDeclarationsAst(AEmptyDeclarationsAst node);
    void caseAIdentifierMoreAst(AIdentifierMoreAst node);
    void caseAIdentifierDAst(AIdentifierDAst node);
    void caseAIntegerAst(AIntegerAst node);
    void caseABooleanAst(ABooleanAst node);
    void caseABodyAst(ABodyAst node);
    void caseAStatementSequenceAst(AStatementSequenceAst node);
    void caseAStatementAst(AStatementAst node);
    void caseAOpenStatementAst(AOpenStatementAst node);
    void caseAClosedStatementAst(AClosedStatementAst node);
    void caseAOpenIfStatementAst(AOpenIfStatementAst node);
    void caseAOpenIfElseStatementAst(AOpenIfElseStatementAst node);
    void caseAClosedIfStatementAst(AClosedIfStatementAst node);
    void caseAOpenWhileStatementAst(AOpenWhileStatementAst node);
    void caseAClosedWhileStatementAst(AClosedWhileStatementAst node);
    void caseASimpleStatementAst(ASimpleStatementAst node);
    void caseAWritelnAst(AWritelnAst node);
    void caseAAssignmentAst(AAssignmentAst node);
    void caseABlockAst(ABlockAst node);
    void caseAEmptyAst(AEmptyAst node);
    void caseAIfStatementAst(AIfStatementAst node);
    void caseAEqualAst(AEqualAst node);
    void caseALessAst(ALessAst node);
    void caseAGreaterAst(AGreaterAst node);
    void caseAGreaterEqAst(AGreaterEqAst node);
    void caseALessEqAst(ALessEqAst node);
    void caseAUnequalAst(AUnequalAst node);
    void caseAExprTopAst(AExprTopAst node);
    void caseAOrAst(AOrAst node);
    void caseAXorAst(AXorAst node);
    void caseAPlusAst(APlusAst node);
    void caseAMinusAst(AMinusAst node);
    void caseAAndAst(AAndAst node);
    void caseAModAst(AModAst node);
    void caseAMultAst(AMultAst node);
    void caseADivAst(ADivAst node);
    void caseANotAst(ANotAst node);
    void caseANumberAst(ANumberAst node);
    void caseAIdentifierAst(AIdentifierAst node);
    void caseATrueAst(ATrueAst node);
    void caseAFalseAst(AFalseAst node);
    void caseAUnMinusAst(AUnMinusAst node);
    void caseAUnPlusAst(AUnPlusAst node);
    void caseABreakAst(ABreakAst node);

    void caseTEnd(TEnd node);
    void caseTDiv(TDiv node);
    void caseTVar(TVar node);
    void caseTBegin(TBegin node);
    void caseTProgram(TProgram node);
    void caseTWriteln(TWriteln node);
    void caseTInteger(TInteger node);
    void caseTBoolean(TBoolean node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTIf(TIf node);
    void caseTWhile(TWhile node);
    void caseTBreak(TBreak node);
    void caseTDo(TDo node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTNot(TNot node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTMod(TMod node);
    void caseTAssign(TAssign node);
    void caseTEqual(TEqual node);
    void caseTLess(TLess node);
    void caseTGreater(TGreater node);
    void caseTLessEq(TLessEq node);
    void caseTGreaterEq(TGreaterEq node);
    void caseTUnequal(TUnequal node);
    void caseTComma(TComma node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTDot(TDot node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTIdentifier(TIdentifier node);
    void caseTNumber(TNumber node);
    void caseTComment(TComment node);
    void caseTWhitespace(TWhitespace node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
