// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ForallBody> ::= ForallBodyConstruct:<ForallBodyConstruct>  :production565
 * <ForallBody> ::= ForallBody:<ForallBody> ForallBodyConstruct:<ForallBodyConstruct>  :production566
 */
public class ASTForallBodyNode extends ParseTreeNode
{
    public ASTForallBodyNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTForallBodyConstructNode getASTForallBodyConstruct()
    {
        return (ASTForallBodyConstructNode)this.getChild("ForallBodyConstruct");
    }

    public ASTForallBodyNode getASTForallBody()
    {
        return (ASTForallBodyNode)this.getChild("ForallBody");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTForallBodyNode(this); }
}
