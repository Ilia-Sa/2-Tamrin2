package com.ilia;

public class Lessons {
    //first semester lessens://

    static void math1() {
        System.out.println("General Mathematics 1, 3 credits.");
    }
    static void phys1() {
        System.out.println("Physical Education 1, 3 credits.");
    }
    static void ge() {
        System.out.println("General English, 2 credits.");
    }
    static void gp() {
        System.out.println("General Persian, 2 credits.");
    }
    static void cb() {
        System.out.println("Computer Basics, 3 credits.");
    }

    //second semester lessons://

    static void math2() {
        System.out.println("General Mathematics 2, 3 credits, Prerequisite: General Mathematics 1.");
    }
    static void phys2() {
        System.out.println("Physical Education 2, 3 credits, Prerequisite: Physical Education 1.");
    }
    static void sl() {
        System.out.println("Specialized Language, 2 credits, Prerequisite: General English.");
    }
    static void de() {
        System.out.println("Differential Equations, 3 credits, Prerequisite: General Mathematics 1.");
    }
    static void dm() {
        System.out.println("Discrete Mathematics, 3 credits, Prerequisite: General Mathematics 1 & Computer Basics.");
    }
    static void ap1() {
        System.out.println("Advanced Programming 1, 3 credits, Prerequisite: Computer Basics.");
    }
    static void cbl() {
        System.out.println("Computer Basics Lab, 1 credits, Prerequisite: Computer Basics.");
    }

    //third semester://

    static void ds() {
        System.out.println("Data Structures, 3 credits, Prerequisite: Discrete Mathematics & Computer Basics.");
    }
    static void lc() {
        System.out.println("Logic Circuits, 3 credits, Prerequisite: Differential Equations.");
    }
    static void ec() {
        System.out.println("Electronic Circuits, 3 credits, Prerequisite: Discrete Mathematics.");
    }
    static void em() {
        System.out.println("Engineering Mathematics, 3 credits, Prerequisite: General Mathematics 2 & Differential Equations.");
    }

    //forth semester://

    static void tlm() {
        System.out.println("Theory of Languages and Machines, 3 credits, Prerequisite: Discrete Mathematics.");
    }
    static void ca1() {
        System.out.println("Computer Architecture 1, 3 credits, Prerequisite: logic Circuits.");
    }
    static void da() {
        System.out.println("Designing Algorithms, 3 credits, Prerequisite: Data Structures.");
    }
    static void dsr() {
        System.out.println("Data Storage and Retrieve, 3 credits, Prerequisite: Data Structures.");
    }
    static void eps() {
        System.out.println("Engineering Probability and Statistics, 3 credits, Prerequisite: General Mathematics 2.");
    }
}
