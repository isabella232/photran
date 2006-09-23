// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ReturnStmt> ::= LblDef:<LblDef> treturn:T_RETURN teos:T_EOS  :production921
 * <ReturnStmt> ::= LblDef:<LblDef> treturn:T_RETURN Expr:<Expr> teos:T_EOS  :production922
 */
public class ASTReturnStmtNode extends ParseTreeNode
{
    public ASTReturnStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTreturn()
    {
        return this.getChildToken("treturn");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public ASTExprNode getASTExpr()
    {
        return (ASTExprNode)this.getChild("Expr");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTReturnStmtNode(this); }
}
