// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ArraySpec> ::= ExplicitShapeSpecList:<ExplicitShapeSpecList>  :production282
 * <ArraySpec> ::= AssumedSizeSpec:<AssumedSizeSpec>  :production283
 * <ArraySpec> ::= AssumedShapeSpecList:<AssumedShapeSpecList>  :production284
 * <ArraySpec> ::= DeferredShapeSpecList:<DeferredShapeSpecList>  :production285
 */
public class ASTArraySpecNode extends ParseTreeNode
{
    public ASTArraySpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTExplicitShapeSpecListNode getASTExplicitShapeSpecList()
    {
        return (ASTExplicitShapeSpecListNode)this.getChild("ExplicitShapeSpecList");
    }

    public ASTAssumedSizeSpecNode getASTAssumedSizeSpec()
    {
        return (ASTAssumedSizeSpecNode)this.getChild("AssumedSizeSpec");
    }

    public ASTAssumedShapeSpecListNode getASTAssumedShapeSpecList()
    {
        return (ASTAssumedShapeSpecListNode)this.getChild("AssumedShapeSpecList");
    }

    public ASTDeferredShapeSpecListNode getASTDeferredShapeSpecList()
    {
        return (ASTDeferredShapeSpecListNode)this.getChild("DeferredShapeSpecList");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTArraySpecNode(this); }
}
