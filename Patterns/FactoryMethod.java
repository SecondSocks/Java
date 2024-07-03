package Patterns;

public class FactoryMethod {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.LATTE);
    }
}

// Родитель для всех магазинов кофе
abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Take your coffee, please");
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}

// Наследник CoffeeShop, реализующий фабрику кофе
class ItalianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
            case LATTE:
                coffee = new ItalianStyleLatte();
                break;
        }
        return coffee;
    }
}

// Наследник CoffeeShop, реализующий фабрику кофе
class AmericanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new AmericanStyleCappuccino();
                break;
            case LATTE:
                coffee = new AmericanStyleLatte();
                break;
        }

        return coffee;
    }
}

// Абстрактный класс Coffee - родитель для всех видов кофе
abstract class Coffee {
    public void makeCoffee() {}

    public void pourIntoCup() {}
}

// Блок классов видов кофе, наследующих класс Coffee
class ItalianStyleAmericano extends Coffee {}
class ItalianStyleCappuccino extends Coffee {}
class ItalianStyleLatte extends Coffee {}
class ItalianStyleEspresso extends Coffee {}

class AmericanStyleAmericano extends Coffee {}
class AmericanStyleCappuccino extends Coffee {}
class AmericanStyleLatte extends Coffee {}
class AmericanStyleEspresso extends Coffee {}

// Перечисление видов кофе
enum CoffeeType {
    ESPRESSO,
    CAPPUCCINO,
    LATTE,
    AMERICANO
}

