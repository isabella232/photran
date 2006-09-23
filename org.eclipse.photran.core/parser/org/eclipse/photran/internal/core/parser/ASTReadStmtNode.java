// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ReadStmt> ::= LblDef:<LblDef> tread:T_READ RdCtlSpec:<RdCtlSpec> InputItemList:<InputItemList> teos:T_EOS  :production691
 * <ReadStmt> ::= LblDef:<LblDef> tread:T_READ RdCtlSpec:<RdCtlSpec> teos:T_EOS  :production692
 * <ReadStmt> ::= LblDef:<LblDef> tread:T_READ RdFmtId:<RdFmtId> tcomma:T_COMMA InputItemList:<InputItemList> teos:T_EOS  :production693
 * <ReadStmt> ::= LblDef:<LblDef> tread:T_READ RdFmtId:<RdFmtId> teos:T_EOS  :production694
 */
public class ASTReadStmtNode extends ParseTreeNode
{
    public ASTReadStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTread()
    {
        return this.getChildToken("tread");
    }

    public ASTRdCtlSpecNode getASTRdCtlSpec()
    {
        return (ASTRdCtlSpecNode)this.getChild("RdCtlSpec");
    }

    public ASTInputItemListNode getASTInputItemList()
    {
        return (ASTInputItemListNode)this.getChild("InputItemList");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public ASTRdFmtIdNode getASTRdFmtId()
    {
        return (ASTRdFmtIdNode)this.getChild("RdFmtId");
    }

    public Token getASTTcomma()
    {
        return this.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTReadStmtNode(this); }
}
