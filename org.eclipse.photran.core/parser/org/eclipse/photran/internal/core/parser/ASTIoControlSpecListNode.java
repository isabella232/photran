// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <IoControlSpecList> ::= UnitIdentifier:<UnitIdentifier>  :xIoControlSpecList
 * <IoControlSpecList> ::= UnitIdentifier:<UnitIdentifier> tcomma:T_COMMA FormatIdentifier:<FormatIdentifier>  :production714
 * <IoControlSpecList> ::= UnitIdentifier:<UnitIdentifier> tcomma:T_COMMA IoControlSpec:<IoControlSpec>  :production715
 * <IoControlSpecList> ::= IoControlSpec:<IoControlSpec>  :production716
 * <IoControlSpecList> ::= @:<IoControlSpecList> tcomma:T_COMMA IoControlSpec:<IoControlSpec>  :production717
 */
public class ASTIoControlSpecListNode extends ParseTreeNode
{
    public ASTIoControlSpecListNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public int count()
    {
        ParseTreeNode node = this;
        int count = 1;
        while (node.getChild("@") != null)
        {
            count++;
            node = node.getChild("@");
        }
        return count;
    }

    public ASTUnitIdentifierNode getASTUnitIdentifier(int index)
    {
        ASTIoControlSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTIoControlSpecListNode)node.getChild("@");
        return (ASTUnitIdentifierNode)node.getChild("UnitIdentifier");
    }

    public Token getASTTcomma(int index)
    {
        ASTIoControlSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTIoControlSpecListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    public ASTFormatIdentifierNode getASTFormatIdentifier(int index)
    {
        ASTIoControlSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTIoControlSpecListNode)node.getChild("@");
        return (ASTFormatIdentifierNode)node.getChild("FormatIdentifier");
    }

    public ASTIoControlSpecNode getASTIoControlSpec(int index)
    {
        ASTIoControlSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTIoControlSpecListNode)node.getChild("@");
        return (ASTIoControlSpecNode)node.getChild("IoControlSpec");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTIoControlSpecListNode(this); }
}
