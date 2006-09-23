// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <OptionalStmt> ::= LblDef:<LblDef> toptional:T_OPTIONAL ( tcolon:T_COLON tcolon2:T_COLON )? OptionalParList:<OptionalParList> teos:T_EOS  :production308
 */
public class ASTOptionalStmtNode extends ParseTreeNode
{
    public ASTOptionalStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTToptional()
    {
        return this.getChildToken("toptional");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    public Token getASTTcolon2()
    {
        return this.getChildToken("tcolon2");
    }

    public ASTOptionalParListNode getASTOptionalParList()
    {
        return (ASTOptionalParListNode)this.getChild("OptionalParList");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTOptionalStmtNode(this); }
}
