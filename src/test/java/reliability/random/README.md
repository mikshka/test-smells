## Недетерминированные тесты 
Внутри теста есть `Random`: генератор случайных чисел, либо ответ сервера с изменяющимися данными, либо запись с микрофона.

### Проблемы
Если использовать случайно сгенерированные данные, то тест может успешно пройти 100 раз, а потом завалить билд, потому что сгенерировалось новое сочетание данных.

Обратите внимание, что приведённом примере количество элементов в тестовом наборе может быть от 0 до 10 штук, что меньше проверяемого числа. Тест всегда будет успешным. Это признак других смеллов - проверка только одного из исходов и всегда успешного теста.

### Теория
Тесты всегда должны проходить над одним и тем же набором данных.

### Что делать
Делать раздельные тесты с константными ключевыми значениями

Делать параметризованные тесты. Пример см. в [many_tests_in_one](../../structure/many_tests_in_one).
