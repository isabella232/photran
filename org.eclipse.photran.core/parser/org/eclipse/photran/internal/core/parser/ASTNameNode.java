// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <Name> ::= tident:T_IDENT  :production110
 */
public class ASTNameNode extends ParseTreeNode
{
    public ASTNameNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTident()
    {
        return this.getChildToken("tident");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTNameNode(this); }
}
