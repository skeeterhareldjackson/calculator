import java.util.Scanner; //завантаження необхiдного допоміжного класу Scanner з бiблiотеки Java
public class Calculator //оголошення нового класу Calculator, який доступний для змiн iншими користувачами - public
{	//кудрявi дужки, braces, потрiбнi для роздiлення рiзних команд, методiв i класiв - як дужки в алгебрi
	public static void main (String[] args) //цiми словами чимало програм саме й розпочинаються, "жили-були"
	{
		System.out.println("\f");  //таким чином ми вказуємо, що результат (розрахунку) треба висвiтити на екранi
		Scanner sc = new Scanner(System.in);
		System.out.println("введіть два числа"); //треба написати на екранi "введіть два числа"
		double num1 = sc.nextDouble(); 
		double num2 = sc.nextDouble(); 
		double add, sub, mul, div, mod; //задає можливi дiї для чисел
		System.out.println("якщо скласти:"); //треба написати на екранi "якщо скласти:"
		add = num1 + num2; //порядок виконання складання
        System.out.println("відповідь - " +add);//треба написати на екранi "відповідь - результат складання add"
        System.out.println(); //пуста строчка (), щоб усе близько не тулилося
        System.out.println("якщо помножити:"); //треба написати на екранi "якщо помножити:"
        mul = num1*num2; //порядок виконання множення
        System.out.println("відповідь - " +mul); //треба написати на екранi "відповідь - результат множення mul"
        System.out.println(); //пуста строчка (), щоб усе близько не тулилося
        System.out.println("якщо поділити:"); //треба написати на екранi "якщо поділити:"
        if(num1>num2) //якщо число 1 > числа 2
        {
			div = num1/num2; //порядок виконання ділення такий
		}
		else   //якщо число 2 > числа 1
        {
            div = num2/num1; //порядок виконання ділення такий
        }
        System.out.println("відповідь - " +div); //треба написати на екранi "відповідь - результат ділення div"
        System.out.println(); //пуста строчка (), щоб усе близько не тулилося
        System.out.println("якщо відняти:");  //треба написати на екранi "якщо відняти:"
        if(num1>num2) //якщо число 1 > числа 2
        {
            sub = num1-num2; //порядок виконання віднiмання такий
        }
        else   //якщо число 2 > числа 1
        {
            sub = num2-num1; //порядок виконання віднiмання такий
        }
        System.out.println("відповідь - " +sub); //треба написати на екранi "відповідь - результат віднiмання sub"
        System.out.println(); //пуста строчка (), щоб усе близько не тулилося
        System.out.println("залишок від ділення:");
        if(num1>num2) //якщо число 1 > числа 2
        {
            mod = num1%num2;  //порядок визначення залишку від ділення такий
        }
        else   //якщо число 2 > числа 1
        {
            mod = num2%num1;  //порядок визначення залишку від ділення такий
        }
        System.out.println("відповідь - " +mod); //треба написати на екранi "відповідь - залишок від ділення mod"
        System.out.println(); //пуста строчка (), щоб усе близько не тулилося
	}
}

