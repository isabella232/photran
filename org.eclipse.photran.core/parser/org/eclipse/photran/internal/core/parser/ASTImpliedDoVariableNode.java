// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ImpliedDoVariable> ::= tident:T_IDENT  :production939
 */
public class ASTImpliedDoVariableNode extends ParseTreeNode
{
    public ASTImpliedDoVariableNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTident()
    {
        return this.getChildToken("tident");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTImpliedDoVariableNode(this); }
}
