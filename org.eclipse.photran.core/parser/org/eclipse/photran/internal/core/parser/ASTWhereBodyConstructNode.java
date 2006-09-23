// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <WhereBodyConstruct> ::= AssignmentStmt:<AssignmentStmt>  :production555
 * <WhereBodyConstruct> ::= WhereStmt:<WhereStmt>  :production556
 * <WhereBodyConstruct> ::= WhereConstruct:<WhereConstruct>  :production557
 */
public class ASTWhereBodyConstructNode extends ParseTreeNode
{
    public ASTWhereBodyConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTAssignmentStmtNode getASTAssignmentStmt()
    {
        return (ASTAssignmentStmtNode)this.getChild("AssignmentStmt");
    }

    public ASTWhereStmtNode getASTWhereStmt()
    {
        return (ASTWhereStmtNode)this.getChild("WhereStmt");
    }

    public ASTWhereConstructNode getASTWhereConstruct()
    {
        return (ASTWhereConstructNode)this.getChild("WhereConstruct");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTWhereBodyConstructNode(this); }
}
