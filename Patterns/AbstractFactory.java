package Patterns;

public class AbstractFactory {
    // Создаем объект класса формы, чтобы впоследствии создать ее
    private Form form;

    public void drawForm() {
        // Определим имя операционной системы
        String osName = System.getProperty("os.name").toLowerCase();
        // Создадим объект асбтрактной фабрики
        GUIFactory factory;

        if (osName.startsWith("win")) {
            factory = new WindowsGUIFactory();  // Передаем фабрику графических элементов системы Windows
        } else if (osName.startsWith("mac")) {
            factory = new MacGUIFactory();  // Передаем фабрику графических элементов системы Mac
        } else {
            System.out.println("Unknown OS, can't draw form");
            return;
        }

        form = new Form(factory);  // Создаем объект формы и передаем ей параметр = фабрике графических элементов системы
    }

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.drawForm();
    }
}

// Класс формы, поля которого - элементы графического интерфейса той, или иной системы
class Form {
    private final Button orderButton;
    private final Select typeSelect;
    private final TextField customerNameTextField;

    // В конструктор формы передается асбтрактная фабрика, которая создает элементы интерфейса
    public Form(GUIFactory factory) {
        System.out.println("Creating form");
        customerNameTextField = factory.createTextField();
        orderButton = factory.createButton();
        typeSelect = factory.createSelect();
    }
}

// Блок асбтрактных элементов графического интерфейса
interface Button {}
interface Select {}
interface TextField {}

// Блок классов системы Windows имплементирующих асбрактные элементы графического интерфейса
class WindowsButton implements Button {}
class WindowsSelect implements Select {}
class WindowsTextField implements TextField {}

// Блок классов системы Mac имплементирующих асбрактные элементы графического
class MacButton implements Button {}
class MacSelect implements Select {}
class MacTextField implements TextField {}

// Абстрактная фабрика графических интерфейсов
interface GUIFactory {
    Button createButton();
    TextField createTextField();
    Select createSelect();
}

// Фабрика графических элементов системы Windows, имплементирующая асбтрактную фабрику графических элементов
class WindowsGUIFactory implements GUIFactory {
    public WindowsGUIFactory() {
        System.out.println("Creating GUI Factory for Windows OS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for Windows OS");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for Windows OS");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating Text Field for Windows OS");
        return new WindowsTextField();
    }
}

// Фабрика графических элементов системы Mac, имплементирующая асбтрактную фабрику графических
class MacGUIFactory implements GUIFactory {
    public MacGUIFactory() {
        System.out.println("Creating GUI Factory for Mac OS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for Mac OS");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for Mac OS");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating Text Field for Mac OS");
        return new MacTextField();
    }
}