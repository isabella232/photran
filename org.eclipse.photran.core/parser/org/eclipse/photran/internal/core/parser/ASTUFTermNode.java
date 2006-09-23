// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <UFTerm> ::= UFFactor:<UFFactor>  :production482
 * <UFTerm> ::= UFTerm:<UFTerm> MultOp:<MultOp> UFFactor:<UFFactor>  :production483
 * <UFTerm> ::= UFTerm:<UFTerm> ConcatOp:<ConcatOp> UFPrimary:<UFPrimary>  :production484
 */
public class ASTUFTermNode extends ParseTreeNode
{
    public ASTUFTermNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTUFFactorNode getASTUFFactor()
    {
        return (ASTUFFactorNode)this.getChild("UFFactor");
    }

    public ASTUFTermNode getASTUFTerm()
    {
        return (ASTUFTermNode)this.getChild("UFTerm");
    }

    public ASTMultOpNode getASTMultOp()
    {
        return (ASTMultOpNode)this.getChild("MultOp");
    }

    public ASTConcatOpNode getASTConcatOp()
    {
        return (ASTConcatOpNode)this.getChild("ConcatOp");
    }

    public ASTUFPrimaryNode getASTUFPrimary()
    {
        return (ASTUFPrimaryNode)this.getChild("UFPrimary");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTUFTermNode(this); }
}
