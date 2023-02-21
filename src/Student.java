import java.util.Objects;

public class Student {

    /**
     * 1. Назовите все методы класса Object.
     * 2. Что такое сигнатура метода?
     * 3. Какие есть способы создания объекта String? Где он создается?
     * 4. Зачем в Java такое многообразие имплементации динамического массива?
     * 5. Дайте определение понятию exception (исключительная ситуация).
     * 6. Как остановить поток?
     */


    //Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        final Student student = (Student) o;
        if (this.age == student.age) {
            return true;
        }
        return (Objects.equals(this.name, student.name));
    }

    @Override
    public int hashCode() {
        int result = this.age;
        result = 31 * result + (this.name!=null?this.name.hashCode():0);
        return result;
    }

}