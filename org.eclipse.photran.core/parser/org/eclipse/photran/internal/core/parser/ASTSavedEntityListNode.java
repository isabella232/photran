// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <SavedEntityList> ::= SavedEntity:<SavedEntity>  :production320
 * <SavedEntityList> ::= @:<SavedEntityList> tcomma:T_COMMA SavedEntity:<SavedEntity>  :production321
 */
public class ASTSavedEntityListNode extends ParseTreeNode
{
    public ASTSavedEntityListNode(Nonterminal nonterminal, Production production)
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

    public ASTSavedEntityNode getASTSavedEntity(int index)
    {
        ASTSavedEntityListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTSavedEntityListNode)node.getChild("@");
        return (ASTSavedEntityNode)node.getChild("SavedEntity");
    }

    public Token getASTTcomma(int index)
    {
        ASTSavedEntityListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTSavedEntityListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSavedEntityListNode(this); }
}
