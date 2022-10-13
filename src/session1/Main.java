package session1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("World");
        hs.add("Hello");
        hs.add("World");
        for (String s : hs){
            System.out.println(s);
        }
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Number: "+numbers);

        int first = numbers.peek(); // peek tra ve gia tri dung dau tien trong danh sach nhung chua bo di gia tri;
        System.out.println("First: "+first);
        System.out.println("Total: "+numbers.size());
        System.out.println("Pool: "+numbers.poll() + " remain: "+numbers.size());//pool tra ve gia tri dung dau va xoa khoi danh sach
        System.out.println("Pool: "+numbers.poll() + " remain: "+numbers.size());
        System.out.println("Pool: "+numbers.poll() + " remain: "+numbers.size());
        System.out.println("Pool: "+numbers.poll() + " remain: "+numbers.size());
        System.out.println("Pool: "+numbers.poll() + " remain: "+numbers.size());
        System.out.println("Pool: "+numbers.poll() + " remain: "+numbers.size());

        PriorityQueue<Student> hs1 = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        hs1.add(new Student("Thanh",5));
        hs1.add(new Student("Anh",1));
        hs1.add(new Student("Hung",7));
        hs1.add(new Student("Binh",0));

        Student s;
        while ((s  = hs1.poll()) != null){
            System.out.println("SV: "+s.getName()+" Diem thi: "+s.getMark());
        }

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Good Student",10);
        hm.put("Bad",3);

        System.out.println("Tieu Chuan SV Xuat Sac: "+hm.get("Good Student"));
        System.out.println("Tieu Chuan SV Ngu: "+hm.get("Bad"));
        System.out.println(hm.keySet());

        HashMap<Student,Integer> hm1 = new HashMap<>();
        hm1.put(new Student("Thanh",9),555);
        System.out.println(hm1.keySet());
        Student ss = hm1.keySet().iterator().next();
        System.out.println(hm1.get(ss));
    }
}
