package com.compiler;
import com.compiler.TokenIntf.Type;
import com.compiler.ast.*;

public class ExpressionParser {
    private Lexer m_lexer;
    private SymbolTableIntf m_symbolTable;

    public ExpressionParser(Lexer lexer) {
        m_lexer = lexer;
        m_symbolTable = new SymbolTable();
    }
    
    public ExpressionParser(Lexer lexer, SymbolTableIntf symbolTable) {
        m_lexer = lexer;
        m_symbolTable = symbolTable;
    }
    
    public ASTExprNode parseExpression(String val) throws Exception {
        m_lexer.init(val);
        return getQuestionMarkExpr();
    }

    ASTExprNode getParantheseExpr() throws Exception {
        return new ASTIntegerLiteralNode(m_lexer.lookAhead().m_value);
    }

    ASTExprNode getVariableExpr() throws Exception {
        return null;
    }

    ASTExprNode getDashExpr() throws Exception {
        return getParantheseExpr();
     }    
     
    ASTExprNode getUnaryExpr() throws Exception {
       return getDashExpr();
    }
    
    ASTExprNode getMulDivExpr() throws Exception {
       return getUnaryExpr();
    }
    
    ASTExprNode getPlusMinusExpr() throws Exception {
        return getMulDivExpr();
    }

    ASTExprNode getBitAndOrExpr() throws Exception {        
        return getPlusMinusExpr();
    }

    ASTExprNode getShiftExpr() throws Exception {
        return getBitAndOrExpr();
    }

    ASTExprNode getCompareExpr() throws Exception {
        return getShiftExpr();
    }

    ASTExprNode getAndOrExpr() throws Exception {
        return getCompareExpr();
    }

    ASTExprNode getQuestionMarkExpr() throws Exception {
        return getAndOrExpr();
    }

}