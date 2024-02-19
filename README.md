## E-Shop.

Учебный проект. Интернет-магазин на базе микросервисов с функциональными возможностями аутентификации пользователей, формирования корзины товаров и размещения заказа.

### Состав проекта
 - `api` - совместно используемые библиотеки
 - `auth-service` - сервис аутентификации
 - `cart-service` - сервис работы с корзинами пользователей
 - `core-service` - сервис работы с продуктами и заказами
 - `front-service` - сервис обеспечивающий работу front-end
 - `gateway-service` - прокси-сервис

### Реализованные задачи
- реализовал REST-контроллеры для управления
  продуктами, корзиной, заказами
- создал модуль реализующий хранение данных в СУБД `PostgreSQL` посредством `Spring Data` и
  настроил версионирование при помощи `FlyWay`
- разделил проект на несколько микросервисов и настроил взаимодействие между ними с
  использованием `Spring Cloud Gateway`
- реализовал аутентификацию пользователей с помощью `Spring Security+JWT`
- реализовал пользовательский интерфейс на фреймворке `AngularJS`
- создал для каждого микросервиса `Docker` контейнеры с необходимой инфраструктурой

### Установка
`git clone https://github.com/igojig/EShop.git`

### Сборка Docker-контейнеров
`mvn install -pl api` - установка общих библиотек
```
mvn spring-boot:build-image -pl auth-service
mvn spring-boot:build-image -pl cart-service
mvn spring-boot:build-image -pl core-service
mvn spring-boot:build-image -pl front-service
mvn spring-boot:build-image -pl gateway-service
```

### Запуск Docker-контейнеров
```
docker compose -f ./auth-service/docker-compose.yml up -d
docker compose -f ./cart-service/docker-compose.yml up -d
docker compose -f ./core-service/docker-compose.yml up -d
docker compose -f ./front-service/docker-compose.yml up -d
docker compose -f ./gateway-service/docker-compose.yml up -d
```

### Запуск магазина
```
http://localhost:3000/front
```


