// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <EndForallStmt> ::= LblDef:<LblDef> tend:T_END tforall:T_FORALL ( EndName:<EndName> )? teos:T_EOS  :production580
 * <EndForallStmt> ::= LblDef:<LblDef> tendforall:T_ENDFORALL ( EndName:<EndName> )? teos:T_EOS  :production581
 */
public class ASTEndForallStmtNode extends ParseTreeNode
{
    public ASTEndForallStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTend()
    {
        return this.getChildToken("tend");
    }

    public Token getASTTforall()
    {
        return this.getChildToken("tforall");
    }

    public ASTEndNameNode getASTEndName()
    {
        return (ASTEndNameNode)this.getChild("EndName");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTendforall()
    {
        return this.getChildToken("tendforall");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTEndForallStmtNode(this); }
}
