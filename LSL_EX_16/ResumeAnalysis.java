package LSL_EX_16;

public class ResumeAnalysis {
    public static void main(String[] args) {
        String resume = "������������ ����ʱ�䣺1976.09.01 QQ���䣺CQYT@qq.com��ѧ�ţ�2023231313";

        // ��ȡ����
        int nameStart = resume.indexOf("������") + 3;
        int nameEnd = resume.indexOf(" ", nameStart);
        String name = resume.substring(nameStart, nameEnd);

        // �ж������Ƿ���"��"��ͷ
        boolean isXLastName = name.startsWith("��");

        // ��ȡ��������
        int birthStart = resume.indexOf("����ʱ�䣺") + 5;
        int birthEnd = birthStart + 10;
        String birthDate = resume.substring(birthStart, birthEnd);

        // ��ȡQQ����
        int emailStart = resume.indexOf("QQ���䣺") + 4;
        int emailEnd = resume.indexOf("��", emailStart);
        String email = resume.substring(emailStart, emailEnd);

        // ��ȡѧ��
        int studentIdStart = resume.lastIndexOf("ѧ�ţ�") + 3;
        String studentId = resume.substring(studentIdStart);

        // ������
        System.out.println("�����Ƿ���\"��\"��ͷ��" + isXLastName);
        System.out.println("�������ڣ�" + birthDate);
        System.out.println("QQ���䣺" + email);
        System.out.println("ѧ�ţ�" + studentId);
    }
}
