import java.util.*;

public class Main {

    public static HashMap<Integer, Integer> sortByValues(HashMap<Integer,Integer> map){
        List<HashMap.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        HashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }


    public static void main(String[] args) {
        int n = 1000;
        int y = 10;
        Random random = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++){
            Integer rnd = random.nextInt(y);
            if(map.containsKey(rnd)){
                map.put(rnd, map.get(rnd)+1);
            }else{
                map.put(rnd, 1);
            }
        }
        System.out.println(map);
        System.out.println(sortByValues(map));


        LinkedList<Double> mylist = new LinkedList<>();

        mylist.add(3.14);
        mylist.add(2.332);
        mylist.add(232.0);
        mylist.add(3222332.13231);

        LinkedList.LinkedListIterator<Double> i = mylist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(mylist.contains(3.14));
        System.out.println(mylist.contains(3.143));
        System.out.println(mylist.contains(2.332));

        Job j1 = new Job(1, "Job 1");
        Job j2 = new Job(11, "Job 2");
        Job j3 = new Job(10, "Job 3");
        Job j4 = new Job(2, "Job 4");
        Job j5 = new Job(321, "Job 5");
        Job j6 = new Job(0, "Job 6");
        Job j7 = new Job(21, "Job 7");
        Job j8= new Job(11, "Job 8");
        Job j9 = new Job(15, "Job 9");
        Job j10 = new Job(41, "Job 10");

        List<Job> lista = new ArrayList<>();
        lista.add(j1);
        lista.add(j2);
        lista.add(j3);
        lista.add(j4);
        lista.add(j5);
        lista.add(j6);
        lista.add(j7);
        lista.add(j8);
        lista.add(j9);
        lista.add(j10);
        System.out.println("------------------------");
        for (var p:
             lista) {
            System.out.println(p);
        }

        Collections.sort(lista);
        System.out.println("------------------------");
        for (var p:
                lista) {
            System.out.println(p);
        }

    }
}