// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ExplicitShapeSpec> ::= LowerBound:<LowerBound> tcolon:T_COLON UpperBound:<UpperBound>  :production291
 * <ExplicitShapeSpec> ::= UpperBound:<UpperBound>  :production292
 */
public class ASTExplicitShapeSpecNode extends ParseTreeNode
{
    public ASTExplicitShapeSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLowerBoundNode getASTLowerBound()
    {
        return (ASTLowerBoundNode)this.getChild("LowerBound");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    public ASTUpperBoundNode getASTUpperBound()
    {
        return (ASTUpperBoundNode)this.getChild("UpperBound");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTExplicitShapeSpecNode(this); }
}
