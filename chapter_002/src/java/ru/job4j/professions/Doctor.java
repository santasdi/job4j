package ru.job4j.professions;

/**
 *  Realization of doctor's profession.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Doctor extends Profession {
    Profession doctor = new Profession("Иван", "хирург", 40);
    public String giveRecipe(Pacient pacient) {
        return (doctor.getType() + " " + doctor.getName() + " выписывает рецепт для " + pacient.name);
    }

    public String heal(Pacient pacient) {
        return (doctor.getType() + " " + doctor.getName() + " лечит " + pacient.name);
    }
    public String diagnosis(Pacient pacient) {
        return (doctor.getName() + " " + doctor.getType() + " ставит диагнос для " + pacient.name);
    }
}
class Pacient {
    String name = "Василия";
}