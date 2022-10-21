package com.example.homework2_16.service;

public class IntegerList {
    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    public Integer add(Integer item) {
        return null;
    }

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    public Integer add(int index, Integer item) {
        return null;
    }

    // Установить элемент
    // на определенную позицию,
    // затерев существующий.
    // Выбросить исключение,
    // если индекс больше
    // фактического количества элементов
    // или выходит за пределы массива.
    public Integer set(int index, Integer item) {
        return null;
    }

    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    public Integer removeItem(Integer item) {
        return null;
    }

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    public Integer remove(int index) {
        return null;
    }

    //Сортировка массива
    public Integer[] sort() {
        return new Integer[0];
    }

    // Проверка на существование элемента.
    // Вернуть true/false;
    public boolean contains(Integer item) {
        return false;
    }

    // Поиск элемента.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    public int indexOf(Integer item) {
        return 0;
    }


    // Поиск элемента с конца.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    public int lastIndexOf(Integer item) {
        return 0;
    }

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.
    public Integer get(int index) {
        return null;
    }

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение,
    // если передан null.
    boolean equals(IntegerList otherList) {
        return false;
    }

    // Вернуть фактическое количество элементов.
    public int size() {
        return 0;
    }

    // Вернуть true,
    // если элементов в списке нет,
    // иначе false.
    public boolean isEmpty() {
        return false;
    }

    // Удалить все элементы из списка.
    public void clear() {

    }

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    public Integer[] toArray() {
        return new Integer[0];
    }
}
