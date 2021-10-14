package javarush.collections.arrayList;

/*

    Рассматриваем работу класса ArrayList.


    #! Для создания простых списков применяется интерфейс List,
    который расширяет функциональность интерфейста Collection.

    # Некоторые методы интерфейса List:
                                                                                                    E - объект.
        * void add(int index, E obj): добавляет в список по индексу index объект obj.

            List<String> users = new ArrayList<>();
            users.add(new String(new char[] {'h', 'e', 'l', 'l', 'o'});

            Внутри метода add(value) происходят следующие вещи:
                1. Проверяется, достаточно ли места в массиве для вставки нового элемента.
                   * ensureCapacity(size + 1);
                2. Добавляется элемент в конец (согласно значению size) массива.
                   * elementData[size++] = element;
                3. Если места в массиве недостаточно, новая ёмкость рассчитывается по формуле:
                   * (oldCapacity * 3) / 2 + 1
        ________________________________________________________________________________

        * E remove(E obj): Метод удаляет из списка переданный элемент o. Если элемент
        присутствует в списке, он удаляется, а все элементы смещаются влево. Если элемент
        существует в списке и успешно удален, метод возвращает true, в обратном случае — false.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(51);
            anyNumbers.add(3);
            anyNumbers.add(18);
            anyNumbers.add(401);
        ________________________________________________________________________________

        * E get(int index): возвращает объект из списка по индексу index.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(51);
            anyNumbers.add(3);
            anyNumbers.add(18);
            anyNumbers.add(401);

            anyNumbers.remove(18);

            for (Integer x : anyNumbers) {
                System.out.println(x);
            } // 51, 3, 401. return true;

            anyNumbers.remove(37); // return false;
        ________________________________________________________________________________

        * E set(int index, E obj): присваивает значение объекта obj
        элементу, который находится по индексу index.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(51);
            anyNumbers.add(3);
            anyNumbers.add(18);
            anyNumbers.add(401);

            anyNumbers.set(0, 15);

            int num = anyNumbers.get(0); // num = 15;
        ________________________________________________________________________________

        * void sort(Comparator<? super E> comp): cортировка списка по заданному правилу.
        Правило сортировки представляет собой реализованный интерфейс Comparator
        с переопределенным методом compareTo(). Переопределение нужно, если коллекция
        содержит объекты собственного класса. При работе со стандартными классами
        (Integer, String и так далее) переопределение compareTo() требуется только для нестандартной сортировки.
        ________________________________________________________________________________

        * boolean addAll(int index, Collection<? extends E> col): добавляет в список по
        индексу index все элементы коллекции col. Если в результате добавления список
        был изменен, то возвращается true, иначе возвращается false.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(1);
            anyNumbers.add(2);
            anyNumbers.add(3);
            anyNumbers.add(4);

            List<Integer> copyAnyNumbers = new ArrayList<>():
            copyAnyNumbers.addAll(anyNumbers); // return true.
        ________________________________________________________________________________

        * int indexOf(Object obj): возвращает индекс ПЕРВОГО вхождения
        объекта obj в список. Если объект не найден, то возвращается -1.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(1);
            anyNumbers.add(2);
            anyNumbers.add(3);
            anyNumbers.add(3);

            int indexOfNum = anyNumbers.indexOf(3); // indexOfNum = 2;
            int indexOfNum = anyNumbers.indexOf(7); // indexOfNum = -1;
        ________________________________________________________________________________

        * int lastIndexOf(Object obj): возвращает индекс ПОСЛЕДНЕГО вхождения
        объекта obj в список. Если объект не найден, то возвращается -1.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(3);
            anyNumbers.add(2);
            anyNumbers.add(5);
            anyNumbers.add(4);
            anyNumbers.add(3);

            int indexOfNum = anyNumbers.indexOf(3); // indexOfNum = 4;
            int indexOfNum = anyNumbers.indexOf(1); // indexOfNum = -1;
        ________________________________________________________________________________

        * List<E> subList(int start, int end): получает набор элементов,
        которые находятся в списке между индексами start и end.

            List<Integer> anyNumbers = new ArrayList<>();
            anyNumbers.add(1);
            anyNumbers.add(2);
            anyNumbers.add(3);
            anyNumbers.add(4);
            anyNumbers.add(5);
            anyNumbers.add(6);

            List<Integer> copyAnyNumbers = anyNumbers.sublist(1, 3); // 2, 3, 4;
        ________________________________________________________________________________


    #! По умолчанию в Java есть встроенная реализация этого интерфейса - класс ArrayList.
    Класс ArrayList представляет обобщенную коллекцию, которая наследует
    свою функциональность от класса AbstractList и применяет интерфейс List.

    # Проще говоря, ArrayList представляет простой список, аналогичный массиву,
    за тем исключением, что количество элементов в нем не фиксировано

    Дерево наследования ArrayList. Интерфейсы и классы.
                                                                                        <name> - interface.
                                                                                        (name) - class.
                                            <Iterable>
                                                 |
                                                 |
                                           <Collection>
                                                 |
                            _____________________|________________________
                           |                     |                        |
                           |                     |                        |
                         <Set>                 <List>                  <Queue>
                           |                     |                        |
                       ____|____                 |                     ___|___
                      |         |                |__ (ArrayList)      |       |
                      |         |                |                 <Deque>    |
          (HashSet) __|    <SortedSet>           |                    |       |__ (PriorityQueue)
                      |         |                |__ (LinkedList) _ _ |
                      |         |                |                    |
    (LinkedHashSet) __|     (TreeSet)            |                    |
                                                 |__(Vector)     (ArrayDeque)
                                                       |
                                                       |
                                                    (Stack)

    # Внутри каждого объекта типа ArrayList хранится обычный массив элементов.
    Когда считывается элемент из ArrayList, он считывает их со своего
    внутреннего массива. Когда записывается — записывает их во внутренний массив.


 */

public class ArrayListInfo {

}
