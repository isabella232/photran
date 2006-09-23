// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <RelOp> ::= teq:T_EQ  :production132
 * <RelOp> ::= tne:T_NE  :production133
 * <RelOp> ::= tlt:T_LT  :production134
 * <RelOp> ::= tle:T_LE  :production135
 * <RelOp> ::= tgt:T_GT  :production136
 * <RelOp> ::= tge:T_GE  :production137
 * <RelOp> ::= teqeq:T_EQEQ  :production138
 * <RelOp> ::= tslasheq:T_SLASHEQ  :production139
 * <RelOp> ::= tlessthan:T_LESSTHAN  :production140
 * <RelOp> ::= tlessthaneq:T_LESSTHANEQ  :production141
 * <RelOp> ::= tgreaterthan:T_GREATERTHAN  :production142
 * <RelOp> ::= tgreaterthaneq:T_GREATERTHANEQ  :production143
 */
public class ASTRelOpNode extends ParseTreeNode
{
    public ASTRelOpNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTeq()
    {
        return this.getChildToken("teq");
    }

    public Token getASTTne()
    {
        return this.getChildToken("tne");
    }

    public Token getASTTlt()
    {
        return this.getChildToken("tlt");
    }

    public Token getASTTle()
    {
        return this.getChildToken("tle");
    }

    public Token getASTTgt()
    {
        return this.getChildToken("tgt");
    }

    public Token getASTTge()
    {
        return this.getChildToken("tge");
    }

    public Token getASTTeqeq()
    {
        return this.getChildToken("teqeq");
    }

    public Token getASTTslasheq()
    {
        return this.getChildToken("tslasheq");
    }

    public Token getASTTlessthan()
    {
        return this.getChildToken("tlessthan");
    }

    public Token getASTTlessthaneq()
    {
        return this.getChildToken("tlessthaneq");
    }

    public Token getASTTgreaterthan()
    {
        return this.getChildToken("tgreaterthan");
    }

    public Token getASTTgreaterthaneq()
    {
        return this.getChildToken("tgreaterthaneq");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTRelOpNode(this); }
}
