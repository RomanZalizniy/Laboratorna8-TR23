# Laboratorna8-TR23(For ukrainian and foreign users)

Опис надано українською, and for english users I translated it for English!(Scroll down to the bottom)

Код для першої програми (FileWrite) призначений для створення або перезапису файлу з випадковими числами в заданому діапазоні.

Для запуску цього коду потрібно виконати наступні кроки:

Відкрийте середовище розробки Java (наприклад, IntelliJ IDEA, Eclipse або NetBeans).
Створіть новий проект або відкрийте існуючий проект.
Створіть новий файл класу з назвою FileWriter і скопіюйте вміст першого наданого вами коду в цей файл.
Переконайтеся, що у вас є необхідні імпорти:
import java.io.*;
import java.util.*;
Натисніть на клавіатурі комбінацію клавіш, яка викликає запуск програми (наприклад, Ctrl + Shift + F10 у IntelliJ IDEA або Ctrl + F11 у Eclipse).
Введіть шлях до файлу, з яким ви хочете працювати. Наприклад, C:\Users\msi\Desktop\ІТРЕ\testMy.txt.
Далі програма попросить ввести межі [x, y]. Введіть числа x і y для визначення діапазону випадкових чисел.

Опис використовуваних бібліотек:

java.io.*: Ця бібліотека надає класи для роботи з файлами і потоками вводу-виводу.
java.util.*: Ця бібліотека містить корисні класи та інтерфейси, такі як Scanner для зручного отримання введених даних з консолі та Random для генерації випадкових чисел.

Опис короткого коду:

Перший код (FileWriter) створює файл за вказаним шляхом (якщо файл не існує) або перезаписує його (якщо файл існує). Він використовує клас Scanner для зчитування шляху до файлу та межі [x, y] для генерації випадкових чисел. Код генерує 10 випадкових чисел у вказаному діапазоні та записує їх у файл.


Код для другої програми (FileRead) призначений для читання та виведення вмісту файлу на консоль.

Для запуску цього коду потрібно виконати наступні кроки:

Відкрийте середовище розробки Java (наприклад, IntelliJ IDEA, Eclipse або NetBeans).
Створіть новий проект або відкрийте існуючий проект.
Створіть новий файл класу з назвою FileRead і скопіюйте вміст другого наданого вами коду в цей файл.
Переконайтеся, що у вас є необхідні імпорти:
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
Натисніть на клавіатурі комбінацію клавіш, яка викликає запуск програми (наприклад, Ctrl + Shift + F10 у IntelliJ IDEA або Ctrl + F11 у Eclipse).
Введіть шлях до файлу, який ви хочете прочитати. Наприклад, C:\Users\msi\Desktop\ІТРЕ\testMy.txt.

Опис використовуваних бібліотек:

java.io.FileReader: Цей клас використовується для читання символів з файлу.
java.util.Scanner: Цей клас дозволяє зчитувати введені дані з консолі.

Опис короткого коду:

Другий код (FileRead) використовує клас Scanner для отримання шляху до файлу з консолі. Він використовує клас FileReader для читання символів з файлу і виводить їх на консоль.
__________________________________________________________________________________________________________________________________________________________________

For english users:

# Laboratorna8-TR23(For ukrainian and foreign users)

The description is in Ukrainian, and for English users I translated it for English!

The code for the first program (FileWrite) is designed to create or overwrite a file with random numbers in a given range.

To run this code, follow these steps:

Open a Java development environment (for example, IntelliJ IDEA, Eclipse, or NetBeans).
Create a new project or open an existing project.
Create a new class file named FileWriter and copy the contents of the first code you provided into this file.
Make sure you have the necessary imports:
import java.io.*;
import java.util.*;
Press the key combination on your keyboard that launches the program (for example, Ctrl + Shift + F10 in IntelliJ IDEA or Ctrl + F11 in Eclipse).
Enter the path to the file you want to work with. For example, C:\Users\msi\Desktop\ITRE\testMy.txt.
Next, the program will ask you to enter the boundaries [x, y]. Enter the numbers x and y to define the range of random numbers.

Description of the libraries used:

java.io.*: This library provides classes for working with files and I/O streams.
java.util.*: This library provides useful classes and interfaces such as Scanner for easily retrieving input from the console and Random for generating random numbers.

Short code description:

The first code (FileWriter) creates a file at the specified path (if the file does not exist) or overwrites it (if the file exists). It uses the Scanner class to read the file path and the [x, y] boundary to generate random numbers. The code generates 10 random numbers in the specified range and writes them to the file.


The code for the second program (FileRead) is designed to read and display the contents of the file on the console.

To run this code, follow these steps:

Open a Java development environment (for example, IntelliJ IDEA, Eclipse, or NetBeans).
Create a new project or open an existing project.
Create a new class file named FileRead and copy the contents of the second code you provided into this file.
Make sure you have the necessary imports:
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
Press the key combination on your keyboard that launches the program (for example, Ctrl + Shift + F10 in IntelliJ IDEA or Ctrl + F11 in Eclipse).
Enter the path to the file you want to read. For example, C:\Users\msi\Desktop\ITRE\testMy.txt.

Description of the libraries used:

java.io.FileReader: This class is used to read characters from a file.
java.util.Scanner: This class allows you to read the input from the console.

Description of the short code:

The second code (FileRead) uses the Scanner class to get the file path from the console. It uses the FileReader class to read characters from the file and display them on the console.
