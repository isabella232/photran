// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <Subscript> ::= Expr:<Expr>  :production419
 */
public class ASTSubscriptNode extends ParseTreeNode
{
    public ASTSubscriptNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTExprNode getASTExpr()
    {
        return (ASTExprNode)this.getChild("Expr");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSubscriptNode(this); }
}
