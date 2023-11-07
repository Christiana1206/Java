package abstraction.abstraction1;

public class Test {
    public static void main(String[] args) {


        //  Student student = new Student(); //we cannot create an object of abstract classes


        OnlineStudents online = new OnlineStudents("Minnie", 25);
        online.attend();
        online.eat();
        online.havePJ();
        online.study();  //come from parent class

        OnCampusStudents onCampus = new OnCampusStudents("Tom", 38);

        onCampus.attend();
        onCampus.eat();
        onCampus.study();

        //SelfLearnerStudents selfLearner = new SelfLearnerStudents(); => abstract class can't have an object


        //child of concrete class
        Alex alex = new Alex("alex", 21);
        alex.tableTennis(); // unique for Alex


        //child of abstract class

        John john = new John("John", 28);
        john.read();
        john.attend();
        john.eat();
        john.study();
        john.hike();

        Victor victor = new Victor("Victor", 33);
        victor.eat();
        victor.attend();
        victor.study();
        victor.havePJ();
        victor.callOffice();
        victor.stop();
        victor.jogging();

        OutOfStateStudents.jogging();

        John john1 = new John("J1", 22);
        john1.hike();
        john1.study();
        john1.eat();
        john1.read();
        john1.attend();


        SelfLearnerStudents john2 = new John("J2", 22);
        john2.attend();
        john2.read();
        john2.eat();
        john2.study();
       // john2.hike();

        Student john3 = new John("J3", 22);
        john3.attend();
        john3.eat();
        john3.study();
       //john3.read(); --> from SelfLearnerStudents class
        //right side is the object, where to create the object
        //left side parent class - reference , where to call the object


        }









        }




