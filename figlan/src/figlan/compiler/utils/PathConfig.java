package figlan.compiler.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathConfig {
    // Diretório raiz do projeto
    private static final String rootDir = determineRootDir();
    
    // Caminhos relativos (constantes)
    private static final String BIN_DIR = "figlan/bin";
    private static final String SRC_DIR = "figlan/src";
    private static final String TEMPLATES_DIR = "figlan/src/figlan/compiler/templates";
    private static final String GENERATED_DIR = "figlan/src/figlan/generated";
    private static final String LIB_DIR = "figlan/lib";
    private static final String JAVA_TEST_DIR = "figlan/java-test";
    
    // Determina automaticamente o diretório raiz
    private static String determineRootDir() {
        String currentDir = System.getProperty("user.dir");
        // Se estamos em algum subdiretório do projeto, volte até encontrar a raiz
        if (currentDir.endsWith("figlan") || 
            currentDir.contains("figlan" + File.separator + "src") ||
            currentDir.contains("figlan" + File.separator + "bin")) {
            return currentDir.substring(0, currentDir.lastIndexOf("figlan"));
        }
        // Caso contrário, assume que estamos na raiz do projeto
        return currentDir + File.separator;
    }
    
    // Métodos para obter caminhos completos
    public static String getTemplatesPath() {
        return Paths.get(rootDir, TEMPLATES_DIR).toString();
    }
    
    public static String getTemplateFilePath(String templateName) {
        return Paths.get(rootDir, TEMPLATES_DIR, templateName).toString();
    }
    
    public static String getGeneratedFilePath(String fileName) {
        return Paths.get(rootDir, GENERATED_DIR, fileName).toString();
    }
    
    public static String getBinDir() {
        return Paths.get(rootDir, BIN_DIR).toString();
    }
    
    public static String getJavaTestDir() {
        return Paths.get(rootDir, JAVA_TEST_DIR).toString();
    }
    
    public static String getClasspath() {
        String antlrJar = Paths.get(rootDir, LIB_DIR, "antlr-4.13.1-complete.jar").toString();
        String stJar = Paths.get(rootDir, LIB_DIR, "ST-4.3.4.jar").toString();
        String binDir = getBinDir();
        
        return binDir + File.pathSeparator + antlrJar + File.pathSeparator + stJar;
    }
    
    public static String getRuntimeClasspath() {
        return getBinDir() + File.pathSeparator + getJavaTestDir();
    }
}
