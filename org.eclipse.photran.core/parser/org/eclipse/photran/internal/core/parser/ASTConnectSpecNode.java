// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ConnectSpec> ::= tuniteq:T_UNITEQ UnitIdentifier:<UnitIdentifier>  :production670
 * <ConnectSpec> ::= terreq:T_ERREQ LblRef:<LblRef>  :production671
 * <ConnectSpec> ::= tfileeq:T_FILEEQ CExpr:<CExpr>  :production672
 * <ConnectSpec> ::= tstatuseq:T_STATUSEQ CExpr:<CExpr>  :production673
 * <ConnectSpec> ::= taccesseq:T_ACCESSEQ CExpr:<CExpr>  :production674
 * <ConnectSpec> ::= tformeq:T_FORMEQ CExpr:<CExpr>  :production675
 * <ConnectSpec> ::= trecleq:T_RECLEQ Expr:<Expr>  :production676
 * <ConnectSpec> ::= tblankeq:T_BLANKEQ CExpr:<CExpr>  :production677
 * <ConnectSpec> ::= tiostateq:T_IOSTATEQ ScalarVariable:<ScalarVariable>  :production678
 * <ConnectSpec> ::= tpositioneq:T_POSITIONEQ CExpr:<CExpr>  :production679
 * <ConnectSpec> ::= tactioneq:T_ACTIONEQ CExpr:<CExpr>  :production680
 * <ConnectSpec> ::= tdelimeq:T_DELIMEQ CExpr:<CExpr>  :production681
 * <ConnectSpec> ::= tpadeq:T_PADEQ CExpr:<CExpr>  :production682
 */
public class ASTConnectSpecNode extends ParseTreeNode
{
    public ASTConnectSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTuniteq()
    {
        return this.getChildToken("tuniteq");
    }

    public ASTUnitIdentifierNode getASTUnitIdentifier()
    {
        return (ASTUnitIdentifierNode)this.getChild("UnitIdentifier");
    }

    public Token getASTTerreq()
    {
        return this.getChildToken("terreq");
    }

    public ASTLblRefNode getASTLblRef()
    {
        return (ASTLblRefNode)this.getChild("LblRef");
    }

    public Token getASTTfileeq()
    {
        return this.getChildToken("tfileeq");
    }

    public ASTCExprNode getASTCExpr()
    {
        return (ASTCExprNode)this.getChild("CExpr");
    }

    public Token getASTTstatuseq()
    {
        return this.getChildToken("tstatuseq");
    }

    public Token getASTTaccesseq()
    {
        return this.getChildToken("taccesseq");
    }

    public Token getASTTformeq()
    {
        return this.getChildToken("tformeq");
    }

    public Token getASTTrecleq()
    {
        return this.getChildToken("trecleq");
    }

    public ASTExprNode getASTExpr()
    {
        return (ASTExprNode)this.getChild("Expr");
    }

    public Token getASTTblankeq()
    {
        return this.getChildToken("tblankeq");
    }

    public Token getASTTiostateq()
    {
        return this.getChildToken("tiostateq");
    }

    public ASTScalarVariableNode getASTScalarVariable()
    {
        return (ASTScalarVariableNode)this.getChild("ScalarVariable");
    }

    public Token getASTTpositioneq()
    {
        return this.getChildToken("tpositioneq");
    }

    public Token getASTTactioneq()
    {
        return this.getChildToken("tactioneq");
    }

    public Token getASTTdelimeq()
    {
        return this.getChildToken("tdelimeq");
    }

    public Token getASTTpadeq()
    {
        return this.getChildToken("tpadeq");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTConnectSpecNode(this); }
}
