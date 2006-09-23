// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ForallBodyConstruct> ::= AssignmentStmt:<AssignmentStmt>  :production574
 * <ForallBodyConstruct> ::= PointerAssignmentStmt:<PointerAssignmentStmt>  :production575
 * <ForallBodyConstruct> ::= WhereStmt:<WhereStmt>  :production576
 * <ForallBodyConstruct> ::= WhereConstruct:<WhereConstruct>  :production577
 * <ForallBodyConstruct> ::= ForallConstruct:<ForallConstruct>  :production578
 * <ForallBodyConstruct> ::= ForallStmt:<ForallStmt>  :production579
 */
public class ASTForallBodyConstructNode extends ParseTreeNode
{
    public ASTForallBodyConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTAssignmentStmtNode getASTAssignmentStmt()
    {
        return (ASTAssignmentStmtNode)this.getChild("AssignmentStmt");
    }

    public ASTPointerAssignmentStmtNode getASTPointerAssignmentStmt()
    {
        return (ASTPointerAssignmentStmtNode)this.getChild("PointerAssignmentStmt");
    }

    public ASTWhereStmtNode getASTWhereStmt()
    {
        return (ASTWhereStmtNode)this.getChild("WhereStmt");
    }

    public ASTWhereConstructNode getASTWhereConstruct()
    {
        return (ASTWhereConstructNode)this.getChild("WhereConstruct");
    }

    public ASTForallConstructNode getASTForallConstruct()
    {
        return (ASTForallConstructNode)this.getChild("ForallConstruct");
    }

    public ASTForallStmtNode getASTForallStmt()
    {
        return (ASTForallStmtNode)this.getChild("ForallStmt");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTForallBodyConstructNode(this); }
}
