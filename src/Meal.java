/**
 *
 * Блюдо из меню
 */
public class Meal {
    private String name;
    private Float price;
    //todo Добавьте необходимые конструктуры и/или методы, чтобы можно было создать блюдо с указанием его наименования
    //todo Подумайте, что лучше подходит. Считается, что у блюда название не изменяется ;)
    public Meal create(String s, Float price){
        Meal meal = new Meal();
        meal.name = s;
        meal.price=price;
        return meal;
    }
    /**
     *
     * @return наименование блюда
     */
    public String getTitle(){
        return name;
        //throw new UnsupportedOperationException();
    }

    /**
     * Вовзвращает цену с плавающей точкой.
     * @return Цена, число с плавающей точкой в у.е.
     */
    public Float getPrice(){
        return price;
        //throw new UnsupportedOperationException();
    }
}
