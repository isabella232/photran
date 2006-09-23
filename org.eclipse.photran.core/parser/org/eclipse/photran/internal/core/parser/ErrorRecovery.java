// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser; import org.eclipse.photran.internal.core.lexer.*;

import java.util.LinkedList;

/**
 * The methods in this class use the error productions specified
 * in the grammar to attempt to recover from syntax errors.
 */
public class ErrorRecovery
{

    private abstract class AbstractErrorProduction
    {
        public abstract boolean applies(Parser parser);

        public abstract boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception;
    }
    protected Parser parser;
    protected ErrorRecovery.AbstractErrorProduction[] errorProductions;
    protected LinkedList recoveryList;

    public ErrorRecovery(Parser parserToRecover)
    {
        parser = parserToRecover;
        errorProductions = new ErrorRecovery.AbstractErrorProduction[6];
        errorProductions[0] = new ErrorRecovery.ErrorProduction0();
        errorProductions[1] = new ErrorRecovery.ErrorProduction1();
        errorProductions[2] = new ErrorRecovery.ErrorProduction2();
        errorProductions[3] = new ErrorRecovery.ErrorProduction3();
        errorProductions[4] = new ErrorRecovery.ErrorProduction4();
        errorProductions[5] = new ErrorRecovery.ErrorProduction5();
    }

    boolean recover() throws Exception
    {
        recoveryList = new LinkedList();
        while (!parser.getSymbolStack().isEmpty())
        {
            int errorProductionToUse = getRecoveryProductionForCurrentState();
            if (errorProductionToUse > -1) return errorProductions[errorProductionToUse].attemptRecovery(parser, recoveryList);

            // No error production applied, so pop the stacks and try again

            // Determine how many values on the parser's valueStack correspond to
            // the symbol on top of its symbolStack, and pop them off the valueStack, saving them
            // in the recoveryList
            TerminalOrNonterminal symOnTop = (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1);
            int symsToPop = symOnTop.getNumberOfSymbolsOnValueStack();
            for (int i = 0; i < symsToPop; i++)
            {
                recoveryList.add(0, (Object)parser.getValueStack().get(parser.getValueStack().size()-1));
                parser.getValueStack().remove(parser.getValueStack().size() - 1);
            }

            // Only one symbol needs to be popped from the state and symbol stacks
            parser.getStateStack().remove(parser.getStateStack().size() - 1);
            parser.getSymbolStack().remove(parser.getSymbolStack().size() - 1);
        }
        return false;
    }

    protected int getRecoveryProductionForCurrentState()
    {
        // Try each of the 6 error productions
        for (int i = 0; i < 6; i++)
            if (errorProductions[i].applies(parser)) return i;
        return -1;
    }

    /**
     * <FormatStmt> ::= tformat:T_FORMAT %error T_EOS ;
     */
    private class ErrorProduction0 extends AbstractErrorProduction
    {
        public boolean applies(Parser parser)
        {
            return parser.getSymbolStack().size() >= 1 && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1) == Terminal.TFormatTerminal.getInstance();
        }

        public boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception
        {
            // Discard tokens until we reach a token which successfully terminates this error production
            while (parser.getLookaheadToken().getTerminal() != Terminal.T_EOS)
            {
                if (parser.getLookaheadToken().getTerminal() == Terminal.END_OF_INPUT) return false;
                recoveryList.add(parser.getLookaheadToken());
                parser.readNextToken();
            }

            // Now push a %stack token and associate it with the recoveryList and no particular state
            parser.getSymbolStack().add(Terminal.ERROR);
            parser.getValueStack().add(recoveryList);
            parser.getStateStack().add(new Integer(-999));

            // Finally, shift the resume token and go to a state where the parser will reduce by this error production
            parser.shiftAndGoToState(1078);
            return true;
        }
    }

    /**
     * <FormatStmt> ::= LblDef:<LblDef> tformat:T_FORMAT %error T_EOS ;
     */
    private class ErrorProduction1 extends AbstractErrorProduction
    {
        public boolean applies(Parser parser)
        {
            return parser.getSymbolStack().size() >= 2 && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1) == Terminal.TFormatTerminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-2) == Nonterminal.LblDefNonterminal.getInstance();
        }

        public boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception
        {
            // Discard tokens until we reach a token which successfully terminates this error production
            while (parser.getLookaheadToken().getTerminal() != Terminal.T_EOS)
            {
                if (parser.getLookaheadToken().getTerminal() == Terminal.END_OF_INPUT) return false;
                recoveryList.add(parser.getLookaheadToken());
                parser.readNextToken();
            }

            // Now push a %stack token and associate it with the recoveryList and no particular state
            parser.getSymbolStack().add(Terminal.ERROR);
            parser.getValueStack().add(recoveryList);
            parser.getStateStack().add(new Integer(-999));

            // Finally, shift the resume token and go to a state where the parser will reduce by this error production
            parser.shiftAndGoToState(1493);
            return true;
        }
    }

    /**
     * <FunctionStmt> ::= FunctionPrefix:<FunctionPrefix> FunctionName:<FunctionName> %error T_EOS ;
     */
    private class ErrorProduction2 extends AbstractErrorProduction
    {
        public boolean applies(Parser parser)
        {
            return parser.getSymbolStack().size() >= 2 && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1) == Nonterminal.FunctionNameNonterminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-2) == Nonterminal.FunctionPrefixNonterminal.getInstance();
        }

        public boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception
        {
            // Discard tokens until we reach a token which successfully terminates this error production
            while (parser.getLookaheadToken().getTerminal() != Terminal.T_EOS)
            {
                if (parser.getLookaheadToken().getTerminal() == Terminal.END_OF_INPUT) return false;
                recoveryList.add(parser.getLookaheadToken());
                parser.readNextToken();
            }

            // Now push a %stack token and associate it with the recoveryList and no particular state
            parser.getSymbolStack().add(Terminal.ERROR);
            parser.getValueStack().add(recoveryList);
            parser.getStateStack().add(new Integer(-999));

            // Finally, shift the resume token and go to a state where the parser will reduce by this error production
            parser.shiftAndGoToState(1429);
            return true;
        }
    }

    /**
     * <FunctionStmt> ::= LblDef:<LblDef> FunctionPrefix:<FunctionPrefix> FunctionName:<FunctionName> %error T_EOS ;
     */
    private class ErrorProduction3 extends AbstractErrorProduction
    {
        public boolean applies(Parser parser)
        {
            return parser.getSymbolStack().size() >= 3 && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1) == Nonterminal.FunctionNameNonterminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-2) == Nonterminal.FunctionPrefixNonterminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-3) == Nonterminal.LblDefNonterminal.getInstance();
        }

        public boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception
        {
            // Discard tokens until we reach a token which successfully terminates this error production
            while (parser.getLookaheadToken().getTerminal() != Terminal.T_EOS)
            {
                if (parser.getLookaheadToken().getTerminal() == Terminal.END_OF_INPUT) return false;
                recoveryList.add(parser.getLookaheadToken());
                parser.readNextToken();
            }

            // Now push a %stack token and associate it with the recoveryList and no particular state
            parser.getSymbolStack().add(Terminal.ERROR);
            parser.getValueStack().add(recoveryList);
            parser.getStateStack().add(new Integer(-999));

            // Finally, shift the resume token and go to a state where the parser will reduce by this error production
            parser.shiftAndGoToState(2028);
            return true;
        }
    }

    /**
     * <SubroutineStmt> ::= SubroutinePrefix:<SubroutinePrefix> SubroutineName:<SubroutineName> %error T_EOS ;
     */
    private class ErrorProduction4 extends AbstractErrorProduction
    {
        public boolean applies(Parser parser)
        {
            return parser.getSymbolStack().size() >= 2 && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1) == Nonterminal.SubroutineNameNonterminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-2) == Nonterminal.SubroutinePrefixNonterminal.getInstance();
        }

        public boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception
        {
            // Discard tokens until we reach a token which successfully terminates this error production
            while (parser.getLookaheadToken().getTerminal() != Terminal.T_EOS)
            {
                if (parser.getLookaheadToken().getTerminal() == Terminal.END_OF_INPUT) return false;
                recoveryList.add(parser.getLookaheadToken());
                parser.readNextToken();
            }

            // Now push a %stack token and associate it with the recoveryList and no particular state
            parser.getSymbolStack().add(Terminal.ERROR);
            parser.getValueStack().add(recoveryList);
            parser.getStateStack().add(new Integer(-999));

            // Finally, shift the resume token and go to a state where the parser will reduce by this error production
            parser.shiftAndGoToState(1619);
            return true;
        }
    }

    /**
     * <SubroutineStmt> ::= LblDef:<LblDef> SubroutinePrefix:<SubroutinePrefix> SubroutineName:<SubroutineName> %error T_EOS ;
     */
    private class ErrorProduction5 extends AbstractErrorProduction
    {
        public boolean applies(Parser parser)
        {
            return parser.getSymbolStack().size() >= 3 && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-1) == Nonterminal.SubroutineNameNonterminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-2) == Nonterminal.SubroutinePrefixNonterminal.getInstance() && (TerminalOrNonterminal)parser.getSymbolStack().get(parser.getSymbolStack().size()-3) == Nonterminal.LblDefNonterminal.getInstance();
        }

        public boolean attemptRecovery(Parser parser, LinkedList recoveryList) throws Exception
        {
            // Discard tokens until we reach a token which successfully terminates this error production
            while (parser.getLookaheadToken().getTerminal() != Terminal.T_EOS)
            {
                if (parser.getLookaheadToken().getTerminal() == Terminal.END_OF_INPUT) return false;
                recoveryList.add(parser.getLookaheadToken());
                parser.readNextToken();
            }

            // Now push a %stack token and associate it with the recoveryList and no particular state
            parser.getSymbolStack().add(Terminal.ERROR);
            parser.getValueStack().add(recoveryList);
            parser.getStateStack().add(new Integer(-999));

            // Finally, shift the resume token and go to a state where the parser will reduce by this error production
            parser.shiftAndGoToState(2036);
            return true;
        }
    }
}
