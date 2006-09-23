// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <EndInterfaceStmt> ::= LblDef:<LblDef> tendinterface:T_ENDINTERFACE ( EndName:<EndName> )? teos:T_EOS  :production850
 * <EndInterfaceStmt> ::= LblDef:<LblDef> tend:T_END tinterface:T_INTERFACE ( EndName:<EndName> )? teos:T_EOS  :production851
 */
public class ASTEndInterfaceStmtNode extends ParseTreeNode
{
    public ASTEndInterfaceStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTendinterface()
    {
        return this.getChildToken("tendinterface");
    }

    public ASTEndNameNode getASTEndName()
    {
        return (ASTEndNameNode)this.getChild("EndName");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTend()
    {
        return this.getChildToken("tend");
    }

    public Token getASTTinterface()
    {
        return this.getChildToken("tinterface");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTEndInterfaceStmtNode(this); }
}
