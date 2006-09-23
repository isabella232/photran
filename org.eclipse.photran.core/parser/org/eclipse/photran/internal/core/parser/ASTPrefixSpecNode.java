// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <PrefixSpec> ::= TypeSpec:<TypeSpec>  :production901
 * <PrefixSpec> ::= trecursive:T_RECURSIVE  :production902
 * <PrefixSpec> ::= tpure:T_PURE  :production903
 * <PrefixSpec> ::= telemental:T_ELEMENTAL  :production904
 */
public class ASTPrefixSpecNode extends ParseTreeNode
{
    public ASTPrefixSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTTypeSpecNode getASTTypeSpec()
    {
        return (ASTTypeSpecNode)this.getChild("TypeSpec");
    }

    public Token getASTTrecursive()
    {
        return this.getChildToken("trecursive");
    }

    public Token getASTTpure()
    {
        return this.getChildToken("tpure");
    }

    public Token getASTTelemental()
    {
        return this.getChildToken("telemental");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTPrefixSpecNode(this); }
}
