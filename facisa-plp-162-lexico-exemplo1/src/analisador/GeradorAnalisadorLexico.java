package analisador;

import java.io.File;

public class GeradorAnalisadorLexico {
    
    /**
     * @param args the command line arguments
     */
    public static void gerarLexer(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
        
    }
    public static void main(String[] args) {
        String path = "C:/Dev/Workspace/facisa-plp-162-exemplo1/src/analisador/Lexer.flex";
        gerarLexer(path);
    }
}
