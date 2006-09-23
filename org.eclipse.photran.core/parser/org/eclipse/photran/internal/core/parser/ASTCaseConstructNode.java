// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <CaseConstruct> ::= SelectCaseStmt:<SelectCaseStmt> SelectCaseRange:<SelectCaseRange>  :production608
 */
public class ASTCaseConstructNode extends ParseTreeNode
{
    public ASTCaseConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTSelectCaseStmtNode getASTSelectCaseStmt()
    {
        return (ASTSelectCaseStmtNode)this.getChild("SelectCaseStmt");
    }

    public ASTSelectCaseRangeNode getASTSelectCaseRange()
    {
        return (ASTSelectCaseRangeNode)this.getChild("SelectCaseRange");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTCaseConstructNode(this); }
}
