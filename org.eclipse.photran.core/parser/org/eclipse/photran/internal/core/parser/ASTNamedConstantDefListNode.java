// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <NamedConstantDefList> ::= NamedConstantDef:<NamedConstantDef>  :production347
 * <NamedConstantDefList> ::= @:<NamedConstantDefList> tcomma:T_COMMA NamedConstantDef:<NamedConstantDef>  :production348
 */
public class ASTNamedConstantDefListNode extends ParseTreeNode
{
    public ASTNamedConstantDefListNode(Nonterminal nonterminal, Production production)
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

    public ASTNamedConstantDefNode getASTNamedConstantDef(int index)
    {
        ASTNamedConstantDefListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTNamedConstantDefListNode)node.getChild("@");
        return (ASTNamedConstantDefNode)node.getChild("NamedConstantDef");
    }

    public Token getASTTcomma(int index)
    {
        ASTNamedConstantDefListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTNamedConstantDefListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTNamedConstantDefListNode(this); }
}
