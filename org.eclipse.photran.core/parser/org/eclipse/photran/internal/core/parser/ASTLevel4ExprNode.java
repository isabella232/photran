// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <Level4Expr> ::= ( Level3Expr:<Level3Expr> RelOp:<RelOp> )? Level3Expr2:<Level3Expr>  :production492
 */
public class ASTLevel4ExprNode extends ParseTreeNode
{
    public ASTLevel4ExprNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLevel3ExprNode getASTLevel3Expr()
    {
        return (ASTLevel3ExprNode)this.getChild("Level3Expr");
    }

    public ASTRelOpNode getASTRelOp()
    {
        return (ASTRelOpNode)this.getChild("RelOp");
    }

    public ASTLevel3ExprNode getASTLevel3Expr2()
    {
        return (ASTLevel3ExprNode)this.getChild("Level3Expr2");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTLevel4ExprNode(this); }
}
