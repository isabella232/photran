// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <BozLiteralConstant> ::= tbcon:T_BCON  :production171
 * <BozLiteralConstant> ::= tocon:T_OCON  :production172
 * <BozLiteralConstant> ::= tzcon:T_ZCON  :production173
 */
public class ASTBozLiteralConstantNode extends ParseTreeNode
{
    public ASTBozLiteralConstantNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTbcon()
    {
        return this.getChildToken("tbcon");
    }

    public Token getASTTocon()
    {
        return this.getChildToken("tocon");
    }

    public Token getASTTzcon()
    {
        return this.getChildToken("tzcon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTBozLiteralConstantNode(this); }
}
