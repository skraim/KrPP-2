import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.letsGo();

    }

    private void letsGo() {
        List<Transport> transportList = new ArrayList<Transport>();
        Bus b = new Bus("ПАЗ", "Евро-5");
        b.setHorsePower(300);
        b.setNumOfSits(55);
        Offroad off = new Offroad("Toyota", "Land Rover");
        off.setHorsePower(520);
        off.setNumOfSits(6);
        Sportcar sp = new Sportcar("Audi", "TT");
        sp.setHorsePower(440);
        sp.setNumOfSits(2);
        Atv at = new Atv("Hammer", "Tipper 200");
        at.setHorsePower(120);
        at.setNumOfSits(1);
        Bicycle cu = new Bicycle("Cube", "Rouge 3000");
        cu.setHorsePower(0);
        cu.setNumOfSits(1);
        transportList.add(b);
        transportList.add(off);
        transportList.add(sp);
        transportList.add(at);
        transportList.add(cu);
        for (Transport t : transportList) {
            System.out.println(t);
            System.out.println("---------------");
        }
        System.out.println();
        Collections.sort(transportList);
        for (Transport t : transportList) {
            System.out.println(t);
            System.out.println("---------------");
        }
        System.out.println();
        ConcernSort cs = new ConcernSort();
        Collections.sort(transportList,cs);
        for (Transport t : transportList) {
            System.out.println(t);
            System.out.println("---------------");
        }
        System.out.println();
        SitsSort ss = new SitsSort();
        Collections.sort(transportList,ss);
        for (Transport t : transportList) {
            System.out.println(t);
            System.out.println("---------------");
        }
    }

    class ConcernSort implements Comparator<Transport> {
        @Override
        public int compare(Transport t1, Transport t2) {
            return t1.getConcern().compareTo(t2.getConcern());
        }
    }

    class SitsSort implements Comparator<Transport> {
        @Override
        public int compare(Transport t1, Transport t2) {
            if (t1.getNumOfSits()== t2.getNumOfSits()) {
                return 0;
            }
            return t1.getNumOfSits() > t2.getNumOfSits() ? 1 : -1;
        }
    }
}
