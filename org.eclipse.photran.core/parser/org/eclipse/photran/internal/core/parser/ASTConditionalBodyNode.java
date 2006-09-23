// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ConditionalBody> ::= ExecutionPartConstruct:<ExecutionPartConstruct>  :production595
 * <ConditionalBody> ::= ConditionalBody:<ConditionalBody> ExecutionPartConstruct:<ExecutionPartConstruct>  :production596
 */
public class ASTConditionalBodyNode extends ParseTreeNode
{
    public ASTConditionalBodyNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTExecutionPartConstructNode getASTExecutionPartConstruct()
    {
        return (ASTExecutionPartConstructNode)this.getChild("ExecutionPartConstruct");
    }

    public ASTConditionalBodyNode getASTConditionalBody()
    {
        return (ASTConditionalBodyNode)this.getChild("ConditionalBody");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTConditionalBodyNode(this); }
}
