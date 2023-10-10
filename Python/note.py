import pathlib
import os
import datetime


print("Выберите действие:\n 1. Создать заметку \n 2. Редактировать заметку \n 3. Удалить заметку\n"
      + " 4. Добавить данные в существующую заметку \n 5. Читать заметку\n 6. Смотреть список заметок")
action = input()

if action == "1":
    name = input("Введите название заметки: ")
    path = pathlib.Path(f"C:/Users/user/Desktop/Certification/Python/collectionNotes/{name}.json")
    with path.open(mode = "w",encoding="utf-8") as file:
        title = input("Введите заголовок заметки: ")
        file.write(title)
        file.write("\n")
        file.write("\n")
        noteContent = input("Введите содержание заметки (для окончания ввода введите 'q'): ")
        while noteContent != "q":
            file.write(noteContent)
            file.write("\n")
            noteContent = input()
        date = str(datetime.datetime.now())
        file.write("\n")
        file.write(date)
        print("Заметка успешно создана")
    


elif action == "2": 
    name = input("Введите название заметки: ")
    path = pathlib.Path(f"C:/Users/user/Desktop/Certification/Python/collectionNotes/{name}.json")
    if path.exists():
        with path.open(mode = "r",encoding="utf-8") as file:
            text = file.readlines()
            with path.open(mode = "w",encoding="utf-8") as file:
                num = int(input("Введите номер строки для редактирования: "))
                for i in range(1,len(text)+1):
                    if i == num:
                        text[i] = input("Введите измененную строку(для окончания ввода введите 'q'): ")
                        file.write(text[i])
                        file.write("\n")
                    else:
                        file.write(text[i])
                date = str(datetime.datetime.now())
                file.write("\n")
                file.write(date)
    else:
        print("Нет такой заметки")


elif action == "3": 
    name = input("Введите название заметки: ")
    path = pathlib.Path(f"C:/Users/user/Desktop/Certification/Python/collectionNotes/{name}.json")
    if path.exists():
        path.unlink()
        print("Заметка успешно удалена")
    else:
        print("Нет такой заметки")


elif action == "4":
    name = input("Введите название заметки: ")
    path = pathlib.Path(f"C:/Users/user/Desktop/Certification/Python/collectionNotes/{name}.json")
    if path.exists():
        with path.open(mode = "a",encoding="utf-8") as file:
            file.write("\n")
            noteContent = input("Введите текст(для окончания ввода введите 'q'): ")
            while noteContent != "q":
                file.write(noteContent)
                file.write("\n")
                noteContent = input()
            print("Данные успешно добавлены")
            date = str(datetime.datetime.now())
            file.write("\n")
            file.write(date)
    else:
        print("Нет такой заметки") 


elif action == "5":
    name = input("Введите название заметки: ")
    path = pathlib.Path(f"C:/Users/user/Desktop/Certification/Python/collectionNotes/{name}.json")
    if path.exists():
        with path.open(mode = "r",encoding="utf-8") as file:
            print(file.read())
    else:
        print("Нет такой заметки") 


elif action == "6":
    path = pathlib.Path(f"C:/Users/user/Desktop/Certification/Python/collectionNotes")
    files = os.listdir(path)
    print(files)

else:
    print("Нет такого действия")