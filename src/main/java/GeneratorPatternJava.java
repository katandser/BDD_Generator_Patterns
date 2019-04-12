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
        if (nameOfClass.equals("Singleton")) {
            return this.createSingleton();
        }
        else {
            return " class A {\n" +
                    "    private static A instance;\n" +
                    "    private A() {}\n" +
                    "    public static A getInstance() {\n" +
                    "        if (instance == null) {\n" +
                    "            instance = new A();\n" +
                    "        }\n" +
                    "        return instance;\n" +
                    "    }\n" +
                    "} ";
        }
    }


}
