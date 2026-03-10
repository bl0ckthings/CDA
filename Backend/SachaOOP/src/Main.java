//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    User user = new User();
    Classroom classroom = new Classroom();

    classroom.setFloor("4");
    classroom.setNumber("E402");

    user.setClassroom(classroom);

    System.out.println(user.getClassroom());

    }
}