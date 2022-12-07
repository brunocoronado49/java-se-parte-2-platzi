public class DataTypes {
    public static void main(String[] args) {
        // byte ocupa 1 byte y short ocupa 2 bytes
        int n = 123456789;  // int hasta 9 digitos (4 bytes) COMODIN
        long nL = 123245845866L; // long hasta 12 digitos (8 bytes)

        double d = 1.343442234; // double es muy amplio (4 bytes) COMODIN
        float f = 2.7758f;  // float (8 bytes) se usa cuando el calculoo bno es tan preciso

        // Podemos usar "var" desde java 10
        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Francisco Rangel";
        System.out.println("El empleado es:" + employeeName + " con salario " + totalSalary);
    }
}
