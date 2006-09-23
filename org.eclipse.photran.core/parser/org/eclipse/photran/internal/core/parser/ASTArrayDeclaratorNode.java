// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <ArrayDeclarator> ::= VariableName:<VariableName> tlparen:T_LPAREN ArraySpec:<ArraySpec> trparen:T_RPAREN  :production328
 */
public class ASTArrayDeclaratorNode extends ParseTreeNode
{
    public ASTArrayDeclaratorNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTVariableNameNode getASTVariableName()
    {
        return (ASTVariableNameNode)this.getChild("VariableName");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTArraySpecNode getASTArraySpec()
    {
        return (ASTArraySpecNode)this.getChild("ArraySpec");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTArrayDeclaratorNode(this); }
}
