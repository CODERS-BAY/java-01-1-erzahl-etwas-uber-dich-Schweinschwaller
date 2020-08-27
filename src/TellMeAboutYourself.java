import java.time.LocalDate;

public class TellMeAboutYourself {
    public static void main(String[] args) {
        /*Aufgabe 1.1 - Erzähl mir etwas über dich
        Deklariere Variablen für dein Alter, deinen Vornamen, dein Geschlecht, deinen Nachnamen, dein Geburtsdatum, deinen Notendurchschnitt und dafür ob du verheiratet bist oder nicht. Überleg dir gut welchen Datentyp du für welche Variablen am besten verwenden solltest.
        Gib alle Variablen mit System.out.println auf der Konsole aus.*/

        byte age = 33;
        String firstName = "Georg";
        String lastName = "Schweinschwaller";
        LocalDate dateofBirth = LocalDate.of(1986, 9, 3);
        double averageGrade = 1.9;
        boolean married = false;
        boolean male = true;

        System.out.println("My name is " + firstName + " " + lastName + " i'm " + age + " years old.");
        if (male) {
            System.out.println("I'm male.");
        } else {
            System.out.println("I'm female.");
        }
        System.out.println("My birsthday is " + dateofBirth.toString() + ".");
        System.out.println("To say i'm married is " + married + ".");
        System.out.println("My average grade is " + averageGrade + ".");
    }
}