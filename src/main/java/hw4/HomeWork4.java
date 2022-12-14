package hw4;

import java.util.*;

class HomeWork4 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Кофе", "Картофель", "Один",
                "Сыр", "Второй", "Хомяк",
                "Собака", "Кот", "Джава",
                "Рыба", "Табак", "Кофе",
                "Собака", "Второй", "Хомяк",
                "Кот", "Джава", "Рыба", "Собака"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Антонов", "8999123321");
        directory.add("Антонов", "8912155326");
        directory.add("Борисов", "8917155552");
        directory.add("Борисов", "8913455672");
        directory.add("Антонов", "899999999");
        directory.add("Мартынов", "899111111");
        directory.add("Борисов", "89923231999");
        directory.add("Зубов", "8888123113");
        directory.add("Мартынов", "8324325234");

        System.out.println(directory.get("Антонов"));
        System.out.println(directory.get("Мартынов"));
        System.out.println(directory.get("Борисов"));
        System.out.println(directory.get("Зубов"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
