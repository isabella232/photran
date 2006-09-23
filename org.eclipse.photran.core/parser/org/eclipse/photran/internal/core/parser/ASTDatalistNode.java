// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <Datalist> ::= DataStmtSet:<DataStmtSet>  :production351
 * <Datalist> ::= @:<Datalist> DataStmtSet:<DataStmtSet>  :production352
 * <Datalist> ::= @:<Datalist> tcomma:T_COMMA DataStmtSet:<DataStmtSet>  :production353
 */
public class ASTDatalistNode extends ParseTreeNode
{
    public ASTDatalistNode(Nonterminal nonterminal, Production production)
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

    public ASTDataStmtSetNode getASTDataStmtSet(int index)
    {
        ASTDatalistNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTDatalistNode)node.getChild("@");
        return (ASTDataStmtSetNode)node.getChild("DataStmtSet");
    }

    public Token getASTTcomma(int index)
    {
        ASTDatalistNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTDatalistNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTDatalistNode(this); }
}
