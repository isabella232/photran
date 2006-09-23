// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <DataStmtSet> ::= DataStmtObjectList:<DataStmtObjectList> tslash:T_SLASH DataStmtValueList:<DataStmtValueList> tslash2:T_SLASH  :production354
 */
public class ASTDataStmtSetNode extends ParseTreeNode
{
    public ASTDataStmtSetNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTDataStmtObjectListNode getASTDataStmtObjectList()
    {
        return (ASTDataStmtObjectListNode)this.getChild("DataStmtObjectList");
    }

    public Token getASTTslash()
    {
        return this.getChildToken("tslash");
    }

    public ASTDataStmtValueListNode getASTDataStmtValueList()
    {
        return (ASTDataStmtValueListNode)this.getChild("DataStmtValueList");
    }

    public Token getASTTslash2()
    {
        return this.getChildToken("tslash2");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTDataStmtSetNode(this); }
}
