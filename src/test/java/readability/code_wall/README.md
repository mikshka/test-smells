## Стена текста
Тест содержит много кода

### Проблемы
Сложно читать, сложно понять, что делает тест.

### Теория
В тестах можно выделить три части проверки:
- настройка окружения, 
- выполнение действия, 
- проверка постусловий.

Идеальный тест и будет содержать 3 строчки.

### Что делать
Настройку окружения надо выносить в `@Before` или в конструкторы тестового класса. Если полностью вынести невозможно, то надо заворачивать в метод с говорящим названием

Проверить, что выполняемое действие это один-два вызова методов. Их стоит оставлять в коде метода.

Проверку постусловий вынести в метод с говорящим названием, либо в `Matcher`.