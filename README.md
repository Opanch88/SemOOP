## Задание 1

1)
    -[x] Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
2)
    -[x] Создать по два класса
     наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3)
    -[x] В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не
     делало (кошки не летают, рыбы не ходят)
4)
    -[x] В файле readme.md в репозитории гитхаб описать
     какие проблемы в таком проектировании Вы увидели,
     а также там же написать возникшие при выполнении дз вопросы
     (если они есть)

### Заметки:

+ Нужно явно указывать что животное умеет делать, а что не умеет это плохо.
+ Это не входит в жизненный цикл так как он имеет определенные действия.
+ Вероятнее всего нужно создать функцию, которая будет сортировать действие (способности) животного по его реальным
  способностям, и/ или создавать отдельный клас животных определяющий клас животного по его происхождению (Тип, Класс,
  Семейство, Вид, и тд.)

## Задание 2

1)
    -[x] Создать класс Doctor и подумать над его состоянием и поведением.
2)
    -[x] Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.
3)
    -[x] Создайте интерфейсы Goable, Flyable, Swimable.
4)
    -[x] У интерфейсов должны быть методы получения скорости заданного действия: double run(), double fly(), double
     swim()
5)
    -[x] Добавьте наследников этим интерфейсам, но таким образом,
     чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
6)
    -[x] Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
7)
    -[x] У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих и всех летающих.
8)
    -[x] А также методы для работы с персоналом клиники.

### Заметки:
Я бы реализовал абстрактный класс "сотрудники" и от него наследовал бы уже доктора и сестру,
из класса "сотрудники" было бы проще что-то делать с персоналом.
Далее можно создать интерфейс задачи (должностные обязанности) и реализовать их к доктору и сестре
и если я правильно рассуждаю то создал бы отдельную папку и распределил все эти интерфейсы и классы по смыслу и логике .



## Задание 3
1) -[x] Создайте несколько экземпляров `Pharmacy`(или `IterablePharmacy`), причем, чтобы среди них было хотя бы два экземпляра
        с полностью идентичными значениями полей.

2) -[x] Сделать так, чтобы после выполнения кода ниже, в сете `result` были только уникальные объекты.
        `Set<Pharmacy> result = new HashSet<>`(множество из нескольких лекарств);
        `System.out.println(result.size())`; // тут вывод должен быть равен количеству УНИКАЛЬНЫХ экземпляров `Pharmacy`!

3) -[ ] Добавить интерфейс `Copmparable<Pharmacy>` к классу `Pharmacy`. Переопределить метод `compareTo()`
        подсказка: можно добавить, а можно не добавлять в класс поля;