package HomeWorkMap;

import java.util.*;

public class HomeWorkMap {
//    задание 1.3
    Map<String,Integer> stringIntegerMap = new HashMap<>();

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public static Map<String, List<Integer>> getMapRandom() {
        return mapRandom;
    }

    public void appStIntMap(String s, Integer i) {
        if (stringIntegerMap.containsKey(s)&&stringIntegerMap.containsValue(i)) {
            throw new IllegalArgumentException("Такие ключ и значение уже добавлены");
        }
        if (stringIntegerMap.containsKey(s)) {
            stringIntegerMap.put(s, i);  //тут непонятно, вроде как обновляется и ключ и значение,
        } else {                             // но ключ то одинаковый, не знаю считается это или нет
            this.stringIntegerMap.put(s, i);
        }
    }

    @Override
    public String toString() {
        return "HomeWorkMap{" +
                "stringIntegerMap=" + stringIntegerMap +
                ", mapRandom=" + mapRandom +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeWorkMap that = (HomeWorkMap) o;
        return Objects.equals(stringIntegerMap, that.stringIntegerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringIntegerMap);
    }
    //задание 2.1

   private static Map<String, List<Integer>> mapRandom = new HashMap<>();
//    тут получилось только часть задания, потом я пытался сделать метод который вытащит List<Integer> из mapRandom, но не получилось
//    застопорился сильно, переделал внизу по другому, если будет подсказка  тут, буду признателен
    public void appMapRandom(String s) {
        List<Integer> randomList = new ArrayList<>();
        Random random1 = new Random();
        int num1 = random1.nextInt(1000);
        int num2 = random1.nextInt(1000);
        int num3 = random1.nextInt(1000);;
        randomList.add(num1);
        randomList.add(num2);
        randomList.add(num3);
        mapRandom.put(s, randomList);
    }

    public static void main(String[] args) {
        //что бы было проще писать и проверять сделал тут метод мэйн, не знаю как такая практика приветствуется или нет
        HomeWorkMap keyNums = new HomeWorkMap();
        keyNums.appStIntMap("str1", 111);
        keyNums.appStIntMap("str2", 222);
        keyNums.appStIntMap("str3", 333);
        keyNums.appStIntMap("str3", 333);
        keyNums.appStIntMap("str3", 334);

        HomeWorkMap mapRandom = new HomeWorkMap();
        mapRandom.appMapRandom("random1");
        mapRandom.appMapRandom("random2");
        System.out.println("mapRandom.toString() = " + mapRandom.toString());

//        Задание 2.1 вверху неполное решение, застрял, переделываю тут
        Map<String, List<Integer>> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<ArrayList<Integer>> arrays = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arrays.add(new ArrayList());
            arrays.get(i).add(random.nextInt(1000));
            arrays.get(i).add(random.nextInt(1000));
            arrays.get(i).add(random.nextInt(1000));
            map1.put("str" + Integer.toString(i), arrays.get(i));
            System.out.println("str"+ Integer.toString(i)+arrays.get(i));
            map2.put("str" + Integer.toString(i), arrays.get(i).get(0) + arrays.get(i).get(1) + arrays.get(i).get(1));
        }
        System.out.println("map2.toString() = " + map2.toString());

//        задание 2.2
        Map<Integer, String> task2 =new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            task2.put(i,"num" + Integer.toString(i));
        }
        System.out.println("task2.toString() = " + task2.toString());

    }
}
