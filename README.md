# SE_Homework
Для сборки проекта необходим gradle не ниже 4.10.

## Docker
Сборка образа

    gradle buildDocker

Запуск

    docker run -p 8080:8080 days-to/ru.alex.se

## Пример работы
Текущее время

    request: localhost:8080/
    response: {"hours":22,"minutes":38,"seconds":19}
    
Время до даты (параметр _deadline_, формат yyyy-mm-dd)

    request: localhost:8080/deadline?deadline=2020-01-01
    response: {"days":14,"hours":1,"minutes":20,"seconds":14,"exception":""}
    
    request: localhost:8080/deadline?deadline=202
    response: {"days":0,"hours":0,"minutes":0,"seconds":0,"exception":"Wrong format. Use '2020-12-31'"}