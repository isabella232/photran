// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <UnitIdentifier> ::= UFExpr:<UFExpr>  :production664
 * <UnitIdentifier> ::= tasterisk:T_ASTERISK  :production665
 */
public class ASTUnitIdentifierNode extends ParseTreeNode
{
    public ASTUnitIdentifierNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTUFExprNode getASTUFExpr()
    {
        return (ASTUFExprNode)this.getChild("UFExpr");
    }

    public Token getASTTasterisk()
    {
        return this.getChildToken("tasterisk");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTUnitIdentifierNode(this); }
}
