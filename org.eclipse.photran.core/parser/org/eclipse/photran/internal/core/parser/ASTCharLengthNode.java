// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <CharLength> ::= tlparen:T_LPAREN CharLenParamValue:<CharLenParamValue> trparen:T_RPAREN  :production272
 * <CharLength> ::= ticon:T_ICON  :production273
 */
public class ASTCharLengthNode extends ParseTreeNode
{
    public ASTCharLengthNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTCharLenParamValueNode getASTCharLenParamValue()
    {
        return (ASTCharLenParamValueNode)this.getChild("CharLenParamValue");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTicon()
    {
        return this.getChildToken("ticon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTCharLengthNode(this); }
}
