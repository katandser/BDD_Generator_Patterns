public class GeneratorPatternJava {
    public String createSingleton() {
        return " class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
    }
    public String createSingleton(String nameOfClass) {
        return " class " + nameOfClass + " {\n" +
                "    private static " + nameOfClass + " instance;\n" +
                "    private " + nameOfClass + "() {}\n" +
                "    public static " + nameOfClass + " getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new " + nameOfClass + "();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";

    }


}
