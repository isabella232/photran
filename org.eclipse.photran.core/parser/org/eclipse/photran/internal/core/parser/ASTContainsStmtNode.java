// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ContainsStmt> ::= LblDef:<LblDef> tcontains:T_CONTAINS teos:T_EOS  :production923
 */
public class ASTContainsStmtNode extends ParseTreeNode
{
    public ASTContainsStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTcontains()
    {
        return this.getChildToken("tcontains");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTContainsStmtNode(this); }
}
