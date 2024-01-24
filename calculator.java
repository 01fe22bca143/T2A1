class calculator extends cal{
    float addition(float operand_1, float operand_2){
        return(operand_1 + operand_2);

    }

    float substraction(float operand_1, float operand_2){
        return(operand_1 - operand_2);
}

float multiplication(float operand_1, float operand_2){
    return(operand_1 * operand_2);
}
 
float division(float operand_1, float operand_2){
    return(operand_1 / operand_2);
}



    public static void main(String[] args){
    calculator calc = new calculator();
    float operand_1 = 10;
    float operand_2 = 5;
    float add_result = calc.addition(operand_1,operand_2);
    System.out.println("The Result is:"+ add_result);
    float sub_result = calc.substraction(operand_1,operand_2);
    System.out.println("The Result is:"+ sub_result);
    float mul_result = calc.multiplication(operand_1,operand_2);
    System.out.println("The Result is:"+ mul_result);
    float div_result = calc.division(operand_1,operand_2);
    System.out.println("The Result is:"+ div_result);
    float squ_result = calc.square(operand_1);
    System.out.println("The Result is:"+ squ_result);
    float cube_result = calc.cube(operand_1);
    System.out.println("The Result is:"+ cube_result);
    float mode_result = calc.division(operand_1,operand_2);
    System.out.println("The Result is:"+ mode_result);
}}