// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <SelectCaseRange> ::= SelectCaseBody:<SelectCaseBody> EndSelectStmt:<EndSelectStmt>  :production609
 * <SelectCaseRange> ::= EndSelectStmt:<EndSelectStmt>  :production610
 */
public class ASTSelectCaseRangeNode extends ParseTreeNode
{
    public ASTSelectCaseRangeNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTSelectCaseBodyNode getASTSelectCaseBody()
    {
        return (ASTSelectCaseBodyNode)this.getChild("SelectCaseBody");
    }

    public ASTEndSelectStmtNode getASTEndSelectStmt()
    {
        return (ASTEndSelectStmtNode)this.getChild("EndSelectStmt");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSelectCaseRangeNode(this); }
}
