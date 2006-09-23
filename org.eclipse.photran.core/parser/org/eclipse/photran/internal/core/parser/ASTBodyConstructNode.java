// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <BodyConstruct> ::= SpecificationPartConstruct:<SpecificationPartConstruct>  :production15
 * <BodyConstruct> ::= ExecutableConstruct:<ExecutableConstruct>  :production16
 */
public class ASTBodyConstructNode extends ParseTreeNode
{
    public ASTBodyConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTSpecificationPartConstructNode getASTSpecificationPartConstruct()
    {
        return (ASTSpecificationPartConstructNode)this.getChild("SpecificationPartConstruct");
    }

    public ASTExecutableConstructNode getASTExecutableConstruct()
    {
        return (ASTExecutableConstructNode)this.getChild("ExecutableConstruct");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTBodyConstructNode(this); }
}
