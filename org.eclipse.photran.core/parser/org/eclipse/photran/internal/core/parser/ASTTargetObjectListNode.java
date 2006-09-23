// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <TargetObjectList> ::= TargetObject:<TargetObject>  :production341
 * <TargetObjectList> ::= @:<TargetObjectList> tcomma:T_COMMA TargetObject:<TargetObject>  :production342
 */
public class ASTTargetObjectListNode extends ParseTreeNode
{
    public ASTTargetObjectListNode(Nonterminal nonterminal, Production production)
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

    public ASTTargetObjectNode getASTTargetObject(int index)
    {
        ASTTargetObjectListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTTargetObjectListNode)node.getChild("@");
        return (ASTTargetObjectNode)node.getChild("TargetObject");
    }

    public Token getASTTcomma(int index)
    {
        ASTTargetObjectListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTTargetObjectListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTTargetObjectListNode(this); }
}
