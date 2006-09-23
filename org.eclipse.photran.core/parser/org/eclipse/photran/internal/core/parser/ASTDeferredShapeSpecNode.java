// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <DeferredShapeSpec> ::= tcolon:T_COLON  :production299
 */
public class ASTDeferredShapeSpecNode extends ParseTreeNode
{
    public ASTDeferredShapeSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTDeferredShapeSpecNode(this); }
}
