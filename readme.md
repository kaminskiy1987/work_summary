Итоговая аттестация. Практическое задание
Задание

Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
Создать директорию, переместить файл туда.
Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
Установить и удалить deb-пакет с помощью dpkg.
Выложить историю команд в терминале ubuntu
Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).
В подключенном MySQL репозитории создать базу данных “Друзья человека”
Создать таблицы с иерархией из диаграммы в БД
Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
Создать класс с Инкапсуляцией методов и наследованием по диаграмме. 14. Написать программу, имитирующую работу реестра домашних животных. В программе должен быть реализован следующий функционал: 14.1 Завести новое животное 15.2 определять животное в правильный класс 16.3 увидеть список команд, которое выполняет животное 14.4 обучить животное новым командам 17.5 Реализовать навигацию по меню
Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведении животного заполнены все поля.
Решение
Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
Выполнениие команды:

cat > "Домашние животные.txt"
cat > "Вьючные животные.txt"
cat "Домашние животные.txt" "Вьючные животные.txt" > "Друзья человека.txt"
cat "Друзья человека.txt"
Снимок экрана 2023-05-24 в 23 31 18
Создать директорию, переместить файл туда.
Выполнениие команды:

mkdir "Питомник"
mv "Друзья человека.txt" /home/valeria/Питомник
Снимок экрана 2023-05-24 в 23 42 09
Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
Выполнение команды:

wget https://dev.mysql.com/get/mysql-apt-config_0.8.18-1_all.deb

dpkg -i mysql-apt-config_0.8.18-1_all.deb

apt update

apt install mysql-server
Снимок экрана 2023-05-28 в 23 30 33 Снимок экрана 2023-05-28 в 23 30 54
Установить и удалить deb-пакет с помощью dpkg.
Выполнение команды:

wget https://dlcdn.apache.org//directory/apacheds/dist/2.0.0.AM26/apacheds-2.0.0.AM26-amd64.deb
sudo dpkg -i apacheds-2.0.0.AM26-amd64.deb sudo dpkg -P apacheds

пакет

Выложить историю команд в терминале ubuntu
история

Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).
Диаграмма [тут](друзья человека.drawio)

Задания 7-12 тут

Создать класс с Инкапсуляцией методов и наследованием по диаграмме. 14. Написать программу, имитирующую работу реестра домашних животных. В программе должен быть реализован следующий функционал: 14.1 Завести новое животное 15.2 определять животное в правильный класс 16.3 увидеть список команд, которое выполняет животное 14.4 обучить животное новым командам 17.5 Реализовать навигацию по меню

Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведении животного заполнены все поля.