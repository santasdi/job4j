package ru.job4j.professions;

/**
 *  Realization of doctor's profession.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Doctor extends Profession {
    /**
     * doctor class.
     */
    private Profession doctor = new Profession("Иван", "хирург", 40);

    /**
     * Giving recipe to pacient.
     * @param pacient is pacient class
     * @return string
     */
    public String giveRecipe(Pacient pacient) {
        return (doctor.getType() + " " + doctor.getName() + " выписывает рецепт для " + pacient.getName());
    }

    /**
     * Healing pacient.
     * @param pacient is pacient class
     * @return string
     */
    public String heal(Pacient pacient) {
        return (doctor.getType() + " " + doctor.getName() + " лечит " + pacient.getName());
    }

    /**
     * Diagnosis pacient.
     * @param pacient is pacient class
     * @return string
     */
    public String diagnosis(Pacient pacient) {
        return (doctor.getName() + " " + doctor.getType() + " ставит диагнос для " + pacient.getName());
    }
}

/**
 * Class pacient.
 */
class Pacient {
    /**
     * Name of pacient.
     */
    private String name = "Василия";
    /**
     * Get name of patient.
     * @return name
     */
    public String getName() {
        return this.name;
    }
}