// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;


/**
 * <InternalSubprogram> ::= FunctionSubprogram:<FunctionSubprogram>  :production55
 * <InternalSubprogram> ::= SubroutineSubprogram:<SubroutineSubprogram>  :production56
 */
public class ASTInternalSubprogramNode extends ParseTreeNode
{
    public ASTInternalSubprogramNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTFunctionSubprogramNode getASTFunctionSubprogram()
    {
        return (ASTFunctionSubprogramNode)this.getChild("FunctionSubprogram");
    }

    public ASTSubroutineSubprogramNode getASTSubroutineSubprogram()
    {
        return (ASTSubroutineSubprogramNode)this.getChild("SubroutineSubprogram");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTInternalSubprogramNode(this); }
}
