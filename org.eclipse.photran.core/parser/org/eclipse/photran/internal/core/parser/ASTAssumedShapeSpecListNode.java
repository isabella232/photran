// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <AssumedShapeSpecList> ::= LowerBound:<LowerBound> tcolon:T_COLON  :production286
 * <AssumedShapeSpecList> ::= DeferredShapeSpecList:<DeferredShapeSpecList> tcomma:T_COMMA LowerBound:<LowerBound> tcolon:T_COLON  :production287
 * <AssumedShapeSpecList> ::= @:<AssumedShapeSpecList> tcomma:T_COMMA AssumedShapeSpec:<AssumedShapeSpec>  :production288
 */
public class ASTAssumedShapeSpecListNode extends ParseTreeNode
{
    public ASTAssumedShapeSpecListNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public int count()
    {
        ParseTreeNode node = this;
        int count = 1;
        while (node.getChild("@") != null)
        {
            count++;
            node = node.getChild("@");
        }
        return count;
    }

    public ASTLowerBoundNode getASTLowerBound(int index)
    {
        ASTAssumedShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAssumedShapeSpecListNode)node.getChild("@");
        return (ASTLowerBoundNode)node.getChild("LowerBound");
    }

    public Token getASTTcolon(int index)
    {
        ASTAssumedShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAssumedShapeSpecListNode)node.getChild("@");
        return node.getChildToken("tcolon");
    }

    public ASTDeferredShapeSpecListNode getASTDeferredShapeSpecList(int index)
    {
        ASTAssumedShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAssumedShapeSpecListNode)node.getChild("@");
        return (ASTDeferredShapeSpecListNode)node.getChild("DeferredShapeSpecList");
    }

    public Token getASTTcomma(int index)
    {
        ASTAssumedShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAssumedShapeSpecListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    public ASTAssumedShapeSpecNode getASTAssumedShapeSpec(int index)
    {
        ASTAssumedShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAssumedShapeSpecListNode)node.getChild("@");
        return (ASTAssumedShapeSpecNode)node.getChild("AssumedShapeSpec");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTAssumedShapeSpecListNode(this); }
}
