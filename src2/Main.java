import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Node<Integer> node1 = new Node<Integer>(10);
//       node1.setValue(6);
//        System.out.println(node1.getValue());
//        System.out.println(node1.hasNext());
//        Node<Integer> nodey = new Node<Integer>(2);
//        Node<Integer> nodex = new Node<Integer>(7,nodey);
//        System.out.println(nodex.getNext().getValue());
//        nodex.getNext().setValue(9);
//        System.out.println(nodex.getNext().getValue());
//        nodex.setNext(new Node<Integer>(5));
//        System.out.println(nodex.getNext().getValue());
//
//        Node<String> node1 = new Node<String>("how");
//        Node<String> node2 = new Node<String>("are" , node1);
//        Node<String> node3 = new Node<String>("you" , node2);
//        Node<String> node4 = new Node<String>("today" , node3);
//        Node<String> node5 = new Node<String>("friend" , node4);
//        while (node5 != null){
//            System.out.println(node5);
//            node5 = node5.getNext();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your number please:");
//        int x = sc.nextInt();
//        boolean y = false;
//        Node<Integer> node = null;
//        if (x % 2 == 0) {
//            for (int i = 0; i < x; i++) {
//                if (y == false) {
//                    node = new Node<Integer>(x / 2, node);
//                    y = true;
//                } else {
//                    node = new Node<Integer>(x, node);
//                    y = false;
//                }
//            }
//        } else {
//
//            if (x % 2 == 1) {
//                for (int i = 0; i < x; i++) {
//                    if (y == false) {
//                        node = new Node<Integer>(x / 2, node);
//                        y = true;
//                    } else {
//                        node = new Node<Integer>(x, node);
//                        y = false;
//                    }
//                }
//            }
//
//        }
//            while (node != null){
//                System.out.print("| "+node.getValue()+" | ");
//                node=node.getNext();
//                }

//        boolean result = false;
//        Node<Integer> node4 = new Node<Integer>(256);
//        Node<Integer> node3 = new Node<Integer>(16,node4);
//        Node<Integer> node2 = new Node<Integer>(4,node3);
//        Node<Integer> node1 = new Node<Integer>(2,node2);
//        System.out.println(funcNode(node1));

//        Node<Integer> node7 = new Node<Integer>(3);
//        Node<Integer> node6 = new Node<Integer>(2, node7);
//        Node<Integer> node5 = new Node<Integer>(1, node6);
//
//        Node<Integer> node4 = new Node<Integer>(4);
//        Node<Integer> node3 = new Node<Integer>(3, node4);
//        Node<Integer> node2 = new Node<Integer>(2, node3);
//        Node<Integer> node1 = new Node<Integer>(1, node2);
//
//        System.out.println(cont(node5,node1));

//        Student bob = new Student("Bob",24);
//        Student david = new Student("David",35);
//        Student john = new Student("John",20);
//
//        Node<Student> st3 = new Node<>(bob);
//        Node<Student> st2 = new Node<>(david,st3);
//        Node<Student> st1 = new Node<>(john,st2);
//
//        ClassRoom c1 = new ClassRoom("Ashkelon - Tohna",st1);
//        System.out.println(c1.studentAgeMax());
    }

    public static boolean funcNode(Node<Integer> node) {
        while (node.hasNext()) {
            if (node.getNext().getValue() != node.getValue() * node.getValue()) {
                return false;
            }
            node = node.getNext();
        }
        return true;
    }

    public static boolean cont(Node<Integer> x, Node<Integer> y) {
        String x1 = "";
        String y1 = "";
        while (y != null) {
            y1 += y.getValue();
            y = y.getNext();

        }
        while (x != null) {
            x1 += x.getValue();
            x = x.getNext();
        }
        if (y1.contains(x1)) {
            return true;
        } else {
            return false;
        }

    }
}


