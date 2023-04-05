package com.amano.design_pattern.creator.factory.abstract_factory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Application application = init();
        application.paint();
    }

    public static Application init() {
        GUIFactory guiFactory;
        String os = System.getProperty("os.name").toLowerCase();
        switch (os) {
            case "mac" -> guiFactory = new MacOSGUIFactory();
            case "windows 11" -> guiFactory = new WindowsGUIFactory();
            default -> throw new IllegalStateException("不支持的操作系统类型");
        }
        return new Application(guiFactory);
    }
}
