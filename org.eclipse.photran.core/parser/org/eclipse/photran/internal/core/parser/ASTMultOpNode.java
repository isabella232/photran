// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <MultOp> ::= tasterisk:T_ASTERISK  :production125
 * <MultOp> ::= tslash:T_SLASH  :production126
 */
public class ASTMultOpNode extends ParseTreeNode
{
    public ASTMultOpNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTasterisk()
    {
        return this.getChildToken("tasterisk");
    }

    public Token getASTTslash()
    {
        return this.getChildToken("tslash");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTMultOpNode(this); }
}
