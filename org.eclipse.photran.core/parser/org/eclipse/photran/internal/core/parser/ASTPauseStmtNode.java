// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <PauseStmt> ::= LblDef:<LblDef> tpause:T_PAUSE teos:T_EOS  :production956
 * <PauseStmt> ::= LblDef:<LblDef> tpause:T_PAUSE ticon:T_ICON teos:T_EOS  :production957
 * <PauseStmt> ::= LblDef:<LblDef> tpause:T_PAUSE tscon:T_SCON teos:T_EOS  :production958
 */
public class ASTPauseStmtNode extends ParseTreeNode
{
    public ASTPauseStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTpause()
    {
        return this.getChildToken("tpause");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTicon()
    {
        return this.getChildToken("ticon");
    }

    public Token getASTTscon()
    {
        return this.getChildToken("tscon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTPauseStmtNode(this); }
}
