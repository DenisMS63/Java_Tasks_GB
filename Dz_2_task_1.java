/*
 * Дана строка sql-запроса:
select * from students where "

Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. 
Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. 
Метод answer принимает на вход два параметра:
String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример: 
Строка sql-запроса:

select * from students where 
Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Результат:
select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */

import java.util.Arrays;

public class Dz_2_task_1 {
    public static void main(String[] args) {
        
        String QUERY = "select * from students where ";
	    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        
        String newPARAMS = PARAMS.replace("\"", "");
        newPARAMS = newPARAMS.replace("{", "");
        newPARAMS = newPARAMS.replace("}", "");
        System.out.println();
        System.out.println(newPARAMS);

        String [] arrPARAMS = newPARAMS.split(",");
        System.out.println();
        System.out.println(Arrays.toString(arrPARAMS));   

        String [] name = arrPARAMS[0].split(":");
        System.out.println(Arrays.toString(name));
        String [] country = arrPARAMS[1].split(":");
        String [] city = arrPARAMS[2].split(":");
        String [] age = arrPARAMS[3].split(":");
        System.out.println("ТУТ - " + age[1]);
        
        StringBuilder sb = new StringBuilder();
        
            
        if (QUERY.equalsIgnoreCase("select * from students where ")) {

            sb.append(QUERY);
            if (name[1].equalsIgnoreCase("null")){
                sb.append("");
            } else {
                sb.append(name[0] + "=\'" + name[1] + "\'");               
            }


            if (country[1].equalsIgnoreCase("null")){
                sb.append("");
            } else {
                sb.append(" and"); 
                sb.append(country[0] + "=\'" + country[1] + "\'");
            }


            if (city[1].equalsIgnoreCase("null")){
                sb.append("");
            } else {
                sb.append(" and"); 
                sb.append(city[0] + "=\'" + city[1] + "\'");
            }


            if (age[1].equalsIgnoreCase("null")){
                sb.append("");
            } else {
                sb.append(" and");
                sb.append(age[0] + "=\'" + age[1] + "\'");
            }
        }

        System.out.println(sb);


        String answer = "select * from students where name='Ivanov' and country='Russia' and city='Moscow'";
        if (answer.equalsIgnoreCase(sb.toString())) {
            System.out.println(111);
        } else {System.out.println(222);}
        
        //select * from students where name='Ivanov' and country='Russia' and city='Moscow'


        





    } 

    public static StringBuilder answer(String QUERY, String PARAMS){
       
        String [] arrPARAMS = PARAMS.split(",");
        
        String QUERY1 = "select * from students where ";
       if (QUERY1.compareTo(QUERY) == 0){
            System.out.println(111);
       }

       return null;
    }

}
