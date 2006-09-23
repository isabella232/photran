// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ConnectSpecList> ::= UnitIdentifier:<UnitIdentifier>  :production667
 * <ConnectSpecList> ::= ConnectSpec:<ConnectSpec>  :production668
 * <ConnectSpecList> ::= @:<ConnectSpecList> tcomma:T_COMMA ConnectSpec:<ConnectSpec>  :production669
 */
public class ASTConnectSpecListNode extends ParseTreeNode
{
    public ASTConnectSpecListNode(Nonterminal nonterminal, Production production)
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

    public ASTUnitIdentifierNode getASTUnitIdentifier(int index)
    {
        ASTConnectSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTConnectSpecListNode)node.getChild("@");
        return (ASTUnitIdentifierNode)node.getChild("UnitIdentifier");
    }

    public ASTConnectSpecNode getASTConnectSpec(int index)
    {
        ASTConnectSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTConnectSpecListNode)node.getChild("@");
        return (ASTConnectSpecNode)node.getChild("ConnectSpec");
    }

    public Token getASTTcomma(int index)
    {
        ASTConnectSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTConnectSpecListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTConnectSpecListNode(this); }
}
