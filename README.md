# Онлайн калькулятор на микросервисной архитектуре #
1.	Создаю аннотацию @RestController, для того чтоб Spring понимал, что методы этого класса должны возвращать данные напрямую в теле HTTP. При использовании @GetMapping указывается путь, который будет обрабатываться данным методом контроллера. @PathVirable  используется для извлечения переменных из URI шаблона и передачи их в метод контроллера. 


@RestController
public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    public Integer Sum (@PathVariable ("a") Integer a, @PathVariable("b") Integer b){
        return a+b;

    }

    @GetMapping("/minus/{a}/{b}")
    public Integer Diff(@PathVariable("a") Integer a, @PathVariable("b") Integer b){
        return a-b;
    }

}



2.	Чтобы узнать работает ли приложение, проверяю в браузере отвечает ли сервер. Пишу в поисковой строке  http://localhost:8080/plus/12/8 для подсчета суммы чисел и http://localhost:8080/minus/12/8 для разности чисел. 

![image](https://github.com/DanelKogumbaeva/calculator/assets/160221819/d8d1049e-57cc-4a00-a542-39654438c981)
![image](https://github.com/DanelKogumbaeva/calculator/assets/160221819/729424d1-2db2-4e21-8419-01429a2d99f1)


Swagger - это набор инструментов для проектирования, создания, документирования и потребления веб-сервисов RESTful API. Swagger предоставляет интерактивный интерфейс, который позволяет разработчикам и пользователям взаимодействовать с API, выполнять запросы и просматривать ответы прямо в браузере. 
3.	Добавила в файл pom.xml зависимость для подключения Swagger в проект. 
<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.0.2</version>
		</dependency>

4.	В веб-браузере перешла по адресу http://localhost:8080/swagger-ui/index.html чтоб посмотреть интерфейс Swagger. 

![image](https://github.com/DanelKogumbaeva/calculator/assets/160221819/4518bde5-2b5e-4b76-8183-aa26bfabb161)

5.	Написала тесты на проект. Тест считается удачным, если полученный результат соответствует ожидаемому, если результат не соответствует ожиданиям, тест считается неудачным.  
![image](https://github.com/DanelKogumbaeva/calculator/assets/160221819/9b80c651-01a1-4ff6-bc7d-ccc67b3b74ca)

![image](https://github.com/DanelKogumbaeva/calculator/assets/160221819/883c9e14-4d1d-4823-9ec8-8c4bddf09a27)
