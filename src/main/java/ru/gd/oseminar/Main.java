package ru.gd.oseminar;

import ru.gd.oseminar.controller.Controller;
import ru.gd.oseminar.data.Ticher;
import ru.gd.oseminar.data.User;
import ru.gd.oseminar.service.TicherServise;
import ru.gd.oseminar.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TicherServise ticherServise = new TicherServise();
        UserService userService = new UserService();
        Controller controller = new Controller();
        controller.createStudent("Ivan", "Ivanov", "Ivanovich");
        controller.createStudent("Petr", "Petrov", "Petrovich");
        controller.createStudent("Vasily", "Vaasilev","Vasilevich");
        controller.createStudent("Timur", "Vaasilev","Vasilevich");
        controller.createStudent("Pavel", "Akimov","Vasilevich");
        controller.createStudent("Oleg", "Simonov","Vasilevich");
       // controller.printSudents();
        controller.createTicher("Inna","Osipova", "Viktorovna");
        controller.createTicher("Marina","Akimova", "Valerianovna");
       // controller.printTichers();

        controller.createGroup();
       // controller.printGroup();
        controller.printSortGroup();

    }
}