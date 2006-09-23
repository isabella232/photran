// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <LabelDoStmt> ::= LblDef:<LblDef> tdo:T_DO LblRef:<LblRef> CommaLoopControl:<CommaLoopControl> teos:T_EOS  :production633
 * <LabelDoStmt> ::= LblDef:<LblDef> tdo:T_DO LblRef:<LblRef> teos:T_EOS  :production634
 * <LabelDoStmt> ::= LblDef:<LblDef> tdo:T_DO CommaLoopControl:<CommaLoopControl> teos:T_EOS  :production635
 * <LabelDoStmt> ::= LblDef:<LblDef> tdo:T_DO teos:T_EOS  :production636
 * <LabelDoStmt> ::= LblDef:<LblDef> Name:<Name> tcolon:T_COLON tdo:T_DO LblRef:<LblRef> CommaLoopControl:<CommaLoopControl> teos:T_EOS  :production637
 * <LabelDoStmt> ::= LblDef:<LblDef> Name:<Name> tcolon:T_COLON tdo:T_DO LblRef:<LblRef> teos:T_EOS  :production638
 * <LabelDoStmt> ::= LblDef:<LblDef> Name:<Name> tcolon:T_COLON tdo:T_DO CommaLoopControl:<CommaLoopControl> teos:T_EOS  :production639
 * <LabelDoStmt> ::= LblDef:<LblDef> Name:<Name> tcolon:T_COLON tdo:T_DO teos:T_EOS  :production640
 */
public class ASTLabelDoStmtNode extends ParseTreeNode
{
    public ASTLabelDoStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTdo()
    {
        return this.getChildToken("tdo");
    }

    public ASTLblRefNode getASTLblRef()
    {
        return (ASTLblRefNode)this.getChild("LblRef");
    }

    public ASTCommaLoopControlNode getASTCommaLoopControl()
    {
        return (ASTCommaLoopControlNode)this.getChild("CommaLoopControl");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public ASTNameNode getASTName()
    {
        return (ASTNameNode)this.getChild("Name");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTLabelDoStmtNode(this); }
}
