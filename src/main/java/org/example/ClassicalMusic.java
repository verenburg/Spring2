package org.example;

public class ClassicalMusic implements Music{
    public String getSong() {
        return "Moon Sonata";
    }

    public void initMethodForSpring() {
        //Данный метод не должен иметь аргументов, может иметь любое возвращаемое значение и название.
        //Эти правила обусловлены тем что из запускает Spring, и мы не имеем к ним доступ из спринга
        System.out.println("Выполняется инициализация бина");

    }

    public void destroyMethodForSpring() {
        //Данный метод не должен иметь аргументов, может иметь любое возвращаемое значение и название.
        //Эти правила обусловлены тем что из запускает Spring, и мы не имеем к ним доступ из спринга
        System.out.println("Выполняется диструкция бина");
    }

    private ClassicalMusic() {
        // конструктор создан приватным для того что бы применить паттерн factory-method чтобы создание объекта из другого класса
        // было возможно только через этот метод в данном случае factoryMethodForSpring()
    }

    public static ClassicalMusic getClassicalMusic() {
        // важно! Данный метод должен быть статическим так как создание объекта другим методом не возможно,
        // а не статический метод не работает без объекта!
        return new ClassicalMusic();
    }
}
