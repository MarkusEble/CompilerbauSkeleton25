package com;


public class ParserExample {
    com.compiler.Lexer m_lexer;

    void parse(String input) throws Exception {
        m_lexer = new com.compiler.Lexer();
        m_lexer.init(input);
        // parsePrintList();
    }

    public static void main(String[] args) throws Exception {
        ParserExample parser = new ParserExample();
        parser.parse("""
                PRINT 1;
                PRINT 2;
                PRINT 3;
                """);
    }

}
