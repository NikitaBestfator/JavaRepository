class PersonNameException extends Exception {
    PersonNameException(String name, int minLength) {
        String message = "Недостаточная длина имени. Текущее значение: " + name + " . Минимальная длина имени: " + minLength;
        super(message);
    }
}
class PersonAgeException extends Exception {
    PersonAgeException(int age, int minAge, int maxAge) {
        String message = "Некорректный возраст. Текущее значение: " + age +
                ". Минимальный возраст: " + minAge + " . Максимальная длина имени: " + maxAge;
        super(message);
    }
}
