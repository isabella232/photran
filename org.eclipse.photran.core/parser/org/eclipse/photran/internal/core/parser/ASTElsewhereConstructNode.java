// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ElsewhereConstruct> ::= ElsewhereStmt:<ElsewhereStmt> ElsewherePart:<ElsewherePart>  :production548
 */
public class ASTElsewhereConstructNode extends ParseTreeNode
{
    public ASTElsewhereConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTElsewhereStmtNode getASTElsewhereStmt()
    {
        return (ASTElsewhereStmtNode)this.getChild("ElsewhereStmt");
    }

    public ASTElsewherePartNode getASTElsewherePart()
    {
        return (ASTElsewherePartNode)this.getChild("ElsewherePart");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTElsewhereConstructNode(this); }
}
