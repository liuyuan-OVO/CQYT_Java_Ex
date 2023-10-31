package LSL_EX_16;

public class ResumeAnalysis {
    public static void main(String[] args) {
        String resume = "姓名：王洪武 出生时间：1976.09.01 QQ邮箱：CQYT@qq.com。学号：2023231313";

        // 获取姓名
        int nameStart = resume.indexOf("姓名：") + 3;
        int nameEnd = resume.indexOf(" ", nameStart);
        String name = resume.substring(nameStart, nameEnd);

        // 判断姓名是否以"李"开头
        boolean isXLastName = name.startsWith("李");

        // 获取出生日期
        int birthStart = resume.indexOf("出生时间：") + 5;
        int birthEnd = birthStart + 10;
        String birthDate = resume.substring(birthStart, birthEnd);

        // 获取QQ邮箱
        int emailStart = resume.indexOf("QQ邮箱：") + 4;
        int emailEnd = resume.indexOf("。", emailStart);
        String email = resume.substring(emailStart, emailEnd);

        // 获取学号
        int studentIdStart = resume.lastIndexOf("学号：") + 3;
        String studentId = resume.substring(studentIdStart);

        // 输出结果
        System.out.println("姓名是否以\"李\"开头：" + isXLastName);
        System.out.println("出生日期：" + birthDate);
        System.out.println("QQ邮箱：" + email);
        System.out.println("学号：" + studentId);
    }
}
