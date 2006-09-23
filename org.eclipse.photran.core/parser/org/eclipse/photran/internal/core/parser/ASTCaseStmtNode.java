// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <CaseStmt> ::= LblDef:<LblDef> tcase:T_CASE CaseSelector:<CaseSelector> teos:T_EOS  :production619
 * <CaseStmt> ::= LblDef:<LblDef> tcase:T_CASE CaseSelector:<CaseSelector> Name:<Name> teos:T_EOS  :production620
 */
public class ASTCaseStmtNode extends ParseTreeNode
{
    public ASTCaseStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTcase()
    {
        return this.getChildToken("tcase");
    }

    public ASTCaseSelectorNode getASTCaseSelector()
    {
        return (ASTCaseSelectorNode)this.getChild("CaseSelector");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public ASTNameNode getASTName()
    {
        return (ASTNameNode)this.getChild("Name");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTCaseStmtNode(this); }
}
