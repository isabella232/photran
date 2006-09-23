// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <RewindStmt> ::= LblDef:<LblDef> trewind:T_REWIND UnitIdentifier:<UnitIdentifier> teos:T_EOS  :production754
 * <RewindStmt> ::= LblDef:<LblDef> trewind:T_REWIND tlparen:T_LPAREN PositionSpecList:<PositionSpecList> trparen:T_RPAREN teos:T_EOS  :production755
 */
public class ASTRewindStmtNode extends ParseTreeNode
{
    public ASTRewindStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTrewind()
    {
        return this.getChildToken("trewind");
    }

    public ASTUnitIdentifierNode getASTUnitIdentifier()
    {
        return (ASTUnitIdentifierNode)this.getChild("UnitIdentifier");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTPositionSpecListNode getASTPositionSpecList()
    {
        return (ASTPositionSpecListNode)this.getChild("PositionSpecList");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTRewindStmtNode(this); }
}
